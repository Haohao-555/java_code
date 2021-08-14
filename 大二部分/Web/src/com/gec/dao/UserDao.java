package com.gec.dao;

import java.util.ArrayList;

import com.gec.domain.Course_detail;
import com.gec.domain.St_full_course;
import com.gec.domain.Student;
import com.gec.domain.User;

public interface UserDao {
	//�鿴�û��Ƿ�ע����˺��Ѵ���
	public String db_is_user(String account)throws Exception;
	//�ж��û��˺ż������Ƿ���ȷ
	public User db_select_user(String account, String password) throws Exception;
	//�����û�
	public  void db_insert_user(String account,String password)throws Exception;
	//�鿴�ѹ����Ŀγ���Ϣ
	public  ArrayList<Course_detail> db_select_all_course()throws Exception;
	//�鿴�ѹ����γ̵�id
	public ArrayList<Integer> db_select_courseid()throws Exception;
	//�󶨸�����Ϣ 
	public void db_insert_student(Student student) throws Exception;
	//��ȡ������Ϣ
	public Student db_select_student(String account)throws Exception;
	//ѡ��
	public void db_insert_course(String account,int co_id)throws Exception;
	//�ҵ���ѡ
	public ArrayList<St_full_course> db_select_My_course(String account)throws Exception;
	//�鿴�γ��Ƿ��Ѿ�ѡ��
	public Boolean db_is_select_course(String account,int co_id)throws Exception;
	//��ѡ
	public void db_delete_course(String account,int co_id)throws Exception;
	//����user���flag
	public void db_insert_flag(String account)throws Exception;
	//�鿴�ɼ�
	public ArrayList<St_full_course> db_select_me_grade(String account)throws Exception;
}
