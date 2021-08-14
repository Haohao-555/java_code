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
	//ע��
	public String resgister(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		String result = null;
		request.setCharacterEncoding("utf-8");
		String name = request.getParameter("name");
		String p1 = request.getParameter("password01");
		String email = request.getParameter("email");
		User u1 = getUser(email, name, p1);//��װ����
		insert_User(u1);//��������
		request.getSession().setAttribute("name", name);
		result = this.getServletConfig().getInitParameter("success");
		return result;		
	}
    //��¼
	public String login(HttpServletRequest request, HttpServletResponse response) throws Exception {
          List<User>users=select_allUser();
          String result=null;
          String name=request.getParameter("username");
          String pw=request.getParameter("password");
          if(judeuser(users, name, pw)){
        	  result=this.getServletConfig().getInitParameter("success_login");//��ȡ������δ���ú� 
          }
        	 request.getSession().setAttribute("error","������û�������");
        	 result=this.getServletConfig().getInitParameter("error_login");//��ȡ������δ���ú� 
        	 return result;
          
	}
	// �ж��û����Ƿ����
	public String isusername(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		String username=request.getParameter("name");
		User u1=new User();
		u1.setName(username);
		User user=select_user(u1);
		if(user!=null){
			response.getWriter().println("�û����Ѵ���");
		}
		return null;		
	}
	// ********************���ݿ�********************
	private List<User> select_allUser() throws Exception {// ���������û�
		List<User> users;
		SqlSession sqlsession = MyBatisUtil.getSession();
		users = sqlsession.selectList("entity.Mapper.select_All");
		sqlsession.close();
		return users;
	}
	//�����û�
	private User select_user(User u1) throws Exception{
		SqlSession sqlsession=MyBatisUtil.getSession();
		User user=sqlsession.selectOne("entity.Mapper.select_User",u1);
		return user;
	}
	// �����û�
	private void insert_User(User user) throws Exception {
		SqlSession sqlsession = MyBatisUtil.getSession();
		sqlsession.insert("entity.Mapper.insert_User", user);
		sqlsession.commit();
		sqlsession.close();
	}
	// ��������user
	private User getUser(String email, String name, String password) {
		User user = new User();
		user.setEmail(email);
		user.setName(name);
		user.setPassword(password);
		return user;
	}
	//�ж��û���¼�Ƿ�ɹ�
	private boolean judeuser(List<User>users,String name,String password){
		for(User user:users){
			if(user.getName().equalsIgnoreCase(name)&&user.getPassword().equalsIgnoreCase(password)){
				return true;
			}
		}
		return false;
	}
}
