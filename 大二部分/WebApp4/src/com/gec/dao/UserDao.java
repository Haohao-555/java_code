package com.gec.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.gec.domain.User;

public interface UserDao {
	//根据账号获取一个管理员信息
	public User getAdminByAccount(String account)throws SQLException;
	//添加用户到数据库中
	public void addUser(User user)throws SQLException;
	//根据账号获取一个用户
	public User getUserByAccount(String account,boolean required)throws SQLException;
	
	
	
	//获取用户的总记录（不含搜索功能）
	public Integer getUserCount()throws SQLException;
	//获取用户列表数据（只含分页，不含搜索功能） offset:偏移量 pageSize：页大小
	public List<User> getAllUsers(Integer offset,Integer pageSize)throws SQLException;
	
	public void deleteUser(String id)throws SQLException;
	
	public void updateUser(User user)throws SQLException;
	
	public User getUserById(String id)throws SQLException;
	
}
