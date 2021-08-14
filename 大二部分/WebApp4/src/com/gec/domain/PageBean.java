package com.gec.domain;

import java.util.List;
//��ҳ��
public class PageBean<T> {
     private int count;   //�ܼ�¼��
     private int page=1;  //��ǰҳ��
     private int pageSize=10; //ҳ��С
     private int totalPage; //��ҳ��
     private int prevPage; //ǰһҳ
     private int nextPage; //��һҳ
     private List<T>list; //�����б�
     public PageBean(){}
     public PageBean(int page,int pageSize){
    	 this.page=page;
    	 this.pageSize=pageSize;
     }
     public PageBean(int page,int pageSize,int count){
    	 this.page=page;
    	 this.pageSize=pageSize;
    	 this.count=count;
    	  //������ҳ��
    	 this.totalPage=(int)Math.ceil(count/(pageSize*1.0));
    	 //����ǰһҳ
    	 this.prevPage=(page>1)? page-1:1;
    	 //�����һҳ
    	 this.nextPage=(page<this.totalPage)? page+1:this.totalPage;
    	 //��ӡ��ҳ��
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
