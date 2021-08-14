package model;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.List;
import java.util.UUID;

public class QQ_Client implements Protocal {
    public static  Socket s;//创建嵌套字
    public static  ObjectInputStream oos;//输出流
    public static  ObjectOutputStream ios;//输入流 
    public static List<Detail>all;
    public static List<User>user;
    //初始化
    public static void update() throws Exception{
    	s=new Socket("127.0.0.1",12345);
    	oos=new ObjectInputStream(s.getInputStream());
    	ios=new ObjectOutputStream(s.getOutputStream());
    }
//登录功能
    public static User login(String number,String password) throws Exception{
    	update();
    	ios.writeInt(LOGIN);
    	ios.flush();
    	ios.writeUTF(number);
    	ios.flush();
    	ios.writeUTF(password);
    	ios.flush();
    	User user=(User) oos.readObject();
    	ios.close();
    	oos.close();
    	return user;
    }
//注册
    public static void regtster(String number, String password) throws Exception{
    	update();
    	UUID uid=UUID.randomUUID();
    	String ip=uid.randomUUID().toString();//产生ip地址
    	ios.writeInt(REGISTER);
    	ios.flush();
    	ios.writeUTF(number);
    	ios.flush();
    	ios.writeUTF(password);
    	ios.flush();
    	ios.writeUTF(ip);
    	ios.flush();
    	ios.close();
    	oos.close();
    }
//发送消息
    public static void send(String detail,String ip,String number,String sender)throws Exception{
    	update();
    	ios.writeInt(SEND);
    	ios.flush();
    	ios.writeUTF(detail);
    	ios.flush();
    	ios.writeUTF(ip);
    	ios.flush();
    	ios.writeUTF(sender);
    	ios.flush();
    	ios.writeUTF(number);
    	ios.flush();
    	ios.close();
    	oos.close();
    	
    }
//添加好友
    public static void add(int id,String number)throws Exception{
    	update();
    	ios.writeInt(ADD);
    	ios.flush();
    	ios.writeUTF(number);
    	ios.flush();
    	ios.writeInt(id);//自己的id
    	ios.flush();
    	ios.close();
    	ios.close();
    }
    //查看消息
    public static List<Detail> check(String sender,String number) throws Exception{
    	update();
    	ios.writeInt(CHECK);
    	ios.flush();
    	ios.writeUTF(sender);
    	ios.flush();
    	ios.writeUTF(number);
    	ios.flush();
    	all=(List<Detail>) oos.readObject();
    	ios.close();
    	oos.close();
    	return all;
    	
    }
    //获取好友
    public static List<User> fliend(String number) throws Exception{
    	update();
    	ios.writeInt(FILEND);
    	ios.flush();
    	ios.writeUTF(number);
    	ios.flush();
    	user=(List<User>) oos.readObject();
    	ios.close();
    	oos.close();
    	return user;
    }
}
