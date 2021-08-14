package part4;

import java.net.*;
import java.io.*;
public class TCPClient {
	public static void main(String args[]) throws IOException{
		try{
			// 	在端口5432打开连接
			Socket s1 = new Socket("localhost", 5432);
			// 获得socket端口的输入句柄，并从中读取数据
			//InputStream s1In = s1.getInputStream();
			BufferedReader in = new BufferedReader(new InputStreamReader(s1.getInputStream()));
			//通过Socket获取连接上的输入流
			PrintStream out = new PrintStream(s1.getOutputStream());
			BufferedReader userin = new BufferedReader(new InputStreamReader(System.in));
			//创建标准输出流，从键盘接收数据
			String st;
			while(true){
				System.out.print("客户端端发出消息：");
				st = userin.readLine();//从标准输入读数据
				
				out.println(st);//发送给服务器
				if(st.equals("over"))
					break;
				System.out.println("waiting...");
				st = in.readLine();//读取服务器发送数据
				System.out.println("客户端接收服务器端信息：" + st);
				if(st.equals("over"))
					break;		
			}
			//	操作结束，关闭数据流及socket连接
			out.close();
			in.close();
			s1.close();
		}catch(Exception e){
			System.out.println("Exception：" + e.getMessage());
		}
	}
}
