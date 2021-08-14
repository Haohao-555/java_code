package BtyeStream_demo;

import java.io.*;


public class InputStream_demo {
    public static void main(String[] args) throws Exception {
    	File file=new File("e:"+File.separator+"javawork"+File.separator+"BtyeStream_demo"+File.separator+"hello"+File.separator+"demo"+File.separator+"mldn.txt");
    	InputStream input=new FileInputStream(file);//通过子类创建对象
    	byte data[]=new byte[1024];//开辟一个缓存空间
    	int len=input.read(data);//读取数据,数据全部保存在字节数组之中，返回读取个数
    	//如果文件种数据的字节长度超过缓存长度即1024，则返回len的值为1024，如果没有超过1024，则返回读取真实长度
    	System.out.println("读取的长度"+len);
    	System.out.println(new String(data,0,len));
    	//new String(data,0,len)将字节数组转化成字符串（从下标0开始，读取到下标为len）
    	input.close();
    	}
}
/*
 * （1）public abstract int read()throws IOException    每次读取单个字节数据
 *     i)如果现在已经读取到底了，返回为-1  （-1相当于null）效率低
 *     ii)当还没读取完前，每次读取返回的是该字节的大小
 * （2常用）public abstract int read(byte[] b)throws IOException   每次读取一组字节数据
 *     i）假设一组数据里面有35个字节，每读取一组字节长度为14的字节数据时，会返回该字节数组的长度
 *     ii）即前两组返回14，第三组返回11，第4组(数据读取到底)返回-1（-1相当于null）
 * （3）public abstract int read(byte[] b,int off,int len)throws IOException  每次读取部分字节数据
 *     
 * */
