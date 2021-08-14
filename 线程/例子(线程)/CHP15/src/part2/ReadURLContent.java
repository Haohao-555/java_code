package part2;
//读取网站信息
import java.net.URL;
import java.net.MalformedURLException;
import java.io.*;
public class ReadURLContent {
	public static void main(String args[]) {
		URL url = null;
		String readstring;
		DataInputStream dis;
		try {
		    //url = new URL("http://dzx.nfu.edu.cn/");
			url = new URL("http://www.baidu.com/");
			dis = new DataInputStream(url.openStream());
			while ((readstring = dis.readLine()) != null) {
				System.out.println(readstring);
			}
			System.out.println("***** end of the file *****");
			dis.close();
		} catch (MalformedURLException e) {
			System.out.println("MalformedURLException: " + e);
		} catch (IOException e) {
			System.out.println("IOException: " + e);
		}
	}
}
/*java.net包中的URL类和URLConnection类是与URL有关的两个重要的类。URL类代表一个统一资源定位符，该类被定义为final
 * 类型。URLConnection类用来表示应用程序和URL之间的通信连接，它是一个抽象类。URL类和URLConnection类中封装了可以从
 * 远程站点获取信息
 */
