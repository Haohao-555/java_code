package Server;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPServer {
   public static void main(String[] args) throws Exception {
	DatagramSocket server=new DatagramSocket(9000);//����������ļ����˿�
    String str="123456";
	DatagramPacket packet=new DatagramPacket(str.getBytes(),0, str.length(),InetAddress.getByName("localhost"),9998);//���͵���Ϣ
	server.send(packet);
	System.out.println("��Ϣ�������");
	server.close();

	
}
} 
