package com.yc.service;

import java.util.List;

import com.yc.model.UserModel;
import com.yc.model.UserQueryModel;

public interface UserService {
	void del(int operator_id);
	void add(UserModel um);
	UserModel update(int operator_id);
	List<UserModel> findAll(int page);
	String chkName(String name);
	void doUpdate(UserModel um);
	List<UserModel> find(UserQueryModel uq);
}
