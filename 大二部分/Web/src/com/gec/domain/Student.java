package com.gec.domain;

import java.io.Serializable;

import javax.servlet.http.HttpServletRequest;

public class Student implements Serializable{
   private int id;
   private String account;
   private String name;
   private String xuehao;
   private String majory;
   private String colleage;
   private String nianji;
   
public String getColleage() {
	return colleage;
}
public void setColleage(String colleage) {
	this.colleage = colleage;
}
public String getNianji() {
	return nianji;
}
public void setNianji(String nianji) {
	this.nianji = nianji;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getAccount() {
	return account;
}
public void setAccount(String account) {
	this.account = account;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getXuehao() {
	return xuehao;
}
public void setXuehao(String xuehao) {
	this.xuehao = xuehao;
}
public String getMajory() {
	return majory;
}
public void setMajory(String majory) {
	this.majory = majory;
}
public Student(HttpServletRequest req) {
	super();
	this.id = 0;
	this.account = req.getParameter("account");;
	this.name = req.getParameter("name");
	this.xuehao = req.getParameter("xuehao");
	this.majory = req.getParameter("majory");
	this.colleage=req.getParameter("colleage");
	this.nianji=req.getParameter("nianji");
}


public Student(int id, String account, String name, String xuehao,
		String majory, String colleage, String nianji) {
	super();
	this.id = id;
	this.account = account;
	this.name = name;
	this.xuehao = xuehao;
	this.majory = majory;
	this.colleage = colleage;
	this.nianji = nianji;
}
@Override
public String toString() {
	return "Student [account=" + account + ", colleage=" + colleage + ", id="
			+ id + ", majory=" + majory + ", name=" + name + ", nianji="
			+ nianji + ", xuehao=" + xuehao + "]";
}

   
}
