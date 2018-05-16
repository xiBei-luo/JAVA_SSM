package com.yc.menuSys.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yc.menuSys.service.MenuService;
import com.yc.menuSys.service.MenuServiceImpl;

public class MenuController extends HttpServlet{
	private MenuService ms=new MenuServiceImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String m=req.getParameter("m");
		if("getMenuList".equals(m)){
			System.out.println(ms.findAll());
			req.setAttribute("ml", ms.findAll());
			req.getRequestDispatcher("order.jsp").forward(req, resp);
		}
	}
}
