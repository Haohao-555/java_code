package part3;
/*����ĳ����վ��IP��ַ
*/
import java.net.*;
public class GetInternetIP {
	public static void main(String args[]){
			InetAddress hd = null;
			try{
				hd = InetAddress.getByName("www.baidu.com");
				System.out.println(hd);
			}catch(UnknownHostException e) {
			System.out.println("UnknownHostException exception" + e.getMessage());
			e.printStackTrace();				
			}
		}
}
