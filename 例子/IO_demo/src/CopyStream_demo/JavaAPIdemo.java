package CopyStream_demo;

import java.io.*;

public class JavaAPIdemo {
   public static void main(String[] args) throws Exception {
	  File file=new File("e:"+File.separator+"data.txt");
	  PrintStream pu=new PrintStream(new FileOutputStream(file),true);
	  pu.println("������С��");
	  pu.print("���䣺");
	  pu.println("78");
	  //��ʽ�����
	  String name="Сǿ��";
	  int age=78;
	  double salary=785415.25642;
	  pu.printf("������%s�����䣺%d�����룺%9.2f", name,age,salary);
	  pu.close();
	  
  }
}
/**
 * ��ӡ��������
 * ��1��PrintStream�ֽڴ�ӡ��  ���췽���� public PrintStream(OutputStream out)
 *      public class PrintStream extends FilerOutputStream
 * ��2��PrintWriter�ַ���ӡ�� ���췽���� public PrintWriter(OutputStream out)��PrintWriter(Writer out)
 *     public class PrintWriter extends Writer
 *     
 *     �ô��������뵽�ļ������ݲ���ת�����ֽ�����������
 *  
 */