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
			// (1)����һ��Server
			ss = new ServerSocket(5551);
			// (2)�����˿ںţ���������
			s = ss.accept();
			// (3)�������������
			ois = new ObjectInputStream(s.getInputStream());
			oos = new ObjectOutputStream(s.getOutputStream());
			// (4)�������
while(true){	
	      String str = ois.readUTF();
		  if(str.equals("over"))
		    	  break;
		       System.out.println("���������տͻ��˵���Ϣ��" + str);
			   System.out.print("������ظ�����:");
				Scanner sc=new Scanner(System.in);
				String s1=sc.nextLine();
				oos.writeUTF(s1);
				oos.flush();
			// (5)�ر�����socket
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
