package com.yc.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yc.dao.SongDao;
import com.yc.model.CategoryModel;
import com.yc.model.CategoryQueryModel;
import com.yc.model.SongQueryModel;
import com.yc.service.SongService;

@Controller
@RequestMapping("/")
public class SongController {
	@Autowired
	private SongService songServiceImpl;
	
	@RequestMapping(value={"finAllSong"})
	public String finAllSong(Model m){
		List sm=songServiceImpl.finAllSong();
		List cm=songServiceImpl.finAllCategory();
		m.addAttribute("sm",sm);
		m.addAttribute("cm",cm);
		return "showSong";
	}
	
	@RequestMapping(value={"finAllCategory"})
	public String finAllCategory(Model m){
		List cm=songServiceImpl.finAllCategory();
		m.addAttribute("cm",cm);
		return "categoryAdmin";
	}
	@RequestMapping(value={"addCategory"})
	public String addCategory(CategoryQueryModel categoryQueryModel,HttpServletResponse resp){
		songServiceImpl.addCategory(categoryQueryModel);
		try {
			resp.setCharacterEncoding("UTF-8");
			resp.setContentType("text/html;charset=UTF-8");
			resp.getWriter().print("<script type='text/javascript'>alert('添加成功');history.back();</script>");//未刷新
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@RequestMapping(value={"finAllSong"},method=RequestMethod.POST)
	public String finAllSongByCondition(Model m,SongQueryModel songQueryModel){
		System.out.println(songQueryModel);//乱码
		List sm=songServiceImpl.finAllSongByCondition(songQueryModel);
		List cm=songServiceImpl.finAllCategory();
		m.addAttribute("sm",sm);
		m.addAttribute("cm",cm);
		return "showSong";
	}
	
	@RequestMapping(value="findAllSongTop")
	public String finAllSongTop(Model m){
		List sm=songServiceImpl.finAllSongTop();
		List cm=songServiceImpl.finAllCategory();
		m.addAttribute("sm",sm);
		m.addAttribute("cm",cm);
		return "showSong";
	}
	
	
	
}
