package part3;
//��ѯ������IP��ַ
import java.net.InetAddress;
import java.net.UnknownHostException;
public class GetHostAddress {
	public static void main(String args[]){
		try{
			InetAddress hd = InetAddress.getLocalHost();
			System.out.println("����������IP��ַΪ��" + hd);
		}catch(UnknownHostException e){
			System.out.println("UnknownHostException�쳣Ϊ��" + e.getMessage());
			e.printStackTrace();
		}
	}
}
/*InetAddress��û�й��췽��������ͨ��InetAddress���ṩ�ľ�̬�����������������
*/