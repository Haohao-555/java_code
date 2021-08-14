package com.gec.service;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gec.dao.TeacherDao;
import com.gec.dao.TeacherDaoImpl;
import com.gec.dao.UserDao;
import com.gec.dao.UserDaoImpl;
import com.gec.domain.Course_detail;
import com.gec.domain.St_full_course;
import com.gec.domain.Student;
import com.gec.domain.Teacher;
import com.gec.domain.User;

public class UserServiceImpl implements UserService{
//	����һ��UserDao����
	private UserDao userDao=new UserDaoImpl();
	private TeacherDao teacherDao = new TeacherDaoImpl();
	@Override
	public void delete_course(HttpServletRequest req, HttpServletResponse resp) {
		// TODO Auto-generated method stub
		String account = (String)req.getSession().getAttribute("account");
		int co_id=Integer.parseInt(req.getParameter("co_id"));
		try{
			userDao.db_delete_course(account, co_id);
			resp.getWriter().print("��ѡ�γ̳ɹ�");
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
	 	    //System.out.println("ѡ���˺�Ϊ"+account);
		    try {
		    	//�жϿγ��Ƿ��Ѿ�ѡ��
		    	boolean flag=userDao.db_is_select_course(account, co_id);
		    	if(flag==true){
		    		resp.getWriter().print("����ѡ���ˣ������ظ�ѡ��");
		    		//System.out.println("�γ��Ѿ�ѡ����");
		    	}else{
		    		userDao.db_insert_course(account, co_id);
		    		resp.getWriter().print("��ӿγ̳ɹ�");
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
			Teacher teacher=teacherDao.t_db_login(account, password);
			if(user == null && teacher == null) {
				System.out.println("�û���¼ʧ��");
				req.getSession().setAttribute("loginError", "true");
	    	    resp.sendRedirect("/Web/login.jsp");
			} else {
				if(teacher != null) {
					 req.getSession().setAttribute("Teacher_account",teacher);
				     //ת����TeacherServlet       
				     req.getRequestDispatcher("/TeacherServlet").forward(req, resp);
				} else {//ѧ�� ����Ա
					Student st = null;
					if(user.getType().equals("1")) {//����Ա
						 req.getSession().setAttribute("admin_account",user.getAccount());
					     //ת����AdminServlet       
					     req.getRequestDispatcher("/AdminServlet").forward(req, resp);
					}else {//ѧ��
						 req.getSession().setAttribute("account",user.getAccount());
						 st=userDao.db_select_student(account);//��ȡ�û�������Ϣ
						 if (st == null) {
							 application.setAttribute("my", false);
						 } else {
							 application.setAttribute("my", true);
		  	    		     student.add(st);
		  	    		     application.setAttribute("student", student);//�����ݱ��浽ȫ�ֱ�����
						 }
						 select_all_course(req, resp, application);//��ת��course.jspҳ��
					}
				}
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
    		userDao.db_insert_flag(st.getAccount());
    		student.add(st);
    		application.setAttribute("my", true);
    		application.setAttribute("student", student);
    		req.getRequestDispatcher("course.jsp").forward(req, resp);
    		//�󶨸�����Ϣ�ɹ������ɹ���Ϣ���浽�Ի���
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}   
	}

	@Override
	public void register(HttpServletRequest req, HttpServletResponse resp) {
		// TODO Auto-generated method stub
		//ȡ����
		String account=req.getParameter("account").replace(" ","");
   	    String password=req.getParameter("password").replace(" ","");
   	    //�жϲ����Ƿ�Ϊ��
   	    try{
   	    	if(account.length()==0||password.length()==0){
   	   	    	req.getSession().setAttribute("canshuError", "true");
   	   			resp.sendRedirect("/Web/resgiter.jsp");
   	   			//System.out.println("�����������");
   	   	    }else{
   	   	        //�ж��û��Ƿ��Ѿ�����
   	   	    	String result=userDao.db_is_user(account);
   	   	    	if(result.equals("2")){
   	   	    	userDao.db_insert_user(account,password);
   		   	        //��ת��¼����
   		   	        req.getRequestDispatcher("login.jsp").forward(req, resp);
   	   	    	}else{//�˺Ŵ���
   	   	    	    req.getSession().setAttribute("zhanghaoError", "true");
   		            resp.sendRedirect("/Web/resgiter.jsp");
   				    //System.out.println("�˺��Ѵ���");
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
			//��ת���ҵ���ѡ��a��ǩ�Ѿ�����st_full_coourse.jsp��
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
			//System.out.println("ȡ����һ��");
			//��ת����ҳ��
			req.getRequestDispatcher("course.jsp").forward(req, resp);
		}catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}

	@Override
	public void select_grade(HttpServletRequest req, HttpServletResponse resp,
			ServletContext application) {
		ArrayList<St_full_course>st_full_course = new ArrayList<St_full_course>();
	    String account = (String)req.getSession().getAttribute("account");
	    try {
			st_full_course = userDao.db_select_me_grade(account);
			System.out.println("st_full_course is"+st_full_course.toString());
			application.setAttribute("select_grade", st_full_course);
			req.getRequestDispatcher("select_grade.jsp").forward(req, resp);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
