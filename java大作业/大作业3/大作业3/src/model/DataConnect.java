package model;

import java.sql.*;

public class DataConnect {

	private static Statement stat;

	private static void init() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://127.0.0.1:3306/qjxt";
		String name = "root";
		String pw = "123456";
		Connection con = DriverManager.getConnection(url, name, pw);
		 stat = con.createStatement();
	}
	
	public static Statement getStat() throws ClassNotFoundException, SQLException{
		if(stat==null)
			init();
		return stat;
	}

}

