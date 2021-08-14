package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;

import com.thoughtworks.xstream.XStream;

import entity.User;

import util.MyBatisUtil;

public class UserServlet extends Baseservlet {

	public String selectuser(HttpServletRequest request, HttpServletResponse response) throws Exception {
		SqlSession session=MyBatisUtil.getSession();
		List<User>list=new ArrayList<User>();
		list=session.selectList("entity.Mapper.select_All");//从数据库中获取到数据
		//将数据转成xml
		XStream x=new XStream();
		x.alias("student", User.class);
		x.alias("students", List.class);
		String xml=x.toXML(list);
        request.setAttribute("xml", xml);
		return "r:/student.jsp";
	}
	
}
