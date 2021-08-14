package work;
//该线程可以返回线程结束信息(泛型)
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Mycallable implements Callable<String> {
     public String call(){
    	 for(int i=0;i<10;i++){
    		 System.out.println("********线程执行、x="+i);
    	 }
    	 return "线程执行完毕";
     }
    public static void main(String[] args) throws Exception{
	    FutureTask<String>task=new FutureTask<String>(new Mycallable());
//        FutureTask<v>其中v可以为其他类型v对应Callable<v>中的v
	    new Thread(task).start();
	    System.out.println("【线程返回的数据】"+task.get());
}
}
