package CharStream_demo;
//�ַ�����ȡ��ʱ��ֻ�ܰ����������ʽ��ʵ�ִ������
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
//ʹ��Writer ���������ǿ���ֱ�������ַ������������ֱ����������ַ������ÿ��Ǳ�������
public class Writer_demo {
    public static void main(String[] args) throws Exception {
    	File file=new File("e:"+File.separator+"javawork"+File.separator+"Writer_ReaderStream_demo"+File.separator+"hello"+File.separator+"demo"+File.separator+"mldn.txt");
    	if(!file.getParentFile().exists()){
    		file.getParentFile().mkdirs();
    	}
    	Writer out=new FileWriter(file,true);//������
    	String str="�ƼѺ�\r\n";
    	out.write(str);
    	out.append("ͨ��out.append������ӳɹ�");
    	out.close();
	}
}
/*�ֽ�������ʱû���õ������������ַ����õ��˻��������������������������������һ��û�йر��ļ�������
 * �ַ���������������ļ�������û����ʾ�ġ����ֽ���û����Ӱ��
 * */
 