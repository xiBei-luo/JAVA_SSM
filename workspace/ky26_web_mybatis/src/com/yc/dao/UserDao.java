package com.yc.dao;

import java.util.List;

import com.yc.model.UserModel;
import com.yc.model.UserQueryModel;

public interface UserDao {
	//CRUD
	void del(int operator_id);
	void add(UserModel um);
	void update(UserModel um);
	List<UserModel> findAll();
	List<UserModel> findByCondition(UserQueryModel uq);

}
