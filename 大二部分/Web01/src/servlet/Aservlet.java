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
        System.out.println(" ����̨��������");
        response.getWriter().print("doget");
		
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
	   request.setCharacterEncoding("utf-8");//�������
	   response.setContentType("text/html;charset=utf-8");//��Ӧ����
       String name=request.getParameter("username");//��ȡ������Դ
       System.out.println(" doPost����̨��������"+name);
       response.getWriter().print("doPost����"+name);
}

}
