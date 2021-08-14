package File;

import java.io.File;
import java.text.SimpleDateFormat;

public class JavaAPIdemo_two {
    public static void main(String[] args) {
    	File file=new File("e:"+File.separator+"javawork"+File.separator+"File_demo"+File.separator+"my.jpg");
		System.out.println("�ļ��Ƿ�ɶ�"+file.canRead());
		System.out.println("�ļ��Ƿ��д"+file.canWrite());
		System.out.println("�ļ���С"+file.length());//�����ֽڳ���long����
		System.out.println("�ļ�����޸ĵ�ʱ��"+file.lastModified());//���ص�����������long����
		//����ת����yyy-MM-dd
		System.out.println("�ļ�����޸ĵ�ʱ��"+new SimpleDateFormat("yyy-MM-dd HH:mm:ss").format(file.lastModified()));
		System.out.println("�Ƿ�ΪĿ¼"+file.isDirectory());//Ŀ¼���ж���ļ�
		System.out.println("�Ƿ�Ϊ�ļ�"+file.isFile());
		
		//���������г�Ŀ¼�µ������ļ�
		File file_one=new File("e:"+File.separator+"javawork"+File.separator+"File_demo"+File.separator+"hello"+File.separator+"demo");//����Ŀ¼
		if(file_one.isDirectory()){
			File result[]=file_one.listFiles();//���������ļ������������File���͵�������
			for(int x=0;x<result.length;x++){
				System.out.println(result[x]);
			}
			
		}
	}
}
