package com.yc.model;

public class UserModel {
	private int uid;
	private int gid;
	private String username;
	private String password;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public int getGid() {
		return gid;
	}
	public void setGid(int gid) {
		this.gid = gid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public UserModel(int uid, int gid, String username, String password) {
		super();
		this.uid = uid;
		this.gid = gid;
		this.username = username;
		this.password = password;
	}
	public UserModel(int gid, String username, String password) {
		super();
		this.gid = gid;
		this.username = username;
		this.password = password;
	}
	public UserModel() {
		super();
	}
	
	
	
	
}
