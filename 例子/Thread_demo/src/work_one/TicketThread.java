package work_one;
//ͬ������������½�
public class TicketThread implements Runnable {
	 private  volatile int ticket=100;
	 //private  volatile int ticket=100;ʹ�ùؼ��� volatile ��ֱ�������Ե��ڴ������޸�����ֵ��
	 //��û����volatile��ͨ���������Եĸ�����ζ�ȡ��һϵ�в������������ֵ�޸ġ�
	   
	 public synchronized boolean sale(){
		 if(this.ticket>0){
    		 try {
				Thread.sleep(1000);//ģ�������ӳ�
				 System.out.println(""+Thread.currentThread().getName()+"����һ��Ʊ"+"ʣ��"+this.ticket--);
				 return true;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		
    		 
    	 }else{
    		 System.out.println("Ʊ������");
    		 return false;
    	 }
		return false;
     }
	  
    @Override
    public void run() {
    	
    	
    	//��һ�ִ�����(ͬ��������)
//         while(true){
//        	 synchronized(this){//ͬ����ÿ��ֻ��һ���̷߳��ʣ�
//        	 if(this.ticket>0){
//        		 try {
//					Thread.sleep(100);//ģ�������ӳ�
//					 System.out.println(""+Thread.currentThread().getName()+"����һ��Ʊ"+"ʣ��"+this.ticket--);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//        		
//        		 
//        	 }else{
//        		 System.out.println("Ʊ������");
//        		 break;
//        	 }
//         }
//       }
    	
    	
    	
    	//�ڶ��ִ�����(ͬ��������)
    	while(this.sale()){
    		;
    	}
    }
    public static void main(String[] args) {
		TicketThread mt=new TicketThread();
		Thread a=new Thread(mt,"Ʊ��a");
		Thread b=new Thread(mt,"Ʊ��b");
		Thread c=new Thread(mt,"Ʊ��c");
		a.start();
		b.start();
		c.start();
		
	}
}

