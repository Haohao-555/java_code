package com.gec.servlet;

import java.io.IOException;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class LoginServlet extends HttpServlet{
	//ģ�����ݿ�
	Map<String,String> users = new HashMap();
	//��ʼ�����ݿ⣬init�������Զ�����
	public void init() {
		users.put("123", "123");
		users.put("1", "123");
		users.put("andy", "123");
		users.put("wwww", "123");
	}
	//��дdopost����
      public void doPost(HttpServletRequest req,HttpServletResponse resp) throws IOException {
    	 String username =  req.getParameter("username");
    	 String password =  req.getParameter("password");
    	 System.out.println(username);
    	 String result = "�û�������";
    	 boolean success = false;
    	 //�����ݿ����õ�����
    	 String ps = users.get(username);
    	 if(ps!=null) {
    		if(ps.equals(password)) {
    			success = true;
    			result = "�û���¼�ɹ���";
    		}else {
    			result = "�û��������";
    		}
    	 }
    	//��Ϣ����
    	prtInfo("15:20");	 
    	System.out.println("{���}"+result);
    	
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
		System.out.printf("| ѧ�� | %9s  |\n","182017433");
		System.out.printf("+------------------+\n");
		System.out.printf("| ���� |%9s  |\n","�ƼѺ�");
		System.out.printf("+------------------+\n");
		System.out.printf("| ʱ�� | %10s |\n",string);
		System.out.printf("+------------------+\n");
	}
}

