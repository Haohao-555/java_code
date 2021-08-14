package model;

public class Request {
private int id;
private String teacher;
private String student;
private String course;
private String coursetime;
private String ctime;
private String because;
private String condition;


public Request(int id, String teacher, String student, String course,
		String coursetime, String ctime, String because, String condition) {
	super();
	this.id = id;
	this.teacher = teacher;
	this.student = student;
	this.course = course;
	this.coursetime = coursetime;
	this.ctime = ctime;
	this.because = because;
	this.condition = condition;
}

public Request(){}

public String getCondition() {
	return condition;
}

public void setCondition(String condition) {
	this.condition = condition;
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getTeacher() {
	return teacher;
}
public void setTeacher(String teacher) {
	this.teacher = teacher;
}
public String getStudent() {
	return student;
}
public void setStudent(String student) {
	this.student = student;
}
public String getCourse() {
	return course;
}
public void setCourse(String course) {
	this.course = course;
}
public String getCoursetime() {
	return coursetime;
}
public void setCoursetime(String coursetime) {
	this.coursetime = coursetime;
}
public String getCtime() {
	return ctime;
}
public void setCtime(String ctime) {
	this.ctime = ctime;
}
public String getBecause() {
	return because;
}
public void setBecause(String because) {
	this.because = because;
}


}
