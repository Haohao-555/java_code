package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import linstener.SessionLinstener_demo;



public class LoginServlet extends HttpServlet {
	Map<String,String>users;
    public LoginServlet(){
    	users=new HashMap<String,String>();
    	users.put("zhangsan", "123456");
    	users.put("lisi","123456");
    	users.put("wangwu", "123456");
    	users.put("zhaoliu", "123456");
    }
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request,response);
		
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		 request.setCharacterEncoding("utf-8");
         String userId=request.getParameter("userId");
         String  password=request.getParameter("password");
         System.out.println(userId+password);
         
         if(userId!=null&&users.containsKey(userId)&&users.get(userId).equals(password)){
        	 request.getSession().setAttribute("user", userId);
        	 int count=SessionLinstener_demo.getcount();
        	 System.out.println(count);
        	 request.getSession().setAttribute("count", count);
        	 String success=getInitParameter("success");
             response.sendRedirect(success);
         }
         
	}
		
	}


