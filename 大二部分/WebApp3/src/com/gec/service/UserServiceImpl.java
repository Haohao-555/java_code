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
	// ����һ��UserDao����
	private UserDao userDao = new UserDaoImpl();

	public User getAdminByAccount(String account, String password)
			throws Exception {
		// ��ȡ���ݿ�����
		Connection con = JdbcUtils.getConnection();
		User user = null;
		try {
			// ����dao��ȡ�û���Ϣ(�����û�������ȡ)
			user = userDao.getAdminByAccount(account);
			// �õ�user֮��,�Ա������Ƿ���ȷ.
			String dbPS = user.getPassword();
			if (!dbPS.equals(password)) {
				throw new RuntimeException("�û����벻��ȷ");
			}
			// ����ȷ�׳��쳣��ȥcatch��
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally {
			// �ر����ݿ�����
			JdbcUtils.closeConnection();
		}
		// ����user
		return user;
	}

	// saveUser���������£�
	// �����û�(û��id)�������û�(��id)
	@Override
	public void saveUser(User user) throws Exception {
		// {1} ��ȡ���ݿ�����Connection��
		Connection conn = JdbcUtils.getConnection();
		// {2} �����Զ��ύΪFALSE������������
		conn.setAutoCommit(false);
		try {
			// {2} ͨ���ж�user��û��id��ȷ�����������Ǹ��¡�
			if (user.getId() == null) {// ����
				// �����������
				// ȥ���ݿ���ҿ�����û������û����ڡ��������׳��쳣����֤�û�Ψһ��
				User _user = userDao.getUserByAccount(user.getAccount(), false);
				// ���user����---���׳��쳣
				if (_user != null) {
					throw new RuntimeException("�����û�ʧ��");
				}
				// ���������---��д�����ݿ�
				userDao.addUser(user);
			} else {
			}
			// {3} ������������ȥ���ݿ���ҿ�����û������û�
			// {4} ����---���׳��쳣
			// {5} ������---��д�����ݿ�
			// {6} ����Ǹ��£���������
		} catch (Exception e) {
			// {7} ���쳣����
			// {7-1}����ع���
			conn.rollback();
			// {7-2}�׳��쳣
			throw e;
		} finally {
			// {8} �����յĴ���
			// {8-1} ������ύ
			conn.commit();
			// {8-2} �ر����ݿ�����
			JdbcUtils.closeConnection();

		}
	}

	@Override
	public PageBean<User> getUserList(PageBean pBean) throws Exception {
		//{1}��ȡ���ݿ����ӡ�
		Connection conn = JdbcUtils.getConnection();
		PageBean<User> daoBean;
		try{
		    //{2}��ȡ�û���¼����
			int cnt=userDao.getUserCount();
		    //{3}���� PageBean��װ��ҳ���ݡ�
			daoBean=new PageBean(pBean.getPage(),pBean.getPageSize(),cnt);
		    //{4}��ȡ�û��б�
			int offset=(pBean.getPage()-1)*pBean.getPageSize();
			//System.out.println("���ݵ����ݿ�ǰ��offset"+offset);
			List<User> list =userDao.getAllUsers(offset, pBean.getPageSize());
		    //{5}�� List ���õ� PageBean ��
			daoBean.setList(list);
		}finally{
			//{6}�ر����ӡ�
			JdbcUtils.closeConnection();
		}
		//{7}���� PageBean
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
