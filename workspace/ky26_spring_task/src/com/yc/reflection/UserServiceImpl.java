package com.yc.reflection;

public class UserServiceImpl implements UserService {
	private UserDao dao=BasicFactory.getFactory().getDao(UserDao.class);
	public int del(){
		int n=0;
		n=1/n;
		return dao.del();
	}
}
