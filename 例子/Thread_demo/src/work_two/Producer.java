package work_two;
//�����ߣ�������Ϣ��   
public class Producer implements Runnable{
	private Message msg;//������Ϣ
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
				this.msg.set("����","�����˧��");
				
			}else{
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				this.msg.set("С��","���������,��������������");
				
			} 
		}
		
	}

}