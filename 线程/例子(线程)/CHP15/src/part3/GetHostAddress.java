package part3;
//查询本机的IP地址
import java.net.InetAddress;
import java.net.UnknownHostException;
public class GetHostAddress {
	public static void main(String args[]){
		try{
			InetAddress hd = InetAddress.getLocalHost();
			System.out.println("本地主机的IP地址为：" + hd);
		}catch(UnknownHostException e){
			System.out.println("UnknownHostException异常为：" + e.getMessage());
			e.printStackTrace();
		}
	}
}
/*InetAddress类没有构造方法，可以通过InetAddress类提供的静态方法来创建该类对象。
*/