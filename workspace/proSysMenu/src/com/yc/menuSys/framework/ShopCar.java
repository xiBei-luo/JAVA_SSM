package com.yc.menuSys.framework;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.yc.menuSys.dao.MenuDao;
import com.yc.menuSys.dao.MenuDaoImpl;
import com.yc.menuSys.model.Menu;

public class ShopCar {
	// 顾客点的菜
	private	Map<Integer, Menu> menuItem = new HashMap<Integer, Menu>();
	
	public Map<Integer, Menu> getMenuItem() {
		return menuItem;
	}

	/**
	 * 删除点菜
	 * 
	 * @param id
	 */
	public void del(int id) {
		menuItem.remove(id);
	}

	public void update(Menu m, int num) {
		m.setNum(num);
		menuItem.put(m.getId(), m);
	}

	/**
	 * 查询所有点的菜
	 * 
	 * @return
	 */
	public List<Menu> findAll() {
		return (List<Menu>) menuItem.values();
	}

	/**
	 * 增加点菜
	 * 
	 * @param m
	 */
	public void add(Menu m) {
		if (menuItem.containsKey(m.getId()))// 增加份数
		{
			Menu mt = findById(m.getId());
			mt.setNum(mt.getNum() + 1);
			menuItem.put(mt.getId(), mt);
		} else {
			m.setNum(1);
			menuItem.put(m.getId(), m);
		}
	}

	public void sub(Menu m) {
		if (menuItem.containsKey(m.getId()))// 减少份数
		{
			Menu mt = findById(m.getId());
			mt.setNum(mt.getNum() - 1);
			if (mt.getNum() < 1) {
				menuItem.remove(m.getId());
			} else {
				menuItem.put(mt.getId(), mt);
			}
		}
	}

	/**
	 * 通过菜的编号在购物车中查找菜
	 * 
	 * @param id
	 * @return
	 */
	public Menu findById(int id) {
		return menuItem.get(id);
	}

	public void printShopCar() {
		for (Menu m : menuItem.values()) {
			System.out.println(m);
		}
	}

	/**
	 * 计算购物车中菜的总价格
	 * 
	 * @return
	 */
	public double getTotalPrice() {
		double tp = 0;
		for (Menu m : menuItem.values()) {
			tp += m.getPrice() * m.getNum();
		}
		return tp;
	}

	/**
	 * 计算购物车中菜的总数量
	 * 
	 * @return
	 */
	public int getTotalNum() {
		int tn = 0;
		for (Menu m : menuItem.values()) {
			tn += m.getNum();
		}
		return tn;
	}

}

