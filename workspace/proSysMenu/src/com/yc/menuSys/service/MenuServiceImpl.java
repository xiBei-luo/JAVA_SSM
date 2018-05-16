package com.yc.menuSys.service;

import java.util.List;

import com.yc.menuSys.dao.MenuDao;
import com.yc.menuSys.dao.MenuDaoImpl;
import com.yc.menuSys.model.Menu;

public class MenuServiceImpl implements MenuService{
	private MenuDao dao=new MenuDaoImpl();
	@Override
	public void add(Menu t) {
		// TODO Auto-generated method stub
		dao.add(t);
	}

	@Override
	public List<Menu> findAll() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public List<Menu> findByCondition(Menu t) {
		// TODO Auto-generated method stub
		return null;
	}

}
