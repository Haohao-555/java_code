package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JLabel;

public class Student {
private String name;
private String password;
private int id;
private String type;
private String number;

public String getNumber() {
	return number;
}
public void setNumber(String number) {
	this.number = number;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public Student(int id, String name, String password,String type,String number) {
	super();
	this.id = id;
	this.name = name;
	this.password = password;
	this.type=type;
	this.number=number;
}
/**
 * 用户登录
 * @throws Exception 
 */
public static Student login(String name,String password) throws Exception{
	String sql = "select * from user where name='"+name+"' and password = '"+password+"'";
	ResultSet rs = DataConnect.getStat().executeQuery(sql);
	if(!rs.next())
		throw new Exception();
	else
		return new Student(rs.getInt(1),rs.getString(3),rs.getString(4),rs.getString(2),rs.getString(5));
}
/**
 * 请假
 * @throws Exception 
 * @throws SQLException 
 */
public static void request(Request request) throws SQLException, Exception{
	String sql = "insert into request(student,teacher,course,coursetime,because,requesttime,situations,number) values('"+request.getStudent()+"','"+request.getTeacher()+"'," +
			"'"+request.getCourse()+"','"+request.getCoursetime()+"','"+request.getBecause()+"','"+request.getRequesttime()+"'," +
					"'"+request.getSituations()+"','"+request.getNumber()+"')";
	DataConnect.getStat().executeUpdate(sql);//executeUpdate用于执行修改定义数据库的语句
}
 /**
  * 注册
 * @throws Exception 
 * @throws SQLException 
  */
public static void zhuce(String username, String password,String number) throws SQLException, Exception{

	String sql = "insert into user(type,name,password,number) values(0,'"+username+"','"+password+"','"+number+"')";
	DataConnect.getStat().executeUpdate(sql);
}
/**
 * 查看请假情况
 */
public static ArrayList<Request> viewAllrequest(String name) throws SQLException, ClassNotFoundException {
	ArrayList<Request> request = new ArrayList<Request>();
	String sql = "select * from request where student='"+name+"'";
	ResultSet rs = DataConnect.getStat().executeQuery(sql);
	while(rs.next()){
		request.add(new Request(rs.getString(2),rs.getString(4),rs.getString(5),rs.getString(3),rs.getString(6),rs.getString(7),
				rs.getString(8),rs.getInt(1),rs.getString(9),rs.getString(10)));
	}
	return request;
	}	
}
