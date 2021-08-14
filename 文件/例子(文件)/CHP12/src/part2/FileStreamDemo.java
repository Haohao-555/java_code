package part2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class FileStreamDemo {
	public static void main(String args[ ]){
		String s = "Hello";
        try{
        	FileOutputStream fo = new FileOutputStream("file.txt");
            byte[] b = s.getBytes();
            fo.write(b);
            fo.close();
            FileInputStream f =new FileInputStream("file.txt");
            int num = f.available();//从输入流读取字节数
            byte[] buf = new byte[num];//将fo中的数据读入到字节数组buf
            
            int i;
            int by=f.read(buf);
            for (i=0; by!=-1; i++){//顺序读取文件内容
                String str = new String(buf);
            	System.out.println("该文件中的内容是：" + str);
                by=f.read(buf);
            } 
            f.close( );
        }catch(FileNotFoundException e){
        	System.out.println("发生FileNotFound异常"+e.getMessage());
            e.printStackTrace();
        }catch (IOException e){
            System.err.println("发生输出输出异常:" + e);
            e.printStackTrace( );
        }
    }
}
