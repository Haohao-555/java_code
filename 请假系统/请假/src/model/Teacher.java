package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Teacher extends Admin {
private  String course;
private String coursetime;

	public Teacher(int id, String name, String password,String type,String number) {
		super(id, name, password,type,number);
		// TODO Auto-generated constructor stub
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getCoursetime() {
		return coursetime;
	}

	public void setCoursetime(String coursetime) {
		this.coursetime = coursetime;
	}

	public Teacher(int id, String name, String password, String course,
			String coursetime,String type,String number) {
		super(id, name, password,type,number);
		this.course = course;
		this.coursetime = coursetime;
	}
/**
 * 老师查看请假
 */
	public static ArrayList<Request> viewAllrequest(String course) throws SQLException, ClassNotFoundException {
		ArrayList<Request> request = new ArrayList<Request>();
		String sql = "select * from request where course='"+course+"'";
		ResultSet rs = DataConnect.getStat().executeQuery(sql);
		while(rs.next()){
			request.add(new Request(rs.getString(2),rs.getString(4),rs.getString(5),rs.getString(3),
					rs.getString(6),rs.getString(7),rs.getString(8),rs.getInt(1),rs.getString(9),rs.getString(10)));
		}
		return request;
		}	
   public static void zhuce(){
	   System.out.println("老师不能注册");
   }
}
