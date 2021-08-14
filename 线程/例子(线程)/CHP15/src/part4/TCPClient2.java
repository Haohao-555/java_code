package part4;

import java.io.IOException;
import java.io.*;
import java.net.*;

public class TCPClient2 {

	/**
	 * @param args
	 */
	public TCPClient2() {
		try {
			Socket s = new Socket("localhost", 5432);
			ObjectOutputStream oos = new ObjectOutputStream(s.getOutputStream());
			ObjectInputStream ois = new ObjectInputStream(s.getInputStream());
			// System.out.println("���͸�����������Ϣ��");

			oos.writeUTF("hello");
			oos.flush();
			String str = ois.readUTF();
			System.out.println("���յ�����������Ϣ��" + str);
			ois.close();
			oos.close();
			s.close();

		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TCPClient2();
	}

}
