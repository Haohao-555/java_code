package HashSet_demo;

import java.util.HashSet;
import java.util.Set;

public class JavaAPIdemo_one {
   public static void main(String[] args) {
	Set<String> all=new HashSet<String>();
	all.add("Hello");
	all.add("Hello");//重复数据（不被保存下来）
	all.add("World");
	all.add("MLDN");
	
	for(String temp:all){
		System.out.println(temp);
	}
	
	
	
}
}
/*HashSet是Set接口里面使用最多的一个子类。
 * 其最大的特点就是保存的数据是无序的（HashSet接口定义的），且不重复(set接口定义的)
 * 
 * 
 * 数据不重复的原因是利用了Object类提供的方法实现的   例子在该包下的JavaAPIdemo_two
 * （1）对象编码：public int hashCode();
 * （2）对象比较：public boolean equals(Object obj);
 * 在进行重复元素判断的时候首先利用hasCode()进行编码的匹配，如果该编码不存在表示数据不存在，证明没有重复数据。
 * 如果编码存在了，则进一步进行对象比较处理，如果发现重复了，则此数据是不能保存的。
 * 两个方法可以由系统自动生成  步骤是点击 Source 在选择 Generate hashCode()and equals()
 * */
 