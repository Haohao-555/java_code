package work;

import java.sql.*;



public class DataConnect {
   //private static Statement star;
	private static Connection con;
   public static  void init() throws Exception{
	    Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://127.0.0.1:3306/b";
		String name="root";
		String password="123456";
		//Connection con=DriverManager.getConnection(url,name,password);
		con=DriverManager.getConnection(url,name,password);
		//star=con.createStatement();
   }
   public static Connection getcon() throws Exception{
		if(con==null)
			init();
		return con;
	}
	

}
