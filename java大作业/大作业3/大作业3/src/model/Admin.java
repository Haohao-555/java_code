package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Admin {

private String name;
private String password;

public String getAdminname() {
	return name;
}
public void setAdminname(String name) {
	this.name = name;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public Admin( String name, String password) {
	super();
	
	this.name = name;
	this.password = password;
}
public Admin(){}
//登录
public Admin Alogin(String name, String password) throws Exception, Exception{
	String sql = "select * from admin where Adminname='"+name+"' and password = '"+password+"'";
	ResultSet rs = DataConnect.getStat().executeQuery(sql);
	   if(!rs.next())
			throw new Exception("密码或用户名出错");
		else
			return new Admin(rs.getString(1),rs.getString(2));
}
//发布公告
public void Apublish(String title,String detail,String publishername) throws SQLException, ClassNotFoundException{
     String sql = "insert into announcement(title,detail,publishername)values( '"+title+"' , '"+detail+"','"+publishername+"')";
		DataConnect.getStat().executeUpdate(sql);
	}
//审批请假
public ArrayList<Request> viewAllrequest() throws SQLException, ClassNotFoundException {
	ArrayList<Request> request = new ArrayList<Request>();
	String sql = "select * from request";
	ResultSet rs = DataConnect.getStat().executeQuery(sql);
	while(rs.next()){
		request.add(new Request(rs.getString(3),rs.getString(5),rs.getString(4),rs.getString(7),rs.getString(2),rs.getInt(1)));
	}
	return request;}
//查看原因
public Request viewrequest(int id) throws SQLException, ClassNotFoundException {
	String sql = "select * from request where id = "+id;
	ResultSet rs = DataConnect.getStat().executeQuery(sql);
	if(rs.next())
		return new Request(rs.getString(3),rs.getString(5),rs.getString(4),rs.getString(7),rs.getString(2),rs.getInt(1));
	return null;
}
}



