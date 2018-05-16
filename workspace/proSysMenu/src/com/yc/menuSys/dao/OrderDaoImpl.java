package com.yc.menuSys.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;

import com.yc.menuSys.model.Order;
import com.yc.menuSys.utils.DbHelper;

public class OrderDaoImpl implements OrderDao {
	QueryRunner qr=new QueryRunner(DbHelper.getDataSource());
	@Override
	public void add(Order t) {
		// TODO Auto-generated method stub
		String sql="insert into t_order(id,tableNum,personCount,totalPrice,isPay,createDateTime)values(?,?,?,?,?,?)";
		try {
			qr.update(sql,t.getId(),t.getTableNum(),t.getPersonCount(),t.getIsPay(),t.getCreateDateTime());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List<Order> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order> findByCondition(Order t) {
		// TODO Auto-generated method stub
		return null;
	}

}
