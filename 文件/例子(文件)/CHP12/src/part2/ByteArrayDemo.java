package part2;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
public class ByteArrayDemo {
	public static void main(String[] args) {
		int n = 0;
		ByteArrayOutputStream bo = new ByteArrayOutputStream();
		byte[] array = {1,2,3,4};
		for(int i = 0; i <array.length; i++){
			bo.write(array[i]);//将字节数组的内容写入输出流
		}
		System.out.println("写入的内容为：");
		byte[] buf = bo.toByteArray();//将输出流的内容转换为字节数组
		for(int i = 0; i< buf.length; i++){
			System.out.print(buf[i] + "\t");
		}
        System.out.println();
        ByteArrayInputStream bi = new ByteArrayInputStream(buf);
        System.out.println("读取的内容为：");
        while((n=bi.read()) != -1){//读取输入流中的内容
        	System.out.print(n + "\t");
        }
	}
}
