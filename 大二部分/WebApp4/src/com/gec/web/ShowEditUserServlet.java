package com.gec.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gec.domain.User;
import com.gec.service.UserService;
import com.gec.service.UserServiceImpl;

public class ShowEditUserServlet extends HttpServlet{
   private UserService userService =new UserServiceImpl();
   @Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
   @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id=req.getParameter("id");
		User user =null;
		try{
			user=userService.getUserById(id);
			req.setAttribute("user", user);
		}catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		req.getRequestDispatcher("/WEB-INF/editUser.jsp").forward(req, resp);
	}
}
