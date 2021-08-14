package Server;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
	private static class ClientThread implements Runnable{
		private Socket client=null;
		private Scanner scan=null;
		private PrintStream out=null;
		private boolean flag=true;
		public   ClientThread(Socket client) throws Exception{
			this.client=client;
			this.scan=new Scanner(client.getInputStream());//客户端的输入流
			this.scan.useDelimiter("\n");//设置分隔符
			this.out=new PrintStream(client.getOutputStream());//客户端的输出流
		}
		@Override
		public void run() {
			//首先需要先接收客户端发送来的信息，而后才可以将信息处理之后发送回客户端
			while(this.flag){
				if(this.scan.hasNext()){
					String val=scan.next().trim();//.trim()去掉空格
					if("byebye".equalsIgnoreCase(val)){
						out.println("byebye");
						this.flag=false;
					}else{
						out.println("【Echo】"+val);
						out.flush();//强制刷新缓冲区
					}
				}
			}
			
			try {
				scan.close();
				out.close();
				client.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
		
	}
	public static void main(String[] args) throws Exception {
		ServerSocket server=new ServerSocket(9998);//端口号
		System.out.println("等待客户端连接");
		
		boolean flag=true;
		while(flag){
			Socket client=server.accept();//监听客户端
			new Thread(new ClientThread(client)).start();
		}
		server.close();
}
}