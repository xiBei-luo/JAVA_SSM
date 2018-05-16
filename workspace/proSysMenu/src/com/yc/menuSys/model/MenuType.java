package com.yc.menuSys.model;

public class MenuType {
	private int id;
	private String name;
	private String mark;
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
	public String getMark() {
		return mark;
	}
	public void setMark(String mark) {
		this.mark = mark;
	}
	public MenuType() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MenuType(int id, String name, String mark) {
		super();
		this.id = id;
		this.name = name;
		this.mark = mark;
	}
	
}
