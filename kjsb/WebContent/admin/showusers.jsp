<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:set var="basePath"
	value="${pageContext.request.scheme}://${pageContext.request.serverName}:${pageContext.request.localPort}${pageContext.request.contextPath}"></c:set>
<c:set var ="imgPath" value="${basePath}/res/"></c:set>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd"> 
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en">
<head>
<title>科技项目申报系统</title>
<meta http-equiv="content-type" content="text/html; charset=UTF-8" />
<meta name="description" content="Your website description goes here" />
<meta name="keywords" content="your,keywords,goes,here" />
<link rel="stylesheet" href="${basePath}/res/css/andreas08(blue).css" type="text/css" media="screen,projection" />
</head>

<body>
<div id="container" >

<jsp:include page="header.jsp"></jsp:include>

</div>
<div id="container" >
  <div id="content2">
    <table width="100%" height="41"  border="0" align="center" cellpadding="0" cellspacing="0">
    <tr>
      <td width="15" height="18" align="left" valign="top"><div align="left"></div></td>
      <td width="385" align="left" valign="bottom" class="12">&nbsp;</td>
    </tr>
    <tr>
      <td height="4" colspan="2" align="left" valign="bottom"></td>
    </tr>
    <tr>
      <td height="15" align="left" valign="top">&nbsp;</td>
      <td height="15" align="left" valign="top" class="12"><table width="100%" height="20" border="0" cellpadding="0" cellspacing="0">
        <tr>
          <td height="20"><div class="right_proaducts">我的位置&gt;&gt;科技项目申报&gt;登录用户列表<br />
                    <br />
          </div>
                <form action="findAll" method="post" id="form">
                  <DIV class=padding>
                  <DIV id=middlebody>
                  <jsp:include page="top_nav.jsp"></jsp:include>
                  <table class="mars" cellspacing="1" cellpadding="0" width="100%" border="0">
                    <tbody>
                      <tr bgcolor="#fba661" height="30">
                        <td><div align="center">登录名</div></td>
                        <td><div align="center">用户组</div></td>
                        <td><div align="center">删除</div></td>
                      </tr>
                      <c:forEach items="${um}" var="u">
                      <tr bgcolor="#e4f1fe">
                        <td bgcolor="#f3f3f3"><div align="center">${u.username}</div></td>
                        <td bgcolor="#f3f3f3"><div align="center">${u.gid}</div></td>
                        <td bgcolor="#f3f3f3"><div align="center"><a href="${basePath}/${u.uid}/userDel">删除</a></div></td>
                      </tr>
                     </c:forEach>
                      
                      
                      <tr bgcolor="#e4f1fe">
                        <td bgcolor="#f3f3f3" colspan="3"><div align="center"><a href="${basePath}/add">添加用户</a></div></td>
                      </tr>
                    </tbody>
                  </table>
                  <div>
                    <div align="right"><a href="../admin/adduser.html"></a></div>
                  </div>
                </form></td>
        </tr>
      </table>
          <br/>
          <div class="table_wz"></div></td>
    </tr>
  </table>
</div>
</div>
<jsp:include page="footer.jsp"></jsp:include>

</div>
</body>
</html>