package com.yc.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.yc.model.UserModel;
import com.yc.model.UserQueryModel;
import com.yc.utils.DbHelper;

public class UserDaoDsImpl implements UserDao {
	QueryRunner qr=new QueryRunner(DbHelper.getDataSource());
	public void del(int operator_id) {
		// TODO Auto-generated method stub

	}

	public void add(UserModel um) {
		System.out.println("ok");
		String sql="insert into t_crud(operator_id,name,password,status) values " +
				"("+um.getOperator_id()+",'"+um.getName()+"','"+um.getPassword()+"',"+um.getStatus()+")";
		System.out.println(sql);
		try {
			qr.update(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void update(UserModel um) {
		// TODO Auto-generated method stub

	}

	public List<UserModel> findAll() {
		// TODO Auto-generated method stub
		System.out.println("UserDaoDsImpl");
		String sql="select * from t_crud";
		try {
			return qr.query(sql, new BeanListHandler<UserModel>(UserModel.class));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public List<UserModel> findByCondition(UserQueryModel uq) {
		// TODO Auto-generated method stub
		if(uq!=null){
			String sql="select * from t_crud where 1=1 ";
			if(uq.getName()!=null&&uq.getName().trim().length()>0){
			sql+=" and name like '%"+uq.getName()+"%'";
			}
			if(!(uq.getStatus()==-1)){
				sql+=" and status="+uq.getStatus();
			}
			System.out.println(sql);
			try {
				return qr.query(sql,new BeanListHandler<UserModel>(UserModel.class)) ;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}
}
