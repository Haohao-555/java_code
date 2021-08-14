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
	public static Socket s;//����Ƕ����
	public static ObjectInputStream ios;//������
	public static ObjectOutputStream oos;//�����
	public static ServerSocket ss;
	public static List<Detail> all;//��Ϣ
	public static List<User> alluser;
	public void QQ_Server() throws Exception{
		ss=new ServerSocket(12345);//���ö˿ں�
		new Thread(this).start();//�½��߳�
	}
	@Override
	public void run() {
		try{
			while(true){
				s=ss.accept();//���Ͻ��տͻ��˵���Ϣ
				ios=new ObjectInputStream(s.getInputStream());
				oos=new ObjectOutputStream(s.getOutputStream());
				int command=ios.readInt();//����Э���е���Ϣ
				
				//******�������Э���жϿͻ�����Ҫ�Ĺ��ܽ��е��÷���*****
				if(command==LOGIN){//��¼����
					this.login();
				}else if(command==REGISTER){//ע��
					this.regtster();
				}else if(command==SEND){//������Ϣ
					this.send();
				}else if(command==ADD){//��Ӻ���
					this.add();
				}else if(command==CHECK){//�鿴��Ϣ
					this.check();
				}else if(command==FILEND){//��ȡ����
					this.filend();
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	                             //���й��ܷ���
//��¼����
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
//ע�� 
    public void regtster() throws Exception{
    	String number=ios.readUTF();
    	String password=ios.readUTF();
    	String ip=ios.readUTF();
    	String sql = "insert into user(number,password,ip) values('"+number+"','"+password+"','"+ip+"')";
        DataConnect.getStat().executeUpdate(sql);
        oos.close();
 	    ios.close();
    }
//������Ϣ
    public void send() throws Exception{
    	String detail=ios.readUTF();
    	String ip=ios.readUTF();
    	String sender=ios.readUTF();
    	String number=ios.readUTF();//������
    	String sql= "insert into detail(detail,ip,sender,number) values('"+detail+"','"+ip+"','"+sender+"','"+number+"')";
        DataConnect.getStat().executeUpdate(sql);
        oos.close();
 	    ios.close();
    }
//��Ӻ���
    public void add() throws Exception{
    	String number=ios.readUTF();//�Լ����˺�
    	int id=ios.readInt();//����Ӻ��ѵ�id
    	//��id���д���
    	String key=this.chuli(id,number);
    	//������key���и���
    	String sql="update user set key='"+key+"' where number="+number+"";
    	DataConnect.getStat().executeUpdate(sql);
    	oos.close();
 	    ios.close();
    }
//�鿴��Ϣ
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
    
 //��ȡ����
    public void filend() throws Exception{
    	List<Integer>key=new ArrayList<Integer>();
    	String number=ios.readUTF();//�Լ����˺�
    	String allkey=hkey(number);//��ȡkey
    	key=jkey(allkey);//����
    	for(int i=0;i<key.size();i++){
    		int j=key.get(i);//����
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
    //��key���д���(��Ӻ���)
    private static String chuli(int id,String number) throws Exception{
    	//ͨ��number���Ҿɵ�key
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
    //��ȡkeyֵ
   private static String hkey(String number) throws Exception{
    	String allkey=null;
    	String sql = "select * from user where number='"+number+"'";
    	ResultSet rs = DataConnect.getStat().executeQuery(sql);
    	if(rs.next()){
    		allkey=rs.getString(5);
    	}
    	return allkey;
    }
	//����key
   private static List jkey(String allkey){
    	List<Integer>key=new ArrayList<Integer>();
    	String regex="\\d+\\/";//������ʽ
    	Pattern pat=Pattern.compile(regex);//����������ʽ����֣�
		Matcher mat=pat.matcher(allkey);//����ƥ��
		while(mat.find()){
			String regexe="/";
			Integer i=Integer.parseInt(mat.group(0).replaceAll(regexe, ""));//�����ͽ���װ��
			key.add(i);
			System.out.println(mat.group(0).replaceAll(regexe, ""));
		}
    	return key;
    }
  
}
