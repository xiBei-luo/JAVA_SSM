<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="BathPath" value="${pageContext.request.scheme}://${pageContext.request.serverName}:
${pageContext.request.localPort}
${pageContext.request.contextPath}"></c:set>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="css/OAStyle.css" rel="stylesheet" type="text/css"></link>
</head>
<body>
<div class="user">
	<span>
		当前用户： ${name}-----<c:if test="${groupId==1}">欢迎你，经理</c:if><c:if test="${groupId==2}">欢迎你，员工</c:if>
	</span>
</div>
	<ul class="menu">
	<h1>企业办公管理系统</h1>
		<li><a href="LoginAction">查看申请列表</a></li>
		<li><a href="apply.jsp">发起申请借款</a></li>
		<c:if test="${groupId==1}"><li><a href="#">审批申请</a></li></c:if>
		<c:if test="${groupId==2}"><li></c:if>
		<li><a href="${BathPath}/LoginAction?m=loginOut">退出系统</a></li>
	</ul>
</body>
</html>