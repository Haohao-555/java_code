package untity;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;



import com.mysql.jdbc.PreparedStatement;

import entity.Admin;
import entity.Full_course;

public class Admin_Impl{
	
  //  登录
	public static Admin login(String name, String pa) throws Exception {
		String sql="select *from adminer where name=? and pa=?";
		PreparedStatement pstmt=(PreparedStatement) DataConnect.getcon().prepareStatement(sql);
		pstmt.setString(1, name);
		pstmt.setString(2, pa);
		ResultSet rs=pstmt.executeQuery();
		if(rs.next()){
			return new Admin(rs.getInt(1),rs.getString(2),rs.getString(2));	
		}
		return null;
	}

	//********************************更新课程信息********************************
//	(1)查看老师是否存在
	public static boolean isteacher(String te_name) {
		String sql="select te_name from teacher where te_name=?";
		PreparedStatement pstmt;
		ResultSet rs;
		try {
			pstmt=(PreparedStatement) DataConnect.getcon().prepareStatement(sql);
			pstmt.setString(1, te_name);
			rs = pstmt.executeQuery();
			if(rs.next()){
				return true;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		return false;
	} 
//	(2)更新课程老师
	public static void update_course_teacher(int old_id,int new_id,String course){
		String sql="update course set tea_id=? where tea_id=? and course=?";
		PreparedStatement pstmt;
		try {
			pstmt=(PreparedStatement)DataConnect.getcon().prepareStatement(sql);
			pstmt.setInt(1, new_id);
			pstmt.setInt(2, old_id);
			pstmt.setString(3, course);
			pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
//	(3)更新上课地点
	public static void update_cotime(String course,String co_time){
		String sql="update course set co_time=? where course=?";
		PreparedStatement pstmt;
		try {
			pstmt=(PreparedStatement)DataConnect.getcon().prepareStatement(sql);
			pstmt.setString(1, co_time);
			pstmt.setString(2, course);
			pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
	}
//	(4)更新学分
	public static void update_credit(String course,int credit){
		String sql="update course set credit=? where course=?";
		PreparedStatement pstmt;
		try {
			pstmt=(PreparedStatement)DataConnect.getcon().prepareStatement(sql);
			pstmt.setInt(1, credit);
			pstmt.setString(2, course);
			pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
 //	(5)查找教师id
	public static int select_te_id(String te_name){
		String sql="select te_id from teacher where te_name=?";
		PreparedStatement pstmt;
		ResultSet rs;
		try {
			pstmt=(PreparedStatement) DataConnect.getcon().prepareStatement(sql);
			pstmt.setString(1, te_name);
			rs=pstmt.executeQuery();
			if(rs.next()){
				return rs.getInt(1);
			}
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
//  (6)更新课程数量
	public static void update_number(String course,int number){
		String sql="update course set number=? where course=?";
		PreparedStatement pstmt;
		try {
			pstmt=(PreparedStatement)DataConnect.getcon().prepareStatement(sql);
			pstmt.setInt(1, number);
			pstmt.setString(2, course);
			pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
//**********************************************************************************************************************
	
//	查找已有课程
	public static ArrayList<Full_course>get_Courselist()throws Exception{
		ArrayList<Full_course>courselist = new ArrayList<Full_course>();
		String sql="select * from full_course where flag=1 order by co_id ASC";
		ResultSet rs = DataConnect.getcon().createStatement().executeQuery(sql);
		while(rs.next()) {
			courselist.add(new Full_course(rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getString(6),rs.getInt(7),rs.getInt(8)));	
		}
		return courselist;
	}
//  查看一节课程的详细信息
	public static Full_course getcourse(int co_id) throws Exception{
		String sql="select * from full_course where co_id=?";
		PreparedStatement pstmt=(PreparedStatement) DataConnect.getcon().prepareStatement(sql);
		pstmt.setInt(1, co_id);
		ResultSet rs=pstmt.executeQuery();
		if(rs.next()){
			return new Full_course(rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getString(6),rs.getInt(7),rs.getInt(8));
		}
		return null;
	}

  //	增加老师
	public static void add_tea(String name, String college) throws Exception {
		String sq="insert into teacher(te_name,pa,college)values(?,?,?)";
		PreparedStatement pstmt=(PreparedStatement) DataConnect.getcon().prepareStatement(sq);
		pstmt.setString(1, name);
		pstmt.setString(2, "123");//密码默认为123
		pstmt.setString(3, college);
		pstmt.executeUpdate();
	}
 //	增加课程
	public static void add_course(String course, int credit, String coTime,int number,String tea_name) throws Exception {
		String sq="insert into course(course,credit,tea_id,co_time,number,flag)values(?,?,?,?,?,?)";
		PreparedStatement pstmt=(PreparedStatement) DataConnect.getcon().prepareStatement(sq);
		pstmt.setString(1,course);
		pstmt.setInt(2,credit);
		pstmt.setInt(3, select_te_id(tea_name));//查找教师id
		pstmt.setString(4,coTime);
		pstmt.setInt(5,number);
		pstmt.setInt(6,1);
		pstmt.executeUpdate();
	}
 //	增加学生
	public static void add_stu(String name, String xuehao, String major) throws Exception {
		String sq="insert into student(name,xuehao,pa,major)values(?,?,?,?)";
		PreparedStatement pstmt=(PreparedStatement) DataConnect.getcon().prepareStatement(sq);
		pstmt.setString(1, name);
		pstmt.setString(2, xuehao);
		pstmt.setString(3, "321");//密码默认为321
		pstmt.setString(4, major);
		pstmt.executeUpdate();
	}
//	查看已有老师
	public static ArrayList<String>get_tea_name() throws Exception{
		ArrayList<String>tea_namelist=new ArrayList<String>();
		String sql="select te_name from teacher";
		ResultSet rs = DataConnect.getcon().createStatement().executeQuery(sql);
		while(rs.next()) {
			tea_namelist.add(rs.getString(1));
		}
		return tea_namelist;
	}

//	删除课程
	public static  void delete_course(int coId) throws Exception {
		String sql="update course set flag=? where co_id=?";
		PreparedStatement pstmt=(PreparedStatement)DataConnect.getcon().prepareStatement(sql);
		pstmt.setInt(1, 0);
		pstmt.setInt(2, coId);
		pstmt.executeUpdate();
	}

}
