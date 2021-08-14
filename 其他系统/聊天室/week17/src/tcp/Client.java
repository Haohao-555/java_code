package tcp;

import java.io.*;
import java.net.*;

public class Client {

	public Client() throws UnknownHostException, IOException{
		Socket s = new Socket("127.0.0.1",12356);
		
		ObjectOutputStream oos =new ObjectOutputStream(s.getOutputStream());
		ObjectInputStream ois =new ObjectInputStream(s.getInputStream());
		
		oos.writeInt(11);
		oos.flush();
		int n = ois.readInt();
		
		System.out.println(n);
		
	}
	public static void main(String[] args) {
		try {
			new Client();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
