package work;

import java.io.*;
public class JavaAPIdemo {
	   public static void main(String[] args) {
		if(args.length!=2){
			System.out.println();
		}
	  }
}
class FileUtil{//定义一个文件的操作类
	private File srcFile;//源文件路径
	private File desFile; //目标文件路径
	public FileUtil(File srcFile, File desFile) {
		super();
		this.srcFile = srcFile;
		this.desFile = desFile;
	}
	public boolean copy(){//文件拷贝处理
		return false;
	}
	
}

