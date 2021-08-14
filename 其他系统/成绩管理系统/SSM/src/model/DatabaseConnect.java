package model;

import java.sql.*;
import java.util.ArrayList;

public class DatabaseConnect {

	private Statement stat; 
	public DatabaseConnect() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("驱动加载失败");
		}
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/cjxt"
					,"root","123456");
			stat =con.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("数据库连接失败");
		}
	}
	/**
	 * @return the stat
	 */
	public Statement getStat() {
		return stat;
	}
	public static void main(String[] args) {
		DatabaseConnect dc =new DatabaseConnect();
		try {
			Student s=Student.login(152001, "123123", dc.getStat());
			ArrayList<Result> rs= s.viewResult(dc.getStat());
			for(Result r :rs){
				r.getString();
			}
			s.setSpw("222222");
			s.updateUser(dc.getStat());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
