<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="basePath"
	value="${pageContext.request.scheme}://${pageContext.request.serverName}:${pageContext.request.localPort}${pageContext.request.contextPath}"></c:set>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; UTF-8">
<title>Insert title here</title>
<link href="${basePath}/res/css/style.css" rel="stylesheet"
	type="text/css"></link>
<script type="text/javascript" src="${basePath}/res/js/myJs.js"
	charset="gbk"></script>
<script type="text/javascript" src="${basePath}/res/js/jquery-1.9.1.js"></script>
</head>
<body>
	<form action="add" method="post" onsubmit="return checkForm()">
		<table cellspacing="0" class="tb_search">
			<tr>
				<td>账号:</td>
				<td><input type="text" name="operator_id" /></td>
				<td id="operator_id_msg"></td>
			</tr>
			<tr>
				<td>姓名:</td>
				<td><input type="text" name="name" value="${param.name}"
					onblur="checkName(this.value)" /></td>
				<td><font color="red"><span id="name_msg"></span></font></td>
			</tr>
			<tr>
				<td>密码:</td>
				<td><input type="password" name="password" /></td>
				<td id="password_msg"></td>
			</tr>
			<tr>
				<td>状态:</td>
				<td><select name="status">
						<option value="0">无效</option>
						<option value="1">有效</option>
				</select></td>
				<td></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="增加" /></td>

			</tr>
		</table>
	</form>
</body>
</html>