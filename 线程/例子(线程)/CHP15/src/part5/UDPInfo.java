package part5;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
public class UDPInfo {
	public static void main(String[] args) {
		try{
			String ms = "UDP Datagram Example";//发送字符串
			byte[] data = ms.getBytes();  //创建字节数组
			InetAddress ad = InetAddress.getByName(null);//null表示获取的是计算机的本地地址
			DatagramPacket pk = new DatagramPacket(data, data.length,ad,1234);
			System.out.println("收到的数据是：");
			for(int i = 0; i < pk.getData().length; i++){
				System.out.print((char)pk.getData()[i]);//获取数据报中的字节数组
			}
			System.out.println();
			System.out.println("数据报的字节数组长度为：" + pk.getLength());
			System.out.println("目标计算机地址为：" + pk.getAddress());
			System.out.println("目标计算机端口为：" + pk.getPort());
		}catch(IOException e){
			System.out.println("IOException" + e.getMessage());
			e.printStackTrace();
		}
	}
}
