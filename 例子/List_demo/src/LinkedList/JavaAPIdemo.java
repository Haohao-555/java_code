package LinkedList;

import java.util.LinkedList;
import java.util.List;



public class JavaAPIdemo {
   public static void main(String[] args) {
	List<String> all=new LinkedList<String>();
	all.add("Hello");
	all.add("Hello");
	all.add("Hello");
	all.add("Hello");
	all.add("Hello");
	for(int i=0;i<all.size();i++){
		System.out.println(all.get(i));
	}
}
}
/*             LinkedList接口的使用和ArrayList接口类似
 * LinkedList和ArrayList的区别
 * （1）ArrayList是数组实现的集合操作，而LinkedList是链表实现的集合操作
 * （2）在使用List集合的get()方法根据索引获取数据时，ArrayList的时间复杂度为O(1),而LinkedList时间复杂度为O(n)
 * （3）ArrayList在使用的时候默认的初始化对象数组的大小长度为10，如果空间不足则采用2倍的形式进行容量的扩增，
 *     如果保存大量数据的时候可能会造成垃圾的产生以及性能的下降，但是这个时候就可以使用LinkedList
 * */
 