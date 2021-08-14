package com.gec.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.gec.domain.PageBean;
import com.gec.domain.User;

public interface UserService {
	
     public User getAdminByAccount(String account,String password)throws Exception;
     
     public void saveUser(User user)throws Exception;
     
     
     public PageBean<User> getUserList(PageBean pBean)throws Exception;
     
     public User getUserById(String id)throws Exception;
     
     public void deleteUser(String id)throws Exception;
}
