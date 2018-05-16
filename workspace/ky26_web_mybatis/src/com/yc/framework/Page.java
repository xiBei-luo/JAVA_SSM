package com.yc.framework;

import java.util.List;

public class Page {
	private int pageSize;
	private int nowPage;
	private int totalPage;
	private int totalSize;
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getNowPage() {
		return nowPage;
	}
	public void setNowPage(int nowPage) {
		this.nowPage = nowPage;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public int getTotalSize() {
		return totalSize;
	}
	public void setTotalSize(int totalSize) {
		this.totalSize = totalSize;
	}
	public Page(){
		pageSize=2;//默认一页五条记录
		nowPage=1;//默认是第一页
	}
	public Page(int pageSize, int nowPage, int totalPage) {
		super();
		this.pageSize = pageSize;
		this.nowPage = nowPage;
		this.totalPage = totalPage;
	}
	@Override
	public String toString() {
		return "Page [pageSize=" + pageSize + ", nowPage=" + nowPage
				+ ", totalPage=" + totalPage + ", totalSize=" + totalSize + "]";
	}
	
}
