package com.tcp;
import java.io.*;
import java.net.*;
import java.util.Scanner;
public class Server {
  public Server() {
		ServerSocket ss;
		Socket s = null;
		ObjectInputStream ois;
		ObjectOutputStream oos;
		
		try {
			// (1)创建一个Server
			ss = new ServerSocket(5551);
			// (2)监听端口号，建立连接
			s = ss.accept();
			// (3)创建输入输出流
			ois = new ObjectInputStream(s.getInputStream());
			oos = new ObjectOutputStream(s.getOutputStream());
			// (4)输入输出
while(true){	
	      String str = ois.readUTF();
		  if(str.equals("over"))
		    	  break;
		       System.out.println("服务器接收客户端的消息：" + str);
			   System.out.print("请输入回复内容:");
				Scanner sc=new Scanner(System.in);
				String s1=sc.nextLine();
				oos.writeUTF(s1);
				oos.flush();
			// (5)关闭流和socket
			oos.close();
			ois.close();
			s.close();
			ss.close();
		}
		} catch (IOException e) {
			e.printStackTrace();
		}
}
public static void main(String[] args) {
		new Server();
	}

}
