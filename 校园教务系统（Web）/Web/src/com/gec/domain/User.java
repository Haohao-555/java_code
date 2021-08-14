package com.gec.domain;

public class User {
   private int id;
   private String account;
   private String password;
   private String type;
public User(int id, String account, String password, String type) {
	super();
	this.id = id;
	this.account = account;
	this.password = password;
	this.type = type;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
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
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
   
}
