package com.yc.menuSys.model;

import java.util.Collection;
import java.util.Date;
import java.util.List;

public class Order {
	private int id;
	private String tableNum;
	private Date createDateTime;
	private int personCount;
	private int isPay;
	private double totalPrice;
	private List<OrderItem> ois;
	private Collection<Menu> me;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTableNum() {
		return tableNum;
	}
	public void setTableNum(String tableNum) {
		this.tableNum = tableNum;
	}
	public Date getCreateDateTime() {
		return createDateTime;
	}
	public void setCreateDateTime(Date createDateTime) {
		this.createDateTime = createDateTime;
	}
	public int getPersonCount() {
		return personCount;
	}
	public void setPersonCount(int personCount) {
		this.personCount = personCount;
	}
	public int getIsPay() {
		return isPay;
	}
	public void setIsPay(int isPay) {
		this.isPay = isPay;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public List<OrderItem> getOis() {
		return ois;
	}
	public void setOis(List<OrderItem> ois) {
		this.ois = ois;
	}
	public Collection<Menu> getMe() {
		return me;
	}
	public void setMe(Collection<Menu> me) {
		this.me = me;
	}
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(int id, String tableNum, Date createDateTime, int personCount,
			int isPay, double totalPrice, List<OrderItem> ois,
			Collection<Menu> me) {
		super();
		this.id = id;
		this.tableNum = tableNum;
		this.createDateTime = createDateTime;
		this.personCount = personCount;
		this.isPay = isPay;
		this.totalPrice = totalPrice;
		this.ois = ois;
		this.me = me;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", tableNum=" + tableNum
				+ ", createDateTime=" + createDateTime + ", personCount="
				+ personCount + ", isPay=" + isPay + ", totalPrice="
				+ totalPrice + ", ois=" + ois + ", me=" + me + "]";
	}
	
}
