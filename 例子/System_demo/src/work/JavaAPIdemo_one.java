package work;

import java.io.*;

public class JavaAPIdemo_one {
   public static void main(String[] args) throws Exception {
	   System.getProperties().list(System.out);//获取本机属性
	   File file=new File("e:"+File.separator+"javawork"+File.separator+"System_demo"+File.separator+"mldn.txt");
	   OutputStream output=new FileOutputStream(file);
	   String str="哈哈";
	   output.write(str.getBytes("ISO8859-1"));
	   //本机属性默认电脑的文件编码是file.encoding=GBK
	   //output.write(str.getBytes("ISO8859-1"));设置编码为ISO8859-1时会出现乱码。
   }
}
/*GBK/GB2312：国际编码，可以描述中文信息，其中GB2312只描述简体中文，而GBK描述简体中文和繁体中文
 * ISO8859-1：国际编码，可以描述所有字母信息，如果是象形文字则需要进行编码处理
 * UNICODE:采用十六进制的方式存储，可以描述所有文字信息；
 * UTF编码：象形文字部分使用十六进制编码，而普通的字母采用的是ISO8859-1编码，好处是可以快速进行数据传输，节约带宽（首选）
 * */
