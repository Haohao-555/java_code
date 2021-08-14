package work;
//程序在不同国家的显示内容的方式
import java.util.Locale;

public class JavaAPIdemo {
	public static void main(String[] args) {
		//（1）手动设置编码
		Locale locale=new Locale("zh","CN");//中文环境     语言 国家
		System.out.println(locale);
		//（2）手动设置编码
		Locale locle_one=Locale.CHINA;
		System.out.println(locle_one);
		//自动设置编码
		Locale loc=Locale.getDefault();//获取本地默认地址（此时电脑所处的位置）
		System.out.println(loc);
		
		
	}

}
