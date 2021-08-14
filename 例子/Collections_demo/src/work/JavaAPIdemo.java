package work;

import java.util.*;

public class JavaAPIdemo {
   public static void main(String[] args) {
	List <String> all=new ArrayList<String>();
	Collections.addAll(all, "hello","world","mldn","www");//追加数据
	//Collections.reverse(all);数据反转
	
	for(String str:all){
		System.out.print(str+" ");
	}
	//使用二分查找
	Collections.sort(all);//排序
	System.out.println(Collections.binarySearch(all, "mldn"));//先排序在查找
	
   }
}
/*         Collections和Collection的区别
 * （1）Collections是集合接口，允许保存单值对象
 * （2）Collection是集合操作的工具类
 * 
 * Collections可以对各个集合（List Set Map queue(Collection的子接口)）的操作
 * */
