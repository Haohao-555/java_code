package tcpchat;

import java.io.*;
import java.net.*;
import java.util.ArrayList;

public class Server implements ChatProtocol{

	ObjectInputStream ois;
	ObjectOutputStream oos;
	Socket s;
	public Server() throws IOException {
		ServerSocket ss = new ServerSocket(12341);
		while (true) {
			 s = ss.accept();
			ois = new ObjectInputStream(s.getInputStream());
			oos = new ObjectOutputStream(s.getOutputStream());
			int command = ois.readInt();
			if(command==LOGIN){
				login();
			}else if(command == SEND){
				send();
			}else if(command == FLASH){
				falsh();
			}

		}
	}
	private void falsh() throws IOException {
		oos.writeUTF(content);
		oos.flush();
	}
	ArrayList<String> names = new ArrayList<String>();
	public void login() throws IOException{
		String name = ois.readUTF();
		boolean active = false;
		if(!names.contains(name)){
			names.add(name);
			active =true;
		}
		oos.writeBoolean(active);
		oos.flush();
	}
	String content="»¶Ó­µÇÂ½ÏµÍ³\n";
	public void send() throws IOException{
		String name =ois.readUTF();
		String msg =ois.readUTF();
		content+=name+":"+msg+"/"+s.getInetAddress();
		content+="\n";
		System.out.println(content);
		oos.writeUTF(content);
		
		oos.flush();
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
