package Client;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPClient {
   public static void main(String[] args) throws Exception {
	DatagramSocket client=new DatagramSocket(9998);//客户端本身的监听端口
	byte data[]=new byte [1024];//接收消息
	DatagramPacket packet=new DatagramPacket(data, data.length);//接收数据
	System.out.println("客户端等待接收发送的消息.........");
	client.receive(packet);//接收消息，所有的信息都在data字节数组之中
	System.out.println("接收到的信息内容为："+new String(data,0,packet.getLength()));
	client.close();
	
	
	
}
}
