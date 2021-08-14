package model;

public class Student {
private int id;
private String number;
private String name;
private String detail;
public Student(int id, String number, String name, String detail) {
	super();
	this.id = id;
	this.number = number;
	this.name = name;
	this.detail=detail;
}

public String getDetail() {
	return detail;
}

public void setDetail(String detail) {
	this.detail = detail;
}

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
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

}
