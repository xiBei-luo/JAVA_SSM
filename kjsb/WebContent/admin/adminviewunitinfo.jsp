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
</head>

<body>
<div id="container" >

<jsp:include page="header.jsp"></jsp:include>

</div>
<div id="container" >
  <div id="content2">
    <table width="100%" height="41"  border="0" align="center" cellpadding="0" cellspacing="0">
    <tr>
      <td height="15" align="left" valign="top">&nbsp;</td>
      <td height="15" align="left" valign="top" class="12"><table width="100%" height="20" border="0" cellpadding="0" cellspacing="0">
        <tr>
          <td height="20" align="center"><div class="right_proaducts">
            <div align="left">我的位置&gt;&gt;科技项目申报&gt;单位信息 </div>
          </div>
              <form action="unitDoUpdate" method="post" id="form">
              <input type="hidden" value="${u.unitid}" />
                <DIV class=padding>
                <DIV id=middlebody>
                 <jsp:include page="top_nav.jsp"></jsp:include>
                <table width="60%" border="0" cellpadding="0" cellspacing="1">
                  <tbody>
                    <tr> </tr>
                    <tr>
                      <td height="20" align="middle" bgcolor="#f3f3f3">单位名称</td>
                      <td height="20" bgcolor="#f3f3f3"><div align="left">
                        <input id="unit.unitname" value="${u.unitname}" name="unitname" />
                      </div></td>
                    </tr>
                    <tr>
                      <td height="20" align="middle" bgcolor="#f3f3f3">单位地址</td>
                      <td height="20" bgcolor="#f3f3f3"><div align="left">
                        <input id="unit.address" value="${u.address}" name="address" />
                      </div></td>
                    </tr>
                    <tr>
                      <td height="20" align="middle" bgcolor="#f3f3f3">单位法人</td>
                      <td height="20" bgcolor="#f3f3f3"><div align="left">
                        <input id="unit.corporation" value="${u.corporation}" name="corporation" />
                      </div></td>
                    </tr>
                    <tr>
                      <td height="20" align="middle" bgcolor="#f3f3f3">注册资金</td>
                      <td height="20" bgcolor="#f3f3f3"><div align="left">
                        <input id="unit.investment" value="${u.investment}" name="investment" />
                      </div></td>
                    </tr>
                    <tr>
                      <td height="20" align="middle" bgcolor="#f3f3f3">单位性质</td>
                      <td height="20" bgcolor="#f3f3f3"><div align="left">
                        <input id="unit.type" value="${u.type}" name="type" />
                      </div></td>
                    </tr>
                    <tr>
                      <td height="20" align="middle" bgcolor="#f3f3f3">单位电话</td>
                      <td height="20" bgcolor="#f3f3f3"><div align="left">
                        <input id="unit.tel" value="${u.tel}" name="tel" />
                      </div></td>
                    </tr>
                    <tr>
                      <td height="20" align="middle" bgcolor="#f3f3f3">单位邮箱</td>
                      <td height="20" bgcolor="#f3f3f3"><div align="left">
                        <input id="unit.email" value="${u.email}" name="email" />
                      </div></td>
                    </tr>
                    <tr>
                      <td height="20" align="middle" bgcolor="#f3f3f3">单位传真</td>
                      <td height="20" bgcolor="#f3f3f3"><div align="left">
                        <input id="unit.fax" value="${u.fax}" name="fax" />
                      </div></td>
                    </tr>
                    <tr>
                      <td height="20" align="middle" bgcolor="#f3f3f3">单位邮编</td>
                      <td height="20" bgcolor="#f3f3f3"><div align="left">
                        <input id="unit.zipcode" value="${u.zipcode}" name="zipcode" />
                      </div></td>
                    </tr>
                    <tr>
                      <td align="middle" bgcolor="#f3f3f3">单位简介</td>
                      <td bgcolor="#f3f3f3"><div align="left">
                        <textarea id="textarea" name="introduction" rows="5" cols="40">${u.introduction}</textarea>
                      </div></td>
                    </tr>
                    <tr>
                      <td height="30" colspan="2" align="middle" bgcolor="#f3f3f3"><input id="submit3" type="submit" value="修改" name="submit7" />
                          <input id="button23" type="reset" value="取消" name="button23" />                      </td>
                    </tr>
                  </tbody>
                </table>
                <div></div>
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
</body>
</html>