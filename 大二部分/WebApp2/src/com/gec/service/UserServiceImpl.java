package com.gec.service;

import javax.management.RuntimeErrorException;

import com.gec.dao.UserDao;
import com.gec.dao.UserDaoImpl;
import com.gec.domain.User;

public class UserServiceImpl implements UserService{
    private UserDao userDao=new UserDaoImpl();
	@Override
	public User doLogin(String username, String password) {
		// TODO Auto-generated method stub
		//(1)�����ݿ��ȡ�û�
		User daoUser=null;
		daoUser=userDao.getUserByName(username);
		try{
			String ps=daoUser.getPassword();
			//(2)�ȶ�����
			if(!password.equals(ps)){
				//(3)�׳��쳣
				throw new RuntimeException("�û��������");
			}
		}finally{
			//(4)��һЩ���������顣
			
		}
		return daoUser;//���ض���
	}
}
