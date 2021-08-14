package com.gec.domain;

import java.util.List;
//分页类
public class PageBean<T> {
     private int count;   //总记录数
     private int page=1;  //当前页码
     private int pageSize=10; //页大小
     private int totalPage; //总页数
     private int prevPage; //前一页
     private int nextPage; //后一页
     private List<T>list; //对象列表
     public PageBean(){}
     public PageBean(int page,int pageSize){
    	 this.page=page;
    	 this.pageSize=pageSize;
     }
     public PageBean(int page,int pageSize,int count){
    	 this.page=page;
    	 this.pageSize=pageSize;
    	 this.count=count;
    	  //计算总页数
    	 this.totalPage=(int)Math.ceil(count/(pageSize*1.0));
    	 //计算前一页
    	 this.prevPage=(page>1)? page-1:1;
    	 //计算后一页
    	 this.nextPage=(page<this.totalPage)? page+1:this.totalPage;
    	 //打印总页数
     }
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public int getPrevPage() {
		return prevPage;
	}
	public void setPrevPage(int prevPage) {
		this.prevPage = prevPage;
	}
	public int getNextPage() {
		return nextPage;
	}
	public void setNextPage(int nextPage) {
		this.nextPage = nextPage;
	}
	public List<T> getList() {
		return list;
	}
	public void setList(List<T> list) {
		this.list = list;
	}
     
}
