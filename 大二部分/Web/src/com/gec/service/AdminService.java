package com.gec.service;

import java.util.ArrayList;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gec.domain.Course;
import com.gec.domain.Course_detail;
import com.gec.domain.Teacher;

public interface AdminService {
   //��ȡ�γ���Ϣ
	public void a_select_all_course(HttpServletRequest req, HttpServletResponse resp,ServletContext application);
	//ɾ���γ�
	public void a_delete_course(HttpServletRequest req, HttpServletResponse resp);
	//���¿γ�
	public void a_update_course(HttpServletRequest req, HttpServletResponse resp,ServletContext application);
	//���ҽ�ʦid
	public int a_select_tea_id(String te_name);
	//���ӿγ�
	public void a_insert_course(HttpServletRequest req, HttpServletResponse resp,ServletContext application);
	//���ӽ�ʦ
	public void a_insert_teacher(HttpServletRequest req, HttpServletResponse resp,ServletContext application);
	//���ҽ�ʦ��Ϣ
	public void a_select_teacher(HttpServletRequest req, HttpServletResponse resp,ServletContext application);
	//���½�ʦְλ
	public void a_update_teacher(HttpServletRequest req, HttpServletResponse resp,ServletContext application);
	//ɾ����ʦ
	public void a_delete_teacher(HttpServletRequest req, HttpServletResponse resp,ServletContext application);
	//�鿴ѧ����Ϣ
	public void a_select_student(HttpServletRequest req, HttpServletResponse resp,ServletContext application);
	//�鿴�û���Ϣ
	public void a_select_user(HttpServletRequest req, HttpServletResponse resp,ServletContext application);
	//ע���û���Ϣ
	public void a_del_user(HttpServletRequest req, HttpServletResponse resp,ServletContext application);
}
