package ByteArrayStream_demo;
//�ó���������������ַ���
import java.io.*;

public class JavaAPIdemo_one {
   public static void main(String[] args) throws Exception {
	String str="www.mldn.com";
	InputStream input=new ByteArrayInputStream(str.getBytes());//�����ݱ������ڴ�������������
	OutputStream output=new ByteArrayOutputStream();//��ȡ�ڴ��е�����(�����)
	//�����ֽڶ�ȡ����Сд��Ϊ��д
	int datas=0;
	while((datas=input.read())!=-1){
		output.write(Character.toUpperCase((char)datas));//�����ݱ����������
	}
	System.out.println(output);//������ͽ�����������������ݣ��ֽڣ��Զ�ת�����ַ���
	output.close();
	input.close();
	}
}
//�ó������ݴ�ŵ��ն������ڴ�