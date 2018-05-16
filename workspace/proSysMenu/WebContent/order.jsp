<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="basePath"
	value="${pageContext.request.scheme}://${pageContext.request.serverName}:${pageContext.request.localPort}${pageContext.request.contextPath}"></c:set>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="${basePath}/res/js/jquery-1.9.1.js"></script>
</head>
<script type="text/javascript">
	function addMenu(mid){
		$.ajax({
			url:"${basePath}/orderController",
			type:"post",
			data:"m=addMenuToCar&menuId="+mid,
			success:function(msg){
				document.getElementById("num"+mid).innerHTML = eval(document.getElementById("num"+mid).innerHTML)+1;
				//$("#num"+mid+"").html(eval($("#num"+mid+"").html())+1);
				var content=msg.split(",");
					$("#tnum").html(content[0]);
					$("#tprice").html(content[1]);
					shw(mid);
				}
		});
	}
	
	function subMenu(mid){
		$.ajax({
		url:"${basePath}/orderController",
		type:"post",
		data:"m=subMenuToCar&menuId=" + mid,
		success:function(msg){
			var nn=eval(document.getElementById("num"+mid).innerHTML)-1;
			document.getElementById("num"+mid).innerHTML = nn;
			//var nn=eval($("#num"+mid+"").html())-1;//val()
			//$("#num"+mid+"").html();
			if(nn==0)
			{
				hid(mid);
			}
			 var content=msg.split(",");
				$("#tnum").html(content[0]);
				$("#tprice").html(content[1]);
				if(eval(contend[0])!=0)
				{
					$("#tnum").html(content[0]);
				}else
				{
					$("#tnum").html("");
				}
		}
	});
	}
	
	function hid(mid)
	{	
		document.getElementById("num"+mid).style.display ="none";
		document.getElementById("i"+mid).style.display ="none";

	}
	function shw(mid)
	{
		document.getElementById("num"+mid).style.display ="block";
		document.getElementById("i"+mid).style.display ="block";
	}
</script>
<body>
	<table border="0">
		<tr>
			<td colspan="4" align="right"><a href="shopCar.jsp"
				target="cnt">购 物车 </a><font color="red"><span id="tnum"></span></font>---<span
				id="tprice"></span></td>
		</tr>
		<tr></tr>
		<c:forEach items="${ml}" var="m">
			<table align="center">
			<tr>
				<td rowspan="4"><img src="${basePath}/${m.menuPic}" width="130"
					height="130" /></td>
				<td width="200">${m.name}---${m.menuType.name}---${m.price}</td>
				<td  align="center"><img id="i${m.id}" src="${basePath}/img/sub.png"
					onclick="subMenu(${m.id})" style="display: none" /></td>
					
				<td  align="center"><span id="num${m.id}" style="display: block">0</span></td>
				
				<td  align="center"><img src="${basePath}/img/add.png"
					onclick="addMenu(${m.id})" /></td>
			</tr>
			</table>
		</c:forEach>
	</table>
</body>
</html>