package Stream_demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



//�����������ڵ�all���ݷǳ���ʱ���Զ����ݽ��д���ѡ���Լ���Ҫ������
public class JavaAPIdemo_one {
  public static void main(String[] args) {
	List<String> all=new ArrayList<String>();
	Collections.addAll(all, "Java","JavaScript","Python","Go");
	
	
	//****************���������Ҫ��jdk8����
	//��ȡStream�ӿ�
	//Stream<String> stream=all.stream();
	
	//��ȡ����
	//System.out.println(stream.count());
	
	//long count=stream.filter((ele)->ele.toLowerCase().contains("j")).count();
	//System.out.println("������ĸj�ĸ���"+count);
	
	//������j�ĵ��ʱ�����List������
	//List<String> list=stream.filter((ele)->ele.toLowerCase().contains("j")).collect(Collectors.toList());
	//for(String lis:list) {
		//System.out.println(lis);
	//}
}
}
