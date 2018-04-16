package com.yc.model;

import java.sql.Date;

public class ProjetCategoryModel {
	private int categoryid;
	private int expertid;
	private String categoryname;
	private Date rep_start_time;
	private Date rep_stop_time;
	private Date exp_start_time;
	private Date exp_stop_time;
	public int getCategoryid() {
		return categoryid;
	}
	public void setCategoryid(int categoryid) {
		this.categoryid = categoryid;
	}
	public int getExpertid() {
		return expertid;
	}
	public void setExpertid(int expertid) {
		this.expertid = expertid;
	}
	public String getCategoryname() {
		return categoryname;
	}
	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}
	public Date getRep_start_time() {
		return rep_start_time;
	}
	public void setRep_start_time(Date rep_start_time) {
		this.rep_start_time = rep_start_time;
	}
	public Date getRep_stop_time() {
		return rep_stop_time;
	}
	public void setRep_stop_time(Date rep_stop_time) {
		this.rep_stop_time = rep_stop_time;
	}
	public Date getExp_start_time() {
		return exp_start_time;
	}
	public void setExp_start_time(Date exp_start_time) {
		this.exp_start_time = exp_start_time;
	}
	public Date getExp_stop_time() {
		return exp_stop_time;
	}
	public void setExp_stop_time(Date exp_stop_time) {
		this.exp_stop_time = exp_stop_time;
	}
	public ProjetCategoryModel(int categoryid, int expertid,
			String categoryname, Date rep_start_time, Date rep_stop_time,
			Date exp_start_time, Date exp_stop_time) {
		super();
		this.categoryid = categoryid;
		this.expertid = expertid;
		this.categoryname = categoryname;
		this.rep_start_time = rep_start_time;
		this.rep_stop_time = rep_stop_time;
		this.exp_start_time = exp_start_time;
		this.exp_stop_time = exp_stop_time;
	}
	public ProjetCategoryModel(int expertid, String categoryname,
			Date rep_start_time, Date rep_stop_time, Date exp_start_time,
			Date exp_stop_time) {
		super();
		this.expertid = expertid;
		this.categoryname = categoryname;
		this.rep_start_time = rep_start_time;
		this.rep_stop_time = rep_stop_time;
		this.exp_start_time = exp_start_time;
		this.exp_stop_time = exp_stop_time;
	}
	public ProjetCategoryModel() {
		super();
	}
	@Override
	public String toString() {
		return "ProjetCategoryModel [categoryid=" + categoryid + ", expertid="
				+ expertid + ", categoryname=" + categoryname
				+ ", rep_start_time=" + rep_start_time + ", rep_stop_time="
				+ rep_stop_time + ", exp_start_time=" + exp_start_time
				+ ", exp_stop_time=" + exp_stop_time + "]";
	}
	
}
