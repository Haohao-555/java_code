package entity;

import java.lang.reflect.Constructor;

//懒汉式(线程安全)
public class Demo2 {
	private static Demo2 demo;
	  private Demo2(){//构造方法私有化
		  if(demo!= null){
	            throw new RuntimeException();
	        }
	  }
	  public void sayHello(){
		  System.out.println("懒汉式(线程安全):CSDN");
	  }
	  public static synchronized Demo2 getdemo(){
		  if(demo==null){
			 return new Demo2(); 
		  }
			  return demo;
		}
	  public static void main(String[] args) throws Exception {
		  
			  Demo2 demo=Demo2.getdemo();
			  System.out.println(demo.hashCode());
		  
		
		Demo2 demo1=Demo2.getdemo();
		
		System.out.println(demo1.hashCode());
		
		

		demo.sayHello();
		System.out.println("反射");
		Class<?> c=Class.forName("entity.Demo2");
		Constructor con=c.getDeclaredConstructor(null);
		con.setAccessible(true);
		Demo2 d1=(Demo2) con.newInstance();
		Demo2 d2=(Demo2) con.newInstance();
		System.out.println(d1);
		System.out.println(d2);
	   }
}
