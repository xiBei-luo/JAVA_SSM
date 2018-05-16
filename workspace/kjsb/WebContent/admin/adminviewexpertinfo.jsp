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
          <td height="20" align="center"><div class="right_proaducts">
            <div align="left">我的位置&gt;&gt;科技项目申报&gt;专家信息<br />
              <br />
            </div>
          </div>
              <form action="expertDoUpdate" method="post" id="form">
              	<input type="hidden" value="${u.expertid}" />
                <DIV class=padding>
                <DIV id=middlebody>
                 <jsp:include page="top_nav.jsp"></jsp:include>
                <table width="50%" border="0" cellpadding="0" cellspacing="1">
                  <tr>
                    <td width="19%" height="20" align="middle" bgcolor="#f3f3f3"><div align="center">名称 </div></td>
                    <td width="81%" height="20" bgcolor="#f3f3f3"><div align="left">
                      <input id="name" value="${u.name}" name="name" />                    
                    </div></td>
                  </tr>
                  <tr>
                    <td height="20" align="middle" bgcolor="#f3f3f3"><div align="center">单位 </div></td>
                    <td height="20" bgcolor="#f3f3f3"><div align="left">
                      <input id="expert.unitname" value="${u.unitname}" name="unitname" />                    
                    </div></td>
                  </tr>
                  <tr>
                    <td height="20" align="middle" bgcolor="#f3f3f3"><div align="center">国籍 </div></td>
                    <td height="20" bgcolor="#f3f3f3"><div align="left">
                      <input id="nation" value="${u.nation}" name="nation" />                    
                    </div></td>
                  </tr>
                  <tr>
                    <td height="20" align="middle" bgcolor="#f3f3f3"><div align="center">性别 </div></td>
                    <td height="20" bgcolor="#f3f3f3"><div align="left">
                      <input id="sex" value="${u.sex}" name="sex" />                    
                    </div></td>
                  </tr>
                  <tr>
                    <td height="20" align="middle" bgcolor="#f3f3f3"><div align="center">职称 </div></td>
                    <td height="20" bgcolor="#f3f3f3"><div align="left">
                      <input id="title" value="${u.title}" name="title" />                    
                    </div></td>
                  </tr>
                  <tr>
                    <td height="20" align="middle" bgcolor="#f3f3f3"><div align="center">电话 </div></td>
                    <td height="20" bgcolor="#f3f3f3"><div align="left">
                      <input id="expert.tel" value="${u.tel}" name="tel" />                    
                    </div></td>
                  </tr>
                  <tr>
                    <td height="20" align="middle" bgcolor="#f3f3f3"><div align="center">简介 </div></td>
                    <td height="20" bgcolor="#f3f3f3"><div align="left">
                      <input id="expert.introduction" name="introduction" value="${u.introduction}" />                    
                    </div></td>
                  </tr>
                  <tr>
                    <td height="30" align="middle" bgcolor="#f3f3f3">&nbsp;</td>
                    <td height="30" align="middle" bgcolor="#f3f3f3"><div align="left">
                      <input id="submit2" type="submit" value="修改" name="submit6" />
                      <input id="button22" type="reset" value="取消" name="button22" />
                    </div></td>
                  </tr>
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