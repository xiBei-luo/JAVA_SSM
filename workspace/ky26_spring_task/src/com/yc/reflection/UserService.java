package com.yc.reflection;

public interface UserService extends Service {
	@Tran
	int del();
}
