package part4;

import java.net.*;
import java.io.*;

public class TCPServer{
	public static void main(String args[]){
		ServerSocket s = null;
		Socket s1;
		String st;

		// ͨ��5432�˿ڽ�������
		try{
			s = new ServerSocket(5432);
			// �����˿����󣬵ȴ�����
			s1 = s.accept();
			//�������ӣ�ͨ��Socket���������ϵ�������
			BufferedReader in = new BufferedReader(new InputStreamReader(s1.getInputStream()));
			//�������ӣ�ͨ��Socket���������ϵ������
			PrintStream out = new PrintStream(s1.getOutputStream());
			//������׼��������ͨ�����̽�������
			BufferedReader userin = new BufferedReader(new InputStreamReader(System.in));
			while (true){

				System.out.println("waiting...");

				st = in.readLine();
				System.out.println("���յ��ͻ��˵�����Ϊ��" + st);
				if(st.equals("over"))
					break;
				System.out.println();
				System.out.print("��ͻ��˷������ݣ�");
				st = userin.readLine();
				out.println(st);
				if(st.equals("over"))
					break;
			}
			out.close();
			in.close();
			s1.close();
			s.close();
			
		}catch(IOException e){ 
			System.out.println("IOException is:" + e.getMessage());
		}
	}
}
