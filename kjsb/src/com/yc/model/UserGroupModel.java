package com.yc.model;

public class UserGroupModel {
	private int gid;
	private String gname;
	public int getGid() {
		return gid;
	}
	public void setGid(int gid) {
		this.gid = gid;
	}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	public UserGroupModel(int gid, String gname) {
		super();
		this.gid = gid;
		this.gname = gname;
	}
	public UserGroupModel() {
		super();
	}
	
}
