package BtyeStream_demo;
//�ó������ݿ��Բ���׷��
import java.io.*;
public class OutputStream_demo_two {
	 public static void main(String[] args) throws Exception {
			File file=new File("e:"+File.separator+"javawork"+File.separator+"BtyeStream_demo"+File.separator+"hello1"+File.separator+"demo"+File.separator+"mldn.txt");
			//���ļ�Ŀ¼������ʱ�����������Զ�����
			if(!file.getParentFile().exists()){
				file.getParentFile().mkdirs();//������Ŀ¼
			}
			OutputStream output=new FileOutputStream(file,true);//trueĿ�������ݿ��Բ���׷��
			String str="�ƼѺ�\r\n";//\r\n��ʾ����
			output.write(str.getBytes());
			String str1="�ƼѺƹ���\r\n";//\r\n��ʾ����
			output.write(str1.getBytes());
			output.close();//�ļ��ر�
		  }
}

