package work;

import java.io.*;
public class JavaAPIdemo {
	   public static void main(String[] args) {
		if(args.length!=2){
			System.out.println();
		}
	  }
}
class FileUtil{//����һ���ļ��Ĳ�����
	private File srcFile;//Դ�ļ�·��
	private File desFile; //Ŀ���ļ�·��
	public FileUtil(File srcFile, File desFile) {
		super();
		this.srcFile = srcFile;
		this.desFile = desFile;
	}
	public boolean copy(){//�ļ���������
		return false;
	}
	
}

