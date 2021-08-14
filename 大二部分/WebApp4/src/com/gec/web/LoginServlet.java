package com.gec.web;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.gec.domain.User;
import com.gec.service.UserService;
import com.gec.service.UserServiceImpl;

public class LoginServlet extends HttpServlet{
	//����UserService ����
	private UserService userService = new UserServiceImpl();
@Override
protected void doPost(HttpServletRequest req,
		HttpServletResponse resp) 
				throws ServletException, IOException {
    //��ȡ������������account��password
	String account = req.getParameter("account");
	String password = req.getParameter("password");
	User svUser = null;
	//����һ��Ŀ����ͼ���û�����
	String target ="";
	try {
	//����service����¼��֤����ͨ�����쳣��ʽ������Ϣ
		svUser = userService.getAdminByAccount(account, password);
       //��֤ͨ��������һ���Ự��ά�ֵ�¼״̬���÷�������ס��
		HttpSession session = req.getSession();
		//�洢�û����ݵ��Ự��
		session.setAttribute("user", svUser);
		target="/Index";
	}catch(Exception e) {
		//��֤��ͨ������������
		target="/loginFailed.jsp";
	}
	String ctxPath = req.getContextPath();
	resp.sendRedirect(ctxPath + target);
}
}
