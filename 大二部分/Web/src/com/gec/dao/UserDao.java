package com.gec.dao;

import java.util.ArrayList;

import com.gec.domain.Course_detail;
import com.gec.domain.St_full_course;
import com.gec.domain.Student;
import com.gec.domain.User;

public interface UserDao {
	//查看用户是否经注册或账号已存在
	public String db_is_user(String account)throws Exception;
	//判断用户账号及密码是否正确
	public User db_select_user(String account, String password) throws Exception;
	//插入用户
	public  void db_insert_user(String account,String password)throws Exception;
	//查看已公布的课程信息
	public  ArrayList<Course_detail> db_select_all_course()throws Exception;
	//查看已公布课程的id
	public ArrayList<Integer> db_select_courseid()throws Exception;
	//绑定个人信息 
	public void db_insert_student(Student student) throws Exception;
	//读取个人信息
	public Student db_select_student(String account)throws Exception;
	//选课
	public void db_insert_course(String account,int co_id)throws Exception;
	//我的已选
	public ArrayList<St_full_course> db_select_My_course(String account)throws Exception;
	//查看课程是否已经选了
	public Boolean db_is_select_course(String account,int co_id)throws Exception;
	//退选
	public void db_delete_course(String account,int co_id)throws Exception;
	//更新user表的flag
	public void db_insert_flag(String account)throws Exception;
	//查看成绩
	public ArrayList<St_full_course> db_select_me_grade(String account)throws Exception;
}
