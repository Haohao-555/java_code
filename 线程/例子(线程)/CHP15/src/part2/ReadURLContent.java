package part2;
//��ȡ��վ��Ϣ
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
/*java.net���е�URL���URLConnection������URL�йص�������Ҫ���ࡣURL�����һ��ͳһ��Դ��λ�������౻����Ϊfinal
 * ���͡�URLConnection��������ʾӦ�ó����URL֮���ͨ�����ӣ�����һ�������ࡣURL���URLConnection���з�װ�˿��Դ�
 * Զ��վ���ȡ��Ϣ
 */
