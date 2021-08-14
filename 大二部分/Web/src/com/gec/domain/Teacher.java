package com.gec.domain;

public class Teacher {
   private int te_id;
   private String te_name;
   private String password;
   private String college;
   private String position;
   private int flag;

public Teacher(int teId, String teName, String password, String college,
		String position, int flag) {
	super();
	this.te_id = teId;
	this.te_name = teName;
	this.password = password;
	this.college = college;
	this.position = position;
	this.flag = flag;
}
public int getFlag() {
	return flag;
}
public void setFlag(int flag) {
	this.flag = flag;
}
public int getTe_id() {
	return te_id;
}
public void setTe_id(int teId) {
	this.te_id = teId;
}
public String getTe_name() {
	return te_name;
}
public void setTe_name(String teName) {
	this.te_name = teName;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getCollege() {
	return college;
}
public void setCollege(String college) {
	this.college = college;
}
public String getPosition() {
	return position;
}
public void setPosition(String position) {
	this.position = position;
}
@Override
public String toString() {
	return "Teacher [college=" + college + ", flag=" + flag + ", password="
			+ password + ", position=" + position + ", te_id=" + te_id
			+ ", te_name=" + te_name + "]";
}
   
}
