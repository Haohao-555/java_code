package work;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class JavaAPIdemo {
   public static void main(String[] args) {
	//(��ͨ����)
	Queue<String> queue=new LinkedList<String>();//����ʵ����
	queue.offer("1");
	queue.offer("2");
	queue.offer("3");
	queue.offer("4");
	queue.offer("5");//queue.peek()ȡ���Ҳ�ɾ��
    for(int i=queue.size();i>0;i--){
		System.out.println(queue.poll());
	}
	System.out.println();
   
   //���ȼ�����(�бȽϵĹ���)
   Queue<String> priorityqueue=new PriorityQueue<String>();//����ʵ����
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
