package com.gec.service;

import java.util.ArrayList;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gec.dao.AdminDao;
import com.gec.dao.AdminDaoImpl;
import com.gec.domain.Course;
import com.gec.domain.Course_detail;
import com.gec.domain.Student;
import com.gec.domain.Teacher;
import com.gec.domain.User;

public class AdminServiceImpl implements AdminService{
    private AdminDao adminDao=new AdminDaoImpl();
	@Override
	public void a_select_all_course(HttpServletRequest req,
			HttpServletResponse resp, ServletContext application) {
		ArrayList<Course_detail>courselist = new ArrayList<Course_detail>();
		try {
			courselist=adminDao.a_db_select_all_course();
			application.setAttribute("a_courselist", courselist);
			//跳转到管理员主页面
			resp.sendRedirect("admin.jsp");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void a_delete_course(HttpServletRequest req, HttpServletResponse resp) {
		// TODO Auto-generated method stub
		String co_id=req.getParameter("co_id");
		try {
			adminDao.a_db_delete_course(Integer.parseInt(co_id));
			resp.getWriter().print("删除课程成功");
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void a_update_course(HttpServletRequest req, HttpServletResponse resp,ServletContext application) {
		// TODO Auto-generated method stub
		ArrayList<Course_detail>courselist = new ArrayList<Course_detail>();
		String course_name=req.getParameter("course");
		int credit=Integer.parseInt(req.getParameter("credit"));
		String co_time=req.getParameter("time");
		String tea_name=req.getParameter("teacher");
		int number=Integer.parseInt(req.getParameter("number"));
		int co_id=Integer.parseInt(req.getParameter("co_id"));
		int tea_id=a_select_tea_id(tea_name);
		try{
			if(tea_id==0){
				resp.getWriter().print("更新课程失败没有找到该教师");
			}else{
				Course course=new Course(co_id, course_name, credit, tea_id, co_time, number);
				adminDao.a_db_update_course(course);
				//更新全局下的课程信息
				courselist=adminDao.a_db_select_all_course();
				application.setAttribute("a_courselist", courselist);
				resp.getWriter().print("更新课程信息成功");
			}
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}	
	}
	@Override
	public int a_select_tea_id(String te_name) {
		// TODO Auto-generated method stub
		try {
			int tea_id=adminDao.a_db_select_tea_id(te_name);
			return tea_id;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	@Override
	public void a_insert_course(HttpServletRequest req, HttpServletResponse resp,ServletContext application) {
		// TODO Auto-generated method stub
		ArrayList<Course_detail>courselist = new ArrayList<Course_detail>();
		String course_name=req.getParameter("course");
		int credit=Integer.parseInt(req.getParameter("credit"));
		String co_time=req.getParameter("time");
		String tea_name=req.getParameter("teacher");
		int number=Integer.parseInt(req.getParameter("number"));
		int co_id=Integer.parseInt(req.getParameter("co_id"));
		int tea_id=a_select_tea_id(tea_name);
		try{
			if(tea_id == 0){
				resp.getWriter().print("增加课程失败没有找到该教师");
			}else{
				Course course=new Course(co_id, course_name, credit, tea_id, co_time, number);
				adminDao.a_db_insert_course(course);
				//更新全局下的课程信息
				courselist=adminDao.a_db_select_all_course();
				application.setAttribute("a_courselist", courselist);
				resp.getWriter().print("增加课程成功");
				
			}
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	@Override
	public void a_delete_teacher(HttpServletRequest req,
			HttpServletResponse resp, ServletContext application) {
		// TODO Auto-generated method stub
		int te_id=Integer.parseInt(req.getParameter("te_id"));
		try {
			adminDao.a_db_delete_teacher(te_id);
			ArrayList<Teacher> teachers=adminDao.a_db_select_teacher();
			application.setAttribute("teachers", teachers);
			resp.getWriter().print("删除教师成功");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void a_insert_teacher(HttpServletRequest req,
			HttpServletResponse resp, ServletContext application) {
		// TODO Auto-generated method stub
		String te_name=req.getParameter("te_name");
		String colleage=req.getParameter("colleage");
		String position=req.getParameter("position");
		int te_id=Integer.parseInt(req.getParameter("te_id"));
		Teacher teacher =new Teacher(te_id,te_name,"123",colleage,position,1);
		try {
			adminDao.a_db_insert_teacher(teacher);
			ArrayList<Teacher> teachers=adminDao.a_db_select_teacher();
			application.setAttribute("teachers", teachers);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void a_select_teacher(HttpServletRequest req,
			HttpServletResponse resp, ServletContext application) {
		// TODO Auto-generated method stub
		try {
			ArrayList<Teacher> teachers=adminDao.a_db_select_teacher();
			application.setAttribute("teachers", teachers);
			req.getRequestDispatcher("select_teacher.jsp").forward(req, resp);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void a_update_teacher(HttpServletRequest req,
			HttpServletResponse resp, ServletContext application) {
		// TODO Auto-generated method stub
		String position=req.getParameter("position");
		int te_id=Integer.parseInt(req.getParameter("te_id"));
		try {
			adminDao.a_db_update_teacher(position, te_id);
			ArrayList<Teacher> teachers=adminDao.a_db_select_teacher();
			application.setAttribute("teachers", teachers);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Override
	public void a_select_student(HttpServletRequest req,
			HttpServletResponse resp, ServletContext application) {
		// TODO Auto-generated method stub
		try {
			ArrayList<Student> students=adminDao.a_db_select_student();
			application.setAttribute("students", students);
			req.getRequestDispatcher("select_student.jsp").forward(req, resp);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void a_select_user(HttpServletRequest req, HttpServletResponse resp,
			ServletContext application) {
		// TODO Auto-generated method stub
		try {
			ArrayList<User> users = adminDao.a_db_select_user();
			application.setAttribute("users", users);
			req.getRequestDispatcher("guang_resgiter.jsp").forward(req, resp);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	@Override
	public void a_del_user(HttpServletRequest req, HttpServletResponse resp,
			ServletContext application) {
		// TODO Auto-generated method stub
		int id= Integer.parseInt(req.getParameter("id"));
		System.out.println(id);
		try {
			adminDao.a_db_del_user(id);
			resp.getWriter().print("注销账号成功");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
