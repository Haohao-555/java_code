package work_two;
//�����м���Ϣ
public class Message{
	private String title;
	private String concent;
	private boolean flag=true;//��ʾ���������ѵ�״̬
	//true��ʾ�������������������ѡ�false��ʾ�������ѣ�������������
	public synchronized void set(String title,String concent){
		if(this.flag==false){
			try {
				super.wait();//�����������ȴ����ѡ�
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
		this.flag=false;//������ɣ��ȴ����ѡ�
		super.notify();//���������߳�
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
			this.flag=true;//������ɣ��ȴ�����
			super.notify();//���������߳�
//			�ж���߳�ʱsuper.notifyAll()���������߳��е�һ���̣߳������ȼ������ȼ��ߵĿ��ܱ��Ȼ��ѣ���
//          super.notify()���ǻ��ѵ�һ���̣߳����еĶ�ͷ����
//			super.wait()�������õȴ�ʱ��
		}
		
		
	}
    
	
}
