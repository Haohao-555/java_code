package model;

public class Cement {
private String title;
private String detail;
private String publishername;
private int id;
private String ctime;
public String getCtime() {
	return ctime;
}
public void setCtime(String ctime) {
	this.ctime = ctime;
}
public Cement(String title, String detail, String publishername,int id,String ctimye) {
	super();
	this.title = title;
	this.detail = detail;
	this.publishername = publishername;
	this.id=id;
	this.ctime=ctime;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getDetail() {
	return detail;
}
public void setDetail(String detail) {
	this.detail = detail;
}
public String getPublishername() {
	return publishername;
}
public void setPublishername(String publishername) {
	this.publishername = publishername;
}
public Cement(){}
}
