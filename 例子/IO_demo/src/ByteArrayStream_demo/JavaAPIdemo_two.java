package ByteArrayStream_demo;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class JavaAPIdemo_two {
    public static void main(String[] args) throws Exception {
    	String str="www.mldn.com";
    	InputStream input=new ByteArrayInputStream(str.getBytes());//�����ݱ������ڴ�������������
    	ByteArrayOutputStream output=new ByteArrayOutputStream();//��ȡ�ڴ��е�����(�����)
    	//�����ֽڶ�ȡ����Сд��Ϊ��д
    	int datas=0;
    	while((datas=input.read())!=-1){
    		output.write(Character.toUpperCase(datas));//�����ݱ����������
    	}
    	//��ȡ�ֽ�����
    	byte data[]=output.toByteArray();//�÷���ֻ��OutputStream������ByteArrayOutputStream���У����ֻ�ܴ���ByteArrayOutputStream���ʵ����
    	//ByteArrayOutputStream����һ�������ǻ�ȡ����Ϊ ��ʹ���ַ�������ʽ��ȡ����
    	System.out.println(new String(data));//�Լ����ֽ�����ת�����ַ�������
    	//�ô������Լ����������ݣ�����������������������������
    	output.close();
    	input.close();
	}
}
