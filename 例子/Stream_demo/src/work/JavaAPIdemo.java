package work;

//转换流
import java.io.*;

public class JavaAPIdemo {
   public static void main(String[] args) throws Exception {
	   File file=new File("e:"+File.separator+"javawork"+File.separator+"Stream_demo"+File.separator+"hello"+File.separator+"demo"+File.separator+"mldn.txt");
   	if(!file.getParentFile().exists()){
   		file.getParentFile().mkdirs();
   	}
   	OutputStream output=new FileOutputStream(file);//创建字节输出流
   	Writer out=new OutputStreamWriter(output);//将字节流转化成字符流
   	out.write("哈哈");
   	out.close();
   	
}
}
