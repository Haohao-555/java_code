package BtyeStream_demo;
//该程序：数据可以不断追加
import java.io.*;
public class OutputStream_demo_two {
	 public static void main(String[] args) throws Exception {
			File file=new File("e:"+File.separator+"javawork"+File.separator+"BtyeStream_demo"+File.separator+"hello1"+File.separator+"demo"+File.separator+"mldn.txt");
			//该文件目录不存在时下面代码可以自动创建
			if(!file.getParentFile().exists()){
				file.getParentFile().mkdirs();//创建父目录
			}
			OutputStream output=new FileOutputStream(file,true);//true目的是数据可以不断追加
			String str="黄佳浩\r\n";//\r\n表示换行
			output.write(str.getBytes());
			String str1="黄佳浩哈哈\r\n";//\r\n表示换行
			output.write(str1.getBytes());
			output.close();//文件关闭
		  }
}

