package work;

import java.util.ResourceBundle;

//读取资源文件
public class MyresourceBundle {
  public static void main(String[] args) {
	  //新建资源文件步骤：在项目中的一包中右键-new-File-输入资源名字+后缀（properties）
	  //资源录入：资源中右name和value两个值，程序是通过name来找到value的值，所以name不能为空。
	ResourceBundle res=ResourceBundle.getBundle("message.Message");
	//如果资源文件没有在包中直接写资源文件即可（不用后缀名）。
	for(int i=1;i<4;i++){
		String key=Integer.toString(i);
		String val=res.getString(key);
		System.out.println(val);
	}
	
}
}
