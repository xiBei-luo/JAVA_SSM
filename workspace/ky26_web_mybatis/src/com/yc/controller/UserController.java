package com.yc.controller;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import com.yc.dao.UserDao;
import com.yc.dao.UserDaoImpl;
import com.yc.framework.Page;
import com.yc.framework.PageUtils;
import com.yc.model.UserModel;
import com.yc.model.UserQueryModel;
import com.yc.service.UserService;
import com.yc.service.UserServiceImpl;

public class UserController extends HttpServlet {

	private static final long serialVersionUID = 1L;
	UserService userService=new UserServiceImpl();
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String m=request.getParameter("m");
		//response.setCharacterEncoding("UTF-8");
		//response.setContentType("text/html;charset=UTF-8");
		if("add".equals(m)){
			add(request,response);	
		}else if("find".equals(m)){
			find(request,response);	
		}else if("next".equals(m)){
			next(request,response);	
		}else{
			list(request,response);
		}
	}
	 void next(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		 System.out.println("next");
		 Page p=(Page) request.getSession().getAttribute("page");
		 if(p.getNowPage() !=p.getTotalPage()){
			p.setNowPage(p.getNowPage()+1);
		 }
			System.out.println(p);
			PageUtils pUtils=new PageUtils();
			List<UserModel> list=pUtils.findByPage(p);
			System.out.println(list);
			request.setAttribute("um", list);
			request.getSession().setAttribute("page", p);
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
	void find(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		UserQueryModel uq= new UserQueryModel();
				try {
					BeanUtils.populate(uq, request.getParameterMap());
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
//				Page p=new Page();
//				PageUtils pUtils=new PageUtils();
//				int totalSize=pUtils.getPageTotalSize(uq);
//				p.setTotalSize(totalSize);
//				int totalPage=(p.getTotalSize()+(p.getPageSize()-1))/p.getPageSize();
//				p.setTotalPage(totalPage);
//				List<UserModel> list=pUtils.findByPage(p);
//				System.out.println(p);
//				System.out.println(list);
//				request.setAttribute("um", list);
//				request.getSession().setAttribute("page", p);
//				try {
//					request.getRequestDispatcher("UserList.jsp").forward(request, response);
//				} catch (ServletException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				} catch (IOException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
				List<UserModel> um=userService.findByCondition(uq);
				request.setAttribute("um",um);
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
	void add(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		UserModel um=new UserModel();
		//String name=request.getParameter("name");
		try {
			BeanUtils.populate(um,request.getParameterMap());
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		userService.add(um);
		try {
			response.setCharacterEncoding("UTF-8");
			response.setContentType("text/html;charset=UTF-8");
			response.getWriter().print("<script>alert('Ìí¼Ó³É¹¦');window.opener.location='userController';window.close();</script>");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	void list(HttpServletRequest request, HttpServletResponse response) {
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
//		Page p=new Page();
//		PageUtils pUtils=new PageUtils();
//		int totalSize=pUtils.getPageTotalSize(null);
//		p.setTotalSize(totalSize);
//		int totalPage=(p.getTotalSize()+(p.getPageSize()-1))/p.getPageSize();
//		p.setTotalPage(totalPage);
//		List<UserModel> list=pUtils.findByPage(p);
//		System.out.println(p);
//		System.out.println(list);
//		request.setAttribute("um", list);
//		request.getSession().setAttribute("page", p);
//		try {
//			request.getRequestDispatcher("UserList.jsp").forward(request, response);
//		} catch (ServletException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
	
}
