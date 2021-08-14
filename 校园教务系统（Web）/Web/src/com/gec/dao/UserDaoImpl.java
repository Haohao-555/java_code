package com.gec.dao;

import java.sql.ResultSet;
import java.util.ArrayList;

import com.gec.domain.Course_detail;
import com.gec.domain.St_full_course;
import com.gec.domain.Student;
import com.gec.domain.User;
import com.gec.untils.DataConnect;
import com.mysql.jdbc.PreparedStatement;

public class UserDaoImpl implements UserDao{

	@Override
	public void db_delete_course(String account, int co_id) throws Exception {
		// TODO Auto-generated method stub
		String sql="delete from st_course where account=? and co_id=?";
		PreparedStatement pstmt=(PreparedStatement)DataConnect.getcon().prepareStatement(sql);
		pstmt.setString(1, account);
		pstmt.setInt(2, co_id);
		pstmt.executeUpdate();
	}

	@Override
	public void db_insert_course(String account, int co_id) throws Exception {
		// TODO Auto-generated method stub
		String sql="insert into st_course(account,co_id)values(?,?)";
		PreparedStatement pstmt=(PreparedStatement)DataConnect.getcon().prepareStatement(sql);
		pstmt.setString(1, account);
		pstmt.setInt(2, co_id);
		pstmt.executeUpdate();
	}

	@Override
	public void db_insert_student(Student student) throws Exception {
		// TODO Auto-generated method stub
		String sql="insert into student(account,name,xuehao,majory,colleage,nianji)values(?,?,?,?,?,?)";//问号是占位符
		   PreparedStatement pstmt=(PreparedStatement) DataConnect.getcon().prepareStatement(sql);
		   pstmt.setString(1, student.getAccount());
		   pstmt.setString(2, student.getName());
		   pstmt.setString(3, student.getXuehao());
		   pstmt.setString(4, student.getMajory());
		   pstmt.setString(5, student.getColleage());
		   pstmt.setString(6, student.getNianji());
		   pstmt.executeUpdate();
	}

	@Override
	public void db_insert_user(String account, String password)
			throws Exception {
		// TODO Auto-generated method stub
		String sql="insert into user(account,password,type)values(?,?,0)";
	    PreparedStatement pstmt=(PreparedStatement) DataConnect.getcon().prepareStatement(sql);
		pstmt.setString(1,account);
		pstmt.setString(2,password);
		pstmt.executeUpdate();
	}

	@Override
	public Boolean db_is_select_course(String account, int co_id)
			throws Exception {
		// TODO Auto-generated method stub
		String sql="select *from st_course where account=? and co_id=?";
		PreparedStatement pstmt=(PreparedStatement) DataConnect.getcon().prepareStatement(sql);
		pstmt.setString(1, account);
		pstmt.setInt(2, co_id);
		ResultSet rs=pstmt.executeQuery();
		if(rs.next()){
			return true;
		}
		return false;
	}

	@Override
	public String db_is_user(String account) throws Exception {
		// TODO Auto-generated method stub
		String sql="select *from user where account=?";
		PreparedStatement pstmt=(PreparedStatement) DataConnect.getcon().prepareStatement(sql);
		pstmt.setString(1, account);
		ResultSet rs=pstmt.executeQuery();
		if(rs.next()){//账号存在
			return "1";//账号存在
		}
			return "2";//账号不存在
	}

	@Override
	public ArrayList<St_full_course> db_select_My_course(String account)
			throws Exception {
		// TODO Auto-generated method stub
		ArrayList<St_full_course>st_full_course = new ArrayList<St_full_course>();
		String sql="select * from st_full_course where account=?";
		PreparedStatement pstmt=(PreparedStatement) DataConnect.getcon().prepareStatement(sql);
		pstmt.setString(1, account);
		ResultSet rs=pstmt.executeQuery();
		while(rs.next()) {
			st_full_course.add(new St_full_course(rs.getString(1),rs.getString(2),
					rs.getInt(3),rs.getString(4),rs.getString(5),rs.getInt(6)));	
		}
		return st_full_course;	
	}

	@Override
	public ArrayList<Course_detail> db_select_all_course() throws Exception {
		// TODO Auto-generated method stub
		String sql="select * from full_course where flag=1 order by co_id ASC";
		ArrayList<Course_detail>courselist = new ArrayList<Course_detail>();
		ResultSet rs = DataConnect.getcon().createStatement().executeQuery(sql);
		while(rs.next()) {
			courselist.add(new Course_detail(rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getString(4),
					rs.getInt(5),rs.getString(6),rs.getInt(7),rs.getInt(8)));	
		}
		return courselist;
	}

	@Override
	public ArrayList<Integer> db_select_courseid() throws Exception {
		// TODO Auto-generated method stub
		String sql="select co_id from course where flag=1";
		ArrayList<Integer>courseids = new ArrayList<Integer>();
		ResultSet rs = DataConnect.getcon().createStatement().executeQuery(sql);
		while(rs.next()) {
			courseids.add(rs.getInt(1));
		}
		return courseids;
	}

	@Override
	public Student db_select_student(String account) throws Exception {
		// TODO Auto-generated method stub
		String sql="select *from student where account=?";
		PreparedStatement pstmt=(PreparedStatement) DataConnect.getcon().prepareStatement(sql);
		pstmt.setString(1, account);
		ResultSet rs=pstmt.executeQuery();
		if(rs.next()){
			return new Student(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7));
		}
		return null;
	}

	@Override
	public User db_select_user(String account, String password)
			throws Exception {
		// TODO Auto-generated method stub
		//取参数
		User user=null;
		String sql="select *from user where account=? and password=?";
		PreparedStatement pstmt=(PreparedStatement) DataConnect.getcon().prepareStatement(sql);
		pstmt.setString(1, account);
		pstmt.setString(2, password);
		ResultSet rs=pstmt.executeQuery();
		if(rs.next()){
			return new User(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4));
		}
		return null;
	}

	
	
}
