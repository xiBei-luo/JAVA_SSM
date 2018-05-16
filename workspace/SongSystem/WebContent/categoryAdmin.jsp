<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:set var="basePath" value="${pageContext.request.scheme}://${pageContext.request.serverName}:${pageContext.request.localPort}${pageContext.request.contextPath}"></c:set>
<c:set var ="imgPath" value="${basePath}/res/"></c:set>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>歌曲分类管理</title>
<link href="${basePath}/res/css/style.css" rel="stylesheet" type="text/css"></link>
</head>
<body>
<div class="mainBox manageBox">
		<jsp:include page="mainNav.jsp"></jsp:include>
		<div class="content">
			<table>
				<tr>
					<th class="head" colspan="3">分类管理</th>
				</tr>
				<tr>
					<th>分类编号</th>
					<th>分类名称</th>
					<th>操作</th>
				</tr>
				<c:forEach items="${cm}" var="c">
				<tr>
					<td>${c.id}</td>
					<td>${c.name}</td>
					<td><a href="#">更新</a></td>
				</tr>
				</c:forEach>
				<tr>
					<td colspan="3">添加分类
						<form method="post" action="addCategory">
							<input type="text" name="name"/>
							<input type="submit"/>
						</form>
					</td>
				</tr>
			</table>		
		</div>
</div>
</body>
</html>