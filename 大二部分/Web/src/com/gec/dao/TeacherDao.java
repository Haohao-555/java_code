package com.gec.dao;

import java.util.ArrayList;

import com.gec.domain.Course;
import com.gec.domain.St_full_course;
import com.gec.domain.Teacher;

public interface TeacherDao {
    //��¼
	public Teacher t_db_login(String te_name, String password)throws Exception;
	//��ѯ�γ�
	public ArrayList<Course> t_db_select_course(int tea_id)throws Exception;
	//�鿴�γ̵�ѧ��
	public ArrayList<St_full_course> t_db_select_full_course(String te_name, int co_id)throws Exception;
	//����ɼ�
	public void t_db_update_grade(String account,int co_id,float grade)throws Exception;
	//�鿴�ɼ�����
	public ArrayList<St_full_course> t_db_select_grade(String teacher,int co_id)throws Exception;
}
