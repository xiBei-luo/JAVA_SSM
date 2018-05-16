package com.yc.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.yc.dao.UserDao;
import com.yc.dao.UserDaoImpl;
import com.yc.model.UserModel;
import com.yc.model.UserQueryModel;
import com.yc.utils.DbUtils;

public class UserServiceImpl implements UserService {
	private UserDao userDao=new UserDaoImpl();
	@Override
	public void del(int operator_id) {
		// TODO Auto-generated method stub
		userDao.del(operator_id);
	}

	@Override
	public void add(UserModel um) {
		// TODO Auto-generated method stub
		userDao.add(um);
	}

	@Override
	public UserModel update(int operator_id) {
		// TODO Auto-generated method stub
		return userDao.update(operator_id);
	}

	@Override
	public List<UserModel> findAll() {
		// TODO Auto-generated method stub
		return userDao.findAll();
	}

	@Override
	public String chkName(String name) {
		// TODO Auto-generated method stub
		return userDao.chkName(name);
	}

	@Override
	public void doUpdate(UserModel um) {
		// TODO Auto-generated method stub
		userDao.doUpdate(um);
	}

	@Override
	public List<UserModel> find(UserQueryModel uq) {
		// TODO Auto-generated method stub
		return userDao.find(uq);
	}

	

}
