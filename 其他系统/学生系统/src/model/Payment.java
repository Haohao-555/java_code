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
//�ɷ�
public static void payment(int id){
	
}
//����ɷѵķ���
public static int fee(int credit){
	final int ONECREDIT=540;
	int fee=credit*	ONECREDIT;
	return fee;
}
//���·���
public static void insertfeecondition(String student,int id) throws Exception{

	
}
}
