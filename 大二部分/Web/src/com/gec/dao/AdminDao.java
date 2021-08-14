package com.gec.dao;

import java.util.ArrayList;

import com.gec.domain.Course;
import com.gec.domain.Course_detail;
import com.gec.domain.Student;
import com.gec.domain.Teacher;
import com.gec.domain.User;

public interface AdminDao {
	//�����ѹ����Ŀγ�
	public  ArrayList<Course_detail> a_db_select_all_course()throws Exception;
	//���¿γ���Ϣ
	public void a_db_update_course(Course course)throws Exception;
	//ɾ���γ�
	public void a_db_delete_course(int co_id)throws Exception;
	//���ҽ�ʦtea_id
	public int a_db_select_tea_id(String tea_name)throws Exception;
	//���ӿγ�
	public void a_db_insert_course(Course course)throws Exception;
	//���ӽ�ʦ
	public void a_db_insert_teacher(Teacher teacher)throws Exception;
	//���ҽ�ʦ��Ϣ
	public ArrayList<Teacher> a_db_select_teacher()throws Exception;
	//���½�ʦְλ
	public void a_db_update_teacher(String position,int te_id)throws Exception;
	//ɾ����ʦ
	public void a_db_delete_teacher(int te_id)throws Exception;
	//�鿴ѧ����Ϣ
	public ArrayList<Student> a_db_select_student()throws Exception;
	//�鿴ע���˺���Ϣ
	public ArrayList<User> a_db_select_user()throws Exception;
	//ע���˺�
	public void a_db_del_user(int id)throws Exception;
}
