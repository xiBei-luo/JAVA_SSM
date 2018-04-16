<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="basePath"
	value="${pageContext.request.scheme}://${pageContext.request.serverName}:${pageContext.request.localPort}${pageContext.request.contextPath}"></c:set>
<c:set var ="imgPath" value="${basePath}/res/"></c:set>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- <h1>top_nav</h1> -->
<table cellspacing="0" cellpadding="0" width="100%" border="0">
	<tbody>
	<tr>
		<td>
			<div align="left">|&nbsp;&nbsp;欢迎你,<%-- ${um.username}  --%>&nbsp;&nbsp;|&nbsp;&nbsp;
				<a class="table_t"  href="${basePath}/index.jsp">注销</a>&nbsp;&nbsp;|&nbsp;&nbsp;
				<a href="javascript:history.go(-1)">后退</a>&nbsp;&nbsp;|
			</div>
		</td>
		<td>
			<div align="center">
				<a href="${basePath}/user/findAll">登录用户管理</a>
			</div>
		</td>
		<td>
			<div align="center">
				<a href="${basePath}/experts/findAll">专家信息管理</a>
			</div>
		</td>
		<td height="50">
			<div align="center">
				<a href="${basePath}/units/findAll">单位信息管理</a>
			</div>
		</td>
		<td>
			<div align="center">
				<a href="${basePath}/projectCategorys/findAll">项目管理</a>
			</div>
		</td>
	</tr>
	</tbody>
</table>
</body>
</html>