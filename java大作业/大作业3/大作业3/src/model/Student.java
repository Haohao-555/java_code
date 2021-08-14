package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.DataConnect;
public class Student {
private String username;
private String password;
private String number;
private int id;

public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}

public String getNumber() {
	return number;
}
public void setNumber(String number) {
	this.number = number;
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public Student(String username, String password,String number,int id) {
	super();
	this.username = username;
	this.password = password;
	this.number=number;
	this.id=id;
}

public Student() {
}
//登录
public Student Login(String username,String password) throws Exception{
	
		
	String sql = "select * from student where username='"+username+"' and password = '"+password+"'";
	ResultSet rs = DataConnect.getStat().executeQuery(sql);
	if(!rs.next())
		throw new Exception("密码或用户名出错");
	else
		return new Student(rs.getString(3),rs.getString(4),rs.getString(2),rs.getInt(1));
}
//注册
public void register(String username,String password1,String password2,String number) throws Exception{
	if(!password1.equals(password2))
		throw new Exception("两次输入的密码不一致");
	
	String sql = "insert into student(username,password,number) values( '"+username+"' , '"+password1+"','"+number+"')";
	DataConnect.getStat().executeUpdate(sql);
}
//请假
public void request(String studentname, String teachername, String coursename, String coursetime,String requestbecause) throws Exception{
	String sql = "select * from teacher where  teachername = '"+ teachername+"' and course='"+coursename+"' and coursetime='"+coursetime+"'" ;
	ResultSet rs = DataConnect.getStat().executeQuery(sql);
	if(!rs.next())
		throw new Exception("信息出错");
	else{
	String sq2 = "insert into request(studentname,teachername,coursename,coursetime,requestbecause) values('"+studentname+"', '"+teachername+"' , " +
			"'"+coursename+"','"+coursetime+"','"+requestbecause+"')";
	DataConnect.getStat().executeUpdate(sq2);}
}
//查看公告的标题和内容
public Cement viewGG(int id) throws SQLException, ClassNotFoundException {
	String sql = "select * from announcement where id = "+id;
	ResultSet rs = DataConnect.getStat().executeQuery(sql);
	Cement gg=null;
	if(rs.next())
		gg= new Cement(rs.getString(3),rs.getString(4),rs.getString(5),rs.getInt(1),rs.getString(2));
	return gg;
}//查看公告的所有信息
public ArrayList<Cement> viewAllgg() throws SQLException, ClassNotFoundException {
    ArrayList<Cement> gg = new ArrayList<Cement>();
	String sql = "select * from announcement";
	ResultSet rs = DataConnect.getStat().executeQuery(sql);
	while(rs.next()){
		gg.add(new Cement(rs.getString(3),rs.getString(4),rs.getString(5),rs.getInt(1),rs.getString(2)));
	}
	return gg;
}
}
