package Hashtable_demo;

import java.util.Hashtable;
import java.util.Map;

public class JavaAPIdemo {
   public static void main(String[] args) {
	Map<String,Integer>map=new Hashtable<String,Integer>();
	map.put("one", 1);
	map.put("two", 2);
	map.put("one", 101);
	//map.put(null, 0);
	//map.put("zero", null);
	System.out.println(map);
}
}
/*      HashMap接口和Hashtable接口的区别
 *     （1）HashMap允许key或value为空。Hashtable不允许key或value为空。
 *     （2）HashMap中的方法都属于异步操作（非线程安全）。HashtableHashMap中的方法都属于同步操作（线程安全）
 * */
 