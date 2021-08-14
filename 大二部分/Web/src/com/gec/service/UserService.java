package com.gec.service;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface UserService {
	//登录
	public  void islogin(HttpServletRequest req, HttpServletResponse resp,ServletContext application);
	//注册
	public void register(HttpServletRequest req, HttpServletResponse resp);
	//查看已公布的课程信息
	public void select_all_course(HttpServletRequest req, HttpServletResponse resp,ServletContext application);
	//绑定个人信息
	public void  my(HttpServletRequest req, HttpServletResponse resp,ServletContext application);
	//选课
	public void insert_course(HttpServletRequest req,HttpServletResponse resp,ServletContext application);
	//我的已选
	public void select_My_course(HttpServletRequest req,HttpServletResponse resp,ServletContext application);
	//退选
	public void delete_course(HttpServletRequest req,HttpServletResponse resp);
	//查看成绩
	public void select_grade(HttpServletRequest req,HttpServletResponse resp,ServletContext application);
}
