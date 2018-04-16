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
<table width="100%" height="41"  border="0" align="center" cellpadding="0" cellspacing="0">
<tr><td height="4" colspan="2" align="left" valign="bottom"></td>
    </tr><tr><td height="15" align="left" valign="top">&nbsp;</td>
      <td height="15" align="left" valign="top" class="12"><table width="100%" height="20" border="0" cellpadding="0" cellspacing="0"><tr><td height="20" align="center"><div class="right_proaducts">
        <div align="left">我的位置&gt;&gt;科技项目申报&gt;项目详细信息</div>
      </div>
      <form action="expertProjectDoupdate" method="post" id="form" onsubmit="return checkAudit(this)">
	  <DIV class=padding><DIV id=middlebody>
	  
	  <jsp:include page="top_nav.jsp"></jsp:include>
	  
                <table width="50%" border="0" cellpadding="0" cellspacing="1">
                  <input type="hidden" value="6" name="projectId" />
                  <input type="hidden" value="4" name="categoryid" />
                  <tbody>
                    <tr>
                      <td width="21%" bgcolor="#f3f3f3"><div align="right">项目名称</div></td>
                      <td width="2%" bgcolor="#f3f3f3">&nbsp;</td>
                      <td width="77%" bgcolor="#f3f3f3"><div align="left">${umm.projectname}</div></td>
                    </tr>
                    <tr>
                      <td bgcolor="#f3f3f3"><div align="right">申请单位</div></td>
                      <td bgcolor="#f3f3f3">&nbsp;</td>
                      <td bgcolor="#f3f3f3"><div align="left">${umm.unitid}</div></td>
                    </tr>
                    <tr>
                      <td bgcolor="#f3f3f3"><div align="right">申请人</div></td>
                      <td bgcolor="#f3f3f3">&nbsp;</td>
                      <td bgcolor="#f3f3f3"><div align="left">${umm.applicant}</div></td>
                    </tr>
                    <tr>
                      <td bgcolor="#f3f3f3"><div align="right">职称</div></td>
                      <td bgcolor="#f3f3f3">&nbsp;</td>
                      <td bgcolor="#f3f3f3"><div align="left">${umm.grade}</div></td>
                    </tr>
                    <tr>
                      <td bgcolor="#f3f3f3"><div align="right">学历</div></td>
                      <td bgcolor="#f3f3f3">&nbsp;</td>
                      <td bgcolor="#f3f3f3"><div align="left">${umm.education}</div></td>
                    </tr>
                    <tr>
                      <td bgcolor="#f3f3f3"><div align="right">填报时间</div></td>
                      <td bgcolor="#f3f3f3">&nbsp;</td>
                      <td bgcolor="#f3f3f3"><div align="left">${umm.fill_date}</div></td>
                    </tr>
                    <tr>
                      <td bgcolor="#f3f3f3"><div align="right">项目现状</div></td>
                      <td bgcolor="#f3f3f3">&nbsp;</td>
                      <td bgcolor="#f3f3f3"><div align="left">${umm.status}</div></td>
                    </tr>
                    <tr>
                      <td bgcolor="#f3f3f3"><div align="right">项目前景</div></td>
                      <td bgcolor="#f3f3f3">&nbsp;</td>
                      <td bgcolor="#f3f3f3"><div align="left">${umm.future}</div></td>
                    </tr>
                    <tr>
                      <td bgcolor="#f3f3f3"><div align="right">重难点分析</div></td>
                      <td bgcolor="#f3f3f3">&nbsp;</td>
                      <td bgcolor="#f3f3f3"><div align="left">${umm.analysis}</div></td>
                    </tr>
                    <tr>
                      <td bgcolor="#f3f3f3"><div align="right">研究方法</div></td>
                      <td bgcolor="#f3f3f3">&nbsp;</td>
                      <td bgcolor="#f3f3f3"><div align="left">${umm.way}</div></td>
                    </tr>
                    <tr>
                      <td bgcolor="#f3f3f3"><div align="right">预计研究成果</div></td>
                      <td bgcolor="#f3f3f3">&nbsp;</td>
                      <td bgcolor="#f3f3f3"><div align="left">${umm.result}</div></td>
                    </tr>
                    <tr>
                      <td bgcolor="#f3f3f3"><div align="right">申请资金</div></td>
                      <td bgcolor="#f3f3f3">&nbsp;</td>
                      <td bgcolor="#f3f3f3"><div align="left">${umm.capital}</div></td>
                    </tr>
                    <tr>
                      <td bgcolor="#f3f3f3"><div align="right">专家评审意见</div></td>
                      <td bgcolor="#f3f3f3">&nbsp;</td>
                      <td bgcolor="#f3f3f3"><div align="left">
                        <textarea id="opinion" name="expert_opinion">${umm.expert_opinion}</textarea>
                      </div></td>
                    </tr>
                    <tr>
                      <td bgcolor="#f3f3f3"><div align="right">专家评分</div></td>
                      <td bgcolor="#f3f3f3">&nbsp;</td>
                      <td bgcolor="#f3f3f3"><div align="left">
                        <input id="score" name="score" value="${umm.score}"/>                      
                      </div></td>
                    </tr>
                    <tr>
                      <td colspan="2" align="middle" bgcolor="#f3f3f3">&nbsp;</td>
                      <td height="30" align="middle" bgcolor="#f3f3f3"><div align="left">
                        <input name="submit" type="submit" value="提交" />
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