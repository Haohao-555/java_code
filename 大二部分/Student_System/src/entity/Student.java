package entity;

public class Student {
   private int id;
   private String name;
   private String xuehao;
   private String pa;//ÃÜÂë
   private String major;//×¨Òµ
public Student(int id, String name, String xuehao, String pa, String major) {
	super();
	this.id = id;
	this.name = name;
	this.xuehao = xuehao;
	this.pa = pa;
	this.major = major;
}
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
public String getXuehao() {
	return xuehao;
}
public void setXuehao(String xuehao) {
	this.xuehao = xuehao;
}
public String getPa() {
	return pa;
}
public void setPa(String pa) {
	this.pa = pa;
}
public String getMajor() {
	return major;
}
public void setMajor(String major) {
	this.major = major;
}
   
}
