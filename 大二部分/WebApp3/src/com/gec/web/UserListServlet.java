package com.gec.web;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.gec.domain.PageBean;
import com.gec.domain.User;
import com.gec.service.UserService;
import com.gec.service.UserServiceImpl;

public class UserListServlet extends BaseController{
	private UserService userService = new UserServiceImpl();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		  
		 
		  
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//{1}解析并得到 PageBean 对象。
		 PageBean pBean=parsePageBean(req);
		 //System.out.println("UserListServlet"+pBean.toString());
		 PageBean svBean=null;
		 try{
			//{2}调用service获取数据。
			 svBean=userService.getUserList(pBean);
			 //System.out.println("数据为"+svBean.toString());
			//{3}设置到请求域。
			 req.setAttribute("user_svBean", svBean);
		 }catch (Exception e) {
			// TODO: handle exception
			 //{4}异常处理。 
			 e.printStackTrace();
			 req.setAttribute("errorCode", 302);
		}
		//{5}内部转发到 "/User/list"。  
		req.getRequestDispatcher("/WEB-INF/userlist.jsp").forward(req, resp);
	}

}
