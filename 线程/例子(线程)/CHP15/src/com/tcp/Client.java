package com.tcp;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
   public Client() {
		try {
			// (1)建立Socket
			Socket s = new Socket("10.53.144.95",5551);
			// (2)创建输入输出流
            ObjectOutputStream oos = new ObjectOutputStream(s.getOutputStream());
			ObjectInputStream ois = new ObjectInputStream(s.getInputStream());
			// (3)输入输出
			while(true){
	           System.out.print("请输入你要查找的东西");
	           Scanner sc=new Scanner(System.in);
	           String dateil=sc.nextLine();
	           if(dateil.equals("over"))
	        	   break;
				oos.writeUTF(""+dateil+"");
				oos.flush();
				String str = ois.readUTF();
				System.out.println("客户端接收服务器消息：" + str);
			// (4)关闭流和socket
			   oos.close();
			  ois.close();
			  s.close();
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
   public static void main(String[] args) {
	  new Client();
	}

}
