package work_three;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import Person.Son;



public class Text {
    public static void main(String[] args) throws Exception {
    	Class<?> clazz=Son.class;
    	//****************************************��ȡ��������****************************************
    	Class<?>parent=clazz.getSuperclass();
    	//System.out.println(parent.getName());
    	//System.out.println(parent.getSuperclass().getName());
    	
    	
    	
    	//****************************************��ȡ����****************************************
    	Package pack=clazz.getPackage();
    	//System.out.println(pack.getName());
    	
    	
    	
    	//****************************************��ȡ�ӿ�****************************************
    	Class<?>[] instance=clazz.getInterfaces();
    	for(Class<?> temp:instance) {
    		//System.out.println(temp.getName());
    	}
    	
    	
    	
    	//****************************************��ȡ���й��췽��****************************************
    	Constructor<?>[]constructors=clazz.getDeclaredConstructors();
    	for(Constructor<?> cons:constructors) {
    		//System.out.println(cons);
    	}
    	
    	
    	
    	//****************************************�����в�ʵ��������****************************************
    	Constructor<?> constructor=clazz.getDeclaredConstructor(String.class,int.class);//�����вι��췽��
    	Object obj=constructor.newInstance("Сǿ",12);
    	System.out.println(obj);
    	
    	
    	
    	//****************************************��ȡ��ͨ����****************************************
    	//(1)��ȡ�����ȫ���������������ࣩ
    	Method[] methods=clazz.getMethods();
    	for(Method method:methods) {
    		//�Զ��������ʽ
    		int mod=method.getModifiers();//��ȡ���η�
    		//System.out.print(Modifier.toString(mod)+" ");
    		//System.out.print(method.getReturnType().getName()+" ");//��������
    		//System.out.println(method.getName());
    		//�����Ի�ȡ��������
    		
    	}
    	
    	//��2����ȡ��������з���
    	Method[]meths=clazz.getDeclaredMethods();
    	for(Method m:meths) {
    		//System.out.println(m);
    	}
    	
    	//(3)��ȡָ�������ķ���(������Χ��������)
    	String name="print";//��������
    	Method meth=clazz.getMethod(name, String.class);
    	//System.out.println(meth);
    	
    	//(4)��ȡָ�������ķ���(��������Χ����������)
    	String names="print_a";
    	Method methg=clazz.getDeclaredMethod(names);
    	//System.out.println(methg.getName());
    	
    	
    	
    	//****************************************���÷���****************************************
    	String value="Сǿ";
    	Class<?> cla=Class.forName("Person.Son");
    	Object ob=cla.getDeclaredConstructor().newInstance();//�����޲ι��췽����ʵ�������� ���÷���������ʵ��������
    	String setname="setName";//��������
    	Method setmethod=clazz.getDeclaredMethod(setname, String.class);//��ȡָ������
    	setmethod.invoke(ob, value);//����ָ������ �ȼ��� ����.����(����);���÷�����Method��������Ҫ�ģ�
    	String getname="getName";
    	Method getmethod=clazz.getDeclaredMethod(getname);
    	//System.out.println(getmethod.invoke(ob));
    	
    	
    	
    	//****************************************��ȡ��Ա����****************************************
    	//(1)��ȡ����ȫ����Ա
    	Field [] fileds=clazz.getDeclaredFields();
    	for(Field field:fileds) {
    		//System.out.println(field.getName());
    	}
    	
    	//(2)��ȡ����ָ����Ա
    	Field sfiled=clazz.getDeclaredField("sage");
    	//System.out.println(sfiled.getName());
    	
    	//(3)��ȡ�����ȫ����Ա���������η������ǹ����Ĳ��ܻ�ȡ��
    	Field []ffileds=clazz.getFields();
    	
        //(4)��ȡ�����ָ����Ա
    	String fname="sname";
    	Field ffiled=clazz.getField("fname");
    	//System.out.println(ffiled.getName());
    	
    	
    	
    	//****************************************�����Գ�Ա��ֵ���˷����������ã�****************************************
    	Class<?>cl=Class.forName("Person.Person");
    	Object o=cl.getDeclaredConstructor().newInstance();
    	Field pname=cl.getDeclaredField("pname");
    	pname.setAccessible(true);//�����װ
    	pname.set(o, "С��");//��������ֵʱ�������Ա����ǹ����ģ�������Ҫ�����װ
    	//System.out.println(pname.get(o));
    	//��ȡ��Ա���ͣ�����Ҫ��
    	//System.out.println(pname.getType().getSimpleName());
    	//System.out.println(pname.getType().getName());
    	
	}
    
  
   
    
    
}
