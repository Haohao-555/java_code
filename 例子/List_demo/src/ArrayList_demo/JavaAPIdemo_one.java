package ArrayList_demo;

import java.util.ArrayList;
import java.util.List;

public class JavaAPIdemo_one {
   public static void main(String[] args) {
	List<String> all=new ArrayList<String>();//通过子类接口实现父类接口（无参构造方法）参数代表泛型的长度，默认是10个长度单位
	all.add("Hello");
	all.add("Hello");
	all.add("1");
	all.add("2");
	all.add("3");
	System.out.println(all);
	System.out.println(all.get(0));//输出某个位置的元素
	System.out.println("集合是否为空"+all.isEmpty()+"集合个数"+all.size());
	all.remove(0);//删除元素（顺序删除）
	System.out.println(all);
	
}
}
/*List接口和Set接口都是Collection接口的接口。
 * Collection集合保存数据的目的是为了输出，且保存的数据都是单个对象
 * 
 * Set接口和List接口的区别是
 * （1）都是用来保存数据的。
 * （2）Set接口可以多重复数据进行处理，而List接口这是保存数据的中间介质
 * */
