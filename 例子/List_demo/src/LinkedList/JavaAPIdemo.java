package LinkedList;

import java.util.LinkedList;
import java.util.List;



public class JavaAPIdemo {
   public static void main(String[] args) {
	List<String> all=new LinkedList<String>();
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
/*             LinkedList�ӿڵ�ʹ�ú�ArrayList�ӿ�����
 * LinkedList��ArrayList������
 * ��1��ArrayList������ʵ�ֵļ��ϲ�������LinkedList������ʵ�ֵļ��ϲ���
 * ��2����ʹ��List���ϵ�get()��������������ȡ����ʱ��ArrayList��ʱ�临�Ӷ�ΪO(1),��LinkedListʱ�临�Ӷ�ΪO(n)
 * ��3��ArrayList��ʹ�õ�ʱ��Ĭ�ϵĳ�ʼ����������Ĵ�С����Ϊ10������ռ䲻�������2������ʽ����������������
 *     �������������ݵ�ʱ����ܻ���������Ĳ����Լ����ܵ��½����������ʱ��Ϳ���ʹ��LinkedList
 * */
 