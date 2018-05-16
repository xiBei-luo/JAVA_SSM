package com.yc.menuSys.dao;

import com.yc.menuSys.model.OrderItem;

public interface OrderItemDao extends BaseDao<OrderItem>{
	void itemDel(int orderId);
}
