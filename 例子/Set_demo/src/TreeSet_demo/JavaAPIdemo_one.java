package TreeSet_demo;

import java.util.Set;
import java.util.TreeSet;

public class JavaAPIdemo_one {
   public static void main(String[] args) {
	   Set<String> all=new TreeSet<String>();
	   
	   all.add("av");
	   all.add("cd");
	   all.add("bd");
	   for(String temp:all){
		   System.out.println(temp);
	   }
	   
	
}
}
/*TreeSet保存的数据是有序的,按照首字母排序(升序)，且不重复
 * 之所以能够排序是因为实现了Comparable接口（比较器）中的CompareTo()
 * 该包下JavaAPIdemo_two就实现自定义类对象的排序
 * 
 * 
 * TreeSet接口和HashSet接口相比较，
 * 当数据量太大时应该首选HashSet。因为TreeSet在存储的时候会对属性进行排序。性能低
 * */
 