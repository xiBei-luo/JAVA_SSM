function checkName(name) {
//	var t;
//	var err = document.getElementById("name_msg");
//	var xhr = new XMLHttpRequest();
//	xhr.onreadystatechange = function() {
//		if (xhr.readyState == 4 && xhr.status == 200) {
//			t = xhr.responseText;
//			// alert(t);
//			if (t == 1) {
//				err.innerHTML = "用户名已存在";
//			} else {
//				err.innerHTML = "*";
//			}
//		}
//	};
//	// xhr.open("get", "chkName.jsp?name="+name+"&m="+Math.random(),true);
//	xhr.open("post", "userController?m=chkName&t=" + Math.random(), true);
//	xhr.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
//	xhr.send("name=" + name);
	alert("tt");
	$.ajax({
		url:"checkName",
		type:"post",
		data:"name="+name,
		success:function(msg){
			alert(msg);
			if(msg ==1){
				$("#name_msg").html("用户名已存在");
			}else{
				$("#name_msg").html("*");
			}
		}
	});
}
function checkForm(){
	var canSub=true;
	canSub = checkNull("operator_id","账号不能为空!")&&canSub;
	canSub=checkNull("name","用户不能为空!")&&canSub;
	canSub=checkNull("password","密码不能为空!")&&canSub;
	var obj_id_chk=document.getElementsByName("operator_id")[0].value;
	if(obj_id_chk!=null && !/^[1-9]\d{0,9}$/.test(obj_id_chk)){
		document.getElementById("operator_id_msg").innerHTML="账号格式不对!";
		canSub=false;
	}
	alert(document.getElementById("name_msg").innerHTML);
	return canSub;
}
function checkNull(name,msg){
	document.getElementById(name+"_msg").innerHTML="*";
	 var objValue=document.getElementsByName(name)[0].value;
	 if(objValue==null || objValue==""){
		 document.getElementById(name+"_msg").innerHTML="<font color='red'>"+msg+"</font>";
		 return false;
	 }
	 return true;
}

function update(operator_id) {
	alert("update");
	var w = window.screen.width;
	var h = window.screen.height;
	var ww = 520;
	var hh = 400;
	var left = (w - ww) / 2;
	var top = (h - hh) / 2;
	window.open(operator_id+"/update", "更新", "width="
			+ ww + ",height=" + hh + ",left" + left + ",top" + top + ",");
}

function del(operator_id) {
	if (window.confirm("确定删除么:" + operator_id)) {
		location.href = operator_id+"/del";
	}
}
function add() {
	var w = window.screen.width;
	var h = window.screen.height;
	var ww = 520;
	var hh = 400;
	var left = (w - ww) / 2;
	var top = (h - hh) / 2;
	window.open("add", "增加", "width=" + ww + ",height=" + hh + ",left"
			+ left + ",top" + top + ",");
}
 	