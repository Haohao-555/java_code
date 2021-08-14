package work;

public class Mythread extends Thread {//ผฬณะ
     public void run() {
		// TODO Auto-generated method stub
       for(int i=0;i<10;i++){
    	   System.out.println(""+i);
       }
	}
    public static void main(String[] args) {
		Mythread mt=new Mythread();
		new Thread(mt).start();
	} 
}
