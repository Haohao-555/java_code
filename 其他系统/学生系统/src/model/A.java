package model;

public class A {
private String course;
private String coursetime;
private String teacher;
private String credit;

public A(String course, String coursetime, String teacher, String credit) {
	super();
	this.course = course;
	this.coursetime = coursetime;
	this.teacher = teacher;
	this.credit = credit;
}

public String getCredit() {
	return credit;
}

public void setCredit(String credit) {
	this.credit = credit;
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

}
