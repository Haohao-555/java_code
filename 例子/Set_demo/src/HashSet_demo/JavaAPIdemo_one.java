package HashSet_demo;

import java.util.HashSet;
import java.util.Set;

public class JavaAPIdemo_one {
   public static void main(String[] args) {
	Set<String> all=new HashSet<String>();
	all.add("Hello");
	all.add("Hello");//�ظ����ݣ���������������
	all.add("World");
	all.add("MLDN");
	
	for(String temp:all){
		System.out.println(temp);
	}
	
	
	
}
}
/*HashSet��Set�ӿ�����ʹ������һ�����ࡣ
 * �������ص���Ǳ��������������ģ�HashSet�ӿڶ���ģ����Ҳ��ظ�(set�ӿڶ����)
 * 
 * 
 * ���ݲ��ظ���ԭ����������Object���ṩ�ķ���ʵ�ֵ�   �����ڸð��µ�JavaAPIdemo_two
 * ��1��������룺public int hashCode();
 * ��2������Ƚϣ�public boolean equals(Object obj);
 * �ڽ����ظ�Ԫ���жϵ�ʱ����������hasCode()���б����ƥ�䣬����ñ��벻���ڱ�ʾ���ݲ����ڣ�֤��û���ظ����ݡ�
 * �����������ˣ����һ�����ж���Ƚϴ�����������ظ��ˣ���������ǲ��ܱ���ġ�
 * ��������������ϵͳ�Զ�����  �����ǵ�� Source ��ѡ�� Generate hashCode()and equals()
 * */
 