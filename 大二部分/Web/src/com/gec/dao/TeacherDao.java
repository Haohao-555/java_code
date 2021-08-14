package com.gec.dao;

import java.util.ArrayList;

import com.gec.domain.Course;
import com.gec.domain.St_full_course;
import com.gec.domain.Teacher;

public interface TeacherDao {
    //登录
	public Teacher t_db_login(String te_name, String password)throws Exception;
	//查询课程
	public ArrayList<Course> t_db_select_course(int tea_id)throws Exception;
	//查看课程的学生
	public ArrayList<St_full_course> t_db_select_full_course(String te_name, int co_id)throws Exception;
	//插入成绩
	public void t_db_update_grade(String account,int co_id,float grade)throws Exception;
	//查看成绩排名
	public ArrayList<St_full_course> t_db_select_grade(String teacher,int co_id)throws Exception;
}
