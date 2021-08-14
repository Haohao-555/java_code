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
		String methodName = request.getParameter("method");// 获取请求方法名
		Class c = this.getClass();// 获取当前类的class类
		// 判断方法客户端是否有发送
		if (methodName == null || methodName.trim().isEmpty()) {
			throw new RuntimeException();
		}
		Method method = null;
		try {
			method = c.getMethod(methodName, HttpServletRequest.class,
					HttpServletResponse.class);// 获取方法
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new RuntimeException("你要调用的方法不存在");
		}
		// 调用方法
		try {
			String result=(String)method.invoke(this, request, response);
			if(result==null||result.trim().isEmpty()){//如果result为空，则什么都不用干
				return;
			}
			if(result.contains(":")){//判断result是否包含:
				//分隔冒号
				int index=result.indexOf(":");//获取冒号的位置
				String s=result.substring(0,index);//截取冒号前字母
				String path=result.substring(index+1);//截取冒号后字母
				//对冒号前字母进行判断
				if(s.equalsIgnoreCase("r")){//如果前缀是r表示重定向
					response.sendRedirect(request.getContextPath()+path);
				}else if(s.equalsIgnoreCase("f")){//转发
					request.getRequestDispatcher(path).forward(request,response);
				}else{
					throw new RuntimeException("你指定的操作"+s+"当前版本不支持");
				}
			}else{//没有冒号 默认转发(把请求发个其他)
				request.getRequestDispatcher(result).forward(request, response);
				
			}
		} catch (Exception e) {
			System.out.println("你调用的方法:" + method + "它内部抛出了异常");
			throw new RuntimeException(e);

		}
	}

}
