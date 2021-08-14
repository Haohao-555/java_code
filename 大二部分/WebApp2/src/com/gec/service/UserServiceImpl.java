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
		//(1)从数据库获取用户
		User daoUser=null;
		daoUser=userDao.getUserByName(username);
		try{
			String ps=daoUser.getPassword();
			//(2)比对密码
			if(!password.equals(ps)){
				//(3)抛出异常
				throw new RuntimeException("用户密码错误");
			}
		}finally{
			//(4)做一些结束的事情。
			
		}
		return daoUser;//返回对象
	}
}
