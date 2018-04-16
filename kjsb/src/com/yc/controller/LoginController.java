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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yc.model.ExpertModel;
import com.yc.model.ExpertQueryModel;
import com.yc.model.ProjectModel;
import com.yc.model.ProjectQueryModel;
import com.yc.model.ProjetCategoryQueryModel;
import com.yc.model.UnitModel;
import com.yc.model.UnitQueryModel;
import com.yc.model.UserModel;
import com.yc.model.UserQueryModel;
import com.yc.service.ExpertService;
import com.yc.service.UserService;


@Controller
@RequestMapping("/")
public class LoginController {
	@Autowired
	private UserService us;
	private int sessionLoginId;
	private String sessionLoginName;
	/*登录验证开始*/
	@RequestMapping("login")
	public String login(UserQueryModel uq,Model m,HttpServletResponse resp){
		UserModel um=null;
		int power=0;
		try{
			um=us.checkLogin(uq);
			power=um.getGid();
		}catch(Exception e){
			e.printStackTrace();
		}
		if(power==1){
			m.addAttribute("um", um);
			sessionLoginId=um.getUid();
			sessionLoginName=um.getUsername();
			return "admin/admin_index";
		}else if(power==2){
			m.addAttribute("um", um);
			sessionLoginId=um.getUid();
			sessionLoginName=um.getUsername();
			return "expert/expert_index";
		}else if(power==3){
			m.addAttribute("um", um);
			sessionLoginId=um.getUid();
			sessionLoginName=um.getUsername();
			return "unit/unit_index";
		}else{
			resp.setCharacterEncoding("UTF-8");
			resp.setContentType("text/html;charset=UTF-8");
			try {
				resp.getWriter().print("<script type='text/javascript'>alert('用户名或密码错误');history.back(-1);</script>");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	/*登录验证结束*/
	
/*管理员角色界面控制开始*/
	/*查找开始——页面显示*/
	@RequestMapping(value={"user/findAll"})
	public String list(Model m){
		List<UserModel> um=us.findAll();
		m.addAttribute("um", um);
		return "admin/showusers";
	}
	@RequestMapping(value={"experts/findAll"})
	public String list2(Model m){
		List<ExpertModel> em=us.expertFindAll();
		m.addAttribute("em", em);
		return "admin/showexperts";
	}
	@RequestMapping(value={"units/findAll"})
	public String list3(Model m){
		List<UnitModel> um=us.unitFindAll();
		m.addAttribute("um", um);
		return "admin/showunits";
	}
	@RequestMapping(value={"projectCategorys/findAll"})
	public String list4(Model m){
		List<ProjetCategoryQueryModel> um=us.projectCategoryFindAll();
		m.addAttribute("um", um);
		return "admin/showprojectCategorys";
	}
	@RequestMapping("{categoryid}/projectsFindByIdD")
	public String list5(@PathVariable int categoryid,Model m){
		System.out.println(categoryid);
		List<ProjectModel> um=us.projectFindByIdD(categoryid);
		m.addAttribute("um", um);
		return "admin/showprojects";
	}
	/*查找结束*/
	
	/*更新查找开始——读取数据返回数据*/
	@RequestMapping("{expertid}/expertUpdate")
	public String update(@PathVariable int expertid,Model m){
		m.addAttribute("u", us.expertFindById(expertid));
		return "admin/adminviewexpertinfo";
	}
	@RequestMapping("{unitid}/unitUpdate")
	public String update1(@PathVariable int unitid,Model m){
		m.addAttribute("u", us.unitFindById(unitid));
		return "admin/adminviewunitinfo";
	}
	/*@RequestMapping("projectUpdate")//不需要读取
	public String update2(){
		return "admin/viewprojectinfo";
	}*/
	@RequestMapping("{categoryid}/projectUpdate")
	public String update2(@PathVariable int categoryid,Model m){
		m.addAttribute("u", us.projectCategoryFindById(categoryid));
		return "admin/adminupdateshowprojects";
	}
	/*更新查找结束*/
	
	/*正式更新开始*/
	@RequestMapping(value={"{expertid}/expertDoUpdate"},method=RequestMethod.POST)
	public String doUpdate(ExpertModel em,@PathVariable int expertid){
		us.expertDoUpdate(em);
		return "admin/admin_index";
	}//跳转问题
	@RequestMapping(value={"{unitid}/unitDoUpdate"},method=RequestMethod.POST)
	public String doUpdate1(UnitQueryModel uqm,@PathVariable int unitid){
		us.unitDoUpdate(uqm);
		return "admin/admin_index";
	}//跳转问题
	@RequestMapping(value={"{categoryid}/projectDoUpdate"},method=RequestMethod.POST)
	public String doUpdate2(ProjetCategoryQueryModel pcqm,@PathVariable int categoryid){
		System.out.println(pcqm.getCategoryname()+"-----"+categoryid);
		us.projectCategoryDoUpdate(pcqm);
		return "admin/admin_index";
	}//跳转问题
	/*正式更新结束*/
	
	/*删除开始*/
	@RequestMapping(value="{uid}/userDel")
	public String del(@PathVariable int uid){
		us.userDel(uid);
		return "redirect:/admin/admin_index";
	}//用户删除-跳转问题
	@RequestMapping(value="{expertid}/expertDel")
	public String del2(@PathVariable int expertid){
		us.expertDel(expertid);
		return "redirect:/admin/admin_index";
	}//专家删除-跳转问题
	@RequestMapping(value="{unitid}/unitDel")
	public String del3(@PathVariable int unitid){
		us.unitDel(unitid);
		return "redirect:/admin/admin_index";
	}//单位信息删除-跳转问题
	@RequestMapping(value="{categoryid}/projectCategoryDel")
	public String del4(@PathVariable int categoryid){
		us.projectCategoryDel(categoryid);
		return "redirect:/admin/showprojectCategorys1";
	}//项目信息删除-跳转问题
	/*删除结束*/
	
	/*增加开始*/
	@RequestMapping(value="add")
	public String add(){
		return "admin/adduser";
	}
	@RequestMapping(value="addprojectcategory")
	public String add1(Model m){
		m.addAttribute("um",us.expertFindAll());
		return "admin/addprojectcategory";
	}
	@RequestMapping(value="addprojectcategory",method=RequestMethod.POST)
	public String add1(ProjetCategoryQueryModel pcqm,HttpServletRequest req,HttpServletResponse resp){
		System.out.println("项目类别添加"+pcqm);
		System.out.println(pcqm.getExpertid());
		us.addProjectCategory(pcqm);
		return "admin/addprojectcategory";
	}
	@RequestMapping(value="add",method=RequestMethod.POST)
	public String add(UserModel um,HttpServletRequest req,HttpServletResponse resp){
		String power=req.getParameter("select");
		int temp;
		if(power.equals("单位")){
			temp=3;
		}else{
			temp=2;
		}
		um.setGid(temp);
		System.out.println(um.getGid());
		us.addUser(um);
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=UTF-8");
		try {
			resp.getWriter().print("<script type='text/javascript'>alert('增加成功');</script>");
			return "admin/showusers";
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//跳转问题
		return null;
	}
	/*增加结束*/
/*管理员角色界面控制结束*/

	
	
	
/*专家角色界面控制开始*/	
	/*导航显示开始*/
	@RequestMapping(value={"expertFindById"})
	public String findById(Model m){
		m.addAttribute("um", us.expertFindById(sessionLoginId));
		return "expert/viewexpertinfo";
	}
	@RequestMapping(value={"expertUpdatePass"})
	public String findById2(Model m){
		m.addAttribute("umm", us.expertUpdatePass(sessionLoginId));
		return "expert/reworkpassword";
	}
	@RequestMapping(value={"expertProjectManage"})
	public String findById3(Model m){
		m.addAttribute("umm", us.expertFindProject());
		return "expert/showprojectCategorys";
	}
	@RequestMapping(value={"{categoryid}/viewprojectinfo"})
	public String findById3(@PathVariable int categoryid,Model m){
		m.addAttribute("umm", us.projectFindById(categoryid));
		return "expert/viewprojectinfo";
	}//有问题-查询结果为两条-如何显示
	/*导航显示结束*/
	
	/*更新操作开始*/
	@RequestMapping(value={"{expertid}/expertDoUpdateE"},method=RequestMethod.POST)
	public String doUpdate5(ExpertModel em,@PathVariable int expertid,HttpServletResponse resp){
		us.expertDoUpdate(em);
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=UTF-8");
		try {
			resp.getWriter().print("<script type='text/javascript'>alert('密码修改成功');</script>");
			return "expert/expert_index";
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}//专家信息修改
	@RequestMapping(value={"{uid}/reworkpasswordD"},method=RequestMethod.POST)
	public String doUpdate5(UserModel um,@PathVariable int uid,HttpServletResponse resp){
		us.unitPassDoUpdate(um);
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=UTF-8");
		try {
			resp.getWriter().print("<script type='text/javascript'>alert('密码修改成功');</script>");
			return "expert/expert_index";
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}//专家密码修改
	@RequestMapping(value={"{project_id}/expertProjectDoupdate"})
	public String doUpdate(@PathVariable int project_id,ProjectQueryModel pm){
		us.expertProjectDoupdate(pm);
		return "expert/showprojectCategorys";
	}//评审项目-评价和得分
	/*更新操作操作结束*/
	
/*专家角色界面控制结束*/
	
	
/*单位用户角色界面控制开始*/
	/*导航显示开始*/
	@RequestMapping(value={"viewunitinfo"})
	public String findById4(Model m){
		System.out.println(sessionLoginId);
		m.addAttribute("u",us.unitFindById(sessionLoginId));
		return "unit/viewunitinfo";
	}
	@RequestMapping(value={"reworkpassword"})
	public String findById5(Model m){
		System.out.println(sessionLoginId);
		m.addAttribute("umm",us.expertUpdatePass(sessionLoginId));
		return "unit/reworkpassword";
	}
	@RequestMapping("showprojectCategorys")
	public String findById6(Model m){
		m.addAttribute("umm", us.expertFindProject());
		return "unit/showprojectCategorys";
	}
	@RequestMapping("simpleSearch")
	public String findById7(){
		return "unit/simpleSearch";
	}
	@RequestMapping("highquery")
	public String findById8(){
		return "unit/highquery";
	}
	@RequestMapping(value={"simpleSearch1"},method=RequestMethod.POST)
	public String findById10(@PathVariable String projectname,Model m){
		System.out.println("信息检索");
		m.addAttribute("umm", us.searchProject(projectname));
		return "unit/simpleSearch1";
	}//搜索结果-未完成
	@RequestMapping(value={"highqueryY"},method=RequestMethod.POST)
	public String findById9(){
		return "unit/highquery";
	}//高级搜索-未完成
	/*导航显示结束*/
	
	/*新增项目开始*/
	@RequestMapping("{categoryid}/applyproject")
	public String add2(Model m,@PathVariable int categoryid){
		m.addAttribute("umm", us.projectCategoryFindById(categoryid));
		return "unit/applyproject";
	}
	@RequestMapping(value="addproject",method=RequestMethod.POST)
	public String add2(ProjectQueryModel pqm){
		System.out.println(pqm);
		System.out.println(pqm.getUnitid());
		us.addProject(pqm);
		return "unit/unit_index";
	}
	/*新增项目结束*/
	
	/*更新do开始*/
	@RequestMapping(value={"{unitid}/unitDoUpdateE"},method=RequestMethod.POST)
	public String doUpdate3(UnitQueryModel uqm,@PathVariable int unitid,HttpServletResponse resp){
		us.unitDoUpdate(uqm);
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=UTF-8");
		try {
			resp.getWriter().print("<script type='text/javascript'>alert('单位信息修改成功');</script>");
			return "unit/unit_index";
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}//单位信息修改-跳转问题
	@RequestMapping(value={"reworkpassword"},method=RequestMethod.POST)
	public String doUpdate4(UserModel um,HttpServletResponse resp){
		um.setUid(sessionLoginId);
		us.unitPassDoUpdate(um);
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=UTF-8");
		try {
			resp.getWriter().print("<script type='text/javascript'>alert('密码修改成功');</script>");
			return "unit/unit_index";
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}//密码修改-跳转问题
	/*更新do结束*/
	
/*单位用户角色界面控制结束*/
	
	
	
	
	
	
	
	
	
}
