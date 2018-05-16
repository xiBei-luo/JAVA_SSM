package com.yc.reflection;

public class UserController {
	private UserService uc=BasicFactory.getFactory().getService(UserService.class);
	public int del(){
		return uc.del();
	}
}
