package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Student {

	private String sname;
	private String spw;
	private int sid;
	private String sex;
	private String myClass;
	/**
	 * @return the sname
	 */
	public String getSname() {
		return sname;
	}
	/**
	 * @param sname the sname to set
	 */
	public void setSname(String sname) {
		this.sname = sname;
	}
	/**
	 * @return the spw
	 */
	public String getSpw() {
		return spw;
	}
	/**
	 * @param spw the spw to set
	 */
	public void setSpw(String spw) {
		this.spw = spw;
	}
	/**
	 * @return the sid
	 */
	public int getSid() {
		return sid;
	}
	/**
	 * @param sid the sid to set
	 */
	public void setSid(int sid) {
		this.sid = sid;
	}
	/**
	 * @return the sex
	 */
	public String getSex() {
		return sex;
	}
	/**
	 * @param sex the sex to set
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}
	/**
	 * @return the myClass
	 */
	public String getMyClass() {
		return myClass;
	}
	/**
	 * @param myClass the myClass to set
	 */
	public void setMyClass(String myClass) {
		this.myClass = myClass;
	}
	/**
	 * @param sname
	 * @param spw
	 * @param sid
	 * @param sex
	 * @param myClass
	 */
	public Student(String sname, String spw, int sid, String sex, String myClass) {
		super();
		this.sname = sname;
		this.spw = spw;
		this.sid = sid;
		this.sex = sex;
		this.myClass = myClass;
	}
	//登陆，查看成绩，修改个人信息，选课
	public static Student login(int sid,String pw,Statement stat ) throws Exception{
		String sql ="select * from student where sid="+sid+" and spw = '"+pw+"'";
		ResultSet rs =stat.executeQuery(sql);
		Student s = null;
		if(rs.next()){
			s =new Student(rs.getString(1),
					rs.getString(2),
					Integer.parseInt(rs.getString(3)),
					rs.getString(4),
					rs.getString(5));
		}else
			throw new Exception("用户名或密码错误！");
		
		return s;
		
	}
	/**
	 * 查看全部成绩
	 * @return
	 * @throws Exception
	 */
	public ArrayList<Result> viewResult( Statement stat) throws Exception{
		String sql ="select * from result where sid="+sid;
		ResultSet rs =stat.executeQuery(sql);
		Result s = null;
		ArrayList<Result> results = new ArrayList<Result> ();
		while(rs.next()){
			s =new Result(Integer.parseInt(rs.getString(1)),
			Integer.parseInt(rs.getString(2)),
					Double.parseDouble(rs.getString(3)));
			results.add(s);			
		}
		
		return results;
		
	}
	/**
	 * 查看单科成绩
	 * @return
	 * @throws Exception
	 */
	public ArrayList<Result> viewResult( Statement stat,int cid) throws Exception{
		String sql ="select * from result where sid="+sid+" and cid="+cid;
		ResultSet rs =stat.executeQuery(sql);
		Result s = null;
		ArrayList<Result> results = new ArrayList<Result> ();
		if(rs.next()){
			s =new Result(Integer.parseInt(rs.getString(1)),
			Integer.parseInt(rs.getString(2)),
					Double.parseDouble(rs.getString(3)));
			results.add(s);			
		}else
			throw new Exception("没有选该课程！");
		
		return results;
		
	}
	
	public void updateUser(Statement stat) throws SQLException{
		//public Student(String sname, String spw, int sid, String sex, String myClass) {
			
		 String sql ="update student set sname='"+sname+"' where sid ="+sid;
		 stat.executeUpdate(sql);
		 sql ="update student set spw='"+spw+"' where sid ="+sid;
		 stat.executeUpdate(sql);
		 sql ="update student set sex='"+sex+"' where sid ="+sid;
		 stat.executeUpdate(sql);
		 sql ="update student set myclass='"+myClass+"' where sid ="+sid;
		 stat.executeUpdate(sql);
			
	}
	public void selectCourse(int cid,Statement stat) throws SQLException{
		String sql = "insert into result values("+sid+","+cid+","+"0)";
		stat.executeUpdate(sql);
	}
}
