package servlet;

import java.io.IOException;

import java.lang.reflect.Method;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class Baseservlet extends HttpServlet {
	public void service(HttpServletRequest request, HttpServletResponse response) {
		// 获取当前类(Baseservlet)目的通过反射调用方法
		Class<? extends Baseservlet> c = this.getClass();
		// 获取要调用的方法名
		String method_name = request.getParameter("method");
		// 判断是否有发送请求方法名
		if (method_name == null && method_name.trim().isEmpty()) {// 为空
			throw new RuntimeException();
		} else {// 不为空
			Method method = null;// 定义方法变量
			// 获取方法
			try {
				method = c.getDeclaredMethod(method_name, HttpServletRequest.class,
						HttpServletResponse.class);
				//System.out.println(method.getName());
			} catch (Exception e) {
				throw new RuntimeException("您调用的方法不存在");
			}
			// 调用方法
			try {
				String result = (String) method.invoke(this, request, response);
				// 根据返回结果进行判断(返回格式为r:地址或f:地址)
				if (result == null ||result.trim().isEmpty()) {// 返回内容为空
					return;
				} else {
					// 对字符串进行处理
					int index = result.indexOf(":");// 获取冒号的位置
					String s = result.substring(0, index);// 截取冒号前的字符串
					String path = result.substring(index + 1);// 截取冒号后的字符串
					//System.out.println(path);
					// 对字符串进行判断
					if (s.equalsIgnoreCase("r")) {// 对URL进行重定向
						response.sendRedirect(request.getContextPath() + path);
					} else if (s.equalsIgnoreCase("f")) {// 转发
						request.getRequestDispatcher(path).forward(request,
								response);
					} else {
						throw new RuntimeException("您的浏览器版本不支持当前操作");
					}
				}
			} catch (Exception e) {
				throw new RuntimeException("你调用的方法内部抛出异常");
//				e.printStackTrace();
			}

		}
	}

}
