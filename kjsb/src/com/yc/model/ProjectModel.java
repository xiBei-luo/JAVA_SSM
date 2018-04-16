package com.yc.model;

import java.math.BigDecimal;
import java.sql.Date;

public class ProjectModel {
	private int project_id;
	private int categoryid;
	private int unitid;
	private String applicant;
	private String grade;
	private String education;
	private Date fill_date;
	private String status;
	private String future;
	private String analysis;
	private String way;
	private String result;
	private String projectname;
	private String capital;
	private String expert_opinion;
	private BigDecimal score;
	private Integer ispass;
	private String temp1;
	private String Attribute_58;
	private String Attribute_59;
	private String Attribute_60;
	
	public int getProject_id() {
		return project_id;
	}
	public void setProject_id(int project_id) {
		this.project_id = project_id;
	}
	public int getCategoryid() {
		return categoryid;
	}
	public void setCategoryid(int categoryid) {
		this.categoryid = categoryid;
	}
	public int getUnitid() {
		return unitid;
	}
	public void setUnitid(int unitid) {
		this.unitid = unitid;
	}
	public String getApplicant() {
		return applicant;
	}
	public void setApplicant(String applicant) {
		this.applicant = applicant;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public Date getFill_date() {
		return fill_date;
	}
	public void setFill_date(Date fill_date) {
		this.fill_date = fill_date;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getFuture() {
		return future;
	}
	public void setFuture(String future) {
		this.future = future;
	}
	public String getAnalysis() {
		return analysis;
	}
	public void setAnalysis(String analysis) {
		this.analysis = analysis;
	}
	public String getWay() {
		return way;
	}
	public void setWay(String way) {
		this.way = way;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getProjectname() {
		return projectname;
	}
	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	public String getExpert_opinion() {
		return expert_opinion;
	}
	public void setExpert_opinion(String expert_opinion) {
		this.expert_opinion = expert_opinion;
	}
	public BigDecimal getScore() {
		return score;
	}
	public void setScore(BigDecimal score) {
		this.score = score;
	}
	public Integer getIspass() {
		return ispass;
	}
	public void setIspass(Integer ispass) {
		this.ispass = ispass;
	}
	public String getTemp1() {
		return temp1;
	}
	public void setTemp1(String temp1) {
		this.temp1 = temp1;
	}
	public String getAttribute_58() {
		return Attribute_58;
	}
	public void setAttribute_58(String attribute_58) {
		Attribute_58 = attribute_58;
	}
	public String getAttribute_59() {
		return Attribute_59;
	}
	public void setAttribute_59(String attribute_59) {
		Attribute_59 = attribute_59;
	}
	public String getAttribute_60() {
		return Attribute_60;
	}
	public void setAttribute_60(String attribute_60) {
		Attribute_60 = attribute_60;
	}
	
	public ProjectModel() {
		super();
	}
	public ProjectModel(int project_id, int categoryid, int unitid,
			String applicant, String grade, String education, Date fill_date,
			String status, String future, String analysis, String way,
			String result, String projectname, String capital,
			String expert_opinion, BigDecimal score, Integer ispass,
			String temp1, String attribute_58, String attribute_59,
			String attribute_60) {
		super();
		this.project_id = project_id;
		this.categoryid = categoryid;
		this.unitid = unitid;
		this.applicant = applicant;
		this.grade = grade;
		this.education = education;
		this.fill_date = fill_date;
		this.status = status;
		this.future = future;
		this.analysis = analysis;
		this.way = way;
		this.result = result;
		this.projectname = projectname;
		this.capital = capital;
		this.expert_opinion = expert_opinion;
		this.score = score;
		this.ispass = ispass;
		this.temp1 = temp1;
		Attribute_58 = attribute_58;
		Attribute_59 = attribute_59;
		Attribute_60 = attribute_60;
	}
	public ProjectModel(int categoryid, int unitid, String applicant,
			String grade, String education, Date fill_date, String status,
			String future, String analysis, String way, String result,
			String projectname, String capital, String expert_opinion,
			BigDecimal score, Integer ispass, String temp1,
			String attribute_58, String attribute_59, String attribute_60) {
		super();
		this.categoryid = categoryid;
		this.unitid = unitid;
		this.applicant = applicant;
		this.grade = grade;
		this.education = education;
		this.fill_date = fill_date;
		this.status = status;
		this.future = future;
		this.analysis = analysis;
		this.way = way;
		this.result = result;
		this.projectname = projectname;
		this.capital = capital;
		this.expert_opinion = expert_opinion;
		this.score = score;
		this.ispass = ispass;
		this.temp1 = temp1;
		Attribute_58 = attribute_58;
		Attribute_59 = attribute_59;
		Attribute_60 = attribute_60;
	}
	@Override
	public String toString() {
		return "ProjectModel [project_id=" + project_id + ", categoryid="
				+ categoryid + ", unitid=" + unitid + ", applicant="
				+ applicant + ", grade=" + grade + ", education=" + education
				+ ", fill_date=" + fill_date + ", status=" + status
				+ ", future=" + future + ", analysis=" + analysis + ", way="
				+ way + ", result=" + result + ", projectname=" + projectname
				+ ", capital=" + capital + ", expert_opinion=" + expert_opinion
				+ ", score=" + score + ", ispass=" + ispass + ", temp1="
				+ temp1 + ", Attribute_58=" + Attribute_58 + ", Attribute_59="
				+ Attribute_59 + ", Attribute_60=" + Attribute_60 + "]";
	}
	
	
	
	
}
