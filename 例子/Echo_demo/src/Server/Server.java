package Server;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.*;
import java.util.Scanner;

public class Server {
   public static void main(String[] args) throws Exception {
	ServerSocket server=new ServerSocket(9999);//端口号
	System.out.println("等待客户端连接");
	Socket client=server.accept();//监听客户端
	//首先需要先接收客户端发送来的信息，而后才可以将信息处理之后发送回客户端
	Scanner scan=new Scanner(client.getInputStream());//客户端的输入流
	scan.useDelimiter("\n");//设置分隔符
	PrintStream out=new PrintStream(client.getOutputStream());//客户端的输出流
	boolean flag=true;
	while(flag){
		if(scan.hasNext()){
			String val=scan.next().trim();//.trim()去掉空格
			if("byebye".equalsIgnoreCase(val)){
				out.println("byebye");
				flag=false;
			}else{
				out.println("【Echo】"+val);
				out.flush();//强制刷新缓冲区
			}
		}
	}
	scan.close();
	out.close();
	server.close();
	client.close();
}
}
