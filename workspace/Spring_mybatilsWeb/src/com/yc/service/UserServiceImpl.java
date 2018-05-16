package com.yc.service;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.yc.dao.UserDao;
import com.yc.model.UserModel;
import com.yc.model.UserQueryModel;
@Service("us")
public class UserServiceImpl implements UserService {

	@Resource
	private UserDao userDao;
	public void del(int operator_id) {
		// TODO Auto-generated method stub
		userDao.del(operator_id);
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
