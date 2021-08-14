package work;
//�̲߳���
//ThreadLocal����Ҫ���ڽ���̲߳��з���ʱ����ͬ��������
public class JavaAPIdemo {
	public static void main(String[] args) {
		Channel ch1=new Channel();
		new Thread(ch1,"�߳�1").start();
		new Thread(ch1,"�߳�2").start();
		new Thread(ch1,"�߳�3").start();
		}
}

class Channel implements Runnable{//��Ϣ����ͨ��
	private static  final ThreadLocal<Message> THREADLOCAL=new ThreadLocal<Message>();
	//����ThreadLocal��     Ŀ�����ڴ�ŵ�ǰ�����߳��Լ�ÿ���̶߳�Ӧ�����ݡ�
	//finalĿ�������ò��ܱ�ʵ����
	@Override
		public void run() {
		     Message m=new Message();
		     m.setInfo(Thread.currentThread().getName()+"���͵���Ϣ");//������Ϣ����
		     Channel.setmessage(m);
		     Channel.send();//������Ϣ
		}
	public static  void setmessage(Message m){
		THREADLOCAL.set(m);//��ThreadLocal�б�������
		}
	public static void send(){//������Ϣ
		System.out.println(Thread.currentThread().getName()+" "+THREADLOCAL.get().getInfo());
		//THREADLOCAL.get().getInfo()��ȡ��ǰ�̵߳����ֺ��ȡ���̵߳�����
	}
}

class Message{//Ҫ���͵���Ϣ��
	private String info;
	public void setInfo(String info) {
		this.info = info;
	}
	public String getInfo() {
		return info;
	}
}


