package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 管理员: (username) password
		登陆，修改个人信息，发布课程
 * @author 2SXL20300
 *
 */
public class Admin {

	private String username;
	private String password;
	/**
	 * @param username
	 * @param password
	 */
	public Admin(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	public void updateUser(Statement stat) throws SQLException{
		//public Student(String sname, String spw, int sid, String sex, String myClass) {
			
		 String sql ="update admin set password='"+password+"' where username ="+username;
		 stat.executeUpdate(sql);
			
	}
	public static Admin login(String sid,String pw,Statement stat ) throws Exception{
		String sql ="select * from admin where username='"+sid+"' and password = '"+pw+"'";
		ResultSet rs =stat.executeQuery(sql);
		Admin s = null;
		if(rs.next()){
			s =new Admin(rs.getString(1),
					rs.getString(2))
					;
		}else
			throw new Exception("用户名或密码错误！");
		
		return s;
	}
	/**
	 * 开课
	 *
	 * @param c
	 * @param stat
	 * @throws SQLException
	 */
	public void openCourse(Course c,Statement stat) throws SQLException{
		String sql = "insert into Course values("+c.getCid()+","+c.getTid()+",'"+c.getCname()+"',"
		+c.getMax()+","+c.getCurrent()+")";
		stat.executeUpdate(sql);
	}
}
