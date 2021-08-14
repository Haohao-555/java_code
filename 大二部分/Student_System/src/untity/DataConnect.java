package untity;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataConnect {
	private static Connection con;
   public static  void init() throws Exception{
	    Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://127.0.0.1:3306/student_system";
		String name="root";
		String password="123456";
		con=DriverManager.getConnection(url,name,password);
		
   }
   public static Connection getcon() throws Exception{
		if(con==null)
			init();
		return con;
	}
}
