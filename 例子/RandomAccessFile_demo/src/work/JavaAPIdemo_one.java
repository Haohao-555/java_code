package work;
//����ʹ��֮�����û����ж���Ҫ��ȡ�Ķ�����ָ���Ľṹ�������ݶ�ȡ��ǰ����ͬ�������ݳ���Ҫ����һ��
import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
public class JavaAPIdemo_one {
   public static void main(String[] args) throws Exception {
	File file =new File("e:"+File.separator+"javawork"+File.separator+"RandomAccessFile_demo"+File.separator+"mldn.txt");
	RandomAccessFile raf=new RandomAccessFile(file,"rw");//�����ļ���д
	//д���ļ�
	String[] names=new String[]{"zhangsan","wangwu  ","lisi    "};//ÿ���ַ���Ϊ8λ���ֽڣ�
	int []ages=new int[]{30,20,16};//����Ϊ4λ���ֽڣ�
	for(int i=0;i<names.length;i++){
		raf.write(names[i].getBytes());
		raf.writeInt(ages[i]);
	}
	raf.close();
	
}
}
