package Servlet;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
/*
 * 一个类只有一个对象 线程不安全 效率高 Servlet类由我们写 对象由服务器调用相应方法
 */
public class AServlet implements Servlet {
    /**
     * 生命周期方法
     * 会在Servlet类对象被销毁之前执行，并且只执行一次
     */
	@Override
	public void destroy() {
		System.out.println("destroy");

	}
    /**
     * 获取Servlet类的配置消息
     * 一个ServletConfig对象对应一段Web.xml配置信息
     */
	@Override
	public ServletConfig getServletConfig() {
		System.out.println("getServletConfig");
		return null;
	}
    /**
     * 获取Servlet类的消息
     */
	@Override
	public String getServletInfo() {
		System.out.println("getServletInfo");
		return null;
	}
    /**
     * 生命周期方法
     * 会在Servlet类创建对象后马上执行，并且只执行一次
     */
	@Override
	public void init(ServletConfig servletConfig) throws ServletException {
		System.out.println("init");
        //获取初始化参数Web.xml
		System.out.println(servletConfig.getInitParameter("p1"));
		System.out.println(servletConfig.getInitParameter("p2"));
		
		//获取所有初始化参数名称
		Enumeration e=servletConfig.getInitParameterNames();
		while(e.hasMoreElements()){
			System.out.println(e.nextElement());
		}
	}
    /**
     * 生命周期方法
     * 它会被调用多次，每次处理请求时调用该方法
     */
	@Override
	public void service(ServletRequest request, ServletResponse response)
			throws ServletException, IOException {
		System.out.println("service");

	}

}
