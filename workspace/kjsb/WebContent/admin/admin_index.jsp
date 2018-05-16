﻿<%@ page language="java" contentType="text/html; charset=UTF-8"
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
<style type="text/css">
<!--
.STYLE1 {color: #FF0000}
-->
</style>
</head>

<body>
<div id="container" >

<jsp:include page="header.jsp"></jsp:include>

</div>
<div id="container" ><div id="content2">
	<table width="100%" height="41"  border="0" align="center" cellpadding="0" cellspacing="0">
		<tr>
			<td width="15" height="18" align="left" valign="top"><div align="left"></div></td>
	        <td width="385" align="left" valign="bottom" class="12">&nbsp;</td>
	    </tr>
    <tr>
    	<td height="4" colspan="2" align="left" valign="bottom"></td>
    </tr>
    <tr><td height="15" align="left" valign="top">&nbsp;</td>
      <td height="15" align="left" valign="top" class="12">
      <table width="100%" height="20" border="0" cellpadding="0" cellspacing="0"><tr><td height="20" align="center">
      <div class="right_proaducts">
        <div align="left">我的位置&gt;&gt;科技项目申报&gt;项目详细信息</div>
      </div>
      <form action="" method="post" id="form"><DIV class=padding><DIV id=middlebody>
	  		<jsp:include page="top_nav.jsp"></jsp:include>
                <table width="100%" height="260" border="0" cellpadding="0" cellspacing="1">
                  <tbody>
                    <tr>
                      <td width="44%" bgcolor="#f3f3f3"><div align="right"><img src="${imgPath}/images/tabl.gif" width="298" height="211" /></div></td>
                      <td width="56%" align="left" valign="top" bgcolor="#f3f3f3"><table width="90%" border="0" align="center" cellpadding="0" cellspacing="0">
                        <tr>
                          <td width="7%">&nbsp;</td>
                          <td width="87%">&nbsp;</td>
                          <td width="6%">&nbsp;</td>
                        </tr>
                        <tr>
                          <td>&nbsp;</td>
                          <td><table width="100%" border="0" cellspacing="0" cellpadding="0">
                            <tr>
                              <td width="10"><div align="left"></div></td>
                              <td><p align="center">管理员功能介绍</p>
                                1:登录用户管理,专家用户和单位用户增加和销毁；</br>
                                2:专家信息管理,专家用户的修改和删除；</br>
                                3:单位信息管理，单位信息的修改和删除；</br>
                                4:项目管理,项目类别的添加、修改和删除以及项目的浏览和删除。</br>
                              </td>
                            </tr>
                          </table></td>
                          <td>&nbsp;</td>
                        </tr>
                        <tr>
                          <td>&nbsp;</td>
                          <td>&nbsp;</td>
                          <td>&nbsp;</td>
                        </tr>
                      </table></td>
                    </tr>
                  </tbody>
                </table>
                <div></div>
              </form></td>
        </tr></table>
        <br/><div class="table_wz"></div></td>
    </tr>
    </table>
</div>
</div>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>