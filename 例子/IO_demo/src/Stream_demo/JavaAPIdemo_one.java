package Stream_demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



//此例子适用于当all数据非常大时可以对数据进行处理，选择自己需要的数据
public class JavaAPIdemo_one {
  public static void main(String[] args) {
	List<String> all=new ArrayList<String>();
	Collections.addAll(all, "Java","JavaScript","Python","Go");
	
	
	//****************下面代码需要在jdk8以上
	//获取Stream接口
	//Stream<String> stream=all.stream();
	
	//获取个数
	//System.out.println(stream.count());
	
	//long count=stream.filter((ele)->ele.toLowerCase().contains("j")).count();
	//System.out.println("包含字母j的个数"+count);
	
	//将包含j的单词保存在List集合中
	//List<String> list=stream.filter((ele)->ele.toLowerCase().contains("j")).collect(Collectors.toList());
	//for(String lis:list) {
		//System.out.println(lis);
	//}
}
}
