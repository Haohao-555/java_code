package com.gec.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.gec.Untils.JdbcUtils;
import com.gec.domain.Product;
import com.gec.domain.User;


public class UserDaoImpl implements UserDao{
	public User getAdminByAccount(String account)throws SQLException{
		//��ȡ���ݿ�����
		Connection conn=JdbcUtils.getConnection();
		String sql="select u.*, r.roleName from user u left join role r on u.roleId=r.id where u.account=? and r.roleName='ϵͳ����Ա'";
		PreparedStatement psmt= conn.prepareStatement(sql);
		psmt.setString(1,account);
		ResultSet rs= psmt.executeQuery();
		if( !rs.next()){
			throw new RuntimeException("ָ�����û�������");
		}
		User user=new User(rs);
		rs.close();
		psmt.close();
		return user;
	}

	@Override
	public void addUser(User user) throws SQLException {
		// TODO Auto-generated method stub
		String fields="id,account,password,nickName,no,sex,roleId,createDate";
		String sql="insert into user("+fields+")values(null,?,?,?,?,?,?,null)";
		
		Connection conn=JdbcUtils.getConnection();
		
		PreparedStatement psmt= conn.prepareStatement(sql);
		
		psmt.setString(1,user.getAccount());
		psmt.setString(2,user.getPassword());
		psmt.setString(3,user.getNickName());
		psmt.setString(4,user.getNo());
		psmt.setString(5,user.getSex());
		psmt.setString(6,user.getRoleId());
		
		int updateCnt=psmt.executeUpdate();
		try{
			if(updateCnt!=1){
			    throw new RuntimeException("�����û�ʧ��");	
			}
		}finally{
			psmt.close();
		}	
	}

	@Override
	public User getUserByAccount(String account, boolean required)
			throws SQLException {
		//{1}��дSQL��䡣	
		String  sql = "select u.*, r.roleName from user u"
				+ " left join role r on u.roleId=r.id"
				+ " where r.roleName != 'ϵͳ����Ա'"
				+ " and u.account=?";
		//{2}��ȡ���ݿ����ӡ�
		Connection conn = JdbcUtils.getConnection();
		//{3}�õ�Ԥ�����SQLִ����
		PreparedStatement psmt = conn.prepareStatement(sql);
		//{4}ע��ռλ���ϵĲ���
		psmt.setString(1, account);
		//{5}ʹ��SQLִ����������ѯ,�õ�һ�������
		ResultSet rs = psmt.executeQuery();
		//{6}����required�Ĵ���ֵ����һЩ�߼�����
		boolean exists = rs.next();
		if( required && !exists ) {//���user�Ǳ����
			throw new RuntimeException("�û�������");
		}
		User user = null;
		if( exists ) {//����user�����Ǳ����
			//{7}��װuser����	
			user = new User(rs);
		}
		//{8}�رս������ִ����
		rs.close();
		psmt.close();
		//{9}����user����
		return user;
	}
    
	//��ȡ�����û��б�����
	@Override
	public List<User> getAllUsers(Integer offset, Integer pageSize)
			throws SQLException {
		List<User> list=new ArrayList();
		String sql="select u.*, r.roleName from user u left join role r on u.roleId=r.id where r.roleName!='ϵͳ����Ա' order by u.id limit ?,?";
		Connection conn=JdbcUtils.getConnection();
		PreparedStatement psmt= conn.prepareStatement(sql);
		//System.out.println("���ݿ���յ���offsetΪ"+offset+" pageSizeΪ"+pageSize);
		psmt.setInt(1, offset);
		psmt.setInt(2, pageSize);
		ResultSet rs= psmt.executeQuery();
		while(rs.next()){
			User u=new User(rs);
			list.add(u);
		}
		rs.close();
		psmt.close();
		return list;
	}

	@Override
	public Integer getUserCount() throws SQLException {
		String sql="select count(*) from user u left join role r on u.roleId=r.id where r.roleName!='ϵͳ����Ա'";
		Connection conn=JdbcUtils.getConnection();
		PreparedStatement psmt= conn.prepareStatement(sql);
		ResultSet rs= psmt.executeQuery();
		rs.next();
		int cnt=rs.getInt(1);
		rs.close();
		psmt.close();
		return cnt;
	}

	@Override
	public int del_user(int id) throws SQLException {
		// TODO Auto-generated method stub
		String sql="delete from user where id=?";
		Connection conn=JdbcUtils.getConnection();
		PreparedStatement psmt= conn.prepareStatement(sql);
		psmt.setInt(1, id);
		int updateCnt=psmt.executeUpdate();
		psmt.close();
		return updateCnt;
	}

	@Override
	public int update_user(User user) throws SQLException {
		String sql="update user set password=?,nickName=?,sex=?,roleId=? where id=?";
		Connection conn=JdbcUtils.getConnection();
		PreparedStatement psmt= conn.prepareStatement(sql);
		psmt.setString(1, user.getPassword());
		psmt.setString(2, user.getNickName());
		psmt.setString(3, user.getSex());
		psmt.setString(4, user.getRoleId());
		psmt.setInt(5, user.getId());
		int updateCnt=psmt.executeUpdate();
		psmt.close();
		return updateCnt;
	}

	
	
	

}
