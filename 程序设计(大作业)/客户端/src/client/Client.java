package client;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.Jworker;
import model.Message;
import model.Request;
import model.Suggest;
import model.User;
import model.Work;
public class Client implements Protocal {
	   public static Socket s;//Ƕ����
	   public static ObjectOutputStream oos;//�����
	   public static ObjectInputStream ios;//������
public static void init() throws UnknownHostException, IOException{
	    	s=new Socket("127.0.0.1",55562);//��ʼ���׽���
	    	oos=new ObjectOutputStream(s.getOutputStream());
	    	ios=new ObjectInputStream(s.getInputStream());
	    }
  
  //�û�
//��¼*
	public static User Ulogin(String number,String pw) throws UnknownHostException, IOException, ClassNotFoundException{
		init();
		oos.writeInt(A_LOGIN);
		oos.flush();
		oos.writeUTF(number);
		oos.flush();
		oos.writeUTF(pw);
		oos.flush();
		User u = (User)ios.readObject();
		return u;
	}
//�鿴�����Ϣ*
	public static ArrayList<Message> kcheck(String name,String condition) throws UnknownHostException, IOException, ClassNotFoundException{
		init();
		ArrayList<Message> message = new ArrayList<Message>();
		oos.writeInt(KCHECK);
		oos.flush();
		oos.writeUTF(name);
		oos.flush();
		oos.writeUTF(condition);
		oos.flush();
		message=(ArrayList<Message>) ios.readObject();
		return message;
	}
//�Ὠ��*
	public static void advise(String name,String phone,String detail)throws UnknownHostException, IOException{
		init();
		oos.writeInt(ADVISE);
		oos.flush();
		oos.writeUTF(name);
		oos.flush();
		oos.writeUTF(phone);
		oos.flush();
		oos.writeUTF(detail);
		oos.flush();
		}

//�޸ĵ�¼����(ͨ���û������˺��ж�)*
	public static void alterpw(String name,String number,String xpw) throws UnknownHostException, IOException{
		init();
		oos.writeInt(A_ALTERPW);
		oos.flush();
		oos.writeUTF(name);
		oos.flush();
		oos.writeUTF(number);
		oos.flush();
		oos.writeUTF(xpw);
		oos.flush();
	}
//ע��*
	public static void register(String name,String phone,String site,String pw,
			String number)throws UnknownHostException, IOException{
		init();
		oos.writeInt(REGISTER);
		oos.flush();
		oos.writeUTF(name);
		oos.flush();
		oos.writeUTF(phone);
		oos.flush();
		oos.writeUTF(site);
		oos.flush();
		oos.writeUTF(pw);
		oos.flush();
		oos.writeUTF(number);
		oos.flush();
	}
	
//�Ŀ��*
	public static void ksend(String ktype,String jname,String sname,
			String jsite,String ssite,String weight,String price,
			String jphone,String sphone,String condition)throws UnknownHostException, IOException{
		init();
		oos.writeInt(KSEND);
		oos.flush();
		oos.writeUTF(ktype);
		oos.flush();
		oos.writeUTF(jname);
		oos.flush();
		oos.writeUTF(sname);
		oos.flush();
		oos.writeUTF(jsite);
		oos.flush();
		oos.writeUTF(ssite);
		oos.flush();
		oos.writeUTF(weight);
		oos.flush();
		oos.writeUTF(price);
		oos.flush();
		oos.writeUTF(jphone);
		oos.flush();
		oos.writeUTF(sphone);
		oos.flush();
		oos.writeUTF(condition);
		oos.flush();
		}
//��ȡȡ����*	
	public static Message check_knumber(int id) throws UnknownHostException, IOException, ClassNotFoundException{
		init();
		Message message=null;
		oos.writeInt(CKECK_KNUMBER);
		oos.flush();
		oos.writeInt(id);
		oos.flush();
		message=(Message)ios.readObject();
		return message;
	}
//�鿴�ļ������*
	public static ArrayList<Message> check_jmessage(String name) throws IOException, ClassNotFoundException{
		init();
		ArrayList<Message> message = new ArrayList<Message>();
		oos.writeInt(CHECK_JMESSAGE);
		oos.flush();
		oos.writeUTF(name);
		oos.flush();
		message=(ArrayList<Message>) ios.readObject();
		return message;
	}
//���¼ļ�����Ϣ
	public static void update(int id) throws UnknownHostException, IOException{
		init();
		oos.writeInt(UPDATE);
		oos.flush();
		oos.writeInt(id);
		oos.flush();
		
	}
//������
	//���
	public  static void leave(String name,String number,String because,String needtime) throws IOException{
		init();
		String situation="δ����";
		oos.writeInt(LEAVE);
		oos.flush();
		oos.writeUTF(name);
		oos.flush();
		oos.writeUTF(number);
		oos.flush();
		oos.writeUTF(because);
		oos.flush();
		oos.writeUTF(needtime);
		oos.flush();
		oos.writeUTF(situation);
		oos.flush();
		
	}
//�鿴���
	public  static Work check_work(String number) throws UnknownHostException, IOException, ClassNotFoundException{
		init();
		Work work=null;
		oos.writeInt(CHECK_WORK);
		oos.flush();
		oos.writeUTF(number);
		oos.flush();
		work=(Work) ios.readObject();
		return work;
		
	}
//�鿴������
	public static ArrayList<Request> check_request(String number) throws  Exception{
		init();
		ArrayList<Request> request = new ArrayList<Request>();
		oos.writeInt(CHECK_REQUEST);
		oos.flush();
		oos.writeUTF(number);
		oos.flush();
		request=(ArrayList<Request>)ios.readObject();
		return request;
	}
//������
	public  static void kin(String ktype, String jname, String sname,
			String jsite, String ssite, String weight, String price,
			String jphone, String sphone, String knumber, String condition,
			String deadline) throws UnknownHostException, IOException{
		init();
		oos.writeInt(KIN);
		oos.flush();
		oos.writeUTF(ktype);
		oos.flush();
		oos.writeUTF(jname);
		oos.flush();
		oos.writeUTF(sname);
		oos.flush();
		oos.writeUTF(jsite);
		oos.flush();
		oos.writeUTF(ssite);
		oos.flush();
		oos.writeUTF(weight);
		oos.flush();
		oos.writeUTF(price);
		oos.flush();
		oos.writeUTF(jphone);
		oos.flush();
		oos.writeUTF(sphone);
		oos.flush();
		oos.writeUTF(knumber);
		oos.flush();
		oos.writeUTF(condition);
		oos.flush();
		oos.writeUTF(deadline);
		oos.flush();
	}
//��ݳ���
	public  static String kout(String knumber,String name) throws UnknownHostException, IOException{
		init();
		String condition="��ȡ��";
		String kout_condition;
		oos.writeInt(KOUT);
		oos.flush();
		oos.writeUTF(knumber);
		oos.flush();
		oos.writeUTF(name);
		oos.flush();
		oos.writeUTF(condition);
		oos.flush();
		kout_condition=ios.readUTF();
		return kout_condition;
		}
//��ʾȫ����ݵ�
	public  static ArrayList<Message> gain_All_k() throws UnknownHostException, IOException, ClassNotFoundException{
		init();
		ArrayList<Message> message = new ArrayList<Message>();
		oos.writeInt(GAIN_ALL_K);
		oos.flush();
		message=(ArrayList<Message>)ios.readObject();
		return message;
		}
//��ȡ���
	public static void gain_k(int id) throws IOException{
		init();
		oos.writeInt(GAINK);
		oos.flush();
		oos.writeInt(id);
		oos.flush();
	} 
//�鿴�ļ���ϸ��Ϣ
	public static Message gain_k_message(int id) throws UnknownHostException, IOException, ClassNotFoundException{
		init();
		Message message=null;
		oos.writeInt(GAIN_K_MESSAGE);
		oos.flush();
		oos.writeInt(id);
		oos.flush();
		message=(Message)ios.readObject();
		return message;
		
	}
//�޸ĵ�¼����(������Ա)
	public  static void w_alter_pw(String name,String number,String xpw,String pw) throws UnknownHostException, IOException{
		init();
		oos.writeInt(W_ALTERPW);
		oos.flush();
		oos.writeUTF(name);
		oos.flush();
		oos.writeUTF(number);
		oos.flush();
		oos.writeUTF(xpw);
		oos.flush();
		oos.writeUTF(pw);
		oos.flush();
	}
//��¼(������Ա)
	public static Jworker w_login(String number,String pw) throws UnknownHostException, IOException, ClassNotFoundException{
		init();
		Jworker worker=null;
		oos.writeInt(W_LOGIN);
		oos.flush();
		oos.writeUTF(number);
		oos.flush();
		oos.writeUTF(pw);
		oos.flush();
		worker=(Jworker)ios.readObject();
        return worker;
	}
//�����
//����Ա��
	public  static void insert(String number, String name, String pw) throws UnknownHostException, IOException{
		init();
		String type="0";
		oos.writeInt(INSERT);
		oos.flush();
		oos.writeUTF(number);
		oos.flush();
		oos.writeUTF(name);
		oos.flush();
		oos.writeUTF(pw);
		oos.flush();
		oos.writeUTF(type);
		oos.flush();
	}

//��ʾ����Ա��
	public  static ArrayList<Jworker> check_worker() throws Exception{
		init();
		ArrayList<Jworker> worker = new ArrayList<Jworker>();
		oos.writeInt(CHECK_WORKER);
		oos.flush();
		worker=(ArrayList<Jworker>)ios.readObject();
		return worker;
	}

//ɾ��Ա��	
public  static void delete_worker(String number) throws UnknownHostException, IOException{
		init();
		oos.writeInt(DELETE_WORKER);
		oos.flush();
		oos.writeUTF(number);
		oos.flush();
		
	}
//����Ա�����
	public static Request approve(int id) throws UnknownHostException, IOException, ClassNotFoundException{
		init();
		Request request=null;
		oos.writeInt(APPROVER);
		oos.flush();
		oos.writeInt(id);
		oos.flush();
		request=(Request)ios.readObject();
		return request;
		
	}
//��ʾĳ��Ա����Ϣ
	public  static Jworker check_OW(int id) throws Exception{
		init();
		Jworker worker=null;
		oos.writeInt(CHECK_OW);
		oos.flush();
		oos.writeInt(id);
		oos.flush();
		worker=(Jworker)ios.readObject();
		return worker; 
	}
	
//�鿴ȫ��Ա�����
	public static ArrayList<Request> check_ALL_request() throws UnknownHostException, IOException, ClassNotFoundException{
		init();
		ArrayList<Request> request = new ArrayList<Request>();
		oos.writeInt(CHECK_ALL_REQUEST);
		oos.flush();
		request=(ArrayList<Request>)ios.readObject();
		return request;
	}
//����������
	public  static void update_request(int id,String situation) throws UnknownHostException, IOException{
		init();
		oos.writeInt(UPDATE_REQUEST);
		oos.flush();
		oos.writeInt(id);
		oos.flush();
		oos.writeUTF(situation);
		oos.flush();
		
	} 
	
//�鿴�û�������Ͷ��
	public static Suggest checksuggest(int id) throws UnknownHostException, IOException, ClassNotFoundException{
		init();
		oos.writeInt(CHECK_SUGGEST);
		oos.flush();
		oos.writeInt(id);
		oos.flush();
		Suggest suggest=(Suggest)ios.readObject();
		return suggest;
	}
//��ʾ�û�ȫ��������Ͷ��
	public static ArrayList<Suggest> check_allsuggest() throws UnknownHostException, IOException, ClassNotFoundException{
		init();
		ArrayList<Suggest> suggest = new ArrayList<Suggest>();
		oos.writeInt(CHECK_ALL_SUGGEST);
		oos.flush();
		suggest=(ArrayList<Suggest>)ios.readObject();
		return suggest;
		}
	
//����Ա�����
	public  static void arrange(String number,String work_content) throws UnknownHostException, IOException{
		init();
		oos.writeInt(ARRANGE);
		oos.flush();
		oos.writeUTF(number);
		oos.flush();
		oos.writeUTF(work_content);
		oos.flush();
	}
	
}
	

	
	
	
  

