package work;
//整体使用之中由用户自行定义要读取的而后按照指定的结构进行数据读取。前提是同类型数据长度要保持一致
import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
public class JavaAPIdemo_one {
   public static void main(String[] args) throws Exception {
	File file =new File("e:"+File.separator+"javawork"+File.separator+"RandomAccessFile_demo"+File.separator+"mldn.txt");
	RandomAccessFile raf=new RandomAccessFile(file,"rw");//进行文件读写
	//写入文件
	String[] names=new String[]{"zhangsan","wangwu  ","lisi    "};//每个字符串为8位（字节）
	int []ages=new int[]{30,20,16};//数字为4位（字节）
	for(int i=0;i<names.length;i++){
		raf.write(names[i].getBytes());
		raf.writeInt(ages[i]);
	}
	raf.close();
	
}
}
