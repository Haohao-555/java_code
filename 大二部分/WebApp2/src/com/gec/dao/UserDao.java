package com.gec.dao;

import com.gec.domain.User;

public interface UserDao{
	public User getUserByName(String username);
}
