package tcpchat;

import java.io.*;
import java.net.*;

public class Client implements ChatProtocol{
	ObjectOutputStream oos;
	ObjectInputStream ois;
	public Client() throws UnknownHostException, IOException{
		Socket s = new Socket("10.10.194.8",12341);	//端口号和IP要改
		oos =new ObjectOutputStream(s.getOutputStream());
		ois =new ObjectInputStream(s.getInputStream());
		
	}
	
	public boolean login(String name) throws IOException{
		oos.writeInt(LOGIN);
		oos.flush();
		oos.writeUTF(name);
		oos.flush();
		return ois.readBoolean();
	}
	public String send(String name,String msg) throws IOException{
		oos.writeInt(SEND);
		oos.flush();
		oos.writeUTF(name);
		oos.flush();
		oos.writeUTF(msg);
		oos.flush();
		return ois.readUTF();
	}
	public String flash() throws IOException{
		oos.writeInt(FLASH);
		oos.flush();
		return ois.readUTF();
	}
}
