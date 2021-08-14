package com.gec.service;

import java.util.ArrayList;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gec.domain.Course;
import com.gec.domain.St_full_course;
import com.gec.domain.Teacher;

public interface TeacherService {
	//查询课程
	public void t_select_course(HttpServletRequest req, HttpServletResponse resp,ServletContext application);
	//查看课程的学生
	public void t_select_full_course(HttpServletRequest req, HttpServletResponse resp,ServletContext application);
	//插入成绩
	public void t_update_grade(HttpServletRequest req, HttpServletResponse resp,ServletContext application);
	//查看成绩排名
	public void t_select_grade(HttpServletRequest req, HttpServletResponse resp,ServletContext application);
}
