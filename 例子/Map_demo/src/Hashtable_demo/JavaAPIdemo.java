package Hashtable_demo;

import java.util.Hashtable;
import java.util.Map;

public class JavaAPIdemo {
   public static void main(String[] args) {
	Map<String,Integer>map=new Hashtable<String,Integer>();
	map.put("one", 1);
	map.put("two", 2);
	map.put("one", 101);
	//map.put(null, 0);
	//map.put("zero", null);
	System.out.println(map);
}
}
/*      HashMap�ӿں�Hashtable�ӿڵ�����
 *     ��1��HashMap����key��valueΪ�ա�Hashtable������key��valueΪ�ա�
 *     ��2��HashMap�еķ����������첽���������̰߳�ȫ����HashtableHashMap�еķ���������ͬ���������̰߳�ȫ��
 * */
 