package tcp;

import java.io.*;
import java.net.*;

public class Server {

	public Server() throws IOException{
		ServerSocket ss = new ServerSocket(12356);
		int i=1;
		while(true){
			Socket s = ss.accept();
			System.out.println("µÚ"+i+"ÓÃ»§µÇÂ¼");
			i++;
			ObjectInputStream ois =new ObjectInputStream(s.getInputStream());
			ObjectOutputStream oos =new ObjectOutputStream(s.getOutputStream());
			
			int n = ois.readInt();
			oos.writeInt(n*n);
			oos.flush();
		}
	}
	public static void main(String[] args) {
		try {
			new Server();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
