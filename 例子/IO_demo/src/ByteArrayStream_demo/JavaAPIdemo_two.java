package ByteArrayStream_demo;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class JavaAPIdemo_two {
    public static void main(String[] args) throws Exception {
    	String str="www.mldn.com";
    	InputStream input=new ByteArrayInputStream(str.getBytes());//将数据保存在内存流（输入流）
    	ByteArrayOutputStream output=new ByteArrayOutputStream();//读取内存中的数据(输出流)
    	//单个字节读取，将小写变为大写
    	int datas=0;
    	while((datas=input.read())!=-1){
    		output.write(Character.toUpperCase(datas));//将数据保存在输出流
    	}
    	//获取字节数据
    	byte data[]=output.toByteArray();//该方法只有OutputStream的子类ByteArrayOutputStream才有，因此只能创建ByteArrayOutputStream类的实例化
    	//ByteArrayOutputStream还有一个方法是获取数据为 ：使用字符串的形式获取数据
    	System.out.println(new String(data));//自己将字节数据转化成字符串数据
    	//好处在于自己来处理数据，可能数据里面有其他二进制数据
    	output.close();
    	input.close();
	}
}
