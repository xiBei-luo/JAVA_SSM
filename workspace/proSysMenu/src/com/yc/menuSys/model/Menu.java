package com.yc.menuSys.model;

public class Menu {
	private int id;
	private String name;
	private String menuPic;
	private float price;
	private int menuTypeId;
	private MenuType menuType;
	private int num;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public MenuType getMenuType() {
		return menuType;
	}
	public void setMenuType(MenuType menuType) {
		this.menuType = menuType;
	}
	private String remark;
	//private int num;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMenuPic() {
		return menuPic;
	}
	public void setMenuPic(String menuPic) {
		this.menuPic = menuPic;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getMenuTypeId() {
		return menuTypeId;
	}
	public void setMenuTypeId(int menuTypeId) {
		this.menuTypeId = menuTypeId;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	public Menu() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Menu(int id, String name, String menuPic, float price,
			int menuTypeId, MenuType menuType, int num, String remark) {
		super();
		this.id = id;
		this.name = name;
		this.menuPic = menuPic;
		this.price = price;
		this.menuTypeId = menuTypeId;
		this.menuType = menuType;
		this.num = num;
		this.remark = remark;
	}
	@Override
	public String toString() {
		return "Menu [id=" + id + ", name=" + name + ", menuPic=" + menuPic
				+ ", price=" + price + ", menuTypeId=" + menuTypeId
				+ ", menuType=" + menuType + ", remark=" + remark + "]";
	}
	
}
