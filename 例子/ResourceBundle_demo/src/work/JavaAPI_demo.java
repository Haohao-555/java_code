package work;

import java.util.Locale;
import java.util.ResourceBundle;

public class JavaAPI_demo {

	/*
	 * 资源读取的顺序为： (1)先读取指定区域的资源文件  
	 *                 (2)再读取默认的资源文件 
	 *                （3）最后读取公共的资源文件（没有区域设置）
	 * */
	public static void main(String[] args) {
		
		//(1)指定区域
		Locale loc=new Locale("en","US");
		ResourceBundle res=ResourceBundle.getBundle("message.Message", loc);
		String val=res.getString("into");
		System.out.println(val);
		
		/*(2)默认区域
		 * 对于下面程序中是指定区域为德国，但没有该区域的资源文件，
		 * 所以读取默认区域Locale.getDefault()获取到本地地址是zh_CN 
		 * 因此读取的资源文件是Message_zh_CN.properties
		 * */
		Locale loc_o=Locale.FRANCE;
		ResourceBundle res_o=ResourceBundle.getBundle("message.Message",loc_o);
		String val_o=res_o.getString("into");
		System.out.println(val_o);
		
		/*如果第（2）种情况找不到该资源文件（Message_zh_CN.properties） 
		 * 则（3）最后读取公共的资源文件（Message.properties）（没有区域设置）
		 * 资源文件名的命名有规定。
		 * */

	}
	
	
}
