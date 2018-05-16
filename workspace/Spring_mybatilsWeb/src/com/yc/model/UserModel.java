package com.yc.model;

public class UserModel {
	private int operator_id;
	private String name;
	private String password;
	private int status;
	public int getOperator_id() {
		return operator_id;
	}
	public void setOperator_id(int operator_id) {
		this.operator_id = operator_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
	public UserModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserModel(String name, String password, int status) {
		super();
		this.name = name;
		this.password = password;
		this.status = status;
	}
	public UserModel(int operator_id, String name, String password, int status) {
		super();
		this.operator_id = operator_id;
		this.name = name;
		this.password = password;
		this.status = status;
	}
	@Override
	public String toString() {
		return "UserModel [operator_id=" + operator_id + ", name=" + name
				+ ", password=" + password + ", status=" + status + "]";
	}
	
}
