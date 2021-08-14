package work_three;
// ÿª§≥Ã–Ú
public class Threadtwo implements Runnable {
	@Override
	public void run() {
		
			
		
		for(int i =0;i<100;i++){
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i+""+Thread.currentThread().getName());
		}
		
	}

}
