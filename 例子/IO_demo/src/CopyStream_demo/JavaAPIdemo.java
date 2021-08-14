package CopyStream_demo;

import java.io.*;

public class JavaAPIdemo {
   public static void main(String[] args) throws Exception {
	  File file=new File("e:"+File.separator+"data.txt");
	  PrintStream pu=new PrintStream(new FileOutputStream(file),true);
	  pu.println("姓名：小黄");
	  pu.print("年龄：");
	  pu.println("78");
	  //格式化输出
	  String name="小强子";
	  int age=78;
	  double salary=785415.25642;
	  pu.printf("姓名：%s、年龄：%d、收入：%9.2f", name,age,salary);
	  pu.close();
	  
  }
}
/**
 * 打印流有两种
 * （1）PrintStream字节打印流  构造方法是 public PrintStream(OutputStream out)
 *      public class PrintStream extends FilerOutputStream
 * （2）PrintWriter字符打印流 构造方法是 public PrintWriter(OutputStream out)或PrintWriter(Writer out)
 *     public class PrintWriter extends Writer
 *     
 *     好处在于输入到文件的数据不用转化成字节数组进行输出
 *  
 */