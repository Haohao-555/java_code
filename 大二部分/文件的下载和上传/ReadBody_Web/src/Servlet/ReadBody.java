package Servlet;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ReadBody extends HttpServlet {
	public void doPost(HttpServletRequest req,HttpServletResponse res)
	throws ServletException,IOException{
		
		
	      
			//获取请求Body
			byte[] body = null;
			try {
				body = readBody(req);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//将内容进行统一编码Utf-8
			String bodytext=new String(body,"utf-8");
			//获取文件名字
			String filename="1.mp4";
			//写到指定位置
			try {
				writeToFile(filename,body);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//返回页面信息
			res.setContentType("text/html;charset=UTF-8");
			PrintWriter out=res.getWriter();
			out.println("<!DOCTYPE HTML>");
			out.println("<HTML>");
			out.println("<HEAD><TITLE>A Servlet</TITLE></HEAD>");
			out.println("<script>alert(\"上传成功\")</script><BODY>");
			out.println("</BODY>");
			out.println("</HTML>");
			out.flush();
			out.close();
	
		
	}
  //读取请求的输入流
	private byte[]readBody(HttpServletRequest req) throws Exception{
		//获取请求内容长度
		int len=req.getContentLength();
		//获取请求的输入流
		InputStream is=req.getInputStream();
		//新建一个字节数组
		byte b[]=new byte[len];
		int total=0;
		while(total<len){
			int bytes=is.read(b,total,len);
			total+=bytes;
		}
		return b;
	}

	//写入到指定文件
	private void writeToFile(String filename,byte[]body) throws Exception{
		FileOutputStream fileOutputStream=new FileOutputStream("e:/"+filename);
		fileOutputStream.write(body);
		fileOutputStream.flush();
		fileOutputStream.close();
	}
}
