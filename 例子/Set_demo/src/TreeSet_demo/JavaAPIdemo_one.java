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
/*TreeSet����������������,��������ĸ����(����)���Ҳ��ظ�
 * ֮�����ܹ���������Ϊʵ����Comparable�ӿڣ��Ƚ������е�CompareTo()
 * �ð���JavaAPIdemo_two��ʵ���Զ�������������
 * 
 * 
 * TreeSet�ӿں�HashSet�ӿ���Ƚϣ�
 * ��������̫��ʱӦ����ѡHashSet����ΪTreeSet�ڴ洢��ʱ�������Խ����������ܵ�
 * */
 