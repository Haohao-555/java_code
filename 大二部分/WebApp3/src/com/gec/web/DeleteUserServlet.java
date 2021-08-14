package com.gec.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gec.domain.User;
import com.gec.service.UserService;
import com.gec.service.UserServiceImpl;

public class DeleteUserServlet extends HttpServlet{
   private UserService userService=new UserServiceImpl();
   @Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
	   req.setCharacterEncoding("utf-8");//�������
	   resp.setContentType("text/html;charset=utf-8");//��Ӧ����
		int id=Integer.parseInt(req.getParameter("id"));
		try {
			String result="ɾ���ɹ�";
			int i=userService.del_user(id);
			if(i!=1){
				//ɾ��ʧ��
				result="ɾ��ʧ��";
			}
			resp.getWriter().print(result);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
   @Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
	   req.setCharacterEncoding("utf-8");//�������
	   resp.setContentType("text/html;charset=utf-8");//��Ӧ����
	   User user=new User(req);
	   try{
		   String result="���³ɹ�";
		   int i=userService.update_user(user);
		   if(i!=1){
				result="����ʧ��";
			}
			resp.getWriter().print(result); 
	   }catch (Exception e) {
		e.printStackTrace();
	}
 }
}
