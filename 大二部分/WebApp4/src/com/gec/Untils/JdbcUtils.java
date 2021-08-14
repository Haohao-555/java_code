package com.gec.Untils;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
public class JdbcUtils {
    //����������̬�����������Ӳ���
	static String url;
	static String username;
	static String password;
	//��̬��ʼ����
	//�������ȡmysql.properties�ļ�����
	//����������Ӳ���
	//����mysql������
	static {
		//�õ��������
		ClassLoader loader = JdbcUtils.class.getClassLoader();
		//���������������ȡ�����ļ���������
		InputStream is = loader.getResourceAsStream("mysql.properties");
		//�������Զ���
		Properties pro = new Properties();
		try {
		//�������뵽���Զ���
		pro.load(is);
		//��ȡ�뱣��������Ӳ���
		String driver = pro.getProperty("jdbc.driver");
		 url = pro.getProperty("jdbc.url");
		 username = pro.getProperty("jdbc.username");
		password = pro.getProperty("jdbc.password");
        prt(driver,url,username,password);
		//����mysql�����ൽ"JVM�ڴ���(����ȥ)"
        //���������ȥ����һ����
		Class.forName(driver);	
		System.out.println("{JDBC}�ɹ���������..");
		}catch(IOException e) {
			System.out.println("{JDBC}��ȡ�ļ�ʧ��..");
		}catch(ClassNotFoundException e1) {
			System.out.println("{JDBC}�������jar���Ƿ������ȷ");
		}
	}
    //����һ���̱߳���,���洢�����Connection�����ӣ�
	private static ThreadLocal<Connection> Local = new ThreadLocal();
	
	//��ȡ���ݿ�����
	//Ҫ���԰���java.sql.Connection
	public static Connection getConnection() throws SQLException {
		Connection conn = Local.get();
		if( conn == null) {
			//���û�У���������������ȡ
			conn = DriverManager.getConnection(url, username,password);
			//ͬʱ�����߳�����
			Local.set(conn);
		}
		return conn;	
	}
	public static void closeConnection()throws SQLException {
		//�������л�ȡ����
		Connection conn = Local.get();
		//����������û�����Ӵ���
		if( conn == null) {
			//�������׳���ָ���쳣
          throw new NullPointerException("{jdbc}���Ӳ�����.");
		}
		//�ر�����
		conn.close();
		//�����
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