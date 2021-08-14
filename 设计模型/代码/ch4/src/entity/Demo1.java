package entity;

import java.lang.reflect.Constructor;

//懒汉式(线程不安全)
public class Demo1 {
  private static Demo1 demo;
  private Demo1(){//构造方法私有化
	  
  }
  public void sayHello(){
	  System.out.println("懒汉式(线程不安全):CSDN");
  }
  public static Demo1 getdemo(){
	  if(demo==null){
		 return new Demo1(); 
	  }
		  return demo;
	}
  public static void main(String[] args) throws Exception {
	Demo1 demo=Demo1.getdemo();
	Demo1 demo2=Demo1.getdemo();
	System.out.println(demo);
	System.out.println(demo2);
	//demo.sayHello();

   }
}
