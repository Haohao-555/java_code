package dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import entity.User;

public interface UserDao {
	@Select("select *from user")
    public List<User>getList();
	@Insert("insert into user(name,pw)values(#{name},#{pw})")
	public  void insert(User user);
}
