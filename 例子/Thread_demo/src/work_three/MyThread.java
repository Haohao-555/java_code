package work_three;

public class MyThread {
     public static void main(String[] args) {
		Threadone one=new Threadone();
		Thread threadone=new Thread(one,"用户程序");
		
		Threadtwo two=new Threadtwo();
		Thread threadtwo=new Thread(two,"守护程序");
		threadtwo.setDaemon(true);//设置线程threadtwo为守护线程
		threadone.start();
		threadtwo.start();
	}
     
}
