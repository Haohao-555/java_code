package work;

//ת����
import java.io.*;

public class JavaAPIdemo {
   public static void main(String[] args) throws Exception {
	   File file=new File("e:"+File.separator+"javawork"+File.separator+"Stream_demo"+File.separator+"hello"+File.separator+"demo"+File.separator+"mldn.txt");
   	if(!file.getParentFile().exists()){
   		file.getParentFile().mkdirs();
   	}
   	OutputStream output=new FileOutputStream(file);//�����ֽ������
   	Writer out=new OutputStreamWriter(output);//���ֽ���ת�����ַ���
   	out.write("����");
   	out.close();
   	
}
}
