package com.gec.dao;

import java.util.ArrayList;

import com.gec.domain.Course;
import com.gec.domain.Course_detail;
import com.gec.domain.Student;
import com.gec.domain.Teacher;
import com.gec.domain.User;

public interface AdminDao {
	//查找已公布的课程
	public  ArrayList<Course_detail> a_db_select_all_course()throws Exception;
	//更新课程信息
	public void a_db_update_course(Course course)throws Exception;
	//删除课程
	public void a_db_delete_course(int co_id)throws Exception;
	//查找教师tea_id
	public int a_db_select_tea_id(String tea_name)throws Exception;
	//增加课程
	public void a_db_insert_course(Course course)throws Exception;
	//增加教师
	public void a_db_insert_teacher(Teacher teacher)throws Exception;
	//查找教师信息
	public ArrayList<Teacher> a_db_select_teacher()throws Exception;
	//更新教师职位
	public void a_db_update_teacher(String position,int te_id)throws Exception;
	//删除教师
	public void a_db_delete_teacher(int te_id)throws Exception;
	//查看学生信息
	public ArrayList<Student> a_db_select_student()throws Exception;
	//查看注册账号信息
	public ArrayList<User> a_db_select_user()throws Exception;
	//注销账号
	public void a_db_del_user(int id)throws Exception;
}
