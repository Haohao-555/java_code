package work;

public class JavaAPIDemo {
   public static void main(String[] args) {
		long start=System.currentTimeMillis();
		Runtime run=Runtime.getRuntime();//获取实例化对象
		System.out.println(run.availableProcessors());//cpu核数
		System.out.println(run.maxMemory());//获取内存最大空间
		System.out.println(run.totalMemory());//获取可用内存空间
		System.out.println(run.freeMemory());//获取空闲内存空间
	
		String str="";
		for(int x=0;x<30000;x++){
			str+=x;//产生大量垃圾;
		}
		long end=System.currentTimeMillis();
		System.out.println("操作耗时："+(end-start)+"毫秒");
        
	}

}
