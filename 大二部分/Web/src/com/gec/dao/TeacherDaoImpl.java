package com.gec.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.gec.domain.Course;
import com.gec.domain.St_full_course;
import com.gec.domain.Teacher;
import com.gec.untils.DataConnect;



public class TeacherDaoImpl implements TeacherDao{

	@Override
	public Teacher t_db_login(String teName, String password) throws Exception {
		// TODO Auto-generated method stub
		String sql="select * from teacher where te_name=? and pa=?";
		PreparedStatement pstmt=(PreparedStatement) DataConnect.getcon().prepareStatement(sql);
		pstmt.setString(1, teName);
		pstmt.setString(2, password);
		ResultSet rs=pstmt.executeQuery();
		if(rs.next()){
			  
			return new Teacher(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getInt(6));
		}
		return null;
	}

	@Override
	public ArrayList<Course> t_db_select_course(int tea_id)
			throws Exception {
		ArrayList<Course> courselist = new ArrayList<Course>();
		String sql="select * from course where tea_id=? and flag=1";
		PreparedStatement pstmt=(PreparedStatement) DataConnect.getcon().prepareStatement(sql);
		pstmt.setInt(1, tea_id);
		ResultSet rs=pstmt.executeQuery();
		while(rs.next()) {
			courselist.add(new Course(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getInt(4),rs.getString(5),rs.getInt(6)));
		}
		return courselist;
	}

	@Override
	public ArrayList<St_full_course> t_db_select_full_course(String te_name, int co_id) throws Exception {
		ArrayList<St_full_course> st_full_course = new ArrayList<St_full_course>();
		String sql="select * from st_full_course where te_name=? and co_id=? and flag=1";
		PreparedStatement pstmt=(PreparedStatement) DataConnect.getcon().prepareStatement(sql);
		pstmt.setString(1, te_name);
		pstmt.setInt(2, co_id);
		ResultSet rs=pstmt.executeQuery();
		while(rs.next()) {
			st_full_course.add(new St_full_course(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getInt(6),rs.getFloat(8),rs.getString(9)));
		}
		return st_full_course;
	}

	@Override
	public ArrayList<St_full_course> t_db_select_grade(String teacher, int coId)
			throws Exception {
		ArrayList<St_full_course> st_full_course = new ArrayList<St_full_course>();
		String sql="select * from st_full_course where te_name=? and co_id=? and flag=1 order by grade desc";
		PreparedStatement pstmt=(PreparedStatement) DataConnect.getcon().prepareStatement(sql);
		pstmt.setString(1, teacher);
		pstmt.setInt(2, coId);
		ResultSet rs=pstmt.executeQuery();
		while(rs.next()) {
			st_full_course.add(new St_full_course(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getInt(6),rs.getFloat(8),rs.getString(9)));
		}
		return st_full_course;
	}

	@Override
	public void t_db_update_grade(String account, int coId, float grade) throws Exception {
		   String sql="update st_course set grade=? where account=? and co_id=?";
		   PreparedStatement pstmt=(PreparedStatement)DataConnect.getcon().prepareStatement(sql);
		   pstmt.setFloat(1, grade);
		   pstmt.setString(2, account);
		   pstmt.setInt(3,coId);
		   pstmt.executeUpdate();
		
	}
   
}
