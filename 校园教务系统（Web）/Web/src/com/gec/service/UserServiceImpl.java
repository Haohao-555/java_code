package com.gec.service;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gec.dao.UserDao;
import com.gec.dao.UserDaoImpl;
import com.gec.domain.Course_detail;
import com.gec.domain.St_full_course;
import com.gec.domain.Student;
import com.gec.domain.User;

public class UserServiceImpl implements UserService{
//	设置一个UserDao引用
	private UserDao userDao=new UserDaoImpl();
	@Override
	public void delete_course(HttpServletRequest req, HttpServletResponse resp) {
		// TODO Auto-generated method stub
		String account = (String)req.getSession().getAttribute("account");
		int co_id=Integer.parseInt(req.getParameter("co_id"));
		try{
			userDao.db_delete_course(account, co_id);
			resp.getWriter().print("退选课程成功");
		}catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}

	@Override
	public void insert_course(HttpServletRequest req, HttpServletResponse resp,ServletContext application) {
		// TODO Auto-generated method stub
		 int co_id=Integer.parseInt(req.getParameter("co_id"));
	 	    String account= (String) req.getSession().getAttribute("account");
	 	    //System.out.println("选课账号为"+account);
		    try {
		    	//判断课程是否已经选了
		    	boolean flag=userDao.db_is_select_course(account, co_id);
		    	if(flag==true){
		    		resp.getWriter().print("你已选择了，不能重复选择");
		    		//System.out.println("课程已经选择了");
		    	}else{
		    		userDao.db_insert_course(account, co_id);
		    		resp.getWriter().print("添加课程成功");
		    		ArrayList<Course_detail> courselist=userDao.db_select_all_course();
		    		application.setAttribute("courselist",courselist);
		    	}
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	@Override
	public void islogin(HttpServletRequest req, HttpServletResponse resp,
			ServletContext application) {
		// TODO Auto-generated method stub
		String account=req.getParameter("account").replace(" ","");
   	    String password=req.getParameter("password").replace(" ","");
   	    List<Student>student=new ArrayList<Student>();
   	    try {
			User user=userDao.db_select_user(account,password);
			if(user!=null){//登录成功
				Student st = null;
				   if(user.getType().equals("0")){//学生身份
					   req.getSession().setAttribute("account",user.getAccount());
					   st=userDao.db_select_student(account);//读取用户个人信息
					   
					   if(st==null){
	  	    		    	application.setAttribute("my", false);
	  	    		    }else{
	  	    		    	application.setAttribute("my", true);
	  	    		    	student.add(st);
	  	    		    	application.setAttribute("student", student);//将数据保存到全局变量中
	  	    		    }
					   select_all_course(req, resp, application);//跳转到course.jsp页面
					   
				   }else{//管理员身份
					   System.out.println("管理员登录成功");
					   req.getSession().setAttribute("admin_account",user.getAccount());
					   //转发到AdminServlet       
					   req.getRequestDispatcher("/AdminServlet").forward(req, resp);
				   }
   
  	    		}else{
  	    			//返回到登录界面（将错误信息返回到上一个页面）
  	    		    //System.out.println("用户登录失败");
  	    			req.getSession().setAttribute("loginError", "true");
  	    			resp.sendRedirect("/Web/login.jsp");
  	    		}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void my(HttpServletRequest req, HttpServletResponse resp,
			ServletContext application) {
		// TODO Auto-generated method stub
		try {
    		List<Student>student=new ArrayList<Student>();
    		Student st=new Student(req);
    		userDao.db_insert_student(st);
    		student.add(st);
    		application.setAttribute("my", true);
    		application.setAttribute("student", student);
    		req.getRequestDispatcher("course.jsp").forward(req, resp);
    		//绑定个人信息成功，将成功信息保存到对话中
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}   
	}

	@Override
	public void register(HttpServletRequest req, HttpServletResponse resp) {
		// TODO Auto-generated method stub
		//取参数
		String account=req.getParameter("account").replace(" ","");
   	    String password=req.getParameter("password").replace(" ","");
   	    //判断参数是否为空
   	    try{
   	    	if(account.length()==0||password.length()==0){
   	   	    	req.getSession().setAttribute("canshuError", "true");
   	   			resp.sendRedirect("/Web/resgiter.jsp");
   	   			//System.out.println("输入参数错误");
   	   	    }else{
   	   	        //判断用户是否已经存在
   	   	    	String result=userDao.db_is_user(account);
   	   	    	if(result.equals("2")){
   	   	    	userDao.db_insert_user(account,password);
   		   	        //跳转登录界面
   		   	        req.getRequestDispatcher("login.jsp").forward(req, resp);
   	   	    	}else{//账号存在
   	   	    	    req.getSession().setAttribute("zhanghaoError", "true");
   		            resp.sendRedirect("/Web/resgiter.jsp");
   				    //System.out.println("账号已存在");
   	   	    	}
   	   	    }	
   	    }catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void select_My_course(HttpServletRequest req,
			HttpServletResponse resp, ServletContext application) {
		// TODO Auto-generated method stub
		ArrayList<St_full_course>st_full_course = new ArrayList<St_full_course>();
		String account = (String)req.getSession().getAttribute("account");
		try{
			st_full_course=userDao.db_select_My_course(account);
			//System.out.println(st_full_course);
			application.setAttribute("st_full_course", st_full_course);
			//跳转到我的已选（a标签已经跳到st_full_coourse.jsp）
			req.getRequestDispatcher("st_full_course.jsp").forward(req, resp);
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	@Override
	public void select_all_course(HttpServletRequest req,
			HttpServletResponse resp, ServletContext application) {
		// TODO Auto-generated method stub
		try{
			ArrayList<Course_detail> courselist=userDao.db_select_all_course();
			ArrayList<Integer> courseids=userDao.db_select_courseid();
			application.setAttribute("courselist",courselist);
			application.setAttribute("courseids",courseids);
			//System.out.println("取数据一次");
			//跳转到主页面
			req.getRequestDispatcher("course.jsp").forward(req, resp);
		}catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}

}
