package BtyeStream_demo;

import java.io.*;


public class InputStream_demo {
    public static void main(String[] args) throws Exception {
    	File file=new File("e:"+File.separator+"javawork"+File.separator+"BtyeStream_demo"+File.separator+"hello"+File.separator+"demo"+File.separator+"mldn.txt");
    	InputStream input=new FileInputStream(file);//ͨ�����ഴ������
    	byte data[]=new byte[1024];//����һ������ռ�
    	int len=input.read(data);//��ȡ����,����ȫ���������ֽ�����֮�У����ض�ȡ����
    	//����ļ������ݵ��ֽڳ��ȳ������泤�ȼ�1024���򷵻�len��ֵΪ1024�����û�г���1024���򷵻ض�ȡ��ʵ����
    	System.out.println("��ȡ�ĳ���"+len);
    	System.out.println(new String(data,0,len));
    	//new String(data,0,len)���ֽ�����ת�����ַ��������±�0��ʼ����ȡ���±�Ϊlen��
    	input.close();
    	}
}
/*
 * ��1��public abstract int read()throws IOException    ÿ�ζ�ȡ�����ֽ�����
 *     i)��������Ѿ���ȡ�����ˣ�����Ϊ-1  ��-1�൱��null��Ч�ʵ�
 *     ii)����û��ȡ��ǰ��ÿ�ζ�ȡ���ص��Ǹ��ֽڵĴ�С
 * ��2���ã�public abstract int read(byte[] b)throws IOException   ÿ�ζ�ȡһ���ֽ�����
 *     i������һ������������35���ֽڣ�ÿ��ȡһ���ֽڳ���Ϊ14���ֽ�����ʱ���᷵�ظ��ֽ�����ĳ���
 *     ii����ǰ���鷵��14�������鷵��11����4��(���ݶ�ȡ����)����-1��-1�൱��null��
 * ��3��public abstract int read(byte[] b,int off,int len)throws IOException  ÿ�ζ�ȡ�����ֽ�����
 *     
 * */
