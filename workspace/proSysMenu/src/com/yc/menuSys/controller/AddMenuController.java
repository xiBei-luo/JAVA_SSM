package com.yc.menuSys.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import com.yc.menuSys.model.Menu;
import com.yc.menuSys.service.MenuService;
import com.yc.menuSys.service.MenuServiceImpl;
import com.yc.menuSys.utils.IOUtils;
public class AddMenuController extends HttpServlet{
	private MenuService sc=new MenuServiceImpl();
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
		add(req, resp);
	}
	 void add(HttpServletRequest req, HttpServletResponse resp) {
	
		// TODO Auto-generated method stub
		// String encode=this.getServletContext().getInitParameter("encode");
		Map<String,String> paramMap=new HashMap<String,String>();
		DiskFileItemFactory factory=new DiskFileItemFactory();
		factory.setSizeThreshold(1024*100);
		
		//factory.setRepository(new File(this.getServletContext().getRealPath("/upload")));
		ServletFileUpload fileUpload=new ServletFileUpload(factory);
		fileUpload.setHeaderEncoding("UTF-8");
		fileUpload.setFileSizeMax(1024*1024*1);
		fileUpload.setSizeMax(1024*1024*100);
		if(!fileUpload.isMultipartContent(req)){
			new RuntimeException("表单提交错误");
		}
		try {
			List<FileItem> list=fileUpload.parseRequest(req);
			for(FileItem item:list){
				if(item.isFormField()){
					//普通字段
					String name=item.getFieldName();
					try {
						String value=item.getString("UTF-8");
						paramMap.put(name,value);
					} catch (UnsupportedEncodingException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}else{
					String realname=item.getFieldName();
					String fname=new SimpleDateFormat("yyyyMMddHHmmss").format(new Date())+"_"+realname;
					String upload=this.getServletContext().getRealPath("/upload");
					String imgurl="/upload/"+fname;
					paramMap.put("menuPic", imgurl);
					File uploadFile=new File(upload);
					try {
						InputStream in = item.getInputStream();
						OutputStream out = new FileOutputStream(new File(upload,fname));
						
						IOUtils.In2Out(in, out);
						IOUtils.close(in, out);
						
						item.delete();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		} catch (FileUploadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Menu m=new Menu();
		try {
			BeanUtils.populate(m, paramMap);
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(m);
		sc.add(m);
	}
}
