package work_two;
//生产者（生产信息）   
public class Producer implements Runnable{
	private Message msg;//保存信息
	public  Producer(Message msg){
		this.msg=msg;
	}
	@Override
	public void run() {
		for(int i=0;i<20;i++){
			if(i%2==0){
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				this.msg.set("王建","宇宙大帅哥");
				
			}else{
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				this.msg.set("小高","宇宙大渣男,哈哈哈哈哈哈哈");
				
			} 
		}
		
	}

}