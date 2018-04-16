<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="basePath"
	value="${pageContext.request.scheme}://${pageContext.request.serverName}:${pageContext.request.localPort}${pageContext.request.contextPath}"></c:set>
<c:set var ="imgPath" value="${basePath}/res/"></c:set>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table cellspacing="0" cellpadding="0" width="100%" border="0"><tbody><tr><td><div align="left">|&nbsp;&nbsp;欢迎你,${um.username}&nbsp;&nbsp;|&nbsp;&nbsp;<a 
      class="table_t" 
      href="${basePath}/index.jsp">注销</a>&nbsp;&nbsp;|&nbsp;&nbsp;<a href="javascript:history.go(-1)">后退</a>&nbsp;&nbsp;|</div></td>
                      <td><div align="center"><a href="viewunitinfo">单位信息</a></div></td>
                      <td><div align="center"><a href="reworkpassword">修改密码</a><%-- <a 
      href="${basePath}/expert/viewexpertinfo.jsp"></a> --%></div></td>
                      <td><div align="center"><a href="showprojectCategorys">项目申报管理</a><%-- <a 
      href="${basePath}/expert/reworkpassword.jsp"></a> --%></div></td>
                      <td height="50"><div align="center"><a href="${basePath}/simpleSearch">信息查询</a><%-- <a 
      href="${basePath}/expert/showprojectCategorys.jsp"></a> --%></div></td>
                      </tr></tbody></table>
</body>
</html>