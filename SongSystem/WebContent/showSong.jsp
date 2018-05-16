<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="basePath" value="${pageContext.request.scheme}://${pageContext.request.serverName}:${pageContext.request.localPort}${pageContext.request.contextPath}"></c:set>
<c:set var ="imgPath" value="${basePath}/res/"></c:set>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>最新金曲</title>
<link href="${basePath}/res/css/style.css" rel="stylesheet" type="text/css"></link>
</head>
<body>
<div class="mainBox manageBox">
		<jsp:include page="mainNav.jsp"></jsp:include>
		<div class="content showSongContent">
			<form action="finAllSong" method="post">
				<select name="categoryId">
					<option value="-1">---请选择---</option>
					<c:forEach items="${cm}" var="c">
					<option value="${c.id}">${c.name}</option>
					</c:forEach>
				</select>
				<input type="text" name="name" />
				<input type="submit" value="搜索"/>
			</form>
			<table>
				<tr>
					<th class="head" colspan="3">歌曲检索</th>
				</tr>
				<tr>
					<th>歌名</th>
					<th>歌手</th>
					<th>发行日期</th>
				</tr>
				<c:forEach items="${sm}" var="s">
				<tr>
					<td>${s.name}</td>
					<td>${s.singer}</td>
					<td>${s.pubDate}</td>
				</tr>
				</c:forEach>
			</table>		
		</div>
</div>
</body>
</html>