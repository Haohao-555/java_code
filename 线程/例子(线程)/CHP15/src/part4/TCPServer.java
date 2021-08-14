package part4;

import java.net.*;
import java.io.*;

public class TCPServer{
	public static void main(String args[]){
		ServerSocket s = null;
		Socket s1;
		String st;

		// 通过5432端口建立连接
		try{
			s = new ServerSocket(5432);
			// 监听端口请求，等待连接
			s1 = s.accept();
			//建立连接，通过Socket建立连接上的输入流
			BufferedReader in = new BufferedReader(new InputStreamReader(s1.getInputStream()));
			//建立连接，通过Socket建立连接上的输出流
			PrintStream out = new PrintStream(s1.getOutputStream());
			//创建标准输入流，通过键盘接收数据
			BufferedReader userin = new BufferedReader(new InputStreamReader(System.in));
			while (true){

				System.out.println("waiting...");

				st = in.readLine();
				System.out.println("接收到客户端的数据为：" + st);
				if(st.equals("over"))
					break;
				System.out.println();
				System.out.print("向客户端发送数据：");
				st = userin.readLine();
				out.println(st);
				if(st.equals("over"))
					break;
			}
			out.close();
			in.close();
			s1.close();
			s.close();
			
		}catch(IOException e){ 
			System.out.println("IOException is:" + e.getMessage());
		}
	}
}
