package Client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	private static final BufferedReader INPUT=new BufferedReader(new InputStreamReader(System.in));
	   public static void main(String[] args) throws Exception {
		Socket client=new Socket("localhost",9999);
		Scanner scan=new Scanner(client.getInputStream());//���շ������˵���������
		scan.useDelimiter("\n");
		PrintStream out=new PrintStream(client.getOutputStream());//��������˷�������
		boolean flag=true;
		while(flag){
			String input=getString("������Ҫ���͵�����").trim();
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
