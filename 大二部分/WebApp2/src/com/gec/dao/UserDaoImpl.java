package com.gec.dao;

import java.util.HashMap;
import java.util.Map;

import com.gec.domain.User;

public class UserDaoImpl implements UserDao{
    Map<String,User> users=new HashMap();
    {
		
		User u1=new User("andy","123","安迪");
		User u2=new User("andy","456","安迪");
		User u3=new User("andy","789","安迪");
		users.put("andy",u1);
		users.put("c",u2);
		users.put("2",u3);
	}
	@Override
	public User getUserByName(String username) {
		// TODO Auto-generated method stub
		User user=users.get(username);
		if(user==null){
			throw new RuntimeException("用户不存在");
		}
		return user;
	} 
}
