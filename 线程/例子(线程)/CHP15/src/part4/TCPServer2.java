package part4;

import java.io.IOException;
import java.io.*;
import java.net.*;

public class TCPServer2 {

	/**
	 * @param args
	 */
	public TCPServer2() {
		ServerSocket s;
		try {
			s = new ServerSocket(5432);
			Socket s1;
			s1 = s.accept();
			ObjectInputStream ois = new ObjectInputStream(s1.getInputStream());
			ObjectOutputStream oos = new ObjectOutputStream(s1
					.getOutputStream());

			String str = ois.readUTF();
			System.out.println("���տͻ��˵�������Ϣ��" + str);

			// System.out.print("�������������ݸ��ͻ��ˣ�");
			oos.writeUTF("hi");
			oos.flush();

			ois.close();
			oos.close();
			s1.close();
			s.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TCPServer2();
	}

}
