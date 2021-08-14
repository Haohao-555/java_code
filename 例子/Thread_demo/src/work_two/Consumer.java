package work_two;
//消费者（取出信息）
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
