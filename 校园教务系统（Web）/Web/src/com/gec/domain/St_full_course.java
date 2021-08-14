package com.gec.domain;

public class St_full_course {
    private String te_name;
    private String course;
    private int credit;
    private String co_time;
    private String account;
    private int co_id;
	public String getTe_name() {
		return this.te_name;
	}
	public void setTe_name(String teName) {
		this.te_name = teName;
	}
	public int getCo_id() {
		return this.co_id;
	}
	public void setCo_id(int co_id) {
		this.co_id= co_id;
	}
	public String getCourse() {
		return this.course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getCredit() {
		return this.credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}
	public String getCo_time() {
		return this.co_time;
	}
	public void setCo_time(String coTime) {
		this.co_time = coTime;
	}
	public String getAccount() {
		return this.account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public St_full_course(String teName, String course, int credit,
			String coTime, String account,int co_id) {
		super();
		this.te_name = teName;
		this.course = course;
		this.credit = credit;
		this.co_time = coTime;
		this.account = account;
		this.co_id=co_id;
	}
    
}
