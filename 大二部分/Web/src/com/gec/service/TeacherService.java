package com.gec.service;

import java.util.ArrayList;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gec.domain.Course;
import com.gec.domain.St_full_course;
import com.gec.domain.Teacher;

public interface TeacherService {
	//��ѯ�γ�
	public void t_select_course(HttpServletRequest req, HttpServletResponse resp,ServletContext application);
	//�鿴�γ̵�ѧ��
	public void t_select_full_course(HttpServletRequest req, HttpServletResponse resp,ServletContext application);
	//����ɼ�
	public void t_update_grade(HttpServletRequest req, HttpServletResponse resp,ServletContext application);
	//�鿴�ɼ�����
	public void t_select_grade(HttpServletRequest req, HttpServletResponse resp,ServletContext application);
}
