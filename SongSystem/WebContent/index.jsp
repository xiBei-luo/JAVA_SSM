<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:set var="basePath" value="${pageContext.request.scheme}://${pageContext.request.serverName}:${pageContext.request.localPort}${pageContext.request.contextPath}"></c:set>
<c:set var ="imgPath" value="${basePath}/res/"></c:set>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>歌曲管理系统</title>
<link href="${basePath}/res/css/style.css" rel="stylesheet" type="text/css"></link>
</head>
<body>
	<div class="mainBox">
		<div class=mainBoxWrap></div>
			<h1>欢迎来到歌曲管理系统</h1>
			<ul class="menu">
				<li><a href="finAllSong">曲目管理、查询</a></li>
				<li><a href="finAllCategory">分类管理、查询</a></li>
			</ul>
		
	</div>
</body>
</html>