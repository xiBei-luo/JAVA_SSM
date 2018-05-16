package com.yc.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.yc.model.UserModel;
import com.yc.model.UserQueryModel;
import com.yc.service.UserService;

@Controller
@RequestMapping("/jsp/user")
public class UserController {
	@Autowired
	private UserService us;
	
	@RequestMapping("userList")
	public String list(Model m){
		System.out.println("---");
		List<UserModel> um=us.findAll();
		m.addAttribute("um", um);
		return "user/userList";
	}
	///jsp/user/7/del
	@RequestMapping(value="{operator_id}/del")
	public String del(@PathVariable int operator_id){
		//System.out.println("ok");
		us.del(operator_id);
		return "redirect:/jsp/user/userList";
	}
	@RequestMapping(value="add",method=RequestMethod.GET)
	public String add(@ModelAttribute UserModel um){
		System.out.println("+++");
		return "user/userAdd";
	}
	@RequestMapping(value="add",method=RequestMethod.POST)
	public String add(UserModel um,HttpServletResponse resp){
		us.add(um);
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=UTF-8");
		try {
			resp.getWriter().print("<script type='text/javascript'>alert('增加成功');opener.location='userList';close();</script>");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	@RequestMapping(value="{operator_id}/update",method=RequestMethod.GET)
	public String update(@ModelAttribute UserModel um,@PathVariable int operator_id,Model m){
		System.out.println("1111");
		m.addAttribute("u", us.findById(operator_id));
		return "user/userUpdate";
	}
	@RequestMapping(value="update",method=RequestMethod.POST)
	public String update(UserModel um,HttpServletResponse resp){
		System.out.println("2222");
		us.update(um);
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=UTF-8");
		try {
			resp.getWriter().print("<script type='text/javascript'>alert('更新成功');opener.location='userList';close();</script>");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	@RequestMapping(value="checkName",method=RequestMethod.POST)
	public String checkName(@RequestParam String name,HttpServletResponse resp){
		System.out.println("ok"+name);
		String t="";
		if(us.findByName(name)){
			t="1";
		}
		try {
			resp.getWriter().print(t);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return null;
	}
	
	@RequestMapping(value="findByCondition",method=RequestMethod.POST)
	public String findByCondition(UserQueryModel uq,HttpServletResponse resp,Model m){
		//List um=us.findByCondition(uq);
		List<UserModel> um=us.findByCondition(uq);
		m.addAttribute("um",um);
		return "user/userList";
	}
}
