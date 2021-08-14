package Listener;



import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ServletContextListener_demo implements ServletContextListener {
     
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("Tomcat正在关闭中............");

	}

	public void contextInitialized(ServletContextEvent sce) {
		ServletContext con=sce.getServletContext();
		String value=con.getInitParameter("123");
		System.out.println("value:"+value);

	}

}
