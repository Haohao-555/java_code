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
	//ֻ�ܲ����ַ���
	pro.setProperty("m", "12");
	pro.setProperty("n", "13");
	pro.setProperty("b", "14");
	System.out.println(pro.getProperty("m"));
	System.out.println(pro.getProperty("v","NOfound"));
	System.out.println(pro.getProperty("v"));
	
	
	//�����Դ�����ļ����������Դ�ļ���
	Properties prt=new Properties();
	prt.setProperty("beijing", "����");//���Ŀ���������ת���ˣ�
	prt.setProperty("shanghai", "�Ϻ�");
	prt.setProperty("tianjin", "���");
	File file=new File("e:"+File.separator+"javawork"+File.separator+"Properties_demo"+File.separator+"mldn.txt");
	OutputStream out=new FileOutputStream(file);
	prt.store(out, "���ĵ�ע�Ϳ������ġ���english");
	
	//��ȡ��Դ�ļ�
	InputStream in=new FileInputStream(file);
	prt.load(in);
	System.out.println(prt);
	System.out.println(prt.getProperty("beijing"));
  }
}
/*ʹ��Properties���͵�����ص��ǿ��Խ�����Դ���ݵ�����������Ĵ��������
 * ����ʵ�ʵĿ���֮��Properties�������ڶ�ȡ������Դ����Ϣ
 * */
