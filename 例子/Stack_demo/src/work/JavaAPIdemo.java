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
		System.out.print(all.pop()+"��");
	}
	
	
}
}
/*Stack����Vector�ࣨList�ӿڵ��ӽӿڣ������࣬��û��ʹ�õ�Vector�ṩ�ķ���
 * */
 