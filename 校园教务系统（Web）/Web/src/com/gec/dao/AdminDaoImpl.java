package com.gec.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.gec.domain.Course;
import com.gec.domain.Course_detail;
import com.gec.domain.Student;
import com.gec.domain.Teacher;
import com.gec.domain.User;
import com.gec.untils.DataConnect;
import com.mysql.jdbc.PreparedStatement;

public class AdminDaoImpl implements AdminDao{

	@Override
	public ArrayList<Course_detail> a_db_select_all_course() throws Exception{
		// TODO Auto-generated method stub
		String sql="select * from full_course where flag=1 order by co_id ASC";
		ArrayList<Course_detail>courselist = new ArrayList<Course_detail>();
		ResultSet rs;
		
			rs = DataConnect.getcon().createStatement().executeQuery(sql);
			while(rs.next()) {
				courselist.add(new Course_detail(rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getString(4),
						rs.getInt(5),rs.getString(6),rs.getInt(7),rs.getInt(8)));	
			}
			return courselist;
		
		
	}

	@Override
	public void a_db_delete_course(int coId) throws Exception {
		// TODO Auto-generated method stub
		   String sql="update course set flag=0 where co_id=?";
		   PreparedStatement pstmt=(PreparedStatement)DataConnect.getcon().prepareStatement(sql);
		   pstmt.setInt(1, coId);
		   pstmt.executeUpdate();
	}

	@Override
	public void a_db_update_course(Course course) throws Exception {
		// TODO Auto-generated method stub
		   String sql="update course set course=?,credit=?,tea_id=?,co_time=?,number=? where co_id=?";
		   PreparedStatement pstmt=(PreparedStatement)DataConnect.getcon().prepareStatement(sql);
		   pstmt.setString(1, course.getCourse());
		   pstmt.setInt(2, course.getCredit());
		   pstmt.setInt(3, course.getTea_id());
		   pstmt.setString(4, course.getCo_time());
		   pstmt.setInt(5, course.getNumber());
		   pstmt.setInt(6, course.getId());
		   pstmt.executeUpdate();
	}

	@Override
	public int a_db_select_tea_id(String teaName) throws Exception {
		// TODO Auto-generated method stub
		String sql="select te_id from teacher where te_name=?";
		PreparedStatement pstmt=(PreparedStatement) DataConnect.getcon().prepareStatement(sql);
		pstmt.setString(1, teaName);
		ResultSet rs=pstmt.executeQuery();
		if(rs.next()){
			return rs.getInt(1);
		}
		return 0;
	}

	@Override
	public void a_db_insert_course(Course course) throws Exception {
		// TODO Auto-generated method stub
		String sql="insert into course(course,credit,tea_id,co_time,number,flag)values(?,?,?,?,?,1)";
		PreparedStatement pstmt=(PreparedStatement)DataConnect.getcon().prepareStatement(sql);
		pstmt.setString(1, course.getCourse());
		pstmt.setInt(2, course.getCredit());
		pstmt.setInt(3, course.getTea_id());
		pstmt.setString(4, course.getCo_time());
		pstmt.setInt(5, course.getNumber());
		pstmt.executeUpdate();
	}

	@Override
	public void a_db_delete_teacher(int teId) throws Exception {
		// TODO Auto-generated method stub
		   String sql="update teacher set flag=0 where te_id=?";
		   PreparedStatement pstmt=(PreparedStatement)DataConnect.getcon().prepareStatement(sql);
		   pstmt.setInt(1,teId);
		   pstmt.executeUpdate();
	}

	@Override
	public void a_db_insert_teacher(Teacher teacher) throws Exception {
		// TODO Auto-generated method stub
		String sql="insert into teacher(te_name,pa,college,position,flag)values(?,?,?,?,1)";
		PreparedStatement pstmt=(PreparedStatement)DataConnect.getcon().prepareStatement(sql);
		pstmt.setString(1, teacher.getTe_name());
		pstmt.setString(2, teacher.getPassword());
		pstmt.setString(3, teacher.getCollege());
		pstmt.setString(4, teacher.getPosition());
		pstmt.executeUpdate();
	}

	@Override
	public ArrayList<Teacher> a_db_select_teacher() throws Exception {
		// TODO Auto-generated method stub
		String sql="select * from teacher where flag=1";
		ArrayList<Teacher>teachers = new ArrayList<Teacher>();
		ResultSet rs;
		
			rs = DataConnect.getcon().createStatement().executeQuery(sql);
			while(rs.next()) {
				teachers.add(new Teacher(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),
						rs.getString(5),rs.getInt(6)));	
			}
			return teachers;
	}

	@Override
	public void a_db_update_teacher(String position,int te_id) throws Exception {
		// TODO Auto-generated method stub
		   String sql="update teacher set position=? where te_id=?";
		   PreparedStatement pstmt=(PreparedStatement)DataConnect.getcon().prepareStatement(sql);
		   pstmt.setString(1, position);
		   pstmt.setInt(2, te_id);
		   pstmt.executeUpdate();
	}

	@Override
	public ArrayList<Student> a_db_select_student() throws Exception {
		// TODO Auto-generated method stub
		String sql="select * from student";
		ArrayList<Student>students = new ArrayList<Student>();
		ResultSet rs;
		
			rs = DataConnect.getcon().createStatement().executeQuery(sql);
			while(rs.next()) {
				students.add(new Student(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),
						rs.getString(5),rs.getString(6),rs.getString(7)));	
			}
			return students;
	}

	@Override
	public ArrayList<User> a_db_select_user() throws Exception {
		// TODO Auto-generated method stub
		String sql="select * from user";
		ArrayList<User> users = new ArrayList<User>();
		ResultSet rs;
		
			rs = DataConnect.getcon().createStatement().executeQuery(sql);
			while(rs.next()) {
				users.add(new User(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4)));	
			}
			return users;
	}
   
}
