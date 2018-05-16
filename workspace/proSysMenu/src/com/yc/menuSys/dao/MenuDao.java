package com.yc.menuSys.dao;

import com.yc.menuSys.model.Menu;

public interface MenuDao extends BaseDao<Menu>{
	Menu findById(int menuId);
}
