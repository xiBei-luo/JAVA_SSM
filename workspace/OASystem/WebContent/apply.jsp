<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="css/OAStyle.css" rel="stylesheet" type="text/css"></link>
</head>
<body>
<div class="content">
<jsp:include page="menu.jsp"></jsp:include>
<h1>申请借款</h1>
<form action="LoginAction" method="post">
	<input type="hidden" name="m" value="apply"/>
	<table class="min_tb apply">
		<tr>
			<th colspan="2">借款申请</th>
		</tr>
		<tr>
			<td>标题:</td>
			<td><input type="text" name="title"/></td>
		</tr>
		<tr>
			<td>金额:</td>
			<td><input type="text" name="amount"/></td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit" value="提交"/></td>
		</tr>
	</table>
</form>

</div>
</body>
</html>