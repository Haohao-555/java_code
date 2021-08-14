package work;

import java.util.UUID;
//该方法可以用文件自动命名
public class JavaAPIdemo {
 public static void main(String[] args) {
	UUID uid=UUID.randomUUID();//产生随机字符串，该字符串是UUID类型
	String name=uid.toString();//uid.toString()将UUID类型转换字符串
	System.out.println("UUID类型"+uid);
	System.out.println("String类型"+name);
	}
}
