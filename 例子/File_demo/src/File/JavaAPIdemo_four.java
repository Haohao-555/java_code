package File;

import java.io.File;

public class JavaAPIdemo_four {
    public static void main(String[] args) {
		File file=new File("e:"+File.separator+"javawork"+File.separator+"File_demo"+File.separator+"hello"+File.separator+"demo");
		long start=System.currentTimeMillis();
		renameDir(file);
		long end=System.currentTimeMillis();
		System.out.println("ִ�е�ʱ��Ϊ"+(end-start));
	}
    public static void renameDir(File file){
    	if(file.isDirectory()){
    		File result[]=file.listFiles();
    		if(result!=null){
    			for(int x=0;x<result.length;x++){
    				renameDir(result[x]);
    			}
    		}
    	}else if(file.isFile()){//������ļ������������
    		String filename=null;
    		//��ȡ����׺��
    		if(file.getName().contains(".")){//����ļ����а���"."
    			filename=file.getName().substring(0,file.getName().lastIndexOf("."))+".py";
    			//��ȡ�ļ����֣���������׺��������Ӻ�׺��Ϊ".txt"
    		}else{//�ļ�����û�к�׺��
    			filename=file.getName()+".py";
    		}
    		File newfile=new File(file.getParentFile(),filename);//�µ��ļ�����
    		file.renameTo(newfile);//��������
    	}
    }
}
