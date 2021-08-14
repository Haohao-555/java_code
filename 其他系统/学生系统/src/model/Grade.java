package model;

public class Grade {
private int id;
private String student;
private String grade;
private String course;


public Grade(int id, String student, String grade, String course,
		String average, String gpa) {
	super();
	this.id = id;
	this.student = student;
	this.grade = grade;
	this.course = course;
	
}
public Grade(){}


public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getStudent() {
	return student;
}
public void setStudent(String student) {
	this.student = student;
}
public String getGrade() {
	return grade;
}
public void setGrade(String grade) {
	this.grade = grade;
}
public String getCourse() {
	return course;
}
public void setCourse(String course) {
	this.course = course;
}
//计算平均成绩
public void average(){
	
}
//计算绩点
public void GPA(){}
}
