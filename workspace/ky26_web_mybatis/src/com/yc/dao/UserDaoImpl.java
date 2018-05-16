package com.yc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yc.model.UserModel;
import com.yc.model.UserQueryModel;
import com.yc.utils.DbUtils;

public class UserDaoImpl implements UserDao {

	public void del(int operator_id) {
		// TODO Auto-generated method stub

	}

	public void add(UserModel um) {
		// TODO Auto-generated method stub

	}

	public void update(UserModel um) {
		// TODO Auto-generated method stub

	}

	public List<UserModel> findAll() {
		List<UserModel> list=new ArrayList<UserModel>();
		UserModel um=null;
		String sql="select * from t_crud";
		ResultSet rs=DbUtils.executeQ(sql);
		try {
			while(rs.next()){
				um=new UserModel(rs.getInt("operator_id"),rs.getString("name"),rs.getString("password"),rs.getInt("status"));
				list.add(um);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	public List<UserModel> findByCondition(UserQueryModel uq) {
		// TODO Auto-generated method stub
		return null;
	}

}
