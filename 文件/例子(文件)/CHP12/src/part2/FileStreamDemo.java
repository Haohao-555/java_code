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
            int num = f.available();//����������ȡ�ֽ���
            byte[] buf = new byte[num];//��fo�е����ݶ��뵽�ֽ�����buf
            
            int i;
            int by=f.read(buf);
            for (i=0; by!=-1; i++){//˳���ȡ�ļ�����
                String str = new String(buf);
            	System.out.println("���ļ��е������ǣ�" + str);
                by=f.read(buf);
            } 
            f.close( );
        }catch(FileNotFoundException e){
        	System.out.println("����FileNotFound�쳣"+e.getMessage());
            e.printStackTrace();
        }catch (IOException e){
            System.err.println("�����������쳣:" + e);
            e.printStackTrace( );
        }
    }
}
