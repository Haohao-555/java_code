package Client;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
	private static final BufferedReader INPUT=new BufferedReader(new InputStreamReader(System.in));
   public static void main(String[] args) throws Exception {
	Socket client=new Socket("localhost",9998);
	Scanner scan=new Scanner(client.getInputStream());//接收服务器端的输入内容
	scan.useDelimiter("\n");
	PrintStream out=new PrintStream(client.getOutputStream());//向服务器端发送内容
	boolean flag=true;
	while(flag){
		String input=getString("请输入要发送的内容").trim();
		out.println(input);
		
		if(scan.hasNext()){
			System.out.println(scan.next());
		}
		if("byebye".equalsIgnoreCase(input)){
			flag=false;
		}
		
	}
	scan.close();
	out.close();
	client.close();
	
  }
   public static String getString(String prompt) throws Exception{
	   System.out.println(prompt);
	   String str=INPUT.readLine();
	   return str;
   }
}
