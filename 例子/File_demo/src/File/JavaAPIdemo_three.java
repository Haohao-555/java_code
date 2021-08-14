package File;

import java.io.File;
//输出某个目录下所有文件 采用递归方法
public class JavaAPIdemo_three {
   public static void main(String[] args) {
	File file=new File("e:"+File.separator+"python"+File.separator+"work");
	long start=System.currentTimeMillis();
	listDir(file);
	long end =System.currentTimeMillis();
	System.out.println("执行时间为"+(end-start)+"毫秒");
}
   public static void listDir(File file){
	   if(file.isDirectory()){
		   File result[]=file.listFiles();//列出目录下的全部内容
		   if(result!=null){
			   for(int x=0;x<result.length;x++){
				   listDir(result[x]);
			   }
		   }
		  
	   }
		   System.out.println(file);
	   
	   
   }
}
