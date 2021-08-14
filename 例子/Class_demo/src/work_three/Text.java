package work_three;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import Person.Son;



public class Text {
    public static void main(String[] args) throws Exception {
    	Class<?> clazz=Son.class;
    	//****************************************获取父类名字****************************************
    	Class<?>parent=clazz.getSuperclass();
    	//System.out.println(parent.getName());
    	//System.out.println(parent.getSuperclass().getName());
    	
    	
    	
    	//****************************************获取包名****************************************
    	Package pack=clazz.getPackage();
    	//System.out.println(pack.getName());
    	
    	
    	
    	//****************************************获取接口****************************************
    	Class<?>[] instance=clazz.getInterfaces();
    	for(Class<?> temp:instance) {
    		//System.out.println(temp.getName());
    	}
    	
    	
    	
    	//****************************************获取所有构造方法****************************************
    	Constructor<?>[]constructors=clazz.getDeclaredConstructors();
    	for(Constructor<?> cons:constructors) {
    		//System.out.println(cons);
    	}
    	
    	
    	
    	//****************************************创建有参实例化对象****************************************
    	Constructor<?> constructor=clazz.getDeclaredConstructor(String.class,int.class);//调用有参构造方法
    	Object obj=constructor.newInstance("小强",12);
    	System.out.println(obj);
    	
    	
    	
    	//****************************************获取普通方法****************************************
    	//(1)获取该类的全部方法（包括父类）
    	Method[] methods=clazz.getMethods();
    	for(Method method:methods) {
    		//自定义输出形式
    		int mod=method.getModifiers();//获取修饰符
    		//System.out.print(Modifier.toString(mod)+" ");
    		//System.out.print(method.getReturnType().getName()+" ");//返回类型
    		//System.out.println(method.getName());
    		//还可以获取参数类型
    		
    	}
    	
    	//（2）获取本类的所有方法
    	Method[]meths=clazz.getDeclaredMethods();
    	for(Method m:meths) {
    		//System.out.println(m);
    	}
    	
    	//(3)获取指定参数的方法(搜索范围包括父类)
    	String name="print";//方法名字
    	Method meth=clazz.getMethod(name, String.class);
    	//System.out.println(meth);
    	
    	//(4)获取指定参数的方法(搜索方范围不包括父类)
    	String names="print_a";
    	Method methg=clazz.getDeclaredMethod(names);
    	//System.out.println(methg.getName());
    	
    	
    	
    	//****************************************调用方法****************************************
    	String value="小强";
    	Class<?> cla=Class.forName("Person.Son");
    	Object ob=cla.getDeclaredConstructor().newInstance();//调用无参构造方法，实例化对象 调用方法必须先实例化对象
    	String setname="setName";//方法名字
    	Method setmethod=clazz.getDeclaredMethod(setname, String.class);//获取指定方法
    	setmethod.invoke(ob, value);//调用指定方法 等价于 对象.方法(参数);（该方法是Method类种最主要的）
    	String getname="getName";
    	Method getmethod=clazz.getDeclaredMethod(getname);
    	//System.out.println(getmethod.invoke(ob));
    	
    	
    	
    	//****************************************获取成员属性****************************************
    	//(1)获取本类全部成员
    	Field [] fileds=clazz.getDeclaredFields();
    	for(Field field:fileds) {
    		//System.out.println(field.getName());
    	}
    	
    	//(2)获取本类指定成员
    	Field sfiled=clazz.getDeclaredField("sage");
    	//System.out.println(sfiled.getName());
    	
    	//(3)获取父类的全部成员（属性修饰符必须是公共的采能获取）
    	Field []ffileds=clazz.getFields();
    	
        //(4)获取父类的指定成员
    	String fname="sname";
    	Field ffiled=clazz.getField("fname");
    	//System.out.println(ffiled.getName());
    	
    	
    	
    	//****************************************给属性成员赋值（此方法尽量少用）****************************************
    	Class<?>cl=Class.forName("Person.Person");
    	Object o=cl.getDeclaredConstructor().newInstance();
    	Field pname=cl.getDeclaredField("pname");
    	pname.setAccessible(true);//解除封装
    	pname.set(o, "小明");//设置属性值时，该属性必须是公共的，否则需要解除封装
    	//System.out.println(pname.get(o));
    	//获取成员类型（最重要）
    	//System.out.println(pname.getType().getSimpleName());
    	//System.out.println(pname.getType().getName());
    	
	}
    
  
   
    
    
}
