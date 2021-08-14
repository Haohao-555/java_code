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
			this.scan=new Scanner(client.getInputStream());//�ͻ��˵�������
			this.scan.useDelimiter("\n");//���÷ָ���
			this.out=new PrintStream(client.getOutputStream());//�ͻ��˵������
		}
		@Override
		public void run() {
			//������Ҫ�Ƚ��տͻ��˷���������Ϣ������ſ��Խ���Ϣ����֮���ͻؿͻ���
			while(this.flag){
				if(this.scan.hasNext()){
					String val=scan.next().trim();//.trim()ȥ���ո�
					if("byebye".equalsIgnoreCase(val)){
						out.println("byebye");
						this.flag=false;
					}else{
						out.println("��Echo��"+val);
						out.flush();//ǿ��ˢ�»�����
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
		ServerSocket server=new ServerSocket(9998);//�˿ں�
		System.out.println("�ȴ��ͻ�������");
		
		boolean flag=true;
		while(flag){
			Socket client=server.accept();//�����ͻ���
			new Thread(new ClientThread(client)).start();
		}
		server.close();
}
}