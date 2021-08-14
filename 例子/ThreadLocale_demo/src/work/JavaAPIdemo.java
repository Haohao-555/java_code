package work;
//线程并行
//ThreadLocal类主要用于解决线程并行访问时数据同步的问题
public class JavaAPIdemo {
	public static void main(String[] args) {
		Channel ch1=new Channel();
		new Thread(ch1,"线程1").start();
		new Thread(ch1,"线程2").start();
		new Thread(ch1,"线程3").start();
		}
}

class Channel implements Runnable{//信息发送通道
	private static  final ThreadLocal<Message> THREADLOCAL=new ThreadLocal<Message>();
	//构造ThreadLocal类     目的用于存放当前所有线程以及每个线程对应的数据。
	//final目的是设置不能被实例化
	@Override
		public void run() {
		     Message m=new Message();
		     m.setInfo(Thread.currentThread().getName()+"发送的信息");//设置信息内容
		     Channel.setmessage(m);
		     Channel.send();//发送信息
		}
	public static  void setmessage(Message m){
		THREADLOCAL.set(m);//先ThreadLocal中保存数据
		}
	public static void send(){//发送信息
		System.out.println(Thread.currentThread().getName()+" "+THREADLOCAL.get().getInfo());
		//THREADLOCAL.get().getInfo()获取当前线程的名字后获取该线程的数据
	}
}

class Message{//要发送的信息体
	private String info;
	public void setInfo(String info) {
		this.info = info;
	}
	public String getInfo() {
		return info;
	}
}


