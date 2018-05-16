package com.yc.dao;

import java.util.List;

import com.yc.model.UserModel;
import com.yc.model.UserQueryModel;

public interface UserDao {
	void del(int operator_id);
	void add(UserModel um);
	UserModel update(int operator_id);
	List<UserModel> findAll();
	String chkName(String name);
	void doUpdate(UserModel um);
	List<UserModel> find(UserQueryModel uq);
	int findCount();
}
