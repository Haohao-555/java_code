package work_one;
//同步会这次性能下降
public class TicketThread implements Runnable {
	 private  volatile int ticket=100;
	 //private  volatile int ticket=100;使用关键字 volatile 是直接在属性的内存里面修改属性值，
	 //而没有用volatile是通过拷贝属性的副本如何读取等一系列操作后进行属性值修改。
	   
	 public synchronized boolean sale(){
		 if(this.ticket>0){
    		 try {
				Thread.sleep(1000);//模拟网络延迟
				 System.out.println(""+Thread.currentThread().getName()+"卖出一张票"+"剩余"+this.ticket--);
				 return true;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		
    		 
    	 }else{
    		 System.out.println("票卖完了");
    		 return false;
    	 }
		return false;
     }
	  
    @Override
    public void run() {
    	
    	
    	//第一种处理方法(同步方法块)
//         while(true){
//        	 synchronized(this){//同步（每次只能一个线程访问）
//        	 if(this.ticket>0){
//        		 try {
//					Thread.sleep(100);//模拟网络延迟
//					 System.out.println(""+Thread.currentThread().getName()+"卖出一张票"+"剩余"+this.ticket--);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//        		
//        		 
//        	 }else{
//        		 System.out.println("票卖完了");
//        		 break;
//        	 }
//         }
//       }
    	
    	
    	
    	//第二种处理方法(同步方法块)
    	while(this.sale()){
    		;
    	}
    }
    public static void main(String[] args) {
		TicketThread mt=new TicketThread();
		Thread a=new Thread(mt,"票贩a");
		Thread b=new Thread(mt,"票贩b");
		Thread c=new Thread(mt,"票贩c");
		a.start();
		b.start();
		c.start();
		
	}
}

