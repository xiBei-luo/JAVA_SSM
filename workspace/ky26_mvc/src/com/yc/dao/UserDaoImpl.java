package com.yc.dao;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.yc.model.UserModel;
import com.yc.model.UserQueryModel;
import com.yc.service.UserService;
import com.yc.service.UserServiceImpl;
import com.yc.utils.DbHelper;
import com.yc.utils.DbUtils;

public class UserDaoImpl implements UserDao {
	QueryRunner qr=new QueryRunner(DbHelper.getDataSource());

	@Override
	public void del(int operator_id) {
		// TODO Auto-generated method stub
		String sql="delete from t_crud where operator_id="+operator_id;
		DbUtils.executeCUD(sql);
	}

	@Override
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

	@Override
	public UserModel update(int operator_id) {
		// TODO Auto-generated method stub
		System.out.println("ok");
		UserModel um=null;
		String sql="select * from t_crud where operator_id="+operator_id;
		System.out.println(sql);
		ResultSet rs=DbUtils.executeQ(sql);
		try {
			while(rs.next()){
				um=new UserModel(rs.getInt("operator_id"),rs.getString("name"),rs.getString("password"),rs.getInt("status"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return um;
	}

	@Override
	public List<UserModel> findAll() {
		// TODO Auto-generated method stub
		String sql="select * from t_crud";
		try {
			return qr.query(sql, new BeanListHandler<UserModel>(UserModel.class));
			//QueryRunner qr.query()简化数据库查询
			//原来的步骤，执行sql语句，将结果写入Model中，使用qr对象直接将查询结果与写入对象合为一步
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;		
	}

	@Override
	public String chkName(String name) {
		// TODO Auto-generated method stub
		String t="";
		String sql="select * from t_crud where name='"+name+"'";
		ResultSet rs=DbUtils.executeQ(sql);
		try {
			if(rs.next()){
				t="1";
			}else{
				t="0";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(sql);
		return t;
	}

	@Override
	public void doUpdate(UserModel um) {
		// TODO Auto-generated method stub
		String sql="update t_crud set name='"+um.getName()+"',password='"+um.getPassword()+"',status="+um.getStatus()+" where operator_id="+um.getOperator_id();
		System.out.println(sql);
		try {
			qr.update(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List<UserModel> find(UserQueryModel uq) {
		// TODO Auto-generated method stub
		List<UserModel> um=null;
		if(uq!=null){
			um=new ArrayList<UserModel>();
			String sql="select * from t_crud where 1=1 ";
			UserModel u=null;
			if(uq.getName()!=null&&uq.getName().trim().length()>0){
			sql+=" and name like '%"+uq.getName()+"%'";
			}
			if(!(-1==uq.getStatus())){
				sql+=" and status="+uq.getStatus();
			}
			
			try {
				return qr.query(sql, new BeanListHandler<UserModel>(UserModel.class));
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}
	
	@Override
	public int findCount() {
		// TODO Auto-generated method stub
		int count=0;
		String sql="select count(*)from t_crud";//获得数据总条数
		ResultSet rs=DbUtils.executeQ(sql);
		try {
			if(rs.next()){
				count=rs.getInt(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return count;
	}

	

}
