package BtyeStream_demo;
import java.io.*;
//�ó����������ֻ�ܲ��ϸ���
public class OutputStream_demo_one {
   public static void main(String[] args) throws Exception {
	File file=new File("e:"+File.separator+"javawork"+File.separator+"BtyeStream_demo"+File.separator+"hello"+File.separator+"demo"+File.separator+"mldn.txt");
	//���ļ�Ŀ¼������ʱ�����������Զ�����
	if(!file.getParentFile().exists()){
		file.getParentFile().mkdirs();//������Ŀ¼
	}
	OutputStream output=new FileOutputStream(file);//ͨ������ʵ����
	//FileOutputStream��OutputStream�����࣬Ҳ������AutoCloseable�ӿ�����
	String str="�ƼѺ�";//���������
	output.write(str.getBytes());//������ת�����ֽ����飬���������
	output.close();//�ļ��ر�
  }
}
/*OutputStream�����������
 * ��1��ÿ�����Ϊ�����ֽ� public abstract void write(int b)throws IOException
 *  (2)ÿ�����һ���ֽ�����  public abstract void write(byte[] b)throws IOException
 *  (3)ÿ����������ֽ�����  public abstract void write(byte[] b��int off,int len)throws IOException
 * */
 //�ֽ����ʱ��Ҫ����ת�����ַ����������