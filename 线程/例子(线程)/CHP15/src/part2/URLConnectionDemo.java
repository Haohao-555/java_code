package part2;
//����վд���ݺͶ�����
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.URL;
import java.net.URLConnection;
public class URLConnectionDemo {
	public static void main(String args[]) {
		try {
			//�������Ӷ���
			URL t = new URL(
					"http://dzx.nfu.edu.cn/show.php?contentid=1340");
			URLConnection uc = t.openConnection();
			uc.setDoOutput(true);
			//���������д����
			PrintStream out = new PrintStream(uc.getOutputStream());
			out.println("123456");
			out.close();
			//�ӷ������˶�����
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
