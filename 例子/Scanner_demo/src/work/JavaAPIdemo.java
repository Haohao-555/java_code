
package work;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class JavaAPIdemo {
	
   public static void main(String[] args) throws Exception {
	File file=new File("e:"+File.separator+"javawork"+File.separator+"Scanner_demo"+File.separator+"hello.txt");
	Scanner sc=new Scanner(file);
	sc.useDelimiter("\n");//设置读取分隔符是\n
	while(sc.hasNext()){
		System.out.println(sc.next());
	}
   sc.close();
}
}