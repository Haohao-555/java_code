package ByteArrayStream_demo;
//该程序输出的数据是字符串
import java.io.*;

public class JavaAPIdemo_one {
   public static void main(String[] args) throws Exception {
	String str="www.mldn.com";
	InputStream input=new ByteArrayInputStream(str.getBytes());//将数据保存在内存流（输入流）
	OutputStream output=new ByteArrayOutputStream();//读取内存中的数据(输出流)
	//单个字节读取，将小写变为大写
	int datas=0;
	while((datas=input.read())!=-1){
		output.write(Character.toUpperCase((char)datas));//将数据保存在输出流
	}
	System.out.println(output);//这句代码就将保存在输出流的数据（字节）自动转化成字符串
	output.close();
	input.close();
	}
}
//该程序数据存放的终端是在内存