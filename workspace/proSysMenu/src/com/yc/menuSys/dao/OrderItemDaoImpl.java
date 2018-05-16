package com.yc.menuSys.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;

import com.yc.menuSys.model.OrderItem;
import com.yc.menuSys.utils.DbHelper;

public class OrderItemDaoImpl implements OrderItemDao {
	QueryRunner qr=new QueryRunner(DbHelper.getDataSource());
	@Override
	public void add(OrderItem t) {
		// TODO Auto-generated method stub
		String sql = "insert into t_orderItem(orderId,menuId,num)values(?,?,?)";
		try {
			qr.update(sql, t.getOrderId(),t.getMenuId(),t.getNum());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List<OrderItem> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OrderItem> findByCondition(OrderItem t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void itemDel(int orderId) {
		// TODO Auto-generated method stub

	}

}
