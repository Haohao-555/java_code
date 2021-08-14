package com.gec.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.gec.domain.User;

public interface UserDao {
	//�����˺Ż�ȡһ������Ա��Ϣ
	public User getAdminByAccount(String account)throws SQLException;
	//����û������ݿ���
	public void addUser(User user)throws SQLException;
	//�����˺Ż�ȡһ���û�
	public User getUserByAccount(String account,boolean required)throws SQLException;
	
	
	
	//��ȡ�û����ܼ�¼�������������ܣ�
	public Integer getUserCount()throws SQLException;
	//��ȡ�û��б����ݣ�ֻ����ҳ�������������ܣ� offset:ƫ���� pageSize��ҳ��С
	public List<User> getAllUsers(Integer offset,Integer pageSize)throws SQLException;
	
	public void deleteUser(String id)throws SQLException;
	
	public void updateUser(User user)throws SQLException;
	
	public User getUserById(String id)throws SQLException;
	
}
