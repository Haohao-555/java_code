package File;

import java.io.File;
import java.io.IOException;

public class JavaAPIdemo_one {
  public static void main(String[] args) throws Exception {
	  File file=new File("e:"+File.separator+"学期"+File.separator+"mldn.txt");
	//或File file=new File("e:\\mldn.txt"); File.separator表示分隔符
	if(file.exists()){//文件存在
		  System.out.println("文件已经存在");
		  System.out.println("文件已经删除");
		  file.delete();//删除文件
	}else{
		  System.out.println(file.createNewFile());//true代表是该文件没有存在，可以被创建
	}
	
	//创建一个文件是多级目录下的
	File file1=new File("e:"+File.separator+"hello"+File.separator+"demo"+File.separator+"mldn.txt");
	//多级目录
	if(!file1.getParentFile().exists()){//判断父目录是否存在
		//假设不存在
		file1.getParentFile().mkdirs();//创建父目录
//		file1.getParentFile().mkdir();创建父目录是单级目录
		file1.createNewFile();
	}
	
  }
}
