package model;

import java.sql.*;

public class DataConnect {

	private static Statement stat;
	private static void init() throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.jdbc.Driver") ;
		String url="jdbc:mysql://127.0.0.1:3307/ordersystem";
		String user="root";
		String password="123";
		Connection con = DriverManager.getConnection(url,user,password);
		stat = con.createStatement();
	}
	public static Statement getStatement() throws ClassNotFoundException, SQLException{
		if(stat ==null)
			init();
		return stat;
	}
}
