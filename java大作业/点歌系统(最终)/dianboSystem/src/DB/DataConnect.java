package DB;
import java.sql.*;

public class DataConnect {
	//static Connection con;
	public static Statement stat;
	public static PreparedStatement ps;
	public static Connection init() throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("驱动加载成功");
		String url = "jdbc:mysql://127.0.0.1:3306/dgxt";
		String name = "root";
		String pw = "123456";
		Connection con = DriverManager.getConnection(url, name, pw);
		 stat = con.createStatement();
		System.out.println("连接成功");
		return con;
	}
	public static Statement getStatement() throws ClassNotFoundException, SQLException{
		Connection con = init();
		stat=con.createStatement();
		if(stat==null)
		{
			init();  
		}
		return stat;
	}
	
	public static PreparedStatement getPreparedStatement(String sql) throws ClassNotFoundException, SQLException{
		Connection con = init();
		ps = con.prepareStatement(sql);
		if(ps==null){
		init();
		}
		return ps;
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			init();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
}