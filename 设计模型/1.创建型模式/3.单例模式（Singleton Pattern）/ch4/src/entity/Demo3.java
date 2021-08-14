package entity;

import java.lang.reflect.Constructor;

//饿汉式(线程安全)
public class Demo3 {
   private static Demo3 demo=new Demo3();
   public static Demo3 getDemo3(){
	   return demo;
   }
   public void sayHello(){
	   System.out.println("饿汉式(线程安全):Hello CSDN");
   }
//   private Demo3(){
//	   if(demo!= null){
//           throw new RuntimeException();
//       }
//   }
   public static void main(String[] args) throws Exception {
	Demo3 demo=Demo3.getDemo3();
	Demo3 demo1=Demo3.getDemo3();
	System.out.println(demo);
	System.out.println(demo1);
    demo.sayHello();
    
    
	System.out.println("反射");
	Class<?> c=Class.forName("entity.Demo3");
	Constructor con=c.getDeclaredConstructor(null);
	con.setAccessible(true);
	Demo3 d1=(Demo3) con.newInstance();
	Demo3 d2=(Demo3) con.newInstance();
	System.out.println(d1);
	System.out.println(d2);

   }
}
