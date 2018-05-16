package com.yc.menuSys.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.yc.menuSys.model.Menu;
import com.yc.menuSys.model.MenuType;
import com.yc.menuSys.utils.DbHelper;

public class MenuDaoImpl implements MenuDao {
	QueryRunner qr=new QueryRunner(DbHelper.getDataSource());
	@Override
	public void add(Menu t) {
		// TODO Auto-generated method stub
		String sql="insert into t_menu(name,price,menuPic,menuTypeId) values(?,?,?,?)";
		try {
			qr.update(sql, t.getName(),t.getPrice(),t.getMenuPic(),t.getMenuTypeId());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List<Menu> findAll() {
		List<Menu> ms=null;
		//String sql="select mt.*,m.* from t_menu m,t_menutype mt where mt.id=m.menuTypeId";
		String sql="select * from t_menu";
		String sql_s="select * from t_menutype where id=?";
		try {
			 ms=qr.query(sql, new BeanListHandler<Menu>(Menu.class));
			 for(int i=0;i<ms.size();i++){
				 MenuType mt=qr.query(sql_s, new BeanHandler<MenuType>(MenuType.class),ms.get(i).getMenuTypeId());
				 ms.get(i).setMenuType(mt);
			 }
			 return ms;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Menu> findByCondition(Menu t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Menu findById(int menuId) {
		// TODO Auto-generated method stub
		Menu m=null;
		String sql="select * from t_menu";
		String sql_s="select * from t_menutype where id=?";
		try {
			m=qr.query(sql, new BeanHandler<Menu>(Menu.class));
			MenuType mt=qr.query(sql_s, new BeanHandler<MenuType>(MenuType.class),m.getMenuTypeId());
			m.setMenuType(mt);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return m;
	}

}
