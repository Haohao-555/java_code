package Client;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPClient {
   public static void main(String[] args) throws Exception {
	DatagramSocket client=new DatagramSocket(9998);//�ͻ��˱���ļ����˿�
	byte data[]=new byte [1024];//������Ϣ
	DatagramPacket packet=new DatagramPacket(data, data.length);//��������
	System.out.println("�ͻ��˵ȴ����շ��͵���Ϣ.........");
	client.receive(packet);//������Ϣ�����е���Ϣ����data�ֽ�����֮��
	System.out.println("���յ�����Ϣ����Ϊ��"+new String(data,0,packet.getLength()));
	client.close();
	
	
	
}
}
