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
	<div id="header">
	</div>
	<div id="navigation">
	<ul>
	<li class="selected"></li>
	<li><a href="${basePath}/index.jsp">首页</a></li>
	<li><a href="${basePath}/jieshao.jsp">系统介绍</a></li>
	<li><a href="${basePath}/zhinan.jsp">审报指南</a></li>
	<li><a href="${basePath}/login.jsp">项目申报</a></li>
	<li><a href="${basePath}/lianxi.jsp">联系我们</a></li>
	<li></li>
	</ul>
	</div>
</body>
</html>