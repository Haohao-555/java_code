package work;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

public class JavaAPIdemo_two {
   public static void main(String[] args) throws Exception {
	   File file =new File("e:"+File.separator+"javawork"+File.separator+"RandomAccessFile_demo"+File.separator+"mldn.txt");
		RandomAccessFile raf=new RandomAccessFile(file,"rw");//进行文件读写
		String[] names=new String[]{"zhangsan","wangwu  ","lisi    "};//每个字符串为8位（字节）
		int []ages=new int[]{30,20,16};//数字为4位（字节）
		//读出数据lisi
		raf.skipBytes(24);//跳字节24位
		byte data[]=new byte[8];//创建空间为12字节的字节数组
		int len=raf.read(data);
		System.out.println("姓名"+new String(data,0,len)+"年龄"+raf.readInt());
		raf.close();
}
}
