package work;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

public class JavaAPIdemo_two {
   public static void main(String[] args) throws Exception {
	   File file =new File("e:"+File.separator+"javawork"+File.separator+"RandomAccessFile_demo"+File.separator+"mldn.txt");
		RandomAccessFile raf=new RandomAccessFile(file,"rw");//�����ļ���д
		String[] names=new String[]{"zhangsan","wangwu  ","lisi    "};//ÿ���ַ���Ϊ8λ���ֽڣ�
		int []ages=new int[]{30,20,16};//����Ϊ4λ���ֽڣ�
		//��������lisi
		raf.skipBytes(24);//���ֽ�24λ
		byte data[]=new byte[8];//�����ռ�Ϊ12�ֽڵ��ֽ�����
		int len=raf.read(data);
		System.out.println("����"+new String(data,0,len)+"����"+raf.readInt());
		raf.close();
}
}
