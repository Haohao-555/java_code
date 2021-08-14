package com.gec.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.gec.service.UserService;
import com.gec.service.UserServiceImpl;


public class UserServlet extends HttpServlet{
	private UserService userService=new UserServiceImpl();
    @Override
    public void init() throws ServletException {
    	// TODO Auto-generated method stub
    }
    private void serve() {
		// TODO Auto-generated method stub

	}
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
    		throws ServletException, IOException {
    	//��ȡ�Ự����ȫ�֣�
    	ServletContext application=this.getServletContext();
    	req.setCharacterEncoding("utf-8");//�������
 	    resp.setContentType("text/html;charset=utf-8");//��Ӧ����
 	    String type=req.getParameter("type");//��ȡҪ���ʵķ���
   	    try{
   	    	if(type.equals("login")){//��¼
   	    		userService.islogin(req,resp,application);		
   	    	}else if(type.equals("register")){//ע��
   	    		userService.register(req,resp);
   	   	    }else if(type.equals("my")){//�󶨸�����Ϣ
   	   	  userService.my(req, resp, application);
   	   	    }	
   	    }catch (Exception e) {
			e.printStackTrace();
		}
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
    		throws ServletException, IOException {
    	ServletContext application=this.getServletContext();
    	req.setCharacterEncoding("utf-8");//�������
 	    resp.setContentType("text/html;charset=utf-8");//��Ӧ����
 	    String course_type = req.getParameter("course_type");
 	    if(course_type.equals("addcourse")){//ѡ��
 	    	userService.insert_course(req, resp,application);
 	    }else if(course_type.equals("st_full_course")){//�ҵĿα�
 	    	userService.select_My_course(req, resp, application);
 	    }else if(course_type.equals("deletecourse")){//��ѡ
 	    	userService.delete_course(req, resp);
 	    }else if(course_type.equals("select_grade")){//�鿴�ɼ�
 	       userService.select_grade(req, resp, application);	
 	    }
 	}
 	    
    
}
