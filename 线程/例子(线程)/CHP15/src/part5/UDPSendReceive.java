package part5;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
public class UDPSendReceive {
	public static void main(String[] args) {
		DatagramSocket s = null;
		try{
			s = new DatagramSocket(5432);
			s.setSoTimeout(5000);//设置超时时间
			String ms = "UDP message!";
			byte[] data = ms.getBytes();//创建字节数组
			InetAddress ad = InetAddress.getByName(null);
			DatagramPacket pk = new DatagramPacket(data, data.length,ad,5432);
			System.out.println("发送的数据报是：" + ms);
			s.send(pk);//发送数据报
			byte[] buf = new byte[1024];
			pk = new DatagramPacket(buf,buf.length);
			s.receive(pk);//接收数据报
			String inms = new String(pk.getData(),0,pk.getLength());

			System.out.println("目标计算机地址为：" + pk.getAddress());
			System.out.println("目标计算机端口为：" + pk.getPort());
			System.out.println("接收的数据报信息：" + inms);//获取数据报信息
		
		}catch(IOException e){
			System.out.println("IOException" + e.getMessage());
			e.printStackTrace();
		}finally{
			System.out.println("UDP is over!");
			s.close();//通信结束，关闭Socket
		}
	}
}
