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
<meta http-equiv="content-type" content="text/html; charset=GB2312" />
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
<div id="container" ><div id="content2"><table width="100%" height="41"  border="0" align="center" cellpadding="0" cellspacing="0"><tr><td width="15" height="18" align="left" valign="top"><div align="left"></div></td>
      <td width="385" align="left" valign="bottom" class="12">&nbsp;</td>
    </tr><tr><td height="4" colspan="2" align="left" valign="bottom"></td>
    </tr><tr><td height="15" align="left" valign="top">&nbsp;</td>
      <td height="15" align="left" valign="top" class="12"><table width="100%" height="20" border="0" cellpadding="0" cellspacing="0"><tr><td height="20" align="center"><div class="right_proaducts">
        <div align="left">我的位置&gt;&gt;科技项目申报&gt;项目查询</div>
      </div>
      <form action="highqueryY" method="post" id="form"><DIV class=padding><DIV id=middlebody>
	   <jsp:include page="top_nav.jsp"></jsp:include>
		      <div align="center">
		         <table width="60%" border="0" cellpadding="0" cellspacing="1" bgcolor="#f3f3f3">
		           <tbody>
		         <tr>
		          <td align="center" width="20%" valign="middle">项目内容:</td>
		          <td  align="left" width="80%"><input type="text" name="sercontext" size="30" ></td>
		          </tr>
		         <tr><td align="center">开始日期</td>
		         <td align="left"><input  type="text" name="startDate" id="temp2" onFocus="setday(this)" /></td></tr>
		          <tr><td align="center">结束日期</td>
		          <td align="left"><input  type="text" name="endDate" id="temp3"  onFocus="setday(this)" /></td>
		         <tr><td align="center">申请资金</td>
		          <td align="left"><input type="text" name="money" size="30"></td></tr>
		         <tr><td colspan="2" align="center"><input type="submit" value="高级查询" style="font-size:8pt"></td></tr>
		         </tbody>
		         </table> 
	          </div>
                <table width="100%" border="0" cellpadding="0" cellspacing="1">
                  <tbody>
                    <tr>
                      <td align="center" bgcolor="#fba661">主项目</td>
                      <td align="center" bgcolor="#fba661">分项目</td>
                      <td width="208" align="center" bgcolor="#fba661">操作</td>
                    </tr>
                    <tr>
                      <td width="150" align="center" bgcolor="#f3f3f3">科技研发</td>
                      <td width="342" align="center" bgcolor="#f3f3f3"><a href="../unit/viewprojectinfo1.html">软件研发</a></td>
                      <td align="center" bgcolor="#f3f3f3"><a href="../unit/viewprojectinfo.html">没有评审</a></td>
                    </tr>
                    <tr>
                      <td width="150" align="center" bgcolor="#f3f3f3">工程建设</td>
                      <td width="342" align="center" bgcolor="#f3f3f3"><a href="../unit/viewprojectinfo1.html">地铁工程建设</a></td>
                      <td align="center" bgcolor="#f3f3f3"><a href="../unit/viewprojectinfo.html">没有评审</a></td>
                    </tr>
                    <tr>
                      <td width="150" align="center" bgcolor="#f3f3f3">金融工程</td>
                      <td width="342" align="center" bgcolor="#f3f3f3"><a href="../unit/viewprojectinfo1.html">金融投资项目</a></td>
                      <td align="center" bgcolor="#f3f3f3"><a href="../unit/viewprojectinfo.html">没有评审</a></td>
                    </tr>
                    <tr>
                      <td width="150" align="center" bgcolor="#f3f3f3">航空建设</td>
                      <td width="342" align="center" bgcolor="#f3f3f3"><a href="../unit/viewprojectinfo1.html">航空公司建设项目</a></td>
                      <td align="center" bgcolor="#f3f3f3">专家已评审，不能修改</td>
                    </tr>
                    <tr>
                      <td width="150" align="center" bgcolor="#f3f3f3">奥运工程</td>
                      <td width="342" align="center" bgcolor="#f3f3f3"><a href="../unit/viewprojectinfo1.html">奥运管理系统</a></td>
                      <td align="center" bgcolor="#f3f3f3">专家已评审，不能修改</td>
                    </tr>
                  </tbody>
                </table>
                <div></div>
              </td>
        </tr></table>
        <br/><div class="table_wz"></div></td>
    </tr></table>
</div>
</div>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>