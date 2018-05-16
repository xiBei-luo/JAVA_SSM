package com.yc.reflection;

public class UserDaoImpl implements UserDao{

	@Override
	public int del() {
		// TODO Auto-generated method stub
		System.out.println("+++");
		String sql="delete from t_user where operator_id=5";
		DbUtils.executeCUD(sql);
		return 0;
	}

	@Override
	public void add(User u) {
		// TODO Auto-generated method stub
		
	}

}
