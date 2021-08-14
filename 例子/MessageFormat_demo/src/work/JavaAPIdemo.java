package work;


import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

//格式化输出
public class JavaAPIdemo {
   public static void main(String[] args) {
	    Locale loc=new Locale("en","US");
		ResourceBundle res=ResourceBundle.getBundle("message.Message", loc);
		String val=res.getString("into");
		System.out.println(MessageFormat.format(val, "黄佳浩" ,new SimpleDateFormat("yyy-MM-ddd").format(new Date())));
}
}
