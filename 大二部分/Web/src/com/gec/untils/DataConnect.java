package com.gec.untils;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataConnect {
	private static Connection con;
   public static  void init() throws Exception{
	    Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://39.104.61.32:3306/web?useUnicode=true&characterEncoding=utf8";
		String name="root";
		String password="Huang123!";
		con=DriverManager.getConnection(url,name,password);
		
   }
   public static Connection getcon() throws Exception{
		if(con==null)
			init();
		return con;
	}
}
