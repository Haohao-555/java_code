package File;

import java.io.File;
import java.text.SimpleDateFormat;

public class JavaAPIdemo_two {
    public static void main(String[] args) {
    	File file=new File("e:"+File.separator+"javawork"+File.separator+"File_demo"+File.separator+"my.jpg");
		System.out.println("文件是否可读"+file.canRead());
		System.out.println("文件是否可写"+file.canWrite());
		System.out.println("文件大小"+file.length());//返回字节长度long类型
		System.out.println("文件最后修改的时间"+file.lastModified());//返回的数据类型是long类型
		//将其转化成yyy-MM-dd
		System.out.println("文件最后修改的时间"+new SimpleDateFormat("yyy-MM-dd HH:mm:ss").format(file.lastModified()));
		System.out.println("是否为目录"+file.isDirectory());//目录下有多个文件
		System.out.println("是否为文件"+file.isFile());
		
		//接下来是列出目录下的所有文件
		File file_one=new File("e:"+File.separator+"javawork"+File.separator+"File_demo"+File.separator+"hello"+File.separator+"demo");//给定目录
		if(file_one.isDirectory()){
			File result[]=file_one.listFiles();//返回所有文件名并将其放在File类型的数组内
			for(int x=0;x<result.length;x++){
				System.out.println(result[x]);
			}
			
		}
	}
}
