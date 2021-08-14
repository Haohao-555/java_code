package entity;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.reflect.Constructor;

//登记式/静态内部类
public class Demo5 implements Serializable {
	//内部静态类
    private static class Demo6{
    	private static final Demo5 demo=new Demo5();
    }
    private Demo5(){

    }
    private Object readResolve() throws ObjectStreamException{
        return Demo6.demo;
      }
    
    public void sayHello(){
    	System.out.println("登记式/静态内部类:Hello,CSDN");
    }
    public static final Demo5 getdemo(){
    	return Demo6.demo;
    }
    public static void main(String[] args) throws Exception {
    	System.out.println("正常获取实例化对象");
		Demo5 demo=Demo5.getdemo();
		Demo5 demo1=Demo5.getdemo();
		System.out.println(demo.hashCode());
		System.out.println(demo1.hashCode());
	    //demo.sayHello();
	    
		System.out.println("通过Java反射机制获取实例化对象");
		Class<?> c=Class.forName("entity.Demo5");
		Constructor con=c.getDeclaredConstructor(null);
		con.setAccessible(true);
		Demo5 d1=(Demo5) con.newInstance();
		Demo5 d2=(Demo5) con.newInstance();
		System.out.println(d1.hashCode());
		System.out.println(d2.hashCode());
    }
}
