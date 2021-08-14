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
			s.setSoTimeout(5000);//���ó�ʱʱ��
			String ms = "UDP message!";
			byte[] data = ms.getBytes();//�����ֽ�����
			InetAddress ad = InetAddress.getByName(null);
			DatagramPacket pk = new DatagramPacket(data, data.length,ad,5432);
			System.out.println("���͵����ݱ��ǣ�" + ms);
			s.send(pk);//�������ݱ�
			byte[] buf = new byte[1024];
			pk = new DatagramPacket(buf,buf.length);
			s.receive(pk);//�������ݱ�
			String inms = new String(pk.getData(),0,pk.getLength());

			System.out.println("Ŀ��������ַΪ��" + pk.getAddress());
			System.out.println("Ŀ�������˿�Ϊ��" + pk.getPort());
			System.out.println("���յ����ݱ���Ϣ��" + inms);//��ȡ���ݱ���Ϣ
		
		}catch(IOException e){
			System.out.println("IOException" + e.getMessage());
			e.printStackTrace();
		}finally{
			System.out.println("UDP is over!");
			s.close();//ͨ�Ž������ر�Socket
		}
	}
}
