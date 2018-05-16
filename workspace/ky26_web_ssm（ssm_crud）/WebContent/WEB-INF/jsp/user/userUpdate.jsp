<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="basePath"
	value="${pageContext.request.scheme}://${pageContext.request.serverName}:${pageContext.request.localPort}${pageContext.request.contextPath}"></c:set>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="${basePath}/res/css/style.css" rel="stylesheet"
	type="text/css"></link>
<script type="text/javascript" src="${basePath}/res/js/myJs.js"
	charset="gbk"></script>
</head>
<body>
	<form action="${basePath}/jsp/user/update" method="post">
	<input type="hidden" name="operator_id" value="${u.operator_id}"/>
	<table cellspacing="0" class="tb_search">
			<tr>
			<td>账号:</td>
			<td><input type="text" name="operator_id" disabled="disabled" value="${u.operator_id}"/></td>
			</tr>
			<tr>
			<td>姓名:</td>
			<td><input type="text" name="name" value="${u.name}"/></td>
			</tr>
			<tr>
			<td>密码:</td>
			<td><input type="password" name="password" value="${u.password}"/></td>
			</tr>
			<tr>
			<td>状态:</td>
			<td>
			<select name="status">
			<option value="0" <c:if test="${u.status==0}">selected="selected"</c:if> >无效</option>
			<option value="1" <c:if test="${u.status==1}">selected="selected"</c:if> >有效</option>
			</select>
			</td>
		</tr>
		<tr>
			<td colspan="2"> <input id="subBtn" type="submit" value="确认修改"/></td>	
		</tr>
		</table>
	</form>
</body>
</html>