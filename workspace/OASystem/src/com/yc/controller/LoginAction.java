package com.yc.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.beanutils.BeanUtils;

import com.yc.model.OALoanModel;
import com.yc.model.OALoanQueryModel;
import com.yc.model.OAUserModel;
import com.yc.model.OAUserQueryModel;
import com.yc.model.UserModel;
import com.yc.service.OAUserService;
import com.yc.service.OAUserServiceImpl;
import com.yc.service.UserService;

public class LoginAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
	OAUserService oaUserService=new OAUserServiceImpl();
	public HttpSession session = null;
       
    

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");
		

		String m=request.getParameter("m");
		System.out.println(m);
		if(m!=null&&m.equals("loginCheck")){
			loginCheck(request,response);
		}else if(m!=null&&m.equals("loginOut")){
			System.out.println("注销登录申请");
			loginOut(request,response);
		}else if(m!=null&&m.equals("apply")){
			add(request,response);
		}else if(m!=null&&m.equals("del")){
			System.out.println("删除请求");
			del(request,response);
		}else{
			findAll(request,response);
		}
		
		
		
		
		
		
	}



	private void loginCheck(HttpServletRequest request,HttpServletResponse response) {
		session = request.getSession();
		PrintWriter out=null;
		try {
			out = response.getWriter();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		OAUserQueryModel ouq=new OAUserQueryModel();
		try {
			BeanUtils.populate(ouq,request.getParameterMap());
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		OAUserModel s=oaUserService.loginCheck(ouq);
		if(!(s==null)){
			session.setAttribute("user_name", s.getLoginName());
			session.setAttribute("groupId", s.getGroupId());
			session.setAttribute("name", s.getName());
			session.setAttribute("id", s.getId());
			session.setAttribute("pass", "yes");
			//System.out.println(session.getAttribute("groupId"));
			//System.out.println(session.getAttribute("id"));
			try {
				response.getWriter().print("<script>alert('"+"登陆成功"+"');location.href='showResult.jsp';</script>");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else{
			try {
				response.getWriter().print("<script>alert('"+"用户名或密码错误"+"');location.href='login.jsp'</script>");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

	
	private void findAll(HttpServletRequest request,HttpServletResponse response){
		// TODO Auto-generated method stub
		String loginName=(String) session.getAttribute("user_name");
		int groupId=Integer.parseInt(session.getAttribute("id").toString());
		System.out.println("当前用户名是："+loginName);
		System.out.println("当前用户角色是："+groupId);
		List<OALoanModel> list=oaUserService.findAll(groupId,loginName);
		request.setAttribute("um", list);
		try {
			request.getRequestDispatcher("showResult.jsp").forward(request, response);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private void loginOut(HttpServletRequest request,HttpServletResponse response){
		System.out.println("进入注销申请方法");
		session.invalidate();
		//request.getRequestDispatcher("/login.jsp").forward(request, response);
		try {
			response.getWriter().print("<script>location.href='login.jsp';</script>");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	private void add(HttpServletRequest request, HttpServletResponse response) {
		PrintWriter out=null;
		try {
			out = response.getWriter();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		OALoanQueryModel olq=new OALoanQueryModel();
		try {
			BeanUtils.populate(olq,request.getParameterMap());
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*System.out.println(olq.getTitle());
		System.out.println(olq.getAmount());*/
		olq.setEmployeeId(Integer.parseInt(session.getAttribute("id").toString()));
		oaUserService.add(olq);
		try {
			response.getWriter().print("<script>alert('申请已提交');location.href='showResult.jsp'</script>");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	private void del(HttpServletRequest request, HttpServletResponse response) {
		PrintWriter out=null;
		try {
			out = response.getWriter();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String id=request.getParameter("id");
		oaUserService.del(Integer.parseInt(id));
		out.print("<script>alert('删除成功');location.href='LoginAction';</script>");
		
	}
}
