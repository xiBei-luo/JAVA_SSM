package com.yc.model;

public class CategoryModel {
	private Integer id;
	private String name;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public CategoryModel(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public CategoryModel() {
		super();
	}
	public CategoryModel(String name) {
		super();
		this.name = name;
	}
	@Override
	public String toString() {
		return "CategoryModel [id=" + id + ", name=" + name + "]";
	}
	
	
}
