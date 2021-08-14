package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Aservlet extends HttpServlet {

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
        System.out.println(" 控制台输出服务端");
        response.getWriter().print("doget");
		
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
	   request.setCharacterEncoding("utf-8");//请求编码
	   response.setContentType("text/html;charset=utf-8");//响应编码
       String name=request.getParameter("username");//获取请求资源
       System.out.println(" doPost控制台输出服务端"+name);
       response.getWriter().print("doPost姓名"+name);
}

}
