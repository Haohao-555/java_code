package work_two;
//�����ߣ�ȡ����Ϣ��
class Consumer implements Runnable{
	private Message msg;
	public Consumer(Message msg){
		this.msg=msg;
	}
	@Override
	public void run() {
		for(int i=0;i<20;i++){
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(this.msg.get()+"");
		
	}
}   

}
