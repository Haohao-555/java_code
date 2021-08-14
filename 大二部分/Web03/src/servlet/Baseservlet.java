package servlet;

import java.io.IOException;

import java.lang.reflect.Method;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class Baseservlet extends HttpServlet {
	public void service(HttpServletRequest request, HttpServletResponse response) {
		// ��ȡ��ǰ��(Baseservlet)Ŀ��ͨ��������÷���
		Class<? extends Baseservlet> c = this.getClass();
		// ��ȡҪ���õķ�����
		String method_name = request.getParameter("method");
		// �ж��Ƿ��з������󷽷���
		if (method_name == null && method_name.trim().isEmpty()) {// Ϊ��
			throw new RuntimeException();
		} else {// ��Ϊ��
			Method method = null;// ���巽������
			// ��ȡ����
			try {
				method = c.getDeclaredMethod(method_name, HttpServletRequest.class,
						HttpServletResponse.class);
				//System.out.println(method.getName());
			} catch (Exception e) {
				throw new RuntimeException("�����õķ���������");
			}
			// ���÷���
			try {
				String result = (String) method.invoke(this, request, response);
				// ���ݷ��ؽ�������ж�(���ظ�ʽΪr:��ַ��f:��ַ)
				if (result == null ||result.trim().isEmpty()) {// ��������Ϊ��
					return;
				} else {
					// ���ַ������д���
					int index = result.indexOf(":");// ��ȡð�ŵ�λ��
					String s = result.substring(0, index);// ��ȡð��ǰ���ַ���
					String path = result.substring(index + 1);// ��ȡð�ź���ַ���
					//System.out.println(path);
					// ���ַ��������ж�
					if (s.equalsIgnoreCase("r")) {// ��URL�����ض���
						response.sendRedirect(request.getContextPath() + path);
					} else if (s.equalsIgnoreCase("f")) {// ת��
						request.getRequestDispatcher(path).forward(request,
								response);
					} else {
						throw new RuntimeException("����������汾��֧�ֵ�ǰ����");
					}
				}
			} catch (Exception e) {
				throw new RuntimeException("����õķ����ڲ��׳��쳣");
//				e.printStackTrace();
			}

		}
	}

}
