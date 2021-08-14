package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * 老师: tname tpw (tid)  
		登陆，修改个人信息，修改成绩，查看成绩
 * @author 2SXL20300
 *
 */
public class Teacher {

	private String tname;
	private String tpw;
	private int tid;
	/**
	 * @param tname
	 * @param tpw
	 * @param tid
	 */
	public Teacher(String tname, String tpw, int tid) {
		super();
		this.tname = tname;
		this.tpw = tpw;
		this.tid = tid;
	}
	/**
	 * @return the tname
	 */
	public String getTname() {
		return tname;
	}
	/**
	 * @param tname the tname to set
	 */
	public void setTname(String tname) {
		this.tname = tname;
	}
	/**
	 * @return the tpw
	 */
	public String getTpw() {
		return tpw;
	}
	/**
	 * @param tpw the tpw to set
	 */
	public void setTpw(String tpw) {
		this.tpw = tpw;
	}
	/**
	 * @return the tid
	 */
	public int getTid() {
		return tid;
	}
	/**
	 * @param tid the tid to set
	 */
	public void setTid(int tid) {
		this.tid = tid;
	}
	public static Teacher login(int sid,String pw,Statement stat ) throws Exception{
		String sql ="select * from teacher where tid="+sid+" and tpw = '"+pw+"'";
		ResultSet rs =stat.executeQuery(sql);
		Teacher s = null;
		if(rs.next()){
			s =new Teacher(rs.getString(1),
					rs.getString(2),
					Integer.parseInt(rs.getString(3))
					);
		}else
			throw new Exception("用户名或密码错误！");
		
		return s;
		
	}
	public void updateUser(Statement stat) throws SQLException{
		//public Student(String sname, String spw, int sid, String sex, String myClass) {
			
		 String sql ="update teacher set tname='"+tname+"' where tid ="+tid;
		 stat.executeUpdate(sql);
		 sql ="update teacher set tpw='"+tpw+"' where tid ="+tid;
		 stat.executeUpdate(sql);
		
			
	}
	/**
	 * 查看成绩
	 * @return
	 * @throws Exception
	 */
	public ArrayList<Result> viewResult( Statement stat) throws Exception{
		String sql ="select * from result ";
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
	 * 更新单科成绩
	 * @return
	 * @throws Exception
	 */
	public void viewResult( Statement stat,int cid,int sid,double score) throws Exception{
		String sql ="update result set score="+score+" where sid="+sid+" and cid="+cid;
		System.out.println(cid);
		System.out.println(sid);
		System.out.println(score);
		
		 stat.executeUpdate(sql);
	}
}
