package com.gec.web;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gec.service.AdminService;
import com.gec.service.AdminServiceImpl;

public class AdminServlet extends HttpServlet {
    private AdminService adminService=new AdminServiceImpl();
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
	}

	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.service(arg0, arg1);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		ServletContext application = this.getServletContext();
		req.setCharacterEncoding("utf-8");// «Î«Û±‡¬Î
		resp.setContentType("text/html;charset=utf-8");// œÏ”¶±‡¬Î
		String type=req.getParameter("type");
		if(type.equals("login")){
			adminService.a_select_all_course(req, resp, application);
		}else if(type.equals("update_course")){
			adminService.a_update_course(req, resp,application);
		}else if(type.equals("add_course")){
			adminService.a_insert_course(req, resp,application);
		}else if(type.equals("add_teacher")){
			adminService.a_insert_teacher(req, resp, application);
		}else if(type.equals("update_teacher")){
			adminService.a_update_teacher(req, resp, application);
		}
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		ServletContext application = this.getServletContext();
		req.setCharacterEncoding("utf-8");// «Î«Û±‡¬Î
		resp.setContentType("text/html;charset=utf-8");// œÏ”¶±‡¬Î
		String type=req.getParameter("type");
		if(type.equals("delete_course")){
			adminService.a_delete_course(req,resp);
		}else if(type.equals("select_student")){
			adminService.a_select_student(req, resp, application);
		}else if(type.equals("select_teacher")){
			adminService.a_select_teacher(req, resp, application);
		}else if(type.equals("delete_teacher")){
			adminService.a_delete_teacher(req, resp, application);
		}
	}
}
