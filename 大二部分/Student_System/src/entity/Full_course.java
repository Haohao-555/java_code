package entity;

public class Full_course {
   private int co_id;
   private  int credit;
   private  String course;
   private  String co_time;
   private int number;
   private String name;
   private int tea_id;
   private int flag;
public Full_course(int coId, int credit, String course, String coTime,
		int number, String name, int teaId,int flag) {
	super();
	co_id = coId;
	this.credit = credit;
	this.course = course;
	co_time = coTime;
	this.number = number;
	this.name = name;
	this.tea_id = teaId;
	this.flag=flag;
}

public int getFlag() {
	return flag;
}

public void setFlag(int flag) {
	this.flag = flag;
}

public int getCo_id() {
	return co_id;
}
public void setCo_id(int coId) {
	co_id = coId;
}
public int getCredit() {
	return credit;
}
public void setCredit(int credit) {
	this.credit = credit;
}
public String getCourse() {
	return course;
}
public void setCourse(String course) {
	this.course = course;
}
public String getCo_time() {
	return co_time;
}
public void setCo_time(String coTime) {
	co_time = coTime;
}
public int getNumber() {
	return number;
}
public void setNumber(int number) {
	this.number = number;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getTea_id() {
	return tea_id;
}
public void setTea_id(int teaId) {
	tea_id = teaId;
}
   
}
