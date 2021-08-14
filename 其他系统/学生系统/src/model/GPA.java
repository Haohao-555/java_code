package model;

public class GPA {
private String student;
private String gpa;
private String average;
public GPA(String student, String gpa, String average) {
	super();
	this.student = student;
	this.gpa = gpa;
	this.average = average;
}
public String getStudent() {
	return student;
}
public void setStudent(String student) {
	this.student = student;
}
public String getGpa() {
	return gpa;
}
public void setGpa(String gpa) {
	this.gpa = gpa;
}
public String getAverage() {
	return average;
}
public void setAverage(String average) {
	this.average = average;
}

}
