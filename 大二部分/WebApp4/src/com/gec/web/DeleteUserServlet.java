package com.gec.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gec.service.UserService;
import com.gec.service.UserServiceImpl;

public class DeleteUserServlet extends HttpServlet{
	 private UserService userService =new UserServiceImpl();
	 @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id=req.getParameter("id");
		String retPath="/error.jsp";
		try{
			userService.deleteUser(id);
			retPath="/User/list?op=delete&id="+id;
		}catch (Exception e) {
			
			// TODO: handle exception
			retPath="?errCode=303";
		}
		String ctxPath=req.getContextPath();
		resp.sendRedirect(ctxPath + retPath);
	}
}
