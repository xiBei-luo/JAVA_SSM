package com.yc.model;

import java.util.Date;



public class OALoanModel {
	int id;
	int employeeId;
	String title;
	double amount;
	Date applyDate=null;
	int status;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public Date getApplyDate() {
		return applyDate;
	}
	public void setApplyDate(Date applyDate) {
		this.applyDate = applyDate;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public OALoanModel(int id, int employeeId, String title, double amount,
			Date applyDate, int status) {
		super();
		this.id = id;
		this.employeeId = employeeId;
		this.title = title;
		this.amount = amount;
		this.applyDate = applyDate;
		this.status = status;
	}
	public OALoanModel(int employeeId, String title, double amount,
			Date applyDate, int status) {
		super();
		this.employeeId = employeeId;
		this.title = title;
		this.amount = amount;
		this.applyDate = applyDate;
		this.status = status;
	}
	public OALoanModel() {
		super();
	}
	
	
	
	
}
