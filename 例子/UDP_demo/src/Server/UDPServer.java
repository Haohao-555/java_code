package Server;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPServer {
   public static void main(String[] args) throws Exception {
	DatagramSocket server=new DatagramSocket(9000);//服务器本身的监听端口
    String str="123456";
	DatagramPacket packet=new DatagramPacket(str.getBytes(),0, str.length(),InetAddress.getByName("localhost"),9998);//发送的消息
	server.send(packet);
	System.out.println("消息发送完毕");
	server.close();

	
}
} 
