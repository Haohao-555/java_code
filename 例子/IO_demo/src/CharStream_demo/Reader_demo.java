package CharStream_demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class Reader_demo {
  public static void main(String[] args) throws Exception {
	  File file=new File("e:"+File.separator+"javawork"+File.separator+"Writer_ReaderStream_demo"+File.separator+"hello"+File.separator+"demo"+File.separator+"mldn.txt");
	  if(file.exists()){
		  Reader in=new FileReader(file);
		  char data[]=new char[1024];//字符数组
		  int len=in.read(data);
		  System.out.println("读取内容为:"+new String(data,0,len));
		  in.close();
	  }
}
}
