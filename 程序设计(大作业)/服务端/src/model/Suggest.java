package model;

import java.io.Serializable;

public class Suggest implements Serializable {
private int id;//id码 
private String name;//姓名
private String phone;//电话
private String detail;//内容 
private String ctime;//提交建议表时间
private String condition;//情况
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getDetail() {
	return detail;
}
public void setDetail(String detail) {
	this.detail = detail;
}
public String getCtime() {
	return ctime;
}
public void setCtime(String ctime) {
	this.ctime = ctime;
}

public String getCondition() {
	return condition;
}
public void setCondition(String condition) {
	this.condition = condition;
}
public Suggest(int id, String name, String phone, String detail, String ctime,String condition) {
	super();
	this.id = id;
	this.name = name;
	this.phone = phone;
	this.detail = detail;
	this.ctime = ctime;
	this.condition = condition;
}

}