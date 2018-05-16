package com.yc.menuSys.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yc.menuSys.dao.MenuDao;
import com.yc.menuSys.dao.MenuDaoImpl;
import com.yc.menuSys.framework.ShopCar;
import com.yc.menuSys.model.Menu;

public class OrderController extends HttpServlet{
	private MenuDao menuDao = new MenuDaoImpl();
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
		System.out.println("ok");
		req.setCharacterEncoding("utf-8");
		String m = req.getParameter("m");
		if("addMenuToCar".equals(m)) {
			addMenuToCar(req, resp);
		}else if ("subMenuToCar".equals(m)) {
			subMenuToCar(req, resp);
		}

	}
	private void subMenuToCar(HttpServletRequest req, HttpServletResponse resp) {
		// TODO Auto-generated method stub
		ShopCar sc = (ShopCar) req.getSession().getAttribute("sc");
		int id=Integer.parseInt(req.getParameter("menuId"));
		if (sc == null) {
			sc = new ShopCar();
		}
		Menu m = menuDao.findById(id);
		sc.sub(m);
		req.getSession().setAttribute("sc", sc);
		System.out.println(sc.getTotalNum()+"---"+sc.getTotalPrice());
		try {
			resp.getWriter().print(sc.getTotalNum() + "," + sc.getTotalPrice());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	private void addMenuToCar(HttpServletRequest req, HttpServletResponse resp) {
		// TODO Auto-generated method stub
		System.out.println("1111");
		ShopCar sc = (ShopCar) req.getSession().getAttribute("sc");
		int id=Integer.parseInt(req.getParameter("menuId"));
		if (sc == null) {
			sc = new ShopCar();
		}
		Menu m = menuDao.findById(id);
		sc.add(m);
		req.getSession().setAttribute("sc", sc);
		System.out.println(sc.getTotalNum()+"---"+sc.getTotalPrice());
		try {
			resp.getWriter().print(sc.getTotalNum() + "," + sc.getTotalPrice());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
