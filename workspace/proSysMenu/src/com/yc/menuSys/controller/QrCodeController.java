package com.yc.menuSys.controller;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yc.menuSys.framework.QrCodeUtil;

public class QrCodeController extends HttpServlet{
	private static final long serialVersionUID = 1L;
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
		String url =req.getScheme()+"//:"+"192.168.0.107"+":"+req.getLocalPort()+req.getContextPath()+"/menuController";
		System.out.println(url);
		BufferedImage image=QrCodeUtil.getQrCode(url);
		ImageIO.write(image, "gif", resp.getOutputStream());
	}
}
