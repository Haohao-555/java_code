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
	//{ps}�������UserService������	(��ʱ����)
		private UserService userService = new UserServiceImpl();
protected void doPost(HttpServletRequest req,
		HttpServletResponse resp) 
	    throws ServletException, IOException {
	//{ps}��ʹ��req��ȡ����֮ǰ,�����ñ����ʽ
	req.setCharacterEncoding("UTF-8");
	resp.setContentType("text/html;charset=utf-8");//��Ӧ����
	//{1}ת����ΪUser ��req.getParameterMap()��ȡ�������ݣ�
	User frmUser = parseUser(req.getParameterMap());
	//{2}��һ�������
	//String retPage = "/User/list";
	try {
	//{3}����service�����������û�
		userService.saveUser(frmUser);
		resp.getWriter().print("�����û��ɹ�");
	}catch(Exception e) {
		//{5}���쳣����
		e.printStackTrace();
		//retPage = "/adduser.jsp";
		resp.getWriter().print("�û��Ѿ�����");
	}
	//{6}��ȡWebApp��ӳ���ַ
	//String ctxPath = req.getContextPath();
	//{7}�ض��򵽽��ҳ
	//resp.sendRedirect(ctxPath + retPage);
	//�ɹ���list
	//ʧ��
	
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

