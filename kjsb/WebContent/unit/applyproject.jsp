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
<script type="text/javascript" src="${basePath}/res/js/acesys.js"></script>
</head>

<body>
<div id="container" >

<jsp:include page="header.jsp"></jsp:include>

</div>
<div id="container" ><div id="content2">
<table width="100%" height="21"  border="0" align="center" cellpadding="0" cellspacing="0">
<tr>
<td width="15" height="15" align="left" valign="top"><div align="left"></div></td>
      <td width="385" align="left" valign="bottom" class="12">&nbsp;</td>
    </tr>
	<tr><td height="15" align="left" valign="top">&nbsp;</td>
      <td height="15" align="left" valign="top" class="12">
	  <table width="100%" height="15" border="0" cellpadding="0" cellspacing="0">
	  <tr><td height="20" align="center"><div class="right_proaducts">
        <div align="left">我的位置&gt;&gt;科技项目申报&gt;申请项目信息</div>
      </div>
      <form action="${basePath}/addproject" method="post" id="form" onsubmit="return checkProjectDeclare(this)">
	  <DIV class=padding><DIV id=middlebody>
	   <jsp:include page="top_nav.jsp"></jsp:include>
                <table width="60%" border="0" cellpadding="0" cellspacing="1">
                  <input type="hidden" value="" name="" />
                  <input type="hidden" value="5" name="" />
                  <tbody>
                    <tr>
                      <td width="126" align="right" bgcolor="#f3f3f3">项目分类名称</td>
                      <td width="10" align="right" bgcolor="#f3f3f3">&nbsp;</td>
                      <td colspan="2" bgcolor="#f3f3f3"><div align="left">${umm.categoryname}</div></td>
                    </tr>
                    <tr>
                      <td align="right" bgcolor="#f3f3f3">项目名称</td>
                      <td align="right" bgcolor="#f3f3f3">&nbsp;</td>
                      <td colspan="2" bgcolor="#f3f3f3"><div align="left">
                        <input id="projectname" name="projectname" />
                      </div></td>
                    </tr>
                    <tr>
                      <td align="right" bgcolor="#f3f3f3">申请单位</td>
                      <td align="right" bgcolor="#f3f3f3">&nbsp;</td>
                      <td colspan="2" bgcolor="#f3f3f3"><div align="left">
                        <input id="unitid" value="2" name="unitid" />
                      </div></td>
                    </tr>
                    <tr>
                      <td align="right" bgcolor="#f3f3f3">申请人</td>
                      <td align="right" bgcolor="#f3f3f3">&nbsp;</td>
                      <td colspan="2" bgcolor="#f3f3f3"><div align="left">
                        <input id="applicant" name="applicant" />
                      </div></td>
                    </tr>
                    <tr>
                      <td align="right" bgcolor="#f3f3f3">职称</td>
                      <td align="right" bgcolor="#f3f3f3">&nbsp;</td>
                      <td colspan="2" bgcolor="#f3f3f3"><div align="left">
                        <input id="grade" name="grade" />
                      </div></td>
                    </tr>
                    <tr>
                      <td align="right" bgcolor="#f3f3f3">学历</td>
                      <td align="right" bgcolor="#f3f3f3">&nbsp;</td>
                      <td colspan="2" bgcolor="#f3f3f3"><div align="left">
                        <input id="education" name="education" />
                      </div></td>
                    </tr>
                    <tr>
                      <td align="right" bgcolor="#f3f3f3">申请时间</td>
                      <td align="right" bgcolor="#f3f3f3">&nbsp;</td>
                      <td colspan="2" bgcolor="#f3f3f3"><div align="left">
                        <input id="filldate" type="date" onfocus="setday(this)" name="fill_date" />
                      </div></td>
                    </tr>
                    <tr>
                      <td align="right" bgcolor="#f3f3f3">项目现状</td>
                      <td align="right" bgcolor="#f3f3f3">&nbsp;</td>
                      <td colspan="2" bgcolor="#f3f3f3"><div align="left">
                        <input id="status" name="status" />
                      </div></td>
                    </tr>
                    <tr>
                      <td align="right" bgcolor="#f3f3f3">项目前景</td>
                      <td align="right" bgcolor="#f3f3f3">&nbsp;</td>
                      <td colspan="2" bgcolor="#f3f3f3"><div align="left">
                        <input id="future" name="future" />
                      </div></td>
                    </tr>
                    <tr>
                      <td align="right" bgcolor="#f3f3f3">重难点分析</td>
                      <td align="right" bgcolor="#f3f3f3">&nbsp;</td>
                      <td colspan="2" bgcolor="#f3f3f3"><div align="left">
                        <input id="analysis" name="analysis" />
                      </div></td>
                    </tr>
                    <tr>
                      <td align="right" bgcolor="#f3f3f3">研究方法</td>
                      <td align="right" bgcolor="#f3f3f3">&nbsp;</td>
                      <td colspan="2" bgcolor="#f3f3f3"><div align="left">
                        <input id="way" name="way" />
                      </div></td>
                    </tr>
                    <tr>
                      <td align="right" bgcolor="#f3f3f3">预计研究成果</td>
                      <td align="right" bgcolor="#f3f3f3">&nbsp;</td>
                      <td colspan="2" bgcolor="#f3f3f3"><div align="left">
                        <input id="result" name="result" />
                      </div></td>
                    </tr>
                    <tr>
                      <td align="right" bgcolor="#f3f3f3">申请资金</td>
                      <td align="right" bgcolor="#f3f3f3">&nbsp;</td>
                      <td colspan="2" bgcolor="#f3f3f3"><div align="left">
                        <input id="capital" name="capital" />
                      </div></td>
                    </tr>
                    <tr>
                      <td colspan="2" align="right" bgcolor="#f3f3f3">&nbsp;</td>
                      <td width="70" bgcolor="#f3f3f3"><div align="left">
                        <input name="submit3" type="submit" value="申请" />
                      </div></td>
                      <td width="239" bgcolor="#f3f3f3"><div align="left">
                        <input name="reset" type="reset" value="重置" />
                      </div></td>
                    </tr>
                  </tbody>
                </table>
                <div></div>
              </form></td>
        </tr></table>
        <br/><div class="table_wz"></div></td>
    </tr></table>
</div>
</div>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>