package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Teacher {
private String teacher;
private String password;
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
public Teacher(String teacher, String password) {
	super();
	this.teacher = teacher;
	this.password = password;
}
public Teacher(){}
//登录
public Teacher Tlogin(String name, String password) throws Exception, Exception{
	String sql = "select * from teacher where teachername='"+name+"' and password = '"+password+"'";
	ResultSet rs = DataConnect.getStat().executeQuery(sql);
	   if(!rs.next())
			throw new Exception("密码或用户名出错");
		else
			return new Teacher(rs.getString(2),rs.getString(3));
	
}
//点名系统
public ArrayList<Student> votestudent() throws SQLException, ClassNotFoundException{
	ArrayList<Student> student = new ArrayList<Student>();
	String sql = "select * from student";
	ResultSet rs = DataConnect.getStat().executeQuery(sql);
	while(rs.next()){
		student.add(new Student(rs.getString(3),rs.getString(4),rs.getString(2),rs.getInt(1)));
	}
	
	return student;
}
public int votestudents(String name,String number) throws Exception{
	String sql = "select * from student where username='"+name+"' and number = '"+number+"'";
	ResultSet rs = DataConnect.getStat().executeQuery(sql);
	if(!rs.next())
		throw new Exception("出错");
	else
		return rs.getInt(1);
}
}
