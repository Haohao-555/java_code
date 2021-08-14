package model;

public class Request {
private String student;
private String course;
private String coursetime;
private String teacher;
private String because;
private String requesttime;
private String ctime;
private int id;
private String situations;
private String number;

public String getNumber() {
	return number;
}
public void setNumber(String number) {
	this.number = number;
}
public String getSituations() {
	return situations;
}
public void setSituations(String situations) {
	this.situations = situations;
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
public String getRequesttime() {
	return requesttime;
}
public void setRequesttime(String requesttime) {
	this.requesttime = requesttime;
}
public Request(String student, String course, String coursetime,
		String teacher, String because, String requesttime,String ctime,int id,String situations,String number) {
	super();
	this.student = student;
	this.course = course;
	this.coursetime = coursetime;
	this.teacher = teacher;
	this.because = because;
	this.requesttime = requesttime;
	this.ctime=ctime;
	this.id=id;
	this.situations=situations;
	this.number=number;
}

}
