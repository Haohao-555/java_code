package com.tcp;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
   public Client() {
		try {
			// (1)����Socket
			Socket s = new Socket("10.53.144.95",5551);
			// (2)�������������
            ObjectOutputStream oos = new ObjectOutputStream(s.getOutputStream());
			ObjectInputStream ois = new ObjectInputStream(s.getInputStream());
			// (3)�������
			while(true){
	           System.out.print("��������Ҫ���ҵĶ���");
	           Scanner sc=new Scanner(System.in);
	           String dateil=sc.nextLine();
	           if(dateil.equals("over"))
	        	   break;
				oos.writeUTF(""+dateil+"");
				oos.flush();
				String str = ois.readUTF();
				System.out.println("�ͻ��˽��շ�������Ϣ��" + str);
			// (4)�ر�����socket
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
