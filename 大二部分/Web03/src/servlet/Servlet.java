package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.ibatis.session.SqlSession;
import until.MyBatisUtil;
import entity.User;

public class Servlet extends Baseservlet {
	//注册
	public String resgister(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		String result = null;
		request.setCharacterEncoding("utf-8");
		String name = request.getParameter("name");
		String p1 = request.getParameter("password01");
		String email = request.getParameter("email");
		User u1 = getUser(email, name, p1);//封装对象
		insert_User(u1);//插入数据
		request.getSession().setAttribute("name", name);
		result = this.getServletConfig().getInitParameter("success");
		return result;		
	}
    //登录
	public String login(HttpServletRequest request, HttpServletResponse response) throws Exception {
          List<User>users=select_allUser();
          String result=null;
          String name=request.getParameter("username");
          String pw=request.getParameter("password");
          if(judeuser(users, name, pw)){
        	  result=this.getServletConfig().getInitParameter("success_login");//获取参数，未设置好 
          }
        	 request.getSession().setAttribute("error","密码或用户名错误");
        	 result=this.getServletConfig().getInitParameter("error_login");//获取参数，未设置好 
        	 return result;
          
	}
	// 判断用户名是否存在
	public String isusername(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		String username=request.getParameter("name");
		User u1=new User();
		u1.setName(username);
		User user=select_user(u1);
		if(user!=null){
			response.getWriter().println("用户名已存在");
		}
		return null;		
	}
	// ********************数据库********************
	private List<User> select_allUser() throws Exception {// 查找所有用户
		List<User> users;
		SqlSession sqlsession = MyBatisUtil.getSession();
		users = sqlsession.selectList("entity.Mapper.select_All");
		sqlsession.close();
		return users;
	}
	//查找用户
	private User select_user(User u1) throws Exception{
		SqlSession sqlsession=MyBatisUtil.getSession();
		User user=sqlsession.selectOne("entity.Mapper.select_User",u1);
		return user;
	}
	// 增加用户
	private void insert_User(User user) throws Exception {
		SqlSession sqlsession = MyBatisUtil.getSession();
		sqlsession.insert("entity.Mapper.insert_User", user);
		sqlsession.commit();
		sqlsession.close();
	}
	// 创建对象user
	private User getUser(String email, String name, String password) {
		User user = new User();
		user.setEmail(email);
		user.setName(name);
		user.setPassword(password);
		return user;
	}
	//判断用户登录是否成功
	private boolean judeuser(List<User>users,String name,String password){
		for(User user:users){
			if(user.getName().equalsIgnoreCase(name)&&user.getPassword().equalsIgnoreCase(password)){
				return true;
			}
		}
		return false;
	}
}
