<%-- <%@page import="com.yc.service.UserServiceImpl"%>
<%@page import="java.util.List"%>
<%@page import="com.yc.model.UserQueryModel"%>
<%@page import="com.yc.model.UserModel"%>
<%@page import="com.yc.service.UserService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%! UserService us=new UserServiceImpl();%>  
<%
request.setCharacterEncoding("UTF-8");
String m=request.getParameter("m");
if(m!=null && "add".equals(m)){
	String operator_id=request.getParameter("operator_id");
	String name=request.getParameter("name");
	String password=request.getParameter("password");
	String status=request.getParameter("status");
	UserModel um=new UserModel(Integer.parseInt(operator_id),name,password,Integer.parseInt(status));
	us.add(um);
	out.print("<script>alert('添加成功');window.opener.location='controller.jsp';window.close();</script>");
}else if(m!=null && "chkName".equals(m)){
	String name=request.getParameter("name");
	out.print(us.chkName(name)); 
}else if(m!=null && "doUpdate".equals(m)){
	String operator_id=request.getParameter("operator_id");
	String name=request.getParameter("name");
	String password=request.getParameter("password");
	String status=request.getParameter("status");
	UserModel um=new UserModel(Integer.parseInt(operator_id),name,password,Integer.parseInt(status));
	us.doUpdate(um);
	out.print("<script>alert('修改成功');window.opener.location='controller.jsp';window.close();</script>");
}else if(m!=null && "del".equals(m)){
	us.del(Integer.parseInt(request.getParameter("operator_id")));
	out.print("<script>alert('删除成功');location.href='controller.jsp';</script>");
}else if(m!=null && "update".equals(m)){
	String operator_id=request.getParameter("operator_id");
	request.setAttribute("um",us.update(Integer.parseInt(operator_id)));
	request.getRequestDispatcher("UserUpdate.jsp").forward(request,response);
}else if(m!=null && "find".equals(m)){
	String name=request.getParameter("name");
	String status=request.getParameter("status");
	UserQueryModel uq=new UserQueryModel();
 	uq.setName(name);
	uq.setStatus(Integer.parseInt(status));  
	//System.out.println(um.getName()+"-----"+um.getStatus());
	List<UserModel> um=us.find(uq); 
	request.setAttribute("um",um);
	request.getRequestDispatcher("UserList.jsp").forward(request,response);  
}else{
	request.setAttribute("um",us.findAll());
	request.getRequestDispatcher("UserList.jsp").forward(request,response);
}

%>  --%>