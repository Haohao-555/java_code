package ArrayList_demo;

import java.util.ArrayList;
import java.util.List;

public class JavaAPIdemo_one {
   public static void main(String[] args) {
	List<String> all=new ArrayList<String>();//ͨ������ӿ�ʵ�ָ���ӿڣ��޲ι��췽�������������͵ĳ��ȣ�Ĭ����10�����ȵ�λ
	all.add("Hello");
	all.add("Hello");
	all.add("1");
	all.add("2");
	all.add("3");
	System.out.println(all);
	System.out.println(all.get(0));//���ĳ��λ�õ�Ԫ��
	System.out.println("�����Ƿ�Ϊ��"+all.isEmpty()+"���ϸ���"+all.size());
	all.remove(0);//ɾ��Ԫ�أ�˳��ɾ����
	System.out.println(all);
	
}
}
/*List�ӿں�Set�ӿڶ���Collection�ӿڵĽӿڡ�
 * Collection���ϱ������ݵ�Ŀ����Ϊ��������ұ�������ݶ��ǵ�������
 * 
 * Set�ӿں�List�ӿڵ�������
 * ��1�����������������ݵġ�
 * ��2��Set�ӿڿ��Զ��ظ����ݽ��д�����List�ӿ����Ǳ������ݵ��м����
 * */
