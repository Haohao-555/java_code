package work;
//��ʱ������
import java.util.Timer;
import java.util.TimerTask;

//java.util.TimerTask�ࣺʵ�ֶ�ʱ������
//java.util.Timer��:������������
class MyTask extends TimerTask{//��������
	@Override
	public void run() {//���̴߳�����
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName()+"��ʱ����ִ�У���ǰʱ��"+System.currentTimeMillis());
	}
}
public class JavaAPIdemo {
  public static void main(String[] args) {
	Timer timer=new Timer();//��ʱ������
    timer.scheduleAtFixedRate(new MyTask(),100, 1000);	//����100�����ִ�г���ÿ��1��ִ��һ��
	//timer.schedule(new MyTask(), 0);//�ӳ�ʱ������Ϊ0������������
}
}
