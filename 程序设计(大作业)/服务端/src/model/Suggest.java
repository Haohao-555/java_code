package model;

import java.io.Serializable;

public class Suggest implements Serializable {
private int id;//id�� 
private String name;//����
private String phone;//�绰
private String detail;//���� 
private String ctime;//�ύ�����ʱ��
private String condition;//���
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