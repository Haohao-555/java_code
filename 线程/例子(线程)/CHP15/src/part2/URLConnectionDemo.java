package part2;
//向网站写数据和读数据
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.URL;
import java.net.URLConnection;
public class URLConnectionDemo {
	public static void main(String args[]) {
		try {
			//创建连接对象
			URL t = new URL(
					"http://dzx.nfu.edu.cn/show.php?contentid=1340");
			URLConnection uc = t.openConnection();
			uc.setDoOutput(true);
			//向服务器端写数据
			PrintStream out = new PrintStream(uc.getOutputStream());
			out.println("123456");
			out.close();
			//从服务器端读数据
			BufferedReader in = new BufferedReader(new InputStreamReader(uc
					.getInputStream()));
			String line;
			while ((line = in.readLine()) != null) {
				System.out.println(line);
			}
			in.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
