<%@page import="java.sql.ResultSet"%>
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
<meta http-equiv="Pragma"  content="no-cache"> 
<meta http-equiv="Cache-Control"  content="no-cache"> 
<meta http-equiv="Expires"  content="0">
<title>Insert title here</title>
</head>
<body>
<div class="content">
<jsp:include page="menu.jsp"></jsp:include>
<form action="LoginAction" method="post">
<input name="m" value="" type="hidden" >
	<table cellspacing="0" class="showTable">
		<tr>
			<th>标题</th>
			<th>借款总额</th>
			<th>申请日期</th>
			<th>状态</th>
			<c:if test="${groupId==1}"><th>操作</th></c:if>
		</tr>
		<c:forEach items="${um}" var="u">
		<tr>
		 <td>${u.title}</td> 
		 <td>${u.amount}</td> 
		 <td>${u.applyDate}</td> 
		 <td>
		 	<c:if test="${u.status==0}">未审批</c:if>
			<c:if test="${u.status==1}">审批通过</c:if>
			<c:if test="${u.status==2}">审批驳回</c:if>
		 </td>
		  <c:if test="${groupId==1}">
		  	<td class="edit"><a href="#" onclick="del(${u.id})" class="delBtn">删除</a>
		  					 <%-- <a href="#" onclick="update(${u.id})" class="delBtn">审批</a> --%>
		  	</td>
		  </c:if>
		</tr>
		</c:forEach>
	</table>
</form>	
</div>	
	
<script src="js/OAJs.js"></script>
</body>
</html>