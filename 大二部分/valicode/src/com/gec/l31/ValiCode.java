package com.gec.l31;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ValiCode extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
       this.doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//�õ�����
		String inCode=request.getParameter("inCode").toString().toLowerCase();
		String valiCode=request.getSession().getAttribute("valicode").toString().toLowerCase();
	//�ж��Ƿ���ȷ
		if(valiCode.equals(inCode)){
			response.sendRedirect("index.jsp");
		}else{
			request.getSession().setAttribute("err", "��֤�����");
			//������һҳ
			String url=request.getHeader("Referer");
			response.sendRedirect(url);
		}
	}
	

}
