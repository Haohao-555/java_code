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
	  //������ʼ������
	  dances.add(new Dance("ʮ����","���»�"));
	  dances.add(new Dance("����","����"));
	  dances.add(new Dance("��������","�ܻ���"));
	  dances.add(new Dance("��������","��Ρ"));
	  //����XStream����
	  XStream x=new XStream();
	  //����xml
	  x.alias("dances", List.class);
	  x.alias("dance", Dance.class);
	  String xml=x.toXML(dances);
	  System.out.println(xml);
	  return xml;
	}
}
