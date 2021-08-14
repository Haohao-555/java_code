package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Baseservlet extends HttpServlet {
	public void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String methodName = request.getParameter("method");// ��ȡ���󷽷���
		Class c = this.getClass();// ��ȡ��ǰ���class��
		// �жϷ����ͻ����Ƿ��з���
		if (methodName == null || methodName.trim().isEmpty()) {
			throw new RuntimeException();
		}
		Method method = null;
		try {
			method = c.getMethod(methodName, HttpServletRequest.class,
					HttpServletResponse.class);// ��ȡ����
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new RuntimeException("��Ҫ���õķ���������");
		}
		// ���÷���
		try {
			String result=(String)method.invoke(this, request, response);
			if(result==null||result.trim().isEmpty()){//���resultΪ�գ���ʲô�����ø�
				return;
			}
			if(result.contains(":")){//�ж�result�Ƿ����:
				//�ָ�ð��
				int index=result.indexOf(":");//��ȡð�ŵ�λ��
				String s=result.substring(0,index);//��ȡð��ǰ��ĸ
				String path=result.substring(index+1);//��ȡð�ź���ĸ
				//��ð��ǰ��ĸ�����ж�
				if(s.equalsIgnoreCase("r")){//���ǰ׺��r��ʾ�ض���
					response.sendRedirect(request.getContextPath()+path);
				}else if(s.equalsIgnoreCase("f")){//ת��
					request.getRequestDispatcher(path).forward(request,response);
				}else{
					throw new RuntimeException("��ָ���Ĳ���"+s+"��ǰ�汾��֧��");
				}
			}else{//û��ð�� Ĭ��ת��(�����󷢸�����)
				request.getRequestDispatcher(result).forward(request, response);
				
			}
		} catch (Exception e) {
			System.out.println("����õķ���:" + method + "���ڲ��׳����쳣");
			throw new RuntimeException(e);

		}
	}

}
