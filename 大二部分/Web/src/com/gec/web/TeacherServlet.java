package com.gec.web;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gec.domain.Teacher;
import com.gec.service.TeacherService;
import com.gec.service.TeacherServiceImpl;

public class TeacherServlet extends HttpServlet {
	private TeacherService teacherService = new TeacherServiceImpl();
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1)
				throws ServletException, IOException {
			// TODO Auto-generated method stub
			super.service(arg0, arg1);
	}
	
   @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException {
	   ServletContext application = this.getServletContext();
	   req.setCharacterEncoding("utf-8");// «Î«Û±‡¬Î
	   resp.setContentType("text/html;charset=utf-8");// œÏ”¶±‡¬Î
	   String type=req.getParameter("type");
	   
	   //Teacher teacher = (Teacher)req.getSession().getAttribute("Teacher_account");
	   //System.out.println(teacher.toString());
	   if(type.equals("login")) { 
		  teacherService.t_select_course(req, resp, application);
	   }else if(type.equals("select_grade")){
		   teacherService.t_select_grade(req, resp, application);
	   }else if(type.equals("update_grade")){
		   teacherService.t_update_grade(req, resp, application);
	   }else if(type.equals("select_full_course")){
		   teacherService.t_select_full_course(req, resp, application);
	   } else if(type.equals("select_grade")){
		   teacherService.t_select_grade(req, resp, application);
	   }

   }
   
   @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

  
		
	}
   
}
