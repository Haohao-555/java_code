package File;

import java.io.File;
import java.io.IOException;

public class JavaAPIdemo_one {
  public static void main(String[] args) throws Exception {
	  File file=new File("e:"+File.separator+"ѧ��"+File.separator+"mldn.txt");
	//��File file=new File("e:\\mldn.txt"); File.separator��ʾ�ָ���
	if(file.exists()){//�ļ�����
		  System.out.println("�ļ��Ѿ�����");
		  System.out.println("�ļ��Ѿ�ɾ��");
		  file.delete();//ɾ���ļ�
	}else{
		  System.out.println(file.createNewFile());//true�����Ǹ��ļ�û�д��ڣ����Ա�����
	}
	
	//����һ���ļ��Ƕ༶Ŀ¼�µ�
	File file1=new File("e:"+File.separator+"hello"+File.separator+"demo"+File.separator+"mldn.txt");
	//�༶Ŀ¼
	if(!file1.getParentFile().exists()){//�жϸ�Ŀ¼�Ƿ����
		//���費����
		file1.getParentFile().mkdirs();//������Ŀ¼
//		file1.getParentFile().mkdir();������Ŀ¼�ǵ���Ŀ¼
		file1.createNewFile();
	}
	
  }
}
