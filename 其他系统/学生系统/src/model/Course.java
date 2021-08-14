package model;

public class Course {
private int id;
private String course;
private String coursetime;
private String teacher;
private int credit;


public Course(int id, String course, String coursetime, String teacher,
		int credit) {
	super();
	this.id = id;
	this.course = course;
	this.coursetime = coursetime;
	this.teacher = teacher;
	this.credit = credit;
	
}
public Course(){}

public int  getCredit() {
	return credit;
}
public void setCredit(int  credit) {
	this.credit = credit;
}
public void setCoursetime(String coursetime) {
	this.coursetime = coursetime;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
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
public void setCourse_time(String courseTime) {
	coursetime = courseTime;
}
public String getTeacher() {
	return teacher;
}
public void setTeacher(String teacher) {
	this.teacher = teacher;
}


}
