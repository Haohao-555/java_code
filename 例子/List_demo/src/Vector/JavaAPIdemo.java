package Vector;

import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class JavaAPIdemo {
   public static void main(String[] args) {
	   List<String> all=new Vector<String>();
		all.add("Hello");
		all.add("Hello");
		all.add("Hello");
		all.add("Hello");
		all.add("Hello");
		for(int i=0;i<all.size();i++){
			System.out.println(all.get(i));
		}
}
}
/*Vector��֮�еĲ����������õĶ���synchronizedͬ��������ArrayList��û�н���ͬ������
 * ����Vector��֮�еķ����ڶ��̷߳��ʵ�ʱ�������̰߳�ȫ�ģ������ܱ�ArrayList��
 * 
 * 
 * Vector�����ʹ���޲ι��췽������һ��Ĭ�Ͽ���һ��10�����ȵ����飬���������ʵ����ArrayListһ��
 * �ýӿ�����ԭʼ��
 * */
 