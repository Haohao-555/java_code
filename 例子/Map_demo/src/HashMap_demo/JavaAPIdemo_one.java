package HashMap_demo;

import java.util.HashMap;
import java.util.Map;

public class JavaAPIdemo_one {
   public static void main(String[] args) {
	Map<String,Integer> map=new HashMap<String,Integer>();
	//�������
	map.put("one", 1);
	map.put("two", 2);
	map.put("one", 101);//key�ظ�������value����д���ڼ���Map��key�Ǿ��Բ��ظ��ģ�
	map.remove("two");//ɾ��
	//value��key����Ϊ��
	map.put(null, 0);
	map.put("zero", null);
	System.out.println(map.get("one"));//key����
	System.out.println(map.get(null));//key����
	System.out.println(map.get("ten"));//key������
	System.out.println(map);//����������
	
	//put()����ֵ
	System.out.println(map.put("three", 3));//key���ظ�������Ϊnull
	System.out.println(map.put("three", 33));//key�ظ������ؾɵ����ݣ���3
}
   /*   ���⣺�ڽ���HashMap��put()������ʱ�����ʵ�����������
    * ��1����HashMap������һ������"DEFAULT_INITIAL_CAPACTTY"����Ϊ��ʼ�����������ã����ⳣ����Ĭ�ϴ�С��16��Ԫ�أ����
    * ��2�����洢�����ݳ�����ֵ��DEFAULT_LOAD_FACTOR=0.75f���൱��"����*��ֵ"��16*0.75=12��Ԫ�أ�
    * ��3���ڽ��������ʱ��HashMap���õ��ǳɱ�������ģʽ������ÿ�ζ�����2��������
    * 
    * 
    *  ���⣺HashMap�Ĺ���ԭ��JDK1.8��ʼ�ģ�
    *  ��1����HashMap֮�н������ݴ洢������Node����ɵġ�
    *  ��2������洢������û�г�����ֵ��8����8��Ԫ�ء������ݲ��õ����������ʽ���д洢�� �������8��������ת���ɺ������ʵ������ƽ�⣬�������������������Ĳ�ѯ����
    *  
    *  Map�ӿ���Ҫ�Ĺ����ǶԶ�Ԫż����key=value�������ݱ���,��Ŀ����Ϊ�˽���key�Ĳ���
    * */
}
