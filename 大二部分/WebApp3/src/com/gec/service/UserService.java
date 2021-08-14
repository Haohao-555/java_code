package com.gec.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.gec.domain.PageBean;
import com.gec.domain.User;

public interface UserService { 
  public void saveUser(User user)throws Exception;
  public PageBean<User> getUserList(PageBean pBean)throws Exception;
  public int del_user(int id)throws Exception;
  public int update_user(User user)throws Exception;
  public User getAdminByAccount(String account,String password)throws Exception;
}
