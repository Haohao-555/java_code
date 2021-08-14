package CharStream_demo;
//字符流读取的时候只能按照数组的形式来实现处理操作
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
//使用Writer 最大的优势是可以直接利用字符串输出，可以直接输出中文字符，不用考虑编码问题
public class Writer_demo {
    public static void main(String[] args) throws Exception {
    	File file=new File("e:"+File.separator+"javawork"+File.separator+"Writer_ReaderStream_demo"+File.separator+"hello"+File.separator+"demo"+File.separator+"mldn.txt");
    	if(!file.getParentFile().exists()){
    		file.getParentFile().mkdirs();
    	}
    	Writer out=new FileWriter(file,true);//多次添加
    	String str="黄佳浩\r\n";
    	out.write(str);
    	out.append("通过out.append（）添加成功");
    	out.close();
	}
}
/*字节流处理时没有用到缓冲区，而字符流用到了缓冲区。因此如果在输出流中如果程序最后一步没有关闭文件，则用
 * 字符流输出的内容在文件里面是没有显示的。而字节流没有受影响
 * */
 