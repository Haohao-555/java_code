package Text;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import dao.UserDao;

import entity.User;

import util.MyBatisUtil;

public class Text {
     public static void main(String[] args) throws Exception {
	   SqlSession session=MyBatisUtil.getSession();
	   UserDao userDao=session.getMapper(UserDao.class);
	   //����
	   User u=new User();
	   u.setName("����");
	   u.setPw("456");
	   userDao.insert(u);
	   //����
	   List<User>list=userDao.getList();
	   for(User user:list){
		   System.out.println(user);
	   }
	   
	   
  }
}
