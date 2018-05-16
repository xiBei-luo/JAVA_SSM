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
		/*int n=0;
		n=1/n;*/
	}

	public void add(UserModel um) {
		// TODO Auto-generated method stub
		userDao.add(um);
	}

	public void update(UserModel um) {
		// TODO Auto-generated method stub
		userDao.update(um);

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

	@Override
	public boolean findByName(String name) {
		// TODO Auto-generated method stub
		List<UserModel> um=userDao.findByName(name);
		if(um !=null &&um.size()==1){
			return true;
		}
		return false;
	}

	@Override
	public UserModel findById(int operator_id) {
		// TODO Auto-generated method stub
		return userDao.findById(operator_id);
	}

}
