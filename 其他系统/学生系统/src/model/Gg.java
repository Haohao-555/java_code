package model;

public class Gg {
private int id;
private String detail;
private String title;
private String publish;
private String ctime;

public Gg(int id, String detail, String title, String publish, String ctime) {
	super();
	this.id = id;
	this.detail = detail;
	this.title = title;
	this.publish = publish;
	this.ctime = ctime;
}
public Gg(){}

public String getCtime() {
	return ctime;
}
public void setCtime(String ctime) {
	this.ctime = ctime;
}
public int getId() {
	return id;
}

public String getPublish() {
	return publish;
}
public void setPublish(String publish) {
	this.publish = publish;
}
public void setId(int id) {
	this.id = id;
}
public String getDetail() {
	return detail;
}
public void setDetail(String detail) {
	this.detail = detail;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}

}
