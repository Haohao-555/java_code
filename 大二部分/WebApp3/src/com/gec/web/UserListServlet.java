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
		//{1}�������õ� PageBean ����
		 PageBean pBean=parsePageBean(req);
		 //System.out.println("UserListServlet"+pBean.toString());
		 PageBean svBean=null;
		 try{
			//{2}����service��ȡ���ݡ�
			 svBean=userService.getUserList(pBean);
			 //System.out.println("����Ϊ"+svBean.toString());
			//{3}���õ�������
			 req.setAttribute("user_svBean", svBean);
		 }catch (Exception e) {
			// TODO: handle exception
			 //{4}�쳣���� 
			 e.printStackTrace();
			 req.setAttribute("errorCode", 302);
		}
		//{5}�ڲ�ת���� "/User/list"��  
		req.getRequestDispatcher("/WEB-INF/userlist.jsp").forward(req, resp);
	}

}
