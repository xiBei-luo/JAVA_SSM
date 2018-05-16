package com.yc.model;

import java.sql.Date;

public class SongModel {
	private Integer id;
	private String name;
	private String singer;
	private Date pubDate;
	private Integer categoryId;
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
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public Date getPubDate() {
		return pubDate;
	}
	public void setPubDate(Date pubDate) {
		this.pubDate = pubDate;
	}
	public Integer getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}
	public SongModel(Integer id, String name, String singer, Date pubDate,
			Integer categoryId) {
		super();
		this.id = id;
		this.name = name;
		this.singer = singer;
		this.pubDate = pubDate;
		this.categoryId = categoryId;
	}
	public SongModel() {
		super();
	}
	public SongModel(String name, String singer, Date pubDate,
			Integer categoryId) {
		super();
		this.name = name;
		this.singer = singer;
		this.pubDate = pubDate;
		this.categoryId = categoryId;
	}
	@Override
	public String toString() {
		return "SongModel [id=" + id + ", name=" + name + ", singer=" + singer
				+ ", pubDate=" + pubDate + ", categoryId=" + categoryId + "]";
	}
	
	
}
