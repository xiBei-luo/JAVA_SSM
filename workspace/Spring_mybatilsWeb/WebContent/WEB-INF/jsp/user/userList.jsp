<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="res/css/style.css" rel="stylesheet" type="text/css"></link>
<script type="text/javascript" src="res/js/myJs.js" charset="UTF-8"></script>
</head>
<body>
	<div class="addBtn">
		<a href="#" onclick="add()">增加用户</a>
	</div>
	<form action="userController" method="post">
		<input type="hidden" value="find" name="m"/>
		<table cellspacing="0" class="tb_search">
		<tr>
		<td>按姓名查找</td>
		<td><input type="text" name="name" placeholder="请输入关键字查找"/></td>
		<td>
		<select name="status">
		<option value="-1">--</option>
		<option value="0">无效</option>
		<option value="1">有效</option>
		</select>
		</td>
		<td><input type="submit" value="查询"/></td>
		</tr>
		</table>
		</form>
		<table cellspacing="0">
		<tr>
			<th>账号</th>
			<th>姓名</th>
			<th>密码</th>
			<th>状态</th>
			<th colspan="2">操作</th>
		</tr>
		<c:forEach items="${um}" var="u">
		<tr class="hv">
		 <td class="idNum">${u.operator_id}</td> 
			<td>${u.name}</td>
			<td>${u.password}</td>
			<td><c:if test="${u.status==0}">无效</c:if>
				<c:if test="${u.status==1}">有效</c:if>
			</td>
			<td><a href="#" onclick="del(${u.operator_id})">删除</a></td>
			<td><a href="#" class="update" onclick="update(${u.operator_id})">修改</a>
			</td>
		</tr>
		</c:forEach>	
	</table>
	
	
</body>
</html>