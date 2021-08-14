package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Admin extends Student {

public Admin(int id, String name, String password,String type,String number) {
		super(id, name, password,type,number);
		// TODO Auto-generated constructor stub
	}

/**
 * 查看详情
 */
public static Request viewrequest(int id) throws SQLException, ClassNotFoundException {
	String sql = "select * from request where id = "+id;
	ResultSet rs = DataConnect.getStat().executeQuery(sql);
	if(rs.next())
		return new Request(rs.getString(2),rs.getString(4),rs.getString(5),rs.getString(3),rs.getString(6),rs.getString(7),
				rs.getString(8),rs.getInt(1),rs.getString(9),rs.getString(10));
	return null;
}
/**
 * 显示请假总表
 */
public static ArrayList<Request> viewAllrequest() throws SQLException, ClassNotFoundException {
	ArrayList<Request> request = new ArrayList<Request>();
	String sql = "select * from request";
	ResultSet rs = DataConnect.getStat().executeQuery(sql);
	while(rs.next()){
		if(rs.getString(9).equals("未审批")){
		request.add(new Request(rs.getString(2),rs.getString(4),rs.getString(5),rs.getString(3),rs.getString(6),rs.getString(7),
				rs.getString(8),rs.getInt(1),rs.getString(9),rs.getString(10)))
		;}
	}
	return request;
	}
/**
 * 审批请假
 * @throws Exception 
 * @throws SQLException 
 */
public static  void Acheckrequest(int id,String situations) throws SQLException, Exception{
	String sql="update request set situations='"+situations+"' where id="+id+"";
	DataConnect.getStat().executeUpdate(sql);
}
public static  void zhuce(){
	System.out.println("辅导员不能注册");
}
}
