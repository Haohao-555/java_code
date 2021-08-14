package Servlet;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
/*
 * һ����ֻ��һ������ �̲߳���ȫ Ч�ʸ� Servlet��������д �����ɷ�����������Ӧ����
 */
public class AServlet implements Servlet {
    /**
     * �������ڷ���
     * ����Servlet���������֮ǰִ�У�����ִֻ��һ��
     */
	@Override
	public void destroy() {
		System.out.println("destroy");

	}
    /**
     * ��ȡServlet���������Ϣ
     * һ��ServletConfig�����Ӧһ��Web.xml������Ϣ
     */
	@Override
	public ServletConfig getServletConfig() {
		System.out.println("getServletConfig");
		return null;
	}
    /**
     * ��ȡServlet�����Ϣ
     */
	@Override
	public String getServletInfo() {
		System.out.println("getServletInfo");
		return null;
	}
    /**
     * �������ڷ���
     * ����Servlet�ഴ�����������ִ�У�����ִֻ��һ��
     */
	@Override
	public void init(ServletConfig servletConfig) throws ServletException {
		System.out.println("init");
        //��ȡ��ʼ������Web.xml
		System.out.println(servletConfig.getInitParameter("p1"));
		System.out.println(servletConfig.getInitParameter("p2"));
		
		//��ȡ���г�ʼ����������
		Enumeration e=servletConfig.getInitParameterNames();
		while(e.hasMoreElements()){
			System.out.println(e.nextElement());
		}
	}
    /**
     * �������ڷ���
     * ���ᱻ���ö�Σ�ÿ�δ�������ʱ���ø÷���
     */
	@Override
	public void service(ServletRequest request, ServletResponse response)
			throws ServletException, IOException {
		System.out.println("service");

	}

}
