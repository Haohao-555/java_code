package work;

import java.util.*;

public class JavaAPIdemo {
   public static void main(String[] args) {
	List <String> all=new ArrayList<String>();
	Collections.addAll(all, "hello","world","mldn","www");//׷������
	//Collections.reverse(all);���ݷ�ת
	
	for(String str:all){
		System.out.print(str+" ");
	}
	//ʹ�ö��ֲ���
	Collections.sort(all);//����
	System.out.println(Collections.binarySearch(all, "mldn"));//�������ڲ���
	
   }
}
/*         Collections��Collection������
 * ��1��Collections�Ǽ��Ͻӿڣ������浥ֵ����
 * ��2��Collection�Ǽ��ϲ����Ĺ�����
 * 
 * Collections���ԶԸ������ϣ�List Set Map queue(Collection���ӽӿ�)���Ĳ���
 * */
