package work;
//线程同步，线程优先级，线程礼让，线程强制执行
public class MyRunnable implements Runnable {//接口
	static Thread mainthread;
      @Override
      
    public void run() {
    	for(int i=0;i<20;i++){
    		try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i+"当前线程名字："+Thread.currentThread().getName());
    	}
    	
      }
      //线程强制执行
//	  if(i==3){
//  		try {
//				mainthread.join();//主程序开始先执行
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//  	}
	
	
	
	//线程礼让
//	  if(i%3==1){
//		  mainthread.yield();//礼让
//		  System.out.println("********线程礼让**********");
//	  }   
      
      
      public static void main(String[] args) {
    	  MyRunnable mt=new MyRunnable();
    	  Thread thread_a=new Thread(mt,"线程a");
    	  Thread thread_b=new Thread(mt,"线程b");
    	  Thread thread_c=new Thread(mt,"线程c");
//    	  thread_a.setPriority(10);
    	  thread_b.setPriority(1);
    	  thread_c.setPriority(1);
    	  thread_a.start();
    	  thread_b.start();
    	  thread_c.start();
    	  System.out.println("主线程的优先级"+Thread.currentThread().getPriority());
    	  System.out.println("默认线程的优先级"+thread_a.getPriority());
    	  
//    	  
//    	 mainthread=Thread.currentThread();//获取主线程
////子线程
//    	  MyRunnable mt=new MyRunnable();
//  	      new Thread(mt,"子线程").start();
////主线程	
//	    for(int i=0;i<20;i++){
//	       try {
//				Thread.sleep(100);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			System.out.println(i+"当前线程名字:"+Thread.currentThread().getName());
//	    }
//	  
   }
   
}
