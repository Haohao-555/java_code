package entity;

public class Teacher {
   private int id;
   private String name;
   private String pa;//√‹¬Î
   private String college;//—ß‘∫
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
public String getPa() {
	return pa;
}
public void setPa(String pa) {
	this.pa = pa;
}
public String getCollege() {
	return college;
}
public void setCollege(String college) {
	this.college = college;
}
public Teacher(int id, String name, String pa, String college) {
	super();
	this.id = id;
	this.name = name;
	this.pa = pa;
	this.college = college;
}
   
}
