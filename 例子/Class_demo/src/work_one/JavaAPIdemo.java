package work_one;

import Person.Person;
//���ַ��������ص�
public class JavaAPIdemo {
   public static void main(String[] args) throws Exception {
	Person per=new Person();
	//�÷�����һ��ȱ�㣺�������Class�������������ָ����������ܻ�ȡ
	Class<?extends Person>cis=per.getClass();
	System.out.println(cis.getName());//��ȡ�����������
	
	//JVMֱ��֧�� ������ô���ģʽ������Ҫ��������Ӧ�Ŀ�����
	Class<?extends Person>cir=Person.class;
	System.out.println(cir.getName());//��ȡ�����������
	
	//Class���ṩ�ľ�̬����forname() �ص��ǲ���Ҫ��д�κε�import���
	Class<?>cls=Class.forName("Person.Person");//��.��
	System.out.println(cls.getName());
}
}
