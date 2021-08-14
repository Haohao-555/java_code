package com.gec.service;

import java.sql.SQLException;

import com.gec.Untils.JdbcUtils;
import com.gec.dao.UserDao;
import com.gec.dao.UserDaoImpl;
import com.gec.domain.PageBean;
import com.gec.domain.User;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements UserService {
	// 设置一个UserDao引用
	private UserDao userDao = new UserDaoImpl();

	public User getAdminByAccount(String account, String password)
			throws Exception {
		// 获取数据库连接
		Connection con = JdbcUtils.getConnection();
		User user = null;
		try {
			// 调用dao获取用户信息(根据用户名来获取)
			user = userDao.getAdminByAccount(account);
			// 拿到user之后,对比密码是否正确.
			String dbPS = user.getPassword();
			if (!dbPS.equals(password)) {
				throw new RuntimeException("用户密码不正确");
			}
			// 不正确抛出异常，去catch中
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally {
			// 关闭数据库连接
			JdbcUtils.closeConnection();
		}
		// 返回user
		return user;
	}

	// saveUser能做两件事：
	// 新增用户(没有id)，更新用户(有id)
	@Override
	public void saveUser(User user) throws Exception {
		// {1} 获取数据库连接Connection。
		Connection conn = JdbcUtils.getConnection();
		// {2} 设置自动提交为FALSE，开启事务功能
		conn.setAutoCommit(false);
		try {
			// {2} 通过判断user有没有id，确认是新增还是更新。
			if (user.getId() == null) {// 新增
				// 如果是新增，
				// 去数据库查找看看有没有这个用户存在。（存在抛出异常，保证用户唯一）
				User _user = userDao.getUserByAccount(user.getAccount(), false);
				// 如果user存在---》抛出异常
				if (_user != null) {
					throw new RuntimeException("新增用户失败");
				}
				// 如果不存在---》写入数据库
				userDao.addUser(user);
			} else {
			}
			// {3} 假如是新增，去数据库查找看看有没有这个用户
			// {4} 存在---》抛出异常
			// {5} 不存在---》写入数据库
			// {6} 如果是更新，。。。。
		} catch (Exception e) {
			// {7} 做异常处理
			// {7-1}事务回滚，
			conn.rollback();
			// {7-2}抛出异常
			throw e;
		} finally {
			// {8} 做最终的处理
			// {8-1} 事务的提交
			conn.commit();
			// {8-2} 关闭数据库连接
			JdbcUtils.closeConnection();

		}
	}

	@Override
	public PageBean<User> getUserList(PageBean pBean) throws Exception {
		//{1}获取数据库连接。
		Connection conn = JdbcUtils.getConnection();
		PageBean<User> daoBean;
		try{
		    //{2}获取用户记录数。
			int cnt=userDao.getUserCount();
		    //{3}创建 PageBean封装分页数据。
			daoBean=new PageBean(pBean.getPage(),pBean.getPageSize(),cnt);
		    //{4}获取用户列表。
			int offset=(pBean.getPage()-1)*pBean.getPageSize();
			//System.out.println("传递到数据库前的offset"+offset);
			List<User> list =userDao.getAllUsers(offset, pBean.getPageSize());
		    //{5}把 List 设置到 PageBean 中
			daoBean.setList(list);
		}finally{
			//{6}关闭连接。
			JdbcUtils.closeConnection();
		}
		//{7}返回 PageBean
		return daoBean;
	}

	@Override
	public int del_user(int id) throws Exception {
		// TODO Auto-generated method stub
		Connection conn = JdbcUtils.getConnection();
		conn.setAutoCommit(false);
		int cnt = 0;
		try{
			 cnt=userDao.del_user(id);
		}catch (Exception e) {
			e.printStackTrace();
			conn.rollback();
		}finally{
			conn.commit();
			JdbcUtils.closeConnection();
		}
		return cnt;
	}

	@Override
	public int update_user(User user) throws Exception {
		Connection conn = JdbcUtils.getConnection();
		conn.setAutoCommit(false);
		int cnt = 0;
		try{
			cnt=userDao.update_user(user);
		}catch (Exception e) {
			e.printStackTrace();
			conn.rollback();
		}finally{
			conn.commit();
			JdbcUtils.closeConnection();
		}
		return cnt;
	}
	
}
