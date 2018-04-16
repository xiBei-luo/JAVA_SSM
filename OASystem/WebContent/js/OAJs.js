function del(id) {
	if (window.confirm("确定删除么:" + id)) {
		window.location.href = "LoginAction?m=del&id="+id;
	}
}