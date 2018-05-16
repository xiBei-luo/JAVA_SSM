<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<form action="addMenuController" method="post" enctype="multipart/form-data">
		<table>
		<tr>
		<td>菜名:</td>
		<td><input type="text" name="name"/></td>
		</tr>
		<tr>
		<td>价格:</td>
		<td><input type="text" name="price"/></td>
		</tr>
		<tr>
		<td>菜图:</td>
		<td><input type="file" name="menuPic"/></td>
		</tr>
		<tr>
		<td>类型:</td>
		<td><select	name="menuTypeId">
		<option value="1">凉菜</option>
		<option value="2">热菜</option>
		</select></td>
		</tr>
		<tr>
		<td>描述:</td>
		<td><input type="text" name="remark"/></td>
		</tr>
		<tr>
		<td colspan="2"><input type="submit" value="增加"/></td>
		</tr>
		</table>
		</form>
	</div>
</body>
</html>