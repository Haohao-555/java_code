package model;

import java.io.Serializable;

public class Request implements Serializable {
private int id;//id码
private String name;//员工姓名
private String because;//请假原因 
private String number;//员工工号 
private String needtime;//需要请假时间 
private String ctime;//提交请假表时间
private String rcondition;//审批情况

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
public String getBecause() {
	return because;
}
public void setBecause(String because) {
	this.because = because;
}
public String getNumber() {
	return number;
}
public void setNumber(String number) {
	this.number = number;
}
public String getNeedtime() {
	return needtime;
}
public void setNeedtime(String needtime) {
	this.needtime = needtime;
}
public String getCtime() {
	return ctime;
}
public void setCtime(String ctime) {
	this.ctime = ctime;
}
public String getRcondition() {
	return rcondition;
}
public void setRcondition(String rcondition) {
	this.rcondition = rcondition;
}
public Request(int id, String name, String because, String number,
		String needtime, String ctime,String rcondition) {
	super();
	this.id = id;
	this.name = name;
	this.because = because;
	this.number = number;
	this.needtime = needtime;
	this.ctime = ctime;
	this.rcondition=rcondition;
}

}