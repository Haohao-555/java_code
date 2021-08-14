package part4;
import java.io.IOException;
import java.net.*;
import java.io.*;
public class TCPServer1 {
	
	public static void main(String args[]){
		ServerSocket s = null;
		Socket s1;
		String st;
		try {
			//(1)创建一个ServerSocket
			 s = new ServerSocket(5432);
			//(2)监听端口，接收客户端的连接请求
			s1 = s.accept();
			//(3)建立连接，通过Socket建立输入流,接收客户端的连接请求
			BufferedReader in = new BufferedReader(new InputStreamReader(s1.getInputStream()));
			
			//(4)建立连接，通过Socket建立输出流，发送数据给客户端
			PrintStream out = new PrintStream(s1.getOutputStream());
			
			//创建标准输入流，接收键盘数据
			BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
			//
			System.out.println("waitting~~~~~");
			st = in.readLine();
			System.out.println("接收客户端数据：" + st);
			
			System.out.print("向客户端发送数据：");
			st = bw.readLine();
			out.println(st);
			
			out.close();
			in.close();
			s1.close();
			s.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
