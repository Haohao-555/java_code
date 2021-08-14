package BtyeStream_demo;
import java.io.*;
//该程序：数据输出只能不断覆盖
public class OutputStream_demo_one {
   public static void main(String[] args) throws Exception {
	File file=new File("e:"+File.separator+"javawork"+File.separator+"BtyeStream_demo"+File.separator+"hello"+File.separator+"demo"+File.separator+"mldn.txt");
	//该文件目录不存在时下面代码可以自动创建
	if(!file.getParentFile().exists()){
		file.getParentFile().mkdirs();//创建父目录
	}
	OutputStream output=new FileOutputStream(file);//通过子类实例化
	//FileOutputStream是OutputStream的子类，也是属于AutoCloseable接口子类
	String str="黄佳浩";//输出的内容
	output.write(str.getBytes());//将内容转化成字节数组，并将其输出
	output.close();//文件关闭
  }
}
/*OutputStream的输出有三中
 * （1）每次输出为单个字节 public abstract void write(int b)throws IOException
 *  (2)每次输出一组字节数据  public abstract void write(byte[] b)throws IOException
 *  (3)每次输出部分字节数据  public abstract void write(byte[] b，int off,int len)throws IOException
 * */
 //字节输出时需要将其转化从字符串才能输出