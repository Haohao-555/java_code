package work;

import java.io.*;

public class JavaAPIdemo_one {
   public static void main(String[] args) throws Exception {
	   System.getProperties().list(System.out);//��ȡ��������
	   File file=new File("e:"+File.separator+"javawork"+File.separator+"System_demo"+File.separator+"mldn.txt");
	   OutputStream output=new FileOutputStream(file);
	   String str="����";
	   output.write(str.getBytes("ISO8859-1"));
	   //��������Ĭ�ϵ��Ե��ļ�������file.encoding=GBK
	   //output.write(str.getBytes("ISO8859-1"));���ñ���ΪISO8859-1ʱ��������롣
   }
}
/*GBK/GB2312�����ʱ��룬��������������Ϣ������GB2312ֻ�����������ģ���GBK�����������ĺͷ�������
 * ISO8859-1�����ʱ��룬��������������ĸ��Ϣ�������������������Ҫ���б��봦��
 * UNICODE:����ʮ�����Ƶķ�ʽ�洢��������������������Ϣ��
 * UTF���룺�������ֲ���ʹ��ʮ�����Ʊ��룬����ͨ����ĸ���õ���ISO8859-1���룬�ô��ǿ��Կ��ٽ������ݴ��䣬��Լ������ѡ��
 * */
