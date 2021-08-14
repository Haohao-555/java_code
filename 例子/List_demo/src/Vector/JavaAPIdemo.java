package Vector;

import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class JavaAPIdemo {
   public static void main(String[] args) {
	   List<String> all=new Vector<String>();
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
/*Vector类之中的操作方法采用的都是synchronized同步处理，而ArrayList并没有进行同步处理。
 * 所以Vector类之中的方法在多线程访问的时候属于线程安全的，但性能比ArrayList差
 * 
 * 
 * Vector类如果使用无参构造方法，则一定默认开辟一个10个长度的数组，而后其余的实现与ArrayList一样
 * 该接口是最原始的
 * */
 