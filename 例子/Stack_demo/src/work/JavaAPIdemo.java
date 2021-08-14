package work;

import java.util.Stack;

public class JavaAPIdemo {
   public static void main(String[] args) {
	Stack<String>all=new Stack<String>();
	all.push("A");
	all.push("B");
	all.push("C");
	all.push("D");
	all.push("E");
	all.push("F");
	for(int i=all.size();i>0;i--){
		System.out.print(all.pop()+"、");
	}
	
	
}
}
/*Stack类是Vector类（List接口的子接口）的子类，但没有使用到Vector提供的方法
 * */
 