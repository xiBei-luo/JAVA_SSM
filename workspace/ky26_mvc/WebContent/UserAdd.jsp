<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>增加用户</title>
<link href="css/style.css" rel="stylesheet" type="text/css"></link>
<script type="text/javascript" src="js/myJs.js"charset="UTF-8"></script>
</head>
<body>
	<form action="userController" method="post" onsubmit="return checkForm()">
		<input type="hidden" name="m" value="add"/>
		<table cellspacing="0" class="tb_search">
			<tr>
			<td>账号:</td>
			<td><input type="text" name="operator_id" /></td>
			<td id="operator_id_msg"></td>
			</tr>
			<tr>
			<td>姓名:</td>
			<td><input type="text" name="name" value="${param.name}" onblur="checkName(this.value)"/></td>
			<td id="name_msg"></td>
			</tr>
			<tr>
			<td>密码:</td>
			<td><input type="password" name="password"/></td>
			<td id="password_msg"></td>
			</tr>
			<tr>
				<td>状态:</td>
				<td>
					<select name="status">
						<option value="0">无效</option>
						<option value="1">有效</option>
					</select>
				</td>
				<td></td>
			</tr>
		<tr>
			<td colspan="2"> <input type="submit" id="subBtn" value="增加"/></td>
			
		</tr>
	</table>
	</form>
</body>
</html>