package Server;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.*;
import java.util.Scanner;

public class Server {
   public static void main(String[] args) throws Exception {
	ServerSocket server=new ServerSocket(9999);//�˿ں�
	System.out.println("�ȴ��ͻ�������");
	Socket client=server.accept();//�����ͻ���
	//������Ҫ�Ƚ��տͻ��˷���������Ϣ������ſ��Խ���Ϣ����֮���ͻؿͻ���
	Scanner scan=new Scanner(client.getInputStream());//�ͻ��˵�������
	scan.useDelimiter("\n");//���÷ָ���
	PrintStream out=new PrintStream(client.getOutputStream());//�ͻ��˵������
	boolean flag=true;
	while(flag){
		if(scan.hasNext()){
			String val=scan.next().trim();//.trim()ȥ���ո�
			if("byebye".equalsIgnoreCase(val)){
				out.println("byebye");
				flag=false;
			}else{
				out.println("��Echo��"+val);
				out.flush();//ǿ��ˢ�»�����
			}
		}
	}
	scan.close();
	out.close();
	server.close();
	client.close();
}
}
