package com.yc.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import com.yc.dao.UserDao;
import com.yc.dao.UserDaoImpl;
import com.yc.model.UserModel;
import com.yc.model.UserQueryModel;
import com.yc.service.UserService;
import com.yc.service.UserServiceImpl;

public class UserController extends HttpServlet {
	UserService userService=new UserServiceImpl();
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		
		doPost(request, response);
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");
		UserService us=new UserServiceImpl();
		String m=request.getParameter("m");
		System.out.println(m);

		
		
		if(m!=null && "add".equals(m)){
			add(request,response);
			
		}else if(m!=null && "chkName".equals(m)){
			chkName(request,response);
			
		}else if(m!=null && "doUpdate".equals(m)){
			doUpdate(request,response);
			
		}else if(m!=null && "del".equals(m)){
			del(request,response);
			
		}else if(m!=null && "update".equals(m)){
			update(request,response);
			
		}else if(m!=null && "find".equals(m)){
			find(request,response); 
			
		}else{
			
			findAll(request,response);
		}
	}
	
	
	
	void findAll(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		List<UserModel> list=userService.findAll();
		request.setAttribute("um", list);
		try {
			request.getRequestDispatcher("UserList.jsp").forward(request, response);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	void add(HttpServletRequest request, HttpServletResponse response){
		// TODO Auto-generated method stub
		UserModel um=new UserModel();
		try {
			BeanUtils.populate(um,request.getParameterMap());
			//简化步骤，原步骤获取用户输入，有多少输入就写多少getParameter，
			//现在将获取用户输入与写入Model合为一个步骤
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		userService.add(um);
		try {
			response.getWriter().print("<script>alert('添加成功');window.opener.location='userController';window.close();</script>");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	void del(HttpServletRequest request, HttpServletResponse response){
		PrintWriter out=null;
		try {
			out = response.getWriter();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String operator_id=request.getParameter("operator_id");
		userService.del(Integer.parseInt(operator_id));
		out.print("<script>alert('删除成功');location.href='userController';</script>");
	}
	void chkName(HttpServletRequest request, HttpServletResponse response){
		PrintWriter out=null;
		try {
			out = response.getWriter();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String name=request.getParameter("name");
		String s=userService.chkName(name);
		out.print(s);
	}
	void update(HttpServletRequest request, HttpServletResponse response){
		UserModel um=new UserModel();
		try {
			BeanUtils.populate(um,request.getParameterMap());//获取用户输入
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		um=userService.update(um.getOperator_id());
		try {
			request.setAttribute("um",um);
			request.getRequestDispatcher("/UserUpdate.jsp").forward(request,response);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	void doUpdate(HttpServletRequest request, HttpServletResponse response){
		UserModel um=new UserModel();
		try {
			BeanUtils.populate(um,request.getParameterMap());
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(um);
		userService.doUpdate(um);
		PrintWriter out=null;
		try {
			out = response.getWriter();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		out.print("<script>alert('修改成功');window.opener.location='userController';window.close();</script>");
	}
	void find(HttpServletRequest request, HttpServletResponse response){
		UserQueryModel uq=new UserQueryModel();
		try {
			BeanUtils.populate(uq,request.getParameterMap());
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(uq);
		
		List<UserModel> list=userService.find(uq);
		request.setAttribute("um",list);
		try {
			request.getRequestDispatcher("UserList.jsp").forward(request,response);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
