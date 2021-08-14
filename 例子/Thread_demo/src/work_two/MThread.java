package work_two;
//（1）生产者是生产信息，消费者为取走信息
//（2）生产者每生产一个信息消费者取走一个信息。
//（3）如果生产者没有生产完则消费者要等待生产者生产出来。如果消费者没有取出信息，则生产者要等待消费者取出信息。
public class MThread {
     public static void main(String[] args) {
		Message msg=new Message();
		new Thread(new Producer(msg)).start();//启动线程
		new Thread(new Consumer(msg)).start();//启动线程
	}
}

/*该多线程是两个线程，但两个线程是先后访问资源（串行访问）
 * */
	
	
	
	








