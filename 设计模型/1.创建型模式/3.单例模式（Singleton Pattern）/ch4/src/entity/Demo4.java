package entity;

import java.lang.reflect.Constructor;

//双检锁/双重校验锁
public class Demo4 {
    private volatile static Demo4 demo;
    private Demo4(){
    	if(demo!= null){
            throw new RuntimeException();
        }
    }
    public void sayhello(){
    	System.out.println("双检锁/双重校验锁:Hello,CSDN");
    }
    public static Demo4 getdemo(){
    	if(demo==null){
    		synchronized (Demo4.class) {
				if(demo==null){
					demo=new Demo4();
				}
			}
    	}
    	return demo;
    }
    public static void main(String[] args) throws Exception {
		Demo4 demo=Demo4.getdemo();
		Demo4 demo1=Demo4.getdemo();
		System.out.println(demo);
		System.out.println(demo1);
		demo.sayhello();
		
		System.out.println("反射");
		Class<?> c=Class.forName("entity.Demo4");
		Constructor con=c.getDeclaredConstructor(null);
		con.setAccessible(true);
		Demo4 d1=(Demo4) con.newInstance();
		Demo4 d2=(Demo4) con.newInstance();
		System.out.println(d1);
		System.out.println(d2);
		
	}
}
