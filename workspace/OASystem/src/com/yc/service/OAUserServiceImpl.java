package com.yc.service;

import java.util.List;

import com.yc.dao.OAUserDao;
import com.yc.dao.OAUserDaoImpl;
import com.yc.model.OALoanModel;
import com.yc.model.OALoanQueryModel;
import com.yc.model.OAUserModel;
import com.yc.model.OAUserQueryModel;
import com.yc.model.UserModel;

public class OAUserServiceImpl implements OAUserService{
	OAUserDao oud=new OAUserDaoImpl();

	@Override
	public OAUserModel loginCheck(OAUserQueryModel ouq) {
		// TODO Auto-generated method stub
		return oud.loginCheck(ouq);
	}

	@Override
	public List<OALoanModel> findAll(int groupId,String loginName) {
		// TODO Auto-generated method stub
		return oud.findAll(groupId,loginName);
	}

	@Override
	public void add(OALoanQueryModel olq) {
		// TODO Auto-generated method stub
		oud.add(olq);
	}
	@Override
	public void del(int operator_id) {
		// TODO Auto-generated method stub
		oud.del(operator_id);
	}
	
}
