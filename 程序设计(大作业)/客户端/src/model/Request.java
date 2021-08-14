package model;

import java.io.Serializable;

public class Request implements Serializable {
private int id;//id��
private String name;//Ա������
private String because;//���ԭ�� 
private String number;//Ա������ 
private String needtime;//��Ҫ���ʱ�� 
private String ctime;//�ύ��ٱ�ʱ��
private String rcondition;//�������

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