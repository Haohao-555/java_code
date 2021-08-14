package com.gec.service;

import java.util.ArrayList;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gec.dao.TeacherDao;
import com.gec.dao.TeacherDaoImpl;
import com.gec.domain.Course;
import com.gec.domain.St_full_course;
import com.gec.domain.Teacher;

public class TeacherServiceImpl implements TeacherService{
    private TeacherDao teacherDao = new TeacherDaoImpl();

	@Override
	public void t_select_course(HttpServletRequest req,
			HttpServletResponse resp, ServletContext application) {
		ArrayList<Course> courselist = new ArrayList<Course>();
		 Teacher teacher = (Teacher)req.getSession().getAttribute("Teacher_account");
		try {
			courselist = teacherDao.t_db_select_course(teacher.getTe_id());
			application.setAttribute("t_courselist", courselist);
			//跳转到教师主页面
			resp.sendRedirect("teacher.jsp");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void t_select_full_course(HttpServletRequest req,
			HttpServletResponse resp, ServletContext application) {
		// TODO Auto-generated method stub
		Teacher teacher = (Teacher)req.getSession().getAttribute("Teacher_account");
		ArrayList<St_full_course> full_courselist = new ArrayList<St_full_course>();
		int co_id = Integer.parseInt(req.getParameter("co_id"));
		try {
			full_courselist = teacherDao.t_db_select_full_course(teacher.getTe_name(), co_id);
			application.setAttribute("full_courselist", full_courselist);
			req.getSession().setAttribute("co_id", co_id);
			//resp.sendRedirect("tea_student.jsp");
			req.getRequestDispatcher("tea_student.jsp").forward(req,resp);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void t_select_grade(HttpServletRequest req,
			HttpServletResponse resp, ServletContext application) {
		Teacher teacher = (Teacher)req.getSession().getAttribute("Teacher_account");
		int co_id = Integer.parseInt(req.getParameter("co_id"));
		ArrayList<St_full_course> full_courselist_desc = new ArrayList<St_full_course>();
		try {
			full_courselist_desc=teacherDao.t_db_select_grade(teacher.getTe_name(),co_id);
			application.setAttribute("grade_desc", full_courselist_desc);
			//req.getRequestDispatcher("grade_desc.jsp").forward(req,resp);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void t_update_grade(HttpServletRequest req,
			HttpServletResponse resp, ServletContext application) {
		Teacher teacher = (Teacher)req.getSession().getAttribute("Teacher_account");
		ArrayList<St_full_course> full_courselist = new ArrayList<St_full_course>();
		
		String account = (String)req.getParameter("account");
		int co_id = Integer.parseInt(req.getParameter("co_id"));
		float grade = Float.parseFloat(req.getParameter("grade"));
		try {
			teacherDao.t_db_update_grade(account, co_id, grade);
			//重新加载数据
			full_courselist = teacherDao.t_db_select_full_course(teacher.getTe_name(), co_id);
			application.setAttribute("full_courselist", full_courselist);
			resp.getWriter().print("录入成绩成功");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
	
}
