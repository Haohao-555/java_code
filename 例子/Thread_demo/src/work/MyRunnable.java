package work;
//�߳�ͬ�����߳����ȼ����߳����ã��߳�ǿ��ִ��
public class MyRunnable implements Runnable {//�ӿ�
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
			System.out.println(i+"��ǰ�߳����֣�"+Thread.currentThread().getName());
    	}
    	
      }
      //�߳�ǿ��ִ��
//	  if(i==3){
//  		try {
//				mainthread.join();//������ʼ��ִ��
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//  	}
	
	
	
	//�߳�����
//	  if(i%3==1){
//		  mainthread.yield();//����
//		  System.out.println("********�߳�����**********");
//	  }   
      
      
      public static void main(String[] args) {
    	  MyRunnable mt=new MyRunnable();
    	  Thread thread_a=new Thread(mt,"�߳�a");
    	  Thread thread_b=new Thread(mt,"�߳�b");
    	  Thread thread_c=new Thread(mt,"�߳�c");
//    	  thread_a.setPriority(10);
    	  thread_b.setPriority(1);
    	  thread_c.setPriority(1);
    	  thread_a.start();
    	  thread_b.start();
    	  thread_c.start();
    	  System.out.println("���̵߳����ȼ�"+Thread.currentThread().getPriority());
    	  System.out.println("Ĭ���̵߳����ȼ�"+thread_a.getPriority());
    	  
//    	  
//    	 mainthread=Thread.currentThread();//��ȡ���߳�
////���߳�
//    	  MyRunnable mt=new MyRunnable();
//  	      new Thread(mt,"���߳�").start();
////���߳�	
//	    for(int i=0;i<20;i++){
//	       try {
//				Thread.sleep(100);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			System.out.println(i+"��ǰ�߳�����:"+Thread.currentThread().getName());
//	    }
//	  
   }
   
}
