package part4;
import java.io.IOException;
import java.net.*;
import java.io.*;
public class TCPServer1 {
	
	public static void main(String args[]){
		ServerSocket s = null;
		Socket s1;
		String st;
		try {
			//(1)����һ��ServerSocket
			 s = new ServerSocket(5432);
			//(2)�����˿ڣ����տͻ��˵���������
			s1 = s.accept();
			//(3)�������ӣ�ͨ��Socket����������,���տͻ��˵���������
			BufferedReader in = new BufferedReader(new InputStreamReader(s1.getInputStream()));
			
			//(4)�������ӣ�ͨ��Socket������������������ݸ��ͻ���
			PrintStream out = new PrintStream(s1.getOutputStream());
			
			//������׼�����������ռ�������
			BufferedReader bw = new BufferedReader(new InputStreamReader(System.in));
			//
			System.out.println("waitting~~~~~");
			st = in.readLine();
			System.out.println("���տͻ������ݣ�" + st);
			
			System.out.print("��ͻ��˷������ݣ�");
			st = bw.readLine();
			out.println(st);
			
			out.close();
			in.close();
			s1.close();
			s.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
