﻿<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd"> 
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en">
<head>
<title>科技项目申报系统</title>
<meta http-equiv="content-type" content="text/html; charset=GB2312" />
<meta name="description" content="Your website description goes here" />
<meta name="keywords" content="your,keywords,goes,here" />
<link rel="stylesheet" href="../css/andreas08(blue).css" type="text/css" media="screen,projection" />
<style type="text/css">
<!--
.STYLE1 {color: #FF0000}
-->
</style>
<script type="text/javascript" src="../js/kk.js"></script>
<script type="text/javascript" src="../js/acesys.js"></script>

</head>

<body>
<div id="container" >

<div id="header";>
</div>

<div id="navigation">
<ul>
<li class="selected"></li>
<li><a href="../index.html">首页</a></li>
<li><a href="../jieshao.html">系统介绍</a></li>
<li><a href="../zhinan.html">审报指南</a></li>
<li><a href="../login.html">项目申报</a></li>
<li><a href="../lianxi.html">联系我们</a></li>
<li></li>
</ul>
</div>

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
          <td height="20"><div class="right_proaducts">我的位置&gt;&gt;科技项目申报&gt;添加项目类别<br />
                  <br />
            </div>
              <form action="showprojectCategorys.html" method="post" id="form" >
                <DIV class=padding>
                <DIV id=middlebody>
                <table cellspacing="0" cellpadding="0" width="100%" border="0">
                  <tbody>
                   <tr>
	                <td><div align="left">|&nbsp;&nbsp;欢迎,admin&nbsp;&nbsp;|&nbsp;&nbsp;
	                   <a  class="table_t"  href="../index.html">注销</a>&nbsp;&nbsp;|&nbsp;&nbsp;
	                   <a href="javascript:history.go(-1)">后退</a>&nbsp;&nbsp;|</div></td>
                      <td><div align="center"><a 
      href="../admin/showusers.html">登录用户管理</a></div></td>
                      <td><div align="center"><a 
      href="../admin/showexperts.html">专家信息管理</a></div></td>
                      <td height="50"><div align="center"><a 
      href="../admin/showunits.html">单位信息管理</a></div></td>
                      <td><div align="center"><a 
      href="../admin/showprojectCategorys.html">项目管理</a></div></td>
                    </tr>
                  </tbody>
                </table>
                <table width="400" border="0" align="center" cellpadding="0" cellspacing="1" class="mars">
                  <tbody>
                    <tr bgcolor="#fba661" height="30">
                      <td width="123" height="20" align="right" bgcolor="#f3f3f3">项目类别名称</td>
                      <td width="11" align="right" bgcolor="#f3f3f3">&nbsp;</td>
                      <td height="20" colspan="2" align="left" bgcolor="#f3f3f3"><div align="left">
                          <input type="text" id="temp1" name="categoryname" />
                      </div></td>
                    </tr>
                    <tr bgcolor="#e4f1fe">
                      <td height="20" bgcolor="#f3f3f3"><div align="right">分配专家</div></td>
                      <td bgcolor="#f3f3f3">&nbsp;</td>
                      <td height="20" colspan="2" align="left" bgcolor="#f3f3f3"><div align="left">
                          <select name="select2" size="1">
                            <option selected="selected">AA</option>
                            <option>BB</option>
                          </select>
                      </div></td>
                    </tr>
                    <tr bgcolor="#e4f1fe">
                      <td height="20" bgcolor="#f3f3f3"><div align="right">项目申报开始时间</div></td>
                      <td bgcolor="#f3f3f3">&nbsp;</td>
                      <td height="20" colspan="2" align="left" bgcolor="#f3f3f3">
					  <input type="text" id="temp2" name="repStartTime" onFocus="setday(this)"/></td>
                    </tr>
                    <tr bgcolor="#e4f1fe">
                      <td height="20" bgcolor="#f3f3f3"><div align="right">项目申报结束时间</div></td>
                      <td bgcolor="#f3f3f3">&nbsp;</td>
                      <td height="20" colspan="2" align="left" bgcolor="#f3f3f3"><span class="STYLE1">警告：结束时间不能小于当前系统时间</span></td>
                    </tr>
                    <tr bgcolor="#e4f1fe">
                      <td height="20" bgcolor="#f3f3f3"><div align="right"></div></td>
                      <td bgcolor="#f3f3f3">&nbsp;</td>
                      <td height="20" colspan="2" align="left" bgcolor="#f3f3f3">
					  <input type="text" id="temp3"  name="repStopTime" onFocus="setday(this)" /></td>
                    </tr>
                    <tr bgcolor="#e4f1fe">
                      <td height="30" bgcolor="#f3f3f3">&nbsp;</td>
                      <td bgcolor="#f3f3f3">&nbsp;</td>
                      <td width="73" height="30" align="left" bgcolor="#f3f3f3"><input type="submit" name="Submit3" value="提交" onclick="return checkAddProjectCategory(form);" /></td>
                      <td width="188" height="30" align="left" bgcolor="#f3f3f3"><input type="submit" name="Submit22" value="取消" /></td>
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
<div id="container" >
  <div id="footer">
<p><a href="http://www.ascenttech.com.cn/" target="_blank">版权所有：北京亚思晟商务科技有限公司 &copy;2004-2008|京ICP备05005681</a></p>
</div>

</div>
</body>
</html>