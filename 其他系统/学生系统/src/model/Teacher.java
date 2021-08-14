package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Teacher  {
	public  static class myexception extends Exception{}
   private int id;	
   private String course;//课程
   private String teacher;//老师
   private String password;//密码
   private String coursetime;//上课时间


public Teacher(int id, String course, String teacher, String password,
		String coursetime) {
	super();
	this.id = id;
	this.course = course;
	this.teacher = teacher;
	this.password = password;
	this.coursetime = coursetime;
}

public Teacher(){}

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

public String getTeacher() {
	return teacher;
}

public void setTeacher(String teacher) {
	this.teacher = teacher;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getCoursetime() {
	return coursetime;
}

public  void setCoursetime(String coursetime) {
	this.coursetime = coursetime;
}

//点名
public static void check_student(String course){
	
}
//登录
public static Teacher TLogin(String name,String password) throws Exception{
	String sql = "select * from Teacher where teacher='"+name+"' and password = '"+password+"'";
	ResultSet rs = DataConnect.getStat().executeQuery(sql);
	if(!rs.next())
		throw new Exception("密码或用户名出错");
	else
		return new Teacher(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
}
//录入成绩
public static void course_grade(String course,String teacher,String student,String grade) throws Exception{
	System.out.println(course);
	System.out.println(student);
	System.out.println(teacher);
	System.out.println(grade);
	String sql="update studentcourse set grade='"+grade+"' where course='"+course+"'and teacher='"+teacher+"'and student='"+student+"'";
	DataConnect.getStat().executeUpdate(sql);
}

//查看学生请假
public static ArrayList<Request> check_student_request(String course,String teacher) throws Exception,myexception{
	ArrayList<Request>request=new ArrayList<Request>();
	String sql = "select * from Request where course ='"+course+"'and teacher='"+teacher+"'";
	ResultSet rs = DataConnect.getStat().executeQuery(sql);
	while(rs.next())
		request.add(new Request(rs.getInt(1),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(2),rs.getString(7),rs.getString(8)));
	    return request;

}
//判断老师是否有这门功课
public static boolean checkteachercourse(String course,String teacher) throws Exception{
	String sql = "select * from course where course ='"+course+"'and teacher='"+teacher+"'";
	ResultSet rs = DataConnect.getStat().executeQuery(sql);
	if(!rs.next()){
		return false;
	}else{
		return true;
	}
}
//课堂点名
public static ArrayList<Student> classcheckstudent(String course) throws Exception{
	ArrayList<Student> student=new ArrayList<Student>();
	String sql="select *from studentcourse where course='"+course+"'";
	ResultSet rs=DataConnect.getStat().executeQuery(sql);
	while(rs.next()){
		student.add(new Student(rs.getString(6),rs.getString(2)));
	}
	return student;
}
//点名情况
public static void checkstudentcondition(){}
//显示成绩录入表
public static ArrayList<B> displaycourse(String teacher,String course) throws Exception{
	ArrayList<B> b=new ArrayList<B>();
	String sql="select *from studentcourse where course='"+course+"'and teacher='"+teacher+"'";
	ResultSet rs=DataConnect.getStat().executeQuery(sql);
	while(rs.next()){
		int i=0;
		i++;
		b.add(new B(i,rs.getString(3),rs.getString(4),rs.getString(5),rs.getInt(8),rs.getString(10),rs.getInt(9),rs.getString(7),rs.getString(6)));
	}
	return b;
	
}
}

