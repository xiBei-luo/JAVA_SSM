package com.yc.menuSys.dao;

import java.util.List;

public interface BaseDao<T> {
	void add(T t);
	List<T> findAll();
	List<T> findByCondition(T t);
}
