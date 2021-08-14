package part4;

import java.io.IOException;
import java.net.*;
import java.io.*;
public class TCPClient1 {
	public static void main(String args[]){
		
		try {
			//(1)
			Socket s = new Socket("127.0.0.1",5432);
			//(2)
			BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
			//(3)
			PrintStream out = new PrintStream(s.getOutputStream());
			BufferedReader userin = new BufferedReader(new InputStreamReader(System.in));
			
			String st;
			System.out.print("客户端发送消息：");
			st = userin.readLine();
			out.println(st);
		
			st = in.readLine();
			System.out.print("接收服务器消息：" + st);	
			
			in.close();
			out.close();
			s.close();
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
