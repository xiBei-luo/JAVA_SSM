package com.yc.model;

public class ExpertModel {
	
	private int expertid;
	private int uid;
	private String name;
	private String nation;
	private String sex;
	private String unitname;
	private String title;
	private String tel;
	private String introduction;
	private String temp1;
	private String temp2;
	private String temp3;
	private String temp4;
	
	public int getExpertid() {
		return expertid;
	}
	public void setExpertid(int expertid) {
		this.expertid = expertid;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getUnitname() {
		return unitname;
	}
	public void setUnitname(String unitname) {
		this.unitname = unitname;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
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
	public ExpertModel(int expertid, int uid, String name, String nation,
			String sex, String unitname, String title, String tel,
			String introduction, String temp1, String temp2, String temp3,
			String temp4) {
		super();
		this.expertid = expertid;
		this.uid = uid;
		this.name = name;
		this.nation = nation;
		this.sex = sex;
		this.unitname = unitname;
		this.title = title;
		this.tel = tel;
		this.introduction = introduction;
		this.temp1 = temp1;
		this.temp2 = temp2;
		this.temp3 = temp3;
		this.temp4 = temp4;
	}
	public ExpertModel(int uid, String name, String nation, String sex,
			String unitname, String title, String tel, String introduction,
			String temp1, String temp2, String temp3, String temp4) {
		super();
		this.uid = uid;
		this.name = name;
		this.nation = nation;
		this.sex = sex;
		this.unitname = unitname;
		this.title = title;
		this.tel = tel;
		this.introduction = introduction;
		this.temp1 = temp1;
		this.temp2 = temp2;
		this.temp3 = temp3;
		this.temp4 = temp4;
	}
	public ExpertModel() {
		super();
	}
	
	
	
	
}
