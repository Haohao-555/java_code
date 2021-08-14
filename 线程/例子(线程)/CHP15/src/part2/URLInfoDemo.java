package part2;
//创建URL对象
import java.net.URL;
import java.net.MalformedURLException;
public class URLInfoDemo {
	public static void createURL() {
		try{
			URL url = new URL("http://www.sysu.edu.cn/~vmis/java.html");
			System.out.println("The protocol is:" + url.getProtocol());
			System.out.println("The host is:" + url.getHost());
			System.out.println("The port is:" + url.getPort());
			System.out.println("The file is:" + url.getFile());
		}catch(MalformedURLException e){
			System.out.println("MalformedURLException exception" + e.getMessage());
			e.printStackTrace();
		}
	}
	public static void main(String args[]){
		createURL();
	}
}
