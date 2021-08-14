package com.gec.servlet;

import java.io.IOException;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class LoginServlet extends HttpServlet{
	//模拟数据库
	Map<String,String> users = new HashMap();
	//初始化数据库，init方法会自动调用
	public void init() {
		users.put("123", "123");
		users.put("1", "123");
		users.put("andy", "123");
		users.put("wwww", "123");
	}
	//编写dopost方法
      public void doPost(HttpServletRequest req,HttpServletResponse resp) throws IOException {
    	 String username =  req.getParameter("username");
    	 String password =  req.getParameter("password");
    	 System.out.println(username);
    	 String result = "用户不存在";
    	 boolean success = false;
    	 //从数据库中拿到密码
    	 String ps = users.get(username);
    	 if(ps!=null) {
    		if(ps.equals(password)) {
    			success = true;
    			result = "用户登录成功。";
    		}else {
    			result = "用户密码错误。";
    		}
    	 }
    	//消息反馈
    	prtInfo("15:20");	 
    	System.out.println("{结果}"+result);
    	
    	String ctxPath = req.getContextPath();
//    	System.out.println(ctxPath);
    	if(success) {
    		resp.sendRedirect(ctxPath+"/success.html");
    	}
    	else {
    		resp.sendRedirect(ctxPath+"/failed.html");
    	}
      }
	private void prtInfo(String string) {
		// TODO Auto-generated method stub
		System.out.printf("+------------------+\n");
		System.out.printf("| 学号 | %9s  |\n","182017433");
		System.out.printf("+------------------+\n");
		System.out.printf("| 姓名 |%9s  |\n","黄佳浩");
		System.out.printf("+------------------+\n");
		System.out.printf("| 时间 | %10s |\n",string);
		System.out.printf("+------------------+\n");
	}
}

