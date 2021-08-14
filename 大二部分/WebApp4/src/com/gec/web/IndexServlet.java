package com.gec.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class IndexServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, 
    		 HttpServletResponse resp) 
    		throws ServletException, IOException {
         //使用内部转发，跳转到/WEB-INF/index.jsp
    	//为什么要内部转发？
    	//答：LoginServlet 使用了重定向，重定向相当于浏览器上输入一个地址回车，访问一个地址
    	// /WEB-INF/目录是不能直接打开地址访问的。
    	//     （对外界是屏蔽的）
    	req.getRequestDispatcher("/WEB-INF/index.jsp").forward(req, resp);
    }
}