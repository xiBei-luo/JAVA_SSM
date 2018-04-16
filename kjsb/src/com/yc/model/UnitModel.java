package com.yc.model;

public class UnitModel {
	private int unitid;
	private int uid;
	private String unitname;
	private String address;
	private String corporation;
	private String investment;
	private String type;
	private String tel;
	private String email;
	private String fax;
	private String zipcode;
	private String introduction;
	private String temp1;
	private String temp2;
	private String temp3;
	private String temp4;
	
	public int getUnitid() {
		return unitid;
	}
	public void setUnitid(int unitid) {
		this.unitid = unitid;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUnitname() {
		return unitname;
	}
	public void setUnitname(String unitname) {
		this.unitname = unitname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCorporation() {
		return corporation;
	}
	public void setCorporation(String corporation) {
		this.corporation = corporation;
	}
	public String getInvestment() {
		return investment;
	}
	public void setInvestment(String investment) {
		this.investment = investment;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getIntroduction() {
		return introduction;
	}
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}
	public String getTemp1() {
		return temp1;
	}
	public void setTemp1(String temp1) {
		this.temp1 = temp1;
	}
	public String getTemp2() {
		return temp2;
	}
	public void setTemp2(String temp2) {
		this.temp2 = temp2;
	}
	public String getTemp3() {
		return temp3;
	}
	public void setTemp3(String temp3) {
		this.temp3 = temp3;
	}
	public String getTemp4() {
		return temp4;
	}
	public void setTemp4(String temp4) {
		this.temp4 = temp4;
	}
	public UnitModel(int unitid, int uid, String unitname, String address,
			String corporation, String investment, String type, String tel,
			String email, String fax, String zipcode, String introduction,
			String temp1, String temp2, String temp3, String temp4) {
		super();
		this.unitid = unitid;
		this.uid = uid;
		this.unitname = unitname;
		this.address = address;
		this.corporation = corporation;
		this.investment = investment;
		this.type = type;
		this.tel = tel;
		this.email = email;
		this.fax = fax;
		this.zipcode = zipcode;
		this.introduction = introduction;
		this.temp1 = temp1;
		this.temp2 = temp2;
		this.temp3 = temp3;
		this.temp4 = temp4;
	}
	public UnitModel(int uid, String unitname, String address,
			String corporation, String investment, String type, String tel,
			String email, String fax, String zipcode, String introduction,
			String temp1, String temp2, String temp3, String temp4) {
		super();
		this.uid = uid;
		this.unitname = unitname;
		this.address = address;
		this.corporation = corporation;
		this.investment = investment;
		this.type = type;
		this.tel = tel;
		this.email = email;
		this.fax = fax;
		this.zipcode = zipcode;
		this.introduction = introduction;
		this.temp1 = temp1;
		this.temp2 = temp2;
		this.temp3 = temp3;
		this.temp4 = temp4;
	}
	public UnitModel() {
		super();
	}
	
	
	
}
