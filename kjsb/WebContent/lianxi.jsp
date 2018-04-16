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
<style type="text/css">
<!--
.12 {	font-size: 12px;
	line-height: 1.5;
	text-decoration: none;
}
-->
</style>
</head>

<body>
<div id="container" >

<jsp:include page="header.jsp"></jsp:include>
</div>
<div id="container" >
  <div id="content0">
<h2><strong>欢迎使用项目申报系统</strong></h2>

<table cellspacing="0" cellpadding="0" width="95%">
  <tbody>
    <tr>
      <td><br />
        <table width="700" height="233"  border="0" align="center" cellpadding="0" cellspacing="0">
          <tr>
            <td width="15" height="18" align="left" valign="top" bgcolor="#D4D2DF"><div align="left"></div></td>
            <td colspan="2" align="left" valign="bottom" bgcolor="#D4D2DF" class="12"><strong>联系我们</strong></td>
          </tr>
          <tr>
            <td height="4" colspan="3" align="left" valign="bottom" bgcolor="#eeeeee"></td>
          </tr>
          <tr>
            <td height="4" align="left" valign="bottom" bgcolor="#eeeeee">&nbsp;</td>
            <td height="4" colspan="2" align="left" valign="bottom" bgcolor="#eeeeee" class="12"><strong>亚思晟科技</strong></td>
          </tr>
          <tr>
            <td height="15" align="left" valign="top" bgcolor="#eeeeee">&nbsp;</td>
            <td height="15" colspan="2" align="left" valign="top" bgcolor="#eeeeee" class="12"><strong>BEIJING 
              ASCENT TECHNOLOGIES INC.</strong></td>
          </tr>
          <tr>
            <td height="15" align="left" valign="top" bgcolor="#eeeeee">&nbsp;</td>
            <td height="15" colspan="2" align="left" valign="top" bgcolor="#eeeeee" class="12">地址:北京市海淀区上地东路29号留学人员创业园303-306室</td>
          </tr>
          <tr>
            <td height="15" align="left" valign="top" bgcolor="#eeeeee">&nbsp;</td>
            <td height="15" colspan="2" align="left" valign="top" bgcolor="#eeeeee" class="12">Add:Room 
              303-306,29Shangdi East Road,Overseas 
              Student Pioneer </td>
          </tr>
          <tr>
            <td height="15" align="left" valign="top" bgcolor="#eeeeee">&nbsp;</td>
            <td width="338" height="15" align="left" valign="top" bgcolor="#eeeeee" class="12">Park,Beijing,P.R.China</td>
            <td width="347" rowspan="6" align="right" valign="top" bgcolor="#eeeeee" class="12">&nbsp;</td>
          </tr>
          <tr>
            <td height="15" align="left" valign="top" bgcolor="#eeeeee">&nbsp;</td>
            <td height="15" align="left" valign="top" bgcolor="#eeeeee" class="12">邮编Post 
              Code:100085</td>
            </tr>
          <tr>
            <td height="15" align="left" valign="top" bgcolor="#eeeeee">&nbsp;</td>
            <td height="15" align="left" valign="top" bgcolor="#eeeeee" class="12">传真Fax:010-62969799</td>
            </tr>
          <tr>
            <td height="15" align="left" valign="top" bgcolor="#eeeeee">&nbsp;</td>
            <td height="15" align="left" valign="top" bgcolor="#eeeeee" class="12">电话Tel:010-82780848/82780167</td>
            </tr>
          <tr>
            <td height="15" align="left" valign="top" bgcolor="#eeeeee">&nbsp;</td>
            <td height="15" align="left" valign="top" bgcolor="#eeeeee" class="12">E-mail:ascent@ascenttech.com.cn</td>
            </tr>
          <tr>
            <td height="15" align="left" valign="top" bgcolor="#eeeeee">&nbsp;</td>
            <td height="15" align="left" valign="top" bgcolor="#eeeeee" class="12">Java技术讨论群： 
              3307453 <a href="images/map.gif" target="_blank">地图</a></td>
            </tr>
          <tr>
            <td height="15" colspan="3" valign="top" bgcolor="#eeeeee">&nbsp;</td>
          </tr>
          <tr>
            <td height="15" colspan="3" valign="top" bgcolor="#D4D2DF"></td>
          </tr>
        </table>
        <br />
        <br />
        </td>
    </tr>
  </tbody>
</table>
</div>

</div>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>