package untity;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.jdbc.PreparedStatement;

import entity.A;
import entity.Full_class_grade;
import entity.Full_course;
import entity.Student;

public class Student_Impl{

//	选课
	public  static void choice(int st_id, int co_id,int te_id) throws Exception {
		String sq="insert into stu_course(st_id,co_id,te_id,grade,flag)values(?,?,?,?,?)";
		PreparedStatement pstmt=(PreparedStatement) DataConnect.getcon().prepareStatement(sq);
		pstmt.setInt(1, st_id);
		pstmt.setInt(2, co_id);
		pstmt.setInt(3, te_id);
		pstmt.setInt(4,0);
		pstmt.setInt(5, 0);
		pstmt.executeUpdate();	
	}
//	课程数量减一
	public static void course_1(int co_id) throws Exception{
		String sql="update course set number=number-1 where co_id=?";
		PreparedStatement pstmt=(PreparedStatement)DataConnect.getcon().prepareStatement(sql);
		pstmt.setInt(1, co_id);
		pstmt.executeUpdate();
	}
//  课程数量加一
    public static void course_jia1(int co_id)throws Exception{
    	String sql="update course set number=number+1 where co_id=?";
		PreparedStatement pstmt=(PreparedStatement)DataConnect.getcon().prepareStatement(sql);
		pstmt.setInt(1, co_id);
		pstmt.executeUpdate();
    }
	
// 查看已公布课程
	public static ArrayList<Full_course> select_couse() throws Exception{
		ArrayList<Full_course>courselist = new ArrayList<Full_course>();
		String sql="select * from full_course where flag=1 order by co_id ASC";
		ResultSet rs = DataConnect.getcon().createStatement().executeQuery(sql);
		while(rs.next()) {
			courselist.add(new Full_course(rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getString(4),
					rs.getInt(5),rs.getString(6),rs.getInt(7),rs.getInt(8)));	
		}
		return courselist;
	}
//    登录
	public static Student login(String name, String pa) throws Exception {
		String sql="select *from student where name=? and pa=?";
		PreparedStatement pstmt=(PreparedStatement) DataConnect.getcon().prepareStatement(sql);
		pstmt.setString(1, name);
		pstmt.setString(2, pa);
		ResultSet rs=pstmt.executeQuery();
		if(rs.next()){
			return new Student(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
		}
		return null;
	}

//	查看我的课表
	public static ArrayList<Full_class_grade> select_class(String name) throws Exception{
		ArrayList<Full_class_grade>full_class_grade = new ArrayList<Full_class_grade>();
		String sql="select * from full_class_grade where name=?";
		PreparedStatement pstmt=(PreparedStatement) DataConnect.getcon().prepareStatement(sql);
		pstmt.setString(1, name);
		ResultSet rs=pstmt.executeQuery();
		while(rs.next()) {
			full_class_grade.add(new Full_class_grade(rs.getInt(1), rs.getFloat(2), rs.getInt(3), rs.getString(4),
					rs.getInt(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getInt(11),rs.getInt(12)));
		}
		return full_class_grade;	
	}

//  查看我的课表是否存在这门课
	public static boolean iscourse(int co_id,String name){
		ArrayList<Full_class_grade>full_class_grade = new ArrayList<Full_class_grade>();
		String sql="select * from full_class_grade where co_id=? and name=?";
		PreparedStatement pstmt;
		try {
			pstmt = (PreparedStatement) DataConnect.getcon().prepareStatement(sql);
			pstmt.setInt(1, co_id);
			pstmt.setString(2, name);
			ResultSet rs=pstmt.executeQuery();
			if(rs.next()){
				return true;
			}
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}
	
//	查看已经选择的总学分
	public static int select_credit(String name){
		String sql="select sum(credit) from full_class_grade where name=? ";
		PreparedStatement pstmt;
		try{
			pstmt = (PreparedStatement) DataConnect.getcon().prepareStatement(sql);
			pstmt.setString(1, name);
			ResultSet rs=pstmt.executeQuery();
			if(rs.next()){
				return rs.getInt(1);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
//  查看已获得的学分
	public static int select_gain_credit(String name){
		String sql="select sum(credit) from full_class_grade where name=? and grade>=60 ";
		PreparedStatement pstmt;
		try{
			pstmt = (PreparedStatement) DataConnect.getcon().prepareStatement(sql);
			pstmt.setString(1, name);
			ResultSet rs=pstmt.executeQuery();
			if(rs.next()){
				return rs.getInt(1);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
//	成绩与绩点换算
	public  static String credit_grade(float grade){
		float g1=(grade-50)/10;
		if(grade-50<10){
			return "重修";
		}else{
			 return Float.toString(g1);
		}
	}
//	总绩点
	public static String get_allgrade(ArrayList<A> a){
		int all_credit=0;//分子
		float h;
		float allgrade;
		float num = 0;//分母
		if(a.size()!=0){
			for(int i=0;i<a.size();i++){
				//获取绩点
			    h=Float.parseFloat(credit_grade(a.get(i).getGrade()));
				num+=h*a.get(i).getCredit();//计算分母
				all_credit+=a.get(i).getCredit();//计算分子
			}
			
			BigDecimal b=new BigDecimal(num/all_credit);
			allgrade=b.setScale(2,BigDecimal.ROUND_HALF_UP).floatValue();
			return Float.toString(allgrade);
		}else{
			return "0";
		}
		
	}
	public static void delete_course(int st_id,int co_id) throws Exception{
		String sql="delete from stu_course where st_id=? and co_id=?";
		PreparedStatement pstmt=(PreparedStatement)DataConnect.getcon().prepareStatement(sql);
		pstmt.setInt(1, st_id);
		pstmt.setInt(2, co_id);
		pstmt.executeUpdate();
	}
//	修改密码
	public static void update_pa(String name,String newpa) throws Exception{
		String sql="update student set Pa=? where name=?";
		PreparedStatement pstmt=(PreparedStatement)DataConnect.getcon().prepareStatement(sql);
		pstmt.setString(1, newpa);
		pstmt.setString(2, name);
		pstmt.executeUpdate();
	}

}
