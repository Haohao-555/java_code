package work_three;

public class MyThread {
     public static void main(String[] args) {
		Threadone one=new Threadone();
		Thread threadone=new Thread(one,"�û�����");
		
		Threadtwo two=new Threadtwo();
		Thread threadtwo=new Thread(two,"�ػ�����");
		threadtwo.setDaemon(true);//�����߳�threadtwoΪ�ػ��߳�
		threadone.start();
		threadtwo.start();
	}
     
}
