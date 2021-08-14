package com.gec.Untils;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
public class JdbcUtils {
    //声明三个静态变量保存连接参数
	static String url;
	static String username;
	static String password;
	//静态初始化块
	//加载与读取mysql.properties文件数据
	//保存相关连接参数
	//加载mysql驱动类
	static {
		//拿到类加载器
		ClassLoader loader = JdbcUtils.class.getClassLoader();
		//利用类加载器来获取属性文件的输入流
		InputStream is = loader.getResourceAsStream("mysql.properties");
		//创建属性对象
		Properties pro = new Properties();
		try {
		//载入流入到属性对象
		pro.load(is);
		//读取与保存相关连接参数
		String driver = pro.getProperty("jdbc.driver");
		 url = pro.getProperty("jdbc.url");
		 username = pro.getProperty("jdbc.username");
		password = pro.getProperty("jdbc.password");
        prt(driver,url,username,password);
		//加载mysql驱动类到"JVM内存中(方法去)"
        //让类加载器去加载一个类
		Class.forName(driver);	
		System.out.println("{JDBC}成功加载驱动..");
		}catch(IOException e) {
			System.out.println("{JDBC}读取文件失败..");
		}catch(ClassNotFoundException e1) {
			System.out.println("{JDBC}请检查你的jar包是否放置正确");
		}
	}
    //设置一个线程变量,里面储存的是Connection（连接）
	private static ThreadLocal<Connection> Local = new ThreadLocal();
	
	//获取数据库连接
	//要导对包：java.sql.Connection
	public static Connection getConnection() throws SQLException {
		Connection conn = Local.get();
		if( conn == null) {
			//如果没有，向驱动管理器索取
			conn = DriverManager.getConnection(url, username,password);
			//同时存入线程容器
			Local.set(conn);
		}
		return conn;	
	}
	public static void closeConnection()throws SQLException {
		//从容器中获取连接
		Connection conn = Local.get();
		//看容器中有没有连接存在
		if( conn == null) {
			//不存在抛出空指针异常
          throw new NullPointerException("{jdbc}连接不存在.");
		}
		//关闭连接
		conn.close();
		//解除绑定
	    Local.remove();
	}
	
	private static void prt(String driver, String url, String username, String password) {
		// TODO Auto-generated method stub
		System.out.printf(
				"driver:%s\n"+
						"url:%s\n"+
						"username:%s\n"+
						"password:%s\n",
						driver,url,username,password);
	}	
}