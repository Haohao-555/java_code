package work_one;

import Person.Person;
//三种方法都是重点
public class JavaAPIdemo {
   public static void main(String[] args) throws Exception {
	Person per=new Person();
	//该方法有一个缺点：如果想获得Class类对象，则必须产生指定类对象后才能获取
	Class<?extends Person>cis=per.getClass();
	System.out.println(cis.getName());//获取类的完整名字
	
	//JVM直接支持 如果采用此种模式，则需要导入程序对应的开发包
	Class<?extends Person>cir=Person.class;
	System.out.println(cir.getName());//获取类的完整名字
	
	//Class类提供的静态方法forname() 特点是不需要编写任何的import语句
	Class<?>cls=Class.forName("Person.Person");//包.类
	System.out.println(cls.getName());
}
}
