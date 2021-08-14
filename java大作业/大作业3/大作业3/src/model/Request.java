package model;

public class Request {
private String student;
private String course;
private String teacher;
private String because;
private String ctime;
private int id;
public Request(String student, String course, String teacher, String because,String ctime,int id) {
	super();
	this.student = student;
	this.course = course;
	this.teacher = teacher;
	this.because = because;
	this.ctime=ctime;
	this.id=id;
}
public String getStudent() {
	return student;
}

public void setStudent(String student) {
	this.student = student;
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getCtime() {
	return ctime;
}
public void setCtime(String ctime) {
	this.ctime = ctime;
}
public String getCourse() {
	return course;
}
public void setCourse(String course) {
	this.course = course;
}
public String getTeacher() {
	return teacher;
}
public void setTeacher(String teacher) {
	this.teacher = teacher;
}
public String getBecause() {
	return because;
}
public void setBecause(String because) {
	this.because = because;
}

}
