package part4;

import java.net.*;
import java.io.*;
public class TCPClient {
	public static void main(String args[]) throws IOException{
		try{
			// 	�ڶ˿�5432������
			Socket s1 = new Socket("localhost", 5432);
			// ���socket�˿ڵ��������������ж�ȡ����
			//InputStream s1In = s1.getInputStream();
			BufferedReader in = new BufferedReader(new InputStreamReader(s1.getInputStream()));
			//ͨ��Socket��ȡ�����ϵ�������
			PrintStream out = new PrintStream(s1.getOutputStream());
			BufferedReader userin = new BufferedReader(new InputStreamReader(System.in));
			//������׼��������Ӽ��̽�������
			String st;
			while(true){
				System.out.print("�ͻ��˶˷�����Ϣ��");
				st = userin.readLine();//�ӱ�׼���������
				
				out.println(st);//���͸�������
				if(st.equals("over"))
					break;
				System.out.println("waiting...");
				st = in.readLine();//��ȡ��������������
				System.out.println("�ͻ��˽��շ���������Ϣ��" + st);
				if(st.equals("over"))
					break;		
			}
			//	�����������ر���������socket����
			out.close();
			in.close();
			s1.close();
		}catch(Exception e){
			System.out.println("Exception��" + e.getMessage());
		}
	}
}
