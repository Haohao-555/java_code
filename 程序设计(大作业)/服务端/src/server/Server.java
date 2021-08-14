package server;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.DataConnect;
import model.Jworker;
import model.Message;
import model.Request;
import model.Suggest;
import model.User;
import model.Work;
public class Server implements Protocal,Runnable{
	public static Socket s;//�����׽���
	public static ObjectInputStream ios;//������
	public static ObjectOutputStream oos;//�����
	public static ServerSocket ss;
	//ServerSocket
 public  Server(int id) throws Exception{
	    ss=new ServerSocket(id);
	    Thread t = new Thread(this);
		t.start();
		}
 @Override
public void run(){
	 try{
	 while(true){
		    s=ss.accept();//�õ��������˿ڴӿͻ��˹�������Ϣ�����丳���׽���
			ios=new ObjectInputStream(s.getInputStream());
			oos=new ObjectOutputStream(s.getOutputStream());
			int command=ios.readInt();//��ȡ�ͻ��˵�Ҫ��
			if(command==A_LOGIN){
				this.Ulogin();
			}if(command==KCHECK){
				this.kcheck();
			}if(command==ADVISE){
				this.advise();
			}if(command==KSEND){
				this.ksend();
			}if(command==A_ALTERPW){
				this.alterpw();
			}if(command==REGISTER){
				this.register();
			}if(command==KIN){
				this.kin();
			}if(command==KOUT){
				this.kout();
			}if(command==W_ALTERPW){
				this.walter_pw();
			}if(command==CHECK_SUGGEST){
				this.check_suggest();
			}if(command==CHECK_ALL_SUGGEST){
				this.check_allsuggest();
			}if(command==CKECK_KNUMBER){
				this.check_knumber();
			}if(command==CHECK_JMESSAGE){
				this.check_jmessage();
			}if(command==UPDATE){
				this.update();
			}if(command==W_LOGIN){
				this.W_login();
			}if(command==GAIN_ALL_K){
				this.gain_All_k();
			}if(command==GAINK){
				this.gain_k();
			}if(command==GAIN_K_MESSAGE){
				this.gain_k_message();
			}if(command==LEAVE){
				this.leave();
			}if(command==CHECK_WORK){
				this.check_work();
			}if(command==CHECK_ALL_REQUEST){
				this.check_ALL_request();
			}if(command==APPROVER){
				this.approve();
			}if(command==UPDATE_REQUEST){
				this.update_request();
			}if(command==CHECK_REQUEST){
				this.check_request();
			}if(command==ARRANGE){
				this.arrange();
			}if(command==INSERT){
				this.insert();
			}if(command==DELETE_WORKER){
				this.delete_worker();
			}if(command==CHECK_WORKER){
				this.check_worker();
			}if(command==CHECK_OW){
				this.check_ow();
			}
		}
	 }catch(Exception e){
			e.printStackTrace();
		}
 }

//��¼*
public void Ulogin() throws Exception{
	String number=ios.readUTF();
	String pw=ios.readUTF();
	String sql = "select * from user where number='"+number+"' and pw = '"+pw+"'";
	ResultSet rs = DataConnect.getStat().executeQuery(sql);
	User u=null;
	   if(rs.next())
			u=new User(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),
					rs.getString(5),rs.getString(6));
	   oos.writeObject(u);
	   oos.flush();  
}


//�鿴�����Ϣ*
public void kcheck() throws Exception{
	ArrayList<Message> message = new ArrayList<Message>();
	String name=ios.readUTF();
	String condition=ios.readUTF();
	String sql = "select * from message where sname='"+name+"'";
	ResultSet rs = DataConnect.getStat().executeQuery(sql);
	   while(rs.next()){
		   if(rs.getString(12).equals(condition)){
		   message.add(new Message(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),
				   rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),
				   rs.getString(11),rs.getString(12),rs.getString(13),rs.getString(14))); 
	       }
	   }
	   oos.writeObject(message);
	   oos.flush();  
}

//�Ὠ��
public void advise() throws Exception{
	String name=ios.readUTF();
	String phone=ios.readUTF();
	String detail=ios.readUTF();
	String condition="δ��";
	String sql = "insert into suggest(name,phone,detail,scondition)values" +
			"( '"+name+"' , '"+phone+"','"+detail+"','"+condition+"')";
	DataConnect.getStat().executeUpdate(sql);
}

//�Ŀ��
public void ksend() throws Exception{
	
	String ktype=ios.readUTF();
	String jname=ios.readUTF();
	String sname=ios.readUTF();
	String jsite=ios.readUTF();
	String ssite=ios.readUTF();
	String kweight=ios.readUTF();
	String kprice=ios.readUTF();
	String jphone=ios.readUTF();
	String sphone=ios.readUTF();
	String kcondition=ios.readUTF();
	String sql="insert into jkd(ktype,jname,sname,jsite,ssite,kweight,kprice,jphone,sphone,kcondition)" +
			"values('"+ktype+"','"+jname+"','"+sname+"','"+jsite+"','"+ssite+"','"+kweight+"','"+kprice+"','"+jphone+"','"+sphone+"','"+kcondition+"')";
	DataConnect.getStat().executeUpdate(sql);
}
//��ȡȡ����*
  public void check_knumber() throws SQLException, ClassNotFoundException, IOException{
	  Message message=null;
	  int id=ios.readInt();
	  String sql = "select * from message where id="+id+"";
	  ResultSet rs = DataConnect.getStat().executeQuery(sql);
	  if(rs.next()){
		  message=new Message(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),
				   rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getString(13),rs.getString(14));
	  }
	  oos.writeObject(message);
	  oos.flush();  
  }

//�޸ĵ�¼����(�û�)*
public void alterpw() throws Exception{
	String name=ios.readUTF();
	String number=ios.readUTF();
	String xpw=ios.readUTF();
	String sql="update user set pw='"+xpw+"' where name='"+name+"'and number='"+number+"'";
	DataConnect.getStat().executeUpdate(sql);
}

//ע��*
public void register()throws Exception{
	String name=ios.readUTF();
	String phone=ios.readUTF();
	String site=ios.readUTF();
	String pw=ios.readUTF();
	String number=ios.readUTF();
	String sql1 = "insert into user(name,phone,site,pw,number) values" +
			"('"+name+"','"+phone+"','"+site+"','"+pw+"','"+number+"')";
	DataConnect.getStat().executeUpdate(sql1);
}
//�鿴�ļ������*
   public void check_jmessage() throws SQLException, ClassNotFoundException, IOException{
	   ArrayList<Message> message = new ArrayList<Message>();
	   String name=ios.readUTF();
	   String sql = "select * from jkd where jname='"+name+"'";
	   ResultSet rs = DataConnect.getStat().executeQuery(sql);
		 while(rs.next()){
			  message.add(new Message(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),
					   rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),null,rs.getString(11),null,null)); 
		   }
		   oos.writeObject(message);
		   oos.flush();  
   }
//���¼ļ�����Ϣ
   public void update() throws IOException, SQLException, ClassNotFoundException{
	   int id=ios.readInt();
	   String sql="delete from jkd where id ="+id+"";
	   DataConnect.getStat().executeUpdate(sql);
   }

//������
//���
public void leave() throws IOException, SQLException, ClassNotFoundException{
	String name=ios.readUTF();
	String number=ios.readUTF();
	String because=ios.readUTF();
	String needtime=ios.readUTF();
	String situation=ios.readUTF();
	String sql = "insert into request(name,beacuse,number,needtime,situations) " +
			"values('"+name+"','"+number+"','"+because+"','"+needtime+"','"+situation+"')";
	DataConnect.getStat().executeUpdate(sql);
}
//�鿴���
public void check_work() throws IOException, SQLException, ClassNotFoundException{
	String number=ios.readUTF();
	String sql = "select * from work_list where number= '" +number+ "'";
	ResultSet rs = DataConnect.getStat().executeQuery(sql);
	Work work = null;
	if (rs.next()){
		work = new Work(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
		}
	 oos.writeObject(work);
	 oos.flush();  
}
//�鿴������
public void check_request() throws IOException, SQLException, ClassNotFoundException{
	String number=ios.readUTF();
	ArrayList<Request> request = new ArrayList<Request>();
	String sql = "select * from request where number= '" + number + "'";
	ResultSet rs = DataConnect.getStat().executeQuery(sql);
	while (rs.next()) {
			request.add(new Request(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), 
					rs.getString(5), rs.getString(6), rs.getString(7)));
	}
	oos.writeObject(request);
	oos.flush();  
}
//������
public void kin() throws Exception{
	String ktype=ios.readUTF();
	String jname=ios.readUTF();
	String sname=ios.readUTF();
	String jsite=ios.readUTF();
	String ssite=ios.readUTF();
	String weight=ios.readUTF();
	String price=ios.readUTF();
	String jphone=ios.readUTF();
	String sphone=ios.readUTF();
	String knumber=ios.readUTF();
	String condition=ios.readUTF();
	String deadline=ios.readUTF();
	String sql = "insert into message(ktype,jname,sname,jsite,ssite,weight,price,jphone,sphone,knumber,kcondition,deadline)values('"+ktype+"','"+jname+"','"+sname+"','"+jsite+"','"+ssite+"'" +
	",'"+weight+"','"+price+"','"+jphone+"','"+sphone+"','"+knumber+"','"+condition+"','"+deadline+"')";
    DataConnect.getStat().executeUpdate(sql);
}
//��ݳ���
public void kout() throws Exception{
	String knumber=ios.readUTF();
	String name=ios.readUTF();
	String condition=ios.readUTF();
	//�ж��Ƿ��Ѿ�����
	String kconditions="δȡ��";
	String sq2="select * from message where kcondition='"+kconditions+"'and knumber='"+knumber+"'";
	ResultSet rs = DataConnect.getStat().executeQuery(sq2);
	if(rs.next()){
	String sql="update message set kcondition='"+condition+"' where sname='"+name+"'and knumber='"+knumber+"'";
	DataConnect.getStat().executeUpdate(sql);
	oos.writeUTF("ȡ���ɹ�");
	oos.flush();
	}
	else{
		oos.writeUTF("�üļ��ѱ�ȡ��");
		oos.flush();
	}
}


//��ʾȫ����ݵ�
public void gain_All_k() throws IOException, SQLException, ClassNotFoundException{
	ArrayList<Message> message = new ArrayList<Message>();
	String sql = "select * from jkd ";
	ResultSet rs = DataConnect.getStat().executeQuery(sql);
	while(rs.next()){
		if(rs.getString(11).equals("���Աδȡ��")){
			message.add(new Message(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),
					   rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),null,rs.getString(11),null,null)); 
		}
	}
		 oos.writeObject(message);
		 oos.flush();  
}
//��ȡ���
public void gain_k() throws IOException, SQLException, ClassNotFoundException{
	int id=ios.readInt();
	String kcondition="���Ա��ȡ��";
	String sql="update jkd set kcondition='"+kcondition+"' where id="+id+"";
	DataConnect.getStat().executeUpdate(sql);
	
}
//�鿴�ļ���ϸ��Ϣ
public void gain_k_message() throws IOException, SQLException, ClassNotFoundException{
	Message message=null;
	int id=ios.readInt();
	String sql = "select * from jkd where id="+id+"";
	ResultSet rs = DataConnect.getStat().executeQuery(sql);
	if(rs.next())
		 message=new Message(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),
				   rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10),null,rs.getString(11),null,null);
	 oos.writeObject(message);
	 oos.flush();  
}

//�޸ĵ�¼����(������Ա)
public void walter_pw() throws Exception{
	String name=ios.readUTF();
	String number=ios.readUTF();
	String xpw=ios.readUTF();
	String pw=ios.readUTF();
	String sql="update worker set pw='"+xpw+"' where name='"+name+"'and number='"+number+"'and " +
			"pw='"+pw+"'";
	DataConnect.getStat().executeUpdate(sql);
}
//��¼
public void W_login() throws IOException, SQLException, ClassNotFoundException{
	String number=ios.readUTF();
	String pw=ios.readUTF();
	String sql = "select * from worker where number='"+number+"' and pw = '"+pw+"'";
	ResultSet rs = DataConnect.getStat().executeQuery(sql);
	Jworker u=null;
	   if(rs.next())
			u=new Jworker(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
	   oos.writeObject(u);
	   oos.flush();  
	
}
//�����
//����Ա��
public void insert() throws IOException, SQLException, ClassNotFoundException{
	String number=ios.readUTF(); 
	String name=ios.readUTF();
	String pw=ios.readUTF();
	String type=ios.readUTF();
	String sql = "insert into worker(number,name,pw,type) values('"+number+"','"+name+"','"+pw+"','"+type+"')";
	DataConnect.getStat().executeUpdate(sql);
}
//ɾ��Ա��
public void delete_worker() throws Exception{
	String number=ios.readUTF();
	String sql = "delete from worker where number ='" + number + "'";
	DataConnect.getStat().executeUpdate(sql);
}

//��ʾ����Ա��
public void check_worker() throws SQLException, ClassNotFoundException, IOException{
	ArrayList<Jworker> worker = new ArrayList<Jworker>();
	String sql = "select * from worker";
	ResultSet rs = DataConnect.getStat().executeQuery(sql);
	while (rs.next()) {
		if(rs.getString(5).equals("0")){
			worker.add(new Jworker(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)));
		}
	}
	oos.writeObject(worker);
	oos.flush();
}
//����Ա�����
public void approve() throws IOException, SQLException, ClassNotFoundException{
	int id=ios.readInt();
	String sql = "select * from request where id =" + id + "";
	ResultSet rs = DataConnect.getStat().executeQuery(sql);
	Request request = null;
	if (rs.next()){
		request = new Request(rs.getInt(1), rs.getString(2), rs
				.getString(3), rs.getString(4), rs.getString(5), rs
				.getString(6), rs.getString(7));
		}
	 oos.writeObject(request);
	 oos.flush();
}
//�鿴ȫ��Ա�����
public void check_ALL_request() throws SQLException, ClassNotFoundException, IOException{
	ArrayList<Request> request = new ArrayList<Request>();
	String sql = "select * from request";
	ResultSet rs = DataConnect.getStat().executeQuery(sql);
	while (rs.next()) {
		if (rs.getString(7).equals("δ����")) {
			request.add(new Request(rs.getInt(1), rs.getString(2), rs
					.getString(3), rs.getString(4), rs.getString(5), rs
					.getString(6), rs.getString(7)));
		}
	}
	oos.writeObject(request);
	oos.flush();
}
//����������
public void update_request() throws IOException, SQLException, ClassNotFoundException{
	int id=ios.readInt();
	String situation=ios.readUTF();
	String sql = "update request set situations='" + situation+"' where id="+ id +"";
    DataConnect.getStat().executeUpdate(sql);
	
}
//��ʾĳ��Ա����Ϣ
public void check_ow() throws Exception{
	Jworker worker=null;
	int id=ios.readInt();
	String sql = "select * from worker where id =" + id + "";
	ResultSet rs = DataConnect.getStat().executeQuery(sql);
	if(rs.next())
	    worker=new Jworker(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
	oos.writeObject(worker);
	oos.flush();
	
}
//�鿴�û�������Ͷ��
public void check_suggest() throws Exception{
	int id=ios.readInt();
	String condition="�Կ�";
	Suggest suggest=null;
	String sql = "select * from suggest where id="+id+"";
	ResultSet rs = DataConnect.getStat().executeQuery(sql);
if(rs.next()){
	suggest=new Suggest(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6));
	String sql2="update suggest set scondition='"+condition+"' where id="+id+"";
	 DataConnect.getStat().executeUpdate(sql2);
   }
   
   oos.writeObject(suggest);
   oos.flush(); 

}
//��ʾ�û�ȫ��������Ͷ��
public void check_allsuggest() throws Exception{
	ArrayList<Suggest> suggest = new ArrayList<Suggest>();
	String sql = "select * from suggest";
	ResultSet rs = DataConnect.getStat().executeQuery(sql);
	while(rs.next()){
		suggest.add(new Suggest(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)));
	}
	 oos.writeObject(suggest);
	 oos.flush();
	}

//����Ա�����
public void arrange() throws IOException, SQLException, ClassNotFoundException{
	String number=ios.readUTF();
	String work_content=ios.readUTF();
	String sql = "Update work_list set work_content='" + work_content +"' where number='" + number + "'";
	DataConnect.getStat().executeUpdate(sql);
}


}