package LinkedHashMap_demo;


import java.util.LinkedHashMap;
import java.util.Map;

public class JavaAPIdemo {
   public static void main(String[] args) {
	   Map<String,Integer>map=new LinkedHashMap<String,Integer>();
		map.put("one", 1);
		map.put("two", 2);
		map.put("one", 101);
		map.put(null, 0);
		map.put("zero", null);
		System.out.println(map);
}
}
/*LinkedHashMap�ǲ���������ġ�������������
 *����һ��ʹ��LinkedHashMap��������Ҫ�ر��
 *
 *LinkedHashMap����HashMap������
 * */
 