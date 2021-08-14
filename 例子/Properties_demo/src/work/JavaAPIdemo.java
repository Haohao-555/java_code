package work;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class JavaAPIdemo {
   public static void main(String[] args) throws Exception {
	Properties pro=new Properties();
	//只能操作字符串
	pro.setProperty("m", "12");
	pro.setProperty("n", "13");
	pro.setProperty("b", "14");
	System.out.println(pro.getProperty("m"));
	System.out.println(pro.getProperty("v","NOfound"));
	System.out.println(pro.getProperty("v"));
	
	
	//将属性存放在文件输出流（资源文件）
	Properties prt=new Properties();
	prt.setProperty("beijing", "北京");//中文看不见（被转码了）
	prt.setProperty("shanghai", "上海");
	prt.setProperty("tianjin", "天津");
	File file=new File("e:"+File.separator+"javawork"+File.separator+"Properties_demo"+File.separator+"mldn.txt");
	OutputStream out=new FileOutputStream(file);
	prt.store(out, "中文的注释看不见的——english");
	
	//读取资源文件
	InputStream in=new FileInputStream(file);
	prt.load(in);
	System.out.println(prt);
	System.out.println(prt.getProperty("beijing"));
  }
}
/*使用Properties类型的最大特点是可以进行资源内容的输入与输出的处理操作，
 * 但在实际的开发之中Properties往往用于读取配置资源的信息
 * */
