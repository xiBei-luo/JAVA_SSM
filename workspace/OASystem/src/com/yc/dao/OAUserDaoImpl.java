package com.yc.dao;


//import java.sql.Date;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import java.util.ArrayList;

import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.yc.model.OALoanModel;
import com.yc.model.OALoanQueryModel;
import com.yc.model.OAUserModel;
import com.yc.model.OAUserQueryModel;
import com.yc.model.UserModel;
import com.yc.utils.DbHelper;
import com.yc.utils.DbUtils;

public class OAUserDaoImpl implements OAUserDao {
	QueryRunner qr=new QueryRunner(DbHelper.getDataSource());
	OAUserQueryModel ouq=new OAUserQueryModel();
	OALoanModel olq=new OALoanQueryModel();
	
	public OAUserModel loginCheck(OAUserQueryModel ouq){
		// TODO Auto-generated method stub
		String t="";
		String loginName=ouq.getLoginName();
		String password=ouq.getPassword();
		OAUserModel ouqRS=null;
		String sql="select * from employee where loginName='"+loginName+"' and password='"+password+"'";
		ResultSet rs=DbUtils.executeQ(sql);
		try {
			while(rs.next()){
				ouqRS=new OAUserModel(rs.getInt("id"),rs.getString("name"),rs.getString("loginName"),rs.getString("password"),rs.getInt("groupId"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ouqRS;
	}

	@Override
	public List<OALoanModel> findAll(int groupId,String loginName) {
		String sql="";
		if(groupId==1){
			sql="select * from loan";
		}else{
			sql="select * from loan where employeeID=(select id from employee where loginName='"+loginName+"')";
		}
		System.out.println(sql);
		try {
			return qr.query(sql, new BeanListHandler<OALoanModel>(OALoanModel.class));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void add(OALoanQueryModel olq) {
		// TODO Auto-generated method stub
		String sql="insert into loan(id,employeeId,title,amount,applyDate,status) values " +
				"("+olq.getId()+","+olq.getEmployeeId()+",'"+olq.getTitle()+"',"+olq.getAmount()+","+"(select now())"+","+olq.getStatus()+")";
		System.out.println(sql);
		try {
			qr.update(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void del(int id) {
		// TODO Auto-generated method stub
		String sql="delete from loan where id="+id;
		DbUtils.executeCUD(sql);
	}

	



}
