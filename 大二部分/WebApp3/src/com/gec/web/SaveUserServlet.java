package com.gec.web;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gec.domain.User;
import com.gec.service.UserService;
import com.gec.service.UserServiceImpl;

public class SaveUserServlet extends HttpServlet{
	//{ps}必须持有UserService的引用	(临时代码)
		private UserService userService = new UserServiceImpl();
protected void doPost(HttpServletRequest req,
		HttpServletResponse resp) 
	    throws ServletException, IOException {
	//{ps}在使用req获取数据之前,先设置编码格式
	req.setCharacterEncoding("UTF-8");
	resp.setContentType("text/html;charset=utf-8");//响应编码
	//{1}转化表单为User （req.getParameterMap()获取表单的数据）
	User frmUser = parseUser(req.getParameterMap());
	//{2}定一个结果顶
	//String retPage = "/User/list";
	try {
	//{3}调用service方法来保存用户
		userService.saveUser(frmUser);
		resp.getWriter().print("增加用户成功");
	}catch(Exception e) {
		//{5}做异常处理
		e.printStackTrace();
		//retPage = "/adduser.jsp";
		resp.getWriter().print("用户已经存在");
	}
	//{6}获取WebApp根映射地址
	//String ctxPath = req.getContextPath();
	//{7}重定向到结果页
	//resp.sendRedirect(ctxPath + retPage);
	//成功就list
	//失败
	
}
protected User parseUser(Map<String,String[]> map) {
	User user = new User();
	user.setId(getInt(map,"id"));
	user.setAccount(getString(map,"account"));
	user.setPassword(getString(map,"password"));
	user.setNickName(getString(map,"nickname"));
	user.setSex(getString(map,"sex"));
	user.setNo(getString(map,"no"));
	user.setRoleId(getString(map,"roleId"));
	return user;
		
}
protected Integer getInt(Map<String,String[]> map, String key) {
	String[] values = map.get(key);
	if( values==null) {
		return null;
	}else {
		return Integer.valueOf(values[0]);
	}
}
protected String getString(Map<String,String[]> map, String key) {
	String[] values = map.get(key);
	if( values==null) {
		return null;
	}else {
		return values[0];
	}
}
}

