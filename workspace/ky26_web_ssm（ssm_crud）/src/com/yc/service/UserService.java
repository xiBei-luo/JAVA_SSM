package com.yc.service;

import java.util.List;

import com.yc.model.UserModel;
import com.yc.model.UserQueryModel;

public interface UserService {
	void del(int operator_id);
	void add(UserModel um);
	void update(UserModel um);
	UserModel findById(int operator_id);
	List<UserModel> findAll();
	List<UserModel> findByCondition(UserQueryModel uq);
	boolean findByName(String name);
}
