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
         //ʹ���ڲ�ת������ת��/WEB-INF/index.jsp
    	//ΪʲôҪ�ڲ�ת����
    	//��LoginServlet ʹ�����ض����ض����൱�������������һ����ַ�س�������һ����ַ
    	// /WEB-INF/Ŀ¼�ǲ���ֱ�Ӵ򿪵�ַ���ʵġ�
    	//     ������������εģ�
    	req.getRequestDispatcher("/WEB-INF/index.jsp").forward(req, resp);
    }
}