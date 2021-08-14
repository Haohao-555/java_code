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
	//持有UserService 引用
	private UserService userService = new UserServiceImpl();
@Override
protected void doPost(HttpServletRequest req,
		HttpServletResponse resp) 
				throws ServletException, IOException {
    //获取两个表单参数：account，password
	String account = req.getParameter("account");
	String password = req.getParameter("password");
	User svUser = null;
	//定义一个目标视图给用户反馈
	String target ="";
	try {
	//调用service作登录验证，不通过以异常形式回馈信息
		svUser = userService.getAdminByAccount(account, password);
       //验证通过，创建一个会话来维持登录状态（让服务器记住）
		HttpSession session = req.getSession();
		//存储用户数据到会话域
		session.setAttribute("user", svUser);
		target="/Index";
	}catch(Exception e) {
		//验证不通过会来到这里
		target="/loginFailed.jsp";
	}
	String ctxPath = req.getContextPath();
	resp.sendRedirect(ctxPath + target);
}
}
