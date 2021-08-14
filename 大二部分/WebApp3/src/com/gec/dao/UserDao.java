package com.gec.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.gec.domain.Product;
import com.gec.domain.User;

public interface UserDao {
	//����û������ݿ���
	public void addUser(User user)throws SQLException;
	//�����û�
	public int update_user(User user)throws SQLException;
	//�����˺Ż�ȡһ������Ա��Ϣ
	public User getAdminByAccount(String account)throws SQLException;
	//�����˺Ż�ȡһ���û�
	public User getUserByAccount(String account,boolean required)throws SQLException;
	
	//��ȡ�û����ܼ�¼�������������ܣ�
	public Integer getUserCount()throws SQLException;
	//��ȡ�û��б����ݣ�ֻ����ҳ�������������ܣ� offset:ƫ���� pageSize��ҳ��С
	public List<User> getAllUsers(Integer offset,Integer pageSize)throws SQLException;
	//ɾ���û�
	public int del_user(int id)throws SQLException;
}
