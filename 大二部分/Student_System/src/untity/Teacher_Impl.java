package untity;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.jdbc.PreparedStatement;

import entity.Full_class_grade;
import entity.Teacher;

public class Teacher_Impl{

	
	public static void in_grade(int stId, float grade, int coId) {
		// TODO Auto-generated method stub
		
	}

//    登录
	public static Teacher login(String name, String pa) throws Exception {
		String sql="select *from teacher where te_name=? and pa=?";
		PreparedStatement pstmt=(PreparedStatement) DataConnect.getcon().prepareStatement(sql);
		pstmt.setString(1, name);
		pstmt.setString(2, pa);
		ResultSet rs=pstmt.executeQuery();
		if(rs.next()){
			return new Teacher(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4));
		}
		return null;
		
	}
//  查看课程成绩
	public static ArrayList<Full_class_grade> get_class_grade(String course) throws Exception{
		ArrayList<Full_class_grade> full_class_grade=new ArrayList<Full_class_grade>();
		String sql="select * from full_class_grade where course=? order by xuehao asc";
		PreparedStatement pstmt=(PreparedStatement) DataConnect.getcon().prepareStatement(sql);
		pstmt.setString(1, course);
		ResultSet rs=pstmt.executeQuery();
		while(rs.next()){
			full_class_grade.add(new Full_class_grade(rs.getInt(1), rs.getFloat(2), rs.getInt(3), rs.getString(4),rs.getInt(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getInt(11),rs.getInt(12)));
		}
		return full_class_grade;
	}
//	查看教授的课程
	public static ArrayList<String>get_courselist(int tea_id){
		ArrayList<String> courselist=new ArrayList<String>();
		String sql="select course from course where tea_id=?";
		PreparedStatement pstmt;
		ResultSet rs;
		try {
			pstmt=(PreparedStatement) DataConnect.getcon().prepareStatement(sql);
			pstmt.setInt(1, tea_id);
			rs=pstmt.executeQuery();
			while(rs.next()){
				courselist.add(rs.getString(1));
			}
			return courselist;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	//排名
	public static ArrayList<Full_class_grade> get_pai(String course) throws Exception{
		ArrayList<Full_class_grade> full_class_grade = new ArrayList<Full_class_grade>();
		String sql="select * from full_class_grade where course=? order by grade desc";
		PreparedStatement pstmt=(PreparedStatement) DataConnect.getcon().prepareStatement(sql);
		pstmt.setString(1, course);
		ResultSet rs=pstmt.executeQuery();
		while(rs.next()){
			full_class_grade.add(new Full_class_grade(rs.getInt(1), rs.getFloat(2), rs.getInt(3), rs.getString(4),rs.getInt(5),rs.getString(6),
					rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getInt(11),rs.getInt(12)));
		}
		return full_class_grade;
	}
//  录入成绩
	public static void update_grade(int st_id, float new_grade, int co_id) throws Exception {
		System.out.println(st_id+" "+new_grade+" "+co_id);
		String sql="update stu_course set grade=?,flag=? where st_id=? and co_id=?";
		PreparedStatement pstmt=(PreparedStatement)DataConnect.getcon().prepareStatement(sql);
		pstmt.setFloat(1, new_grade);
		pstmt.setInt(2, 1);
		pstmt.setInt(3, st_id);
		pstmt.setInt(4, co_id);
		pstmt.executeUpdate();
		
	}
	
  //    更新密码
	public static void update_pa(String name,String newpa) throws Exception{
		String sql="update teacher set Pa=? where te_name=?";
		PreparedStatement pstmt=(PreparedStatement)DataConnect.getcon().prepareStatement(sql);
		pstmt.setString(1, newpa);
		pstmt.setString(2, name);
		pstmt.executeUpdate();
	}
}
