package File;

import java.io.File;
//���ĳ��Ŀ¼�������ļ� ���õݹ鷽��
public class JavaAPIdemo_three {
   public static void main(String[] args) {
	File file=new File("e:"+File.separator+"python"+File.separator+"work");
	long start=System.currentTimeMillis();
	listDir(file);
	long end =System.currentTimeMillis();
	System.out.println("ִ��ʱ��Ϊ"+(end-start)+"����");
}
   public static void listDir(File file){
	   if(file.isDirectory()){
		   File result[]=file.listFiles();//�г�Ŀ¼�µ�ȫ������
		   if(result!=null){
			   for(int x=0;x<result.length;x++){
				   listDir(result[x]);
			   }
		   }
		  
	   }
		   System.out.println(file);
	   
	   
   }
}
