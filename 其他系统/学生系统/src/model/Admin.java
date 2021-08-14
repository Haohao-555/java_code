package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Admin {

private String admin;
private String password;
public Admin( String admin, String password) {
	super();
	
	this.admin = admin;
	this.password = password;
}
public Admin(){}

public String getAdmin() {
	return admin;
}
public void setAdmin(String admin) {
	this.admin = admin;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}


//��¼
public  static Admin ALogin(String name,String number) throws Exception{
	String sql = "select * from Admin where admin='"+name+"' and password = '"+number+"'";
	ResultSet rs = DataConnect.getStat().executeQuery(sql);
	if(!rs.next())
		throw new Exception("������û�������");
	else
		return new Admin(rs.getString(2),rs.getString(3));
}

//��ʾ��ٱ�
public static ArrayList<Request> AviewAllrequest() throws Exception{
	ArrayList<Request>request=new ArrayList<Request>();
	String sql = "select * from Request";
	ResultSet rs = DataConnect.getStat().executeQuery(sql);
	while(rs.next()){
		request.add(new Request(rs.getInt(1),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(2),rs.getString(7),rs.getString(8)));
	}
	return request;
}
//�鿴���ԭ��
public  static Request checkrequest(int id) throws Exception{
	String sql = "select * from request where id = "+id;
	ResultSet rs = DataConnect.getStat().executeQuery(sql);
	if(rs.next()){
		return new Request(rs.getInt(1),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(2),rs.getString(7),rs.getString(8));
	}
	return null;	
}

//��������
 public static void Apublish_gg(String title,String detail,String name) throws Exception{
	 String sql = "insert into Gg(title,detail,name)values( '"+title+"' , '"+detail+"','"+name+"')";
		DataConnect.getStat().executeUpdate(sql);
	}
//ɾ������
 public static void deleteGg(int id) throws Exception{
	 String sql="delete from Gg where id="+id;
	 DataConnect.getStat().executeUpdate(sql);
 }
 //��������
 public static void deleterequest(int id,String condition) throws Exception{
	 String sql="update request set conditions='"+condition+"' where id="+id;
	 DataConnect.getStat().executeUpdate(sql);
 }
 //��ӿγ�
 public static void Addcourse(String teacher,String course,String coursetime,String credit) throws Exception{
	 String sql = "insert into course(course,coursetime,teacher,credit) values( '"+course+"' , '"+coursetime+"','"+teacher+"','"+credit+"')";
		DataConnect.getStat().executeUpdate(sql);
 }
}