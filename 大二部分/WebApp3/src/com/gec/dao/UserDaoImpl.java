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
		//获取数据库连接
		Connection conn=JdbcUtils.getConnection();
		String sql="select u.*, r.roleName from user u left join role r on u.roleId=r.id where u.account=? and r.roleName='系统管理员'";
		PreparedStatement psmt= conn.prepareStatement(sql);
		psmt.setString(1,account);
		ResultSet rs= psmt.executeQuery();
		if( !rs.next()){
			throw new RuntimeException("指定的用户不存在");
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
			    throw new RuntimeException("新增用户失败");	
			}
		}finally{
			psmt.close();
		}	
	}

	@Override
	public User getUserByAccount(String account, boolean required)
			throws SQLException {
		//{1}编写SQL语句。	
		String  sql = "select u.*, r.roleName from user u"
				+ " left join role r on u.roleId=r.id"
				+ " where r.roleName != '系统管理员'"
				+ " and u.account=?";
		//{2}获取数据库连接。
		Connection conn = JdbcUtils.getConnection();
		//{3}得到预编译的SQL执行器
		PreparedStatement psmt = conn.prepareStatement(sql);
		//{4}注入占位符上的参数
		psmt.setString(1, account);
		//{5}使用SQL执行器来做查询,得到一个结果集
		ResultSet rs = psmt.executeQuery();
		//{6}根据required的传入值，做一些逻辑处理。
		boolean exists = rs.next();
		if( required && !exists ) {//如果user是必需的
			throw new RuntimeException("用户不存在");
		}
		User user = null;
		if( exists ) {//假如user存在是必需的
			//{7}封装user对象	
			user = new User(rs);
		}
		//{8}关闭结果集与执行器
		rs.close();
		psmt.close();
		//{9}返回user对象
		return user;
	}
    
	//获取所有用户列表数据
	@Override
	public List<User> getAllUsers(Integer offset, Integer pageSize)
			throws SQLException {
		List<User> list=new ArrayList();
		String sql="select u.*, r.roleName from user u left join role r on u.roleId=r.id where r.roleName!='系统管理员' order by u.id limit ?,?";
		Connection conn=JdbcUtils.getConnection();
		PreparedStatement psmt= conn.prepareStatement(sql);
		//System.out.println("数据库接收到的offset为"+offset+" pageSize为"+pageSize);
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
		String sql="select count(*) from user u left join role r on u.roleId=r.id where r.roleName!='系统管理员'";
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
