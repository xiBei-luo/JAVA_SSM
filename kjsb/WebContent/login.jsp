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
<link rel="stylesheet"  id="styles" href="${basePath}/res/css/andreas08(blue).css" type="text/css" media="screen,projection" />
<script type="text/javascript" src="${basePath}/res/js/acesys.js"></script>

</head>

<body>
<div id="container" >

<jsp:include page="header.jsp"></jsp:include>

</div>
<div id="containerpic" >
  <div id="content">
<h2><strong>欢迎使用项目申报系统</strong></h2>


<div class="splitcontentleft">
  <div id="subcontent">
    <form action="login" method="post" id="form">
      <div class="small box">
        <table width="150" border="0" cellspacing="0" cellpadding="0">
          <tr>
            <td width="15%" valign="middle"><img src="${imgPath}/images\username.jpg" width="61" height="17" align="bottom" /></td>
            <td width="15%" valign="middle"><input name="username" id="username" type="text" size="7"/></td>
          </tr>
          <tr>
            <td valign="middle"><img src="${imgPath}/images\password.jpg" width="61" height="17" /></td>
            <td valign="middle"><input name="password" id="password" type="password" size="6" /></td>
          </tr>
          <tr>
            <td height="30" colspan="2" valign="bottom"><input name="image" type="image" onclick="return checkLogin(form);" src="${imgPath}/images\login_1_7.jpg" alt="登录" width="44" height="17" border="0"/>
             </td>
          </tr>
        </table>
      </div>
    </form>
    </div>
  <p>&nbsp;</p>

  </div>
</div>

</div>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>