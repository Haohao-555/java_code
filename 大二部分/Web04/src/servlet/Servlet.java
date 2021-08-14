package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.thoughtworks.xstream.XStream;

import entity.Dance;

public class Servlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String xml=getxml();
		response.setContentType("text/xml;charset=utf-8");
		response.getWriter().println(xml);
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
	}
	private String getxml(){
	  List<Dance>dances =new ArrayList<Dance>();
	  //创建初始化数据
	  dances.add(new Dance("十七岁","刘德华"));
	  dances.add(new Dance("奉献","韩寒"));
	  dances.add(new Dance("刀剑如梦","周华健"));
	  dances.add(new Dance("往后余生","徐巍"));
	  //创建XStream对象
	  XStream x=new XStream();
	  //生成xml
	  x.alias("dances", List.class);
	  x.alias("dance", Dance.class);
	  String xml=x.toXML(dances);
	  System.out.println(xml);
	  return xml;
	}
}
