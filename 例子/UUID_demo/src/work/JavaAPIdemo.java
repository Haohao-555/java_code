package work;

import java.util.UUID;
//�÷����������ļ��Զ�����
public class JavaAPIdemo {
 public static void main(String[] args) {
	UUID uid=UUID.randomUUID();//��������ַ��������ַ�����UUID����
	String name=uid.toString();//uid.toString()��UUID����ת���ַ���
	System.out.println("UUID����"+uid);
	System.out.println("String����"+name);
	}
}
