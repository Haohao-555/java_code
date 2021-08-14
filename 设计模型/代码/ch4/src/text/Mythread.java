package text;


import entity.Demo2;

public class Mythread implements Runnable {

	@Override
	public void run() {
		for(int i=0;i<200;i++){
			Demo2 demo=Demo2.getdemo();
			System.out.print(Thread.currentThread().getName());
			System.out.println(demo.hashCode());
		}
		
	}
	public static void main(String[] args) {
		Mythread mt=new Mythread();
		Thread thread_a=new Thread(mt,"线程a ");
  	    Thread thread_b=new Thread(mt,"线程b ");
  	    thread_a.start();
	    thread_b.start();
	}

}
