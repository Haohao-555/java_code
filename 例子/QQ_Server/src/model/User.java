package model;

import java.io.Serializable;

public class User implements Serializable {
   private int id;
   private String number;
   private String password;
   private String ip;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getNumber() {
	return number;
}
public void setNumber(String number) {
	this.number = number;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}

public String getIp() {
	return ip;
}
public void setIp(String ip) {
	this.ip = ip;
}
public User(int id, String number, String password,String ip) {
	super();
	this.id = id;
	this.number = number;
	this.password = password;
	this.ip=ip;
}
   
}
