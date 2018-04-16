package com.yc.service;

import java.util.List;

import com.yc.model.OALoanModel;
import com.yc.model.OALoanQueryModel;
import com.yc.model.OAUserModel;
import com.yc.model.OAUserQueryModel;
import com.yc.model.UserModel;

public interface OAUserService {
	OAUserModel loginCheck(OAUserQueryModel ouq);
	List<OALoanModel> findAll(int groupId,String loginName);
	void add(OALoanQueryModel olq);
	void del(int id);
	
}
