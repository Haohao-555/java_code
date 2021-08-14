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
		
		
	      
			//��ȡ����Body
			byte[] body = null;
			try {
				body = readBody(req);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//�����ݽ���ͳһ����Utf-8
			String bodytext=new String(body,"utf-8");
			//��ȡ�ļ�����
			String filename="1.mp4";
			//д��ָ��λ��
			try {
				writeToFile(filename,body);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//����ҳ����Ϣ
			res.setContentType("text/html;charset=UTF-8");
			PrintWriter out=res.getWriter();
			out.println("<!DOCTYPE HTML>");
			out.println("<HTML>");
			out.println("<HEAD><TITLE>A Servlet</TITLE></HEAD>");
			out.println("<script>alert(\"�ϴ��ɹ�\")</script><BODY>");
			out.println("</BODY>");
			out.println("</HTML>");
			out.flush();
			out.close();
	
		
	}
  //��ȡ�����������
	private byte[]readBody(HttpServletRequest req) throws Exception{
		//��ȡ�������ݳ���
		int len=req.getContentLength();
		//��ȡ�����������
		InputStream is=req.getInputStream();
		//�½�һ���ֽ�����
		byte b[]=new byte[len];
		int total=0;
		while(total<len){
			int bytes=is.read(b,total,len);
			total+=bytes;
		}
		return b;
	}

	//д�뵽ָ���ļ�
	private void writeToFile(String filename,byte[]body) throws Exception{
		FileOutputStream fileOutputStream=new FileOutputStream("e:/"+filename);
		fileOutputStream.write(body);
		fileOutputStream.flush();
		fileOutputStream.close();
	}
}
