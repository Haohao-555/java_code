package model;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class QQ_Server implements Runnable,Protocal {
	public static Socket s;//创建嵌套字
	public static ObjectInputStream ios;//输入流
	public static ObjectOutputStream oos;//输出流
	public static ServerSocket ss;
	public static List<Detail> all;//消息
	public static List<User> alluser;
	public void QQ_Server() throws Exception{
		ss=new ServerSocket(12345);//设置端口号
		new Thread(this).start();//新建线程
	}
	@Override
	public void run() {
		try{
			while(true){
				s=ss.accept();//不断接收客户端的消息
				ios=new ObjectInputStream(s.getInputStream());
				oos=new ObjectOutputStream(s.getOutputStream());
				int command=ios.readInt();//接收协议中的消息
				
				//******下面根据协议判断客户端想要的功能进行调用方法*****
				if(command==LOGIN){//登录功能
					this.login();
				}else if(command==REGISTER){//注册
					this.regtster();
				}else if(command==SEND){//发送消息
					this.send();
				}else if(command==ADD){//添加好友
					this.add();
				}else if(command==CHECK){//查看消息
					this.check();
				}else if(command==FILEND){//获取好友
					this.filend();
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	                             //所有功能方法
//登录功能
    public void login() throws Exception{
    	String number=ios.readUTF();
    	String password=ios.readUTF();
    	String sql = "select * from user where number='"+number+"' and password = '"+password+"'";
    	ResultSet rs = DataConnect.getStat().executeQuery(sql);
    	User u=null;
    	   if(rs.next())
    			u=new User(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4));
    		  oos.writeObject(u);
    	      oos.flush();  
    	      oos.close();
    	 	  ios.close();
    }
//注册 
    public void regtster() throws Exception{
    	String number=ios.readUTF();
    	String password=ios.readUTF();
    	String ip=ios.readUTF();
    	String sql = "insert into user(number,password,ip) values('"+number+"','"+password+"','"+ip+"')";
        DataConnect.getStat().executeUpdate(sql);
        oos.close();
 	    ios.close();
    }
//发送消息
    public void send() throws Exception{
    	String detail=ios.readUTF();
    	String ip=ios.readUTF();
    	String sender=ios.readUTF();
    	String number=ios.readUTF();//接收者
    	String sql= "insert into detail(detail,ip,sender,number) values('"+detail+"','"+ip+"','"+sender+"','"+number+"')";
        DataConnect.getStat().executeUpdate(sql);
        oos.close();
 	    ios.close();
    }
//添加好友
    public void add() throws Exception{
    	String number=ios.readUTF();//自己的账号
    	int id=ios.readInt();//被添加好友的id
    	//对id进行处理
    	String key=this.chuli(id,number);
    	//对数据key进行更新
    	String sql="update user set key='"+key+"' where number="+number+"";
    	DataConnect.getStat().executeUpdate(sql);
    	oos.close();
 	    ios.close();
    }
//查看消息
    public void check() throws Exception{
    	String sender=ios.readUTF();
    	String number=ios.readUTF();
    	String sql = "select * from detail where sender='"+sender+"'and number='"+number+"'";
    	ResultSet rs = DataConnect.getStat().executeQuery(sql);
    	while(rs.next()){
    		all.add(new Detail(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)));
    		
    	}
    	oos.writeObject(all);
 	    oos.flush();
 	    oos.close();
 	    ios.close();
    }
    
 //获取好友
    public void filend() throws Exception{
    	List<Integer>key=new ArrayList<Integer>();
    	String number=ios.readUTF();//自己的账号
    	String allkey=hkey(number);//获取key
    	key=jkey(allkey);//解码
    	for(int i=0;i<key.size();i++){
    		int j=key.get(i);//拆箱
    		String sql = "select * from user where id="+j+"";
        	ResultSet rs = DataConnect.getStat().executeQuery(sql);
        if(rs.next()){
        	alluser.add(new User(rs.getInt(0),rs.getString(1),rs.getString(2),rs.getString(3)));
        }
    	}
    	oos.writeObject(alluser);
    	oos.close();
    	ios.close();
    }
    //对key进行处理(添加好友)
    private static String chuli(int id,String number) throws Exception{
    	//通过number查找旧的key
    	String old_key = null;
    	String key;
    	String sql = "select * from user where number='"+number+"'";
    	ResultSet rs = DataConnect.getStat().executeQuery(sql);
    	if(rs.next()){
    		 old_key = rs.getString(5);
    	}
    	StringBuffer but=new StringBuffer(old_key);	 
    	key=but.append("+"+Integer.toString(id)).toString();
    	return key;
    }
    //获取key值
   private static String hkey(String number) throws Exception{
    	String allkey=null;
    	String sql = "select * from user where number='"+number+"'";
    	ResultSet rs = DataConnect.getStat().executeQuery(sql);
    	if(rs.next()){
    		allkey=rs.getString(5);
    	}
    	return allkey;
    }
	//解析key
   private static List jkey(String allkey){
    	List<Integer>key=new ArrayList<Integer>();
    	String regex="\\d+\\/";//正则表达式
    	Pattern pat=Pattern.compile(regex);//编译正则表达式（拆分）
		Matcher mat=pat.matcher(allkey);//进行匹配
		while(mat.find()){
			String regexe="/";
			Integer i=Integer.parseInt(mat.group(0).replaceAll(regexe, ""));//将整型进行装箱
			key.add(i);
			System.out.println(mat.group(0).replaceAll(regexe, ""));
		}
    	return key;
    }
  
}
