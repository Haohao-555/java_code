package part5;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
public class UDPInfo {
	public static void main(String[] args) {
		try{
			String ms = "UDP Datagram Example";//�����ַ���
			byte[] data = ms.getBytes();  //�����ֽ�����
			InetAddress ad = InetAddress.getByName(null);//null��ʾ��ȡ���Ǽ�����ı��ص�ַ
			DatagramPacket pk = new DatagramPacket(data, data.length,ad,1234);
			System.out.println("�յ��������ǣ�");
			for(int i = 0; i < pk.getData().length; i++){
				System.out.print((char)pk.getData()[i]);//��ȡ���ݱ��е��ֽ�����
			}
			System.out.println();
			System.out.println("���ݱ����ֽ����鳤��Ϊ��" + pk.getLength());
			System.out.println("Ŀ��������ַΪ��" + pk.getAddress());
			System.out.println("Ŀ�������˿�Ϊ��" + pk.getPort());
		}catch(IOException e){
			System.out.println("IOException" + e.getMessage());
			e.printStackTrace();
		}
	}
}
