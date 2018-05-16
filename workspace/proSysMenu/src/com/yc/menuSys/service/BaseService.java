package com.yc.menuSys.service;

import java.util.List;

public interface BaseService<T> {
	void add(T t);
	List<T> findAll();
	List<T> findByCondition(T t);
}
