package HashMap_demo;

import java.util.HashMap;
import java.util.Map;

public class JavaAPIdemo_one {
   public static void main(String[] args) {
	Map<String,Integer> map=new HashMap<String,Integer>();
	//添加数据
	map.put("one", 1);
	map.put("two", 2);
	map.put("one", 101);//key重复，数据value被覆写（在集合Map中key是绝对不重复的）
	map.remove("two");//删除
	//value和key可以为空
	map.put(null, 0);
	map.put("zero", null);
	System.out.println(map.get("one"));//key存在
	System.out.println(map.get(null));//key存在
	System.out.println(map.get("ten"));//key不存在
	System.out.println(map);//输出是无序的
	
	//put()返回值
	System.out.println(map.put("three", 3));//key不重复，返回为null
	System.out.println(map.put("three", 33));//key重复，返回旧的数据，即3
}
   /*   问题：在进行HashMap的put()操作的时候，如何实现容量扩充的
    * （1）在HashMap类中有一个常量"DEFAULT_INITIAL_CAPACTTY"，作为初始化的容量配置，而这常量的默认大小是16个元素（最大）
    * （2）当存储的内容超过阈值（DEFAULT_LOAD_FACTOR=0.75f）相当于"容量*阈值"（16*0.75=12个元素）
    * （3）在进行扩充的时候HashMap采用的是成倍的扩充模式，即：每次都扩充2倍的容量
    * 
    * 
    *  问题：HashMap的工作原理（JDK1.8后开始的）
    *  （1）在HashMap之中进行数据存储是利用Node类完成的。
    *  （2）如果存储的数据没有超过阈值（8）即8个元素。则数据采用的是链表的形式进行存储。 如果超过8，则将链表转化成红黑树以实现树的平衡，并且利用左旋与右旋的查询性能
    *  
    *  Map接口主要的功能是对二元偶对象（key=value）的数据保存,其目的是为了进行key的查找
    * */
}
