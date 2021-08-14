package entity;

public class Admin {
   private int id;
   private String name;
   private String pa;
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
public Admin(int id, String name, String pa) {
	super();
	this.id = id;
	this.name = name;
	this.pa = pa;
}
   
}
