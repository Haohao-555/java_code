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
	   public static Socket s;//嵌套字
	   public static ObjectOutputStream oos;//输出流
	   public static ObjectInputStream ios;//输入流
public static void init() throws UnknownHostException, IOException{
	    	s=new Socket("127.0.0.1",55562);//初始化套接字
	    	oos=new ObjectOutputStream(s.getOutputStream());
	    	ios=new ObjectInputStream(s.getInputStream());
	    }
  
  //用户
//登录*
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
//查看快递信息*
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
//提建议*
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

//修改登录密码(通过用户名和账号判断)*
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
//注册*
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
	
//寄快递*
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
//获取取件码*	
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
//查看寄件单情况*
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
//更新寄件单信息
	public static void update(int id) throws UnknownHostException, IOException{
		init();
		oos.writeInt(UPDATE);
		oos.flush();
		oos.writeInt(id);
		oos.flush();
		
	}
//基础层
	//请假
	public  static void leave(String name,String number,String because,String needtime) throws IOException{
		init();
		String situation="未审批";
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
//查看班表
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
//查看请假情况
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
//快递入库
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
//快递出库
	public  static String kout(String knumber,String name) throws UnknownHostException, IOException{
		init();
		String condition="已取件";
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
//显示全部快递单
	public  static ArrayList<Message> gain_All_k() throws UnknownHostException, IOException, ClassNotFoundException{
		init();
		ArrayList<Message> message = new ArrayList<Message>();
		oos.writeInt(GAIN_ALL_K);
		oos.flush();
		message=(ArrayList<Message>)ios.readObject();
		return message;
		}
//收取快递
	public static void gain_k(int id) throws IOException{
		init();
		oos.writeInt(GAINK);
		oos.flush();
		oos.writeInt(id);
		oos.flush();
	} 
//查看寄件详细信息
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
//修改登录密码(工作人员)
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
//登录(工作人员)
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
//管理层
//增加员工
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

//显示所有员工
	public  static ArrayList<Jworker> check_worker() throws Exception{
		init();
		ArrayList<Jworker> worker = new ArrayList<Jworker>();
		oos.writeInt(CHECK_WORKER);
		oos.flush();
		worker=(ArrayList<Jworker>)ios.readObject();
		return worker;
	}

//删除员工	
public  static void delete_worker(String number) throws UnknownHostException, IOException{
		init();
		oos.writeInt(DELETE_WORKER);
		oos.flush();
		oos.writeUTF(number);
		oos.flush();
		
	}
//审批员工请假
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
//显示某个员工信息
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
	
//查看全部员工请假
	public static ArrayList<Request> check_ALL_request() throws UnknownHostException, IOException, ClassNotFoundException{
		init();
		ArrayList<Request> request = new ArrayList<Request>();
		oos.writeInt(CHECK_ALL_REQUEST);
		oos.flush();
		request=(ArrayList<Request>)ios.readObject();
		return request;
	}
//更新请假情况
	public  static void update_request(int id,String situation) throws UnknownHostException, IOException{
		init();
		oos.writeInt(UPDATE_REQUEST);
		oos.flush();
		oos.writeInt(id);
		oos.flush();
		oos.writeUTF(situation);
		oos.flush();
		
	} 
	
//查看用户建议与投诉
	public static Suggest checksuggest(int id) throws UnknownHostException, IOException, ClassNotFoundException{
		init();
		oos.writeInt(CHECK_SUGGEST);
		oos.flush();
		oos.writeInt(id);
		oos.flush();
		Suggest suggest=(Suggest)ios.readObject();
		return suggest;
	}
//显示用户全部建议与投诉
	public static ArrayList<Suggest> check_allsuggest() throws UnknownHostException, IOException, ClassNotFoundException{
		init();
		ArrayList<Suggest> suggest = new ArrayList<Suggest>();
		oos.writeInt(CHECK_ALL_SUGGEST);
		oos.flush();
		suggest=(ArrayList<Suggest>)ios.readObject();
		return suggest;
		}
	
//安排员工班表
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
	

	
	
	
  

