package work;
//���߳̿��Է����߳̽�����Ϣ(����)
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Mycallable implements Callable<String> {
     public String call(){
    	 for(int i=0;i<10;i++){
    		 System.out.println("********�߳�ִ�С�x="+i);
    	 }
    	 return "�߳�ִ�����";
     }
    public static void main(String[] args) throws Exception{
	    FutureTask<String>task=new FutureTask<String>(new Mycallable());
//        FutureTask<v>����v����Ϊ��������v��ӦCallable<v>�е�v
	    new Thread(task).start();
	    System.out.println("���̷߳��ص����ݡ�"+task.get());
}
}
