package com.gec.service;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface UserService {
	//��¼
	public  void islogin(HttpServletRequest req, HttpServletResponse resp,ServletContext application);
	//ע��
	public void register(HttpServletRequest req, HttpServletResponse resp);
	//�鿴�ѹ����Ŀγ���Ϣ
	public void select_all_course(HttpServletRequest req, HttpServletResponse resp,ServletContext application);
	//�󶨸�����Ϣ
	public void  my(HttpServletRequest req, HttpServletResponse resp,ServletContext application);
	//ѡ��
	public void insert_course(HttpServletRequest req,HttpServletResponse resp,ServletContext application);
	//�ҵ���ѡ
	public void select_My_course(HttpServletRequest req,HttpServletResponse resp,ServletContext application);
	//��ѡ
	public void delete_course(HttpServletRequest req,HttpServletResponse resp);
	//�鿴�ɼ�
	public void select_grade(HttpServletRequest req,HttpServletResponse resp,ServletContext application);
}
