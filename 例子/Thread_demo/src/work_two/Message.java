package work_two;
//保存中间信息
public class Message{
	private String title;
	private String concent;
	private boolean flag=true;//表示生产或消费的状态
	//true表示允许生产，不允许消费。false表示允许消费，不允许生产。
	public synchronized void set(String title,String concent){
		if(this.flag==false){
			try {
				super.wait();//不能生产，等待消费。
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.title = title;
		this.concent = concent;
		this.flag=false;//生产完成，等待消费。
		super.notify();//唤醒消费线程
	}
	public synchronized String get(){
		if(this.flag==true){
			try {
				super.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try{
			return this.title+"-"+this.concent;
		}finally{
			this.flag=true;//消费完成，等待生产
			super.notify();//唤醒生产线程
//			有多个线程时super.notifyAll()唤醒所有线程中的一个线程，按优先级（优先级高的可能被先唤醒）。
//          super.notify()则是唤醒第一个线程（队列的队头）。
//			super.wait()可以设置等待时间
		}
		
		
	}
    
	
}
