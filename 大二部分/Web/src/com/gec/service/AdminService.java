package com.gec.service;

import java.util.ArrayList;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gec.domain.Course;
import com.gec.domain.Course_detail;
import com.gec.domain.Teacher;

public interface AdminService {
   //获取课程信息
	public void a_select_all_course(HttpServletRequest req, HttpServletResponse resp,ServletContext application);
	//删除课程
	public void a_delete_course(HttpServletRequest req, HttpServletResponse resp);
	//更新课程
	public void a_update_course(HttpServletRequest req, HttpServletResponse resp,ServletContext application);
	//查找教师id
	public int a_select_tea_id(String te_name);
	//增加课程
	public void a_insert_course(HttpServletRequest req, HttpServletResponse resp,ServletContext application);
	//增加教师
	public void a_insert_teacher(HttpServletRequest req, HttpServletResponse resp,ServletContext application);
	//查找教师信息
	public void a_select_teacher(HttpServletRequest req, HttpServletResponse resp,ServletContext application);
	//更新教师职位
	public void a_update_teacher(HttpServletRequest req, HttpServletResponse resp,ServletContext application);
	//删除教师
	public void a_delete_teacher(HttpServletRequest req, HttpServletResponse resp,ServletContext application);
	//查看学生信息
	public void a_select_student(HttpServletRequest req, HttpServletResponse resp,ServletContext application);
	//查看用户信息
	public void a_select_user(HttpServletRequest req, HttpServletResponse resp,ServletContext application);
	//注销用户信息
	public void a_del_user(HttpServletRequest req, HttpServletResponse resp,ServletContext application);
}
