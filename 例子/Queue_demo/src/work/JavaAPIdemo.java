package work;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class JavaAPIdemo {
   public static void main(String[] args) {
	//(普通队列)
	Queue<String> queue=new LinkedList<String>();//子类实例化
	queue.offer("1");
	queue.offer("2");
	queue.offer("3");
	queue.offer("4");
	queue.offer("5");//queue.peek()取出且不删除
    for(int i=queue.size();i>0;i--){
		System.out.println(queue.poll());
	}
	System.out.println();
   
   //优先级队列(有比较的功能)
   Queue<String> priorityqueue=new PriorityQueue<String>();//子类实例化
   priorityqueue.offer("c");
   priorityqueue.offer("a");
   priorityqueue.offer("d");
   priorityqueue.offer("e");
   priorityqueue.offer("b");

	for(int i=priorityqueue.size();i>0;i--){
		System.out.println(priorityqueue.poll());
	}
	
}
}
