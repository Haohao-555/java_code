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
    	//获取会话对象（全局）
    	ServletContext application=this.getServletContext();
    	req.setCharacterEncoding("utf-8");//请求编码
 	    resp.setContentType("text/html;charset=utf-8");//响应编码
 	    String type=req.getParameter("type");//获取要访问的方法
   	    try{
   	    	if(type.equals("login")){//登录
   	    		userService.islogin(req,resp,application);		
   	    	}else if(type.equals("register")){//注册
   	    		userService.register(req,resp);
   	   	    }else if(type.equals("my")){//绑定个人信息
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
    	req.setCharacterEncoding("utf-8");//请求编码
 	    resp.setContentType("text/html;charset=utf-8");//响应编码
 	    String course_type = req.getParameter("course_type");
 	    if(course_type.equals("addcourse")){//选课
 	    	userService.insert_course(req, resp,application);
 	    }else if(course_type.equals("st_full_course")){//我的课表
 	    	userService.select_My_course(req, resp, application);
 	    }else if(course_type.equals("deletecourse")){//退选
 	    	userService.delete_course(req, resp);
 	    }else if(course_type.equals("select_grade")){//查看成绩
 	       userService.select_grade(req, resp, application);	
 	    }
 	}
 	    
    
}
