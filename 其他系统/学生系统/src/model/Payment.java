package model;

import java.sql.SQLException;

public class Payment {
private String student;
private String course;
private String payment;

public Payment(String student, String course, String payment) {
	super();
	this.student = student;
	this.course = course;
	this.payment = payment;
}
public Payment(){}

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
public String getPayment() {
	return payment;
}
public void setPayment(String payment) {
	this.payment = payment;
}
//缴费
public static void payment(int id){
	
}
//计算缴费的费用
public static int fee(int credit){
	final int ONECREDIT=540;
	int fee=credit*	ONECREDIT;
	return fee;
}
//更新费用
public static void insertfeecondition(String student,int id) throws Exception{

	
}
}
