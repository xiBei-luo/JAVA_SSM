package com.yc.service;

import java.util.List;

import com.yc.dao.UserDao;
import com.yc.dao.UserDaoDsImpl;
import com.yc.dao.UserDaoMybatisImpl;
//import com.yc.dao.UserDaoImpl;
import com.yc.model.UserModel;
import com.yc.model.UserQueryModel;

public class UserServiceImpl implements UserService {
	//private UserDao userDao=new UserDaoDsImpl();
	private UserDao userDao=new UserDaoMybatisImpl();
	public void del(int operator_id) {
		// TODO Auto-generated method stub

	}

	public void add(UserModel um) {
		// TODO Auto-generated method stub
		userDao.add(um);
	}

	public void update(UserModel um) {
		// TODO Auto-generated method stub

	}

	public List<UserModel> findAll() {
		// TODO Auto-generated method stub
		return userDao.findAll();
	}

	public List<UserModel> findByCondition(UserQueryModel uq) {
		// TODO Auto-generated method stub
		uq.setName("%"+uq.getName()+"%");
		System.out.println(uq);
		return userDao.findByCondition(uq);
	}

}
