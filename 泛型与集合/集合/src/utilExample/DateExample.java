package utilExample;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class DateExample {

	public static void main(String[] args) {
		//获得当前时间
		Date date = new Date();
		System.out.println(date);
		
		 //"EEE MMM dd HH:mm:ss zzz yyyy";
		//按照yyyy年mm月dd日来输出日期
		//需要使用格式类类 ,来自于java.text包
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
		String day = sdf.format(date);
		System.out.println(day);
		
		//按照hh时mm分来输出时间
		SimpleDateFormat sd = new SimpleDateFormat("hh时mm分");
		String time = sd.format(date);
		System.out.println(time);
		
		//输入字符串转换为时间
		System.out.print("请输入时间，格式为yyyy-MM-dd:");
		Scanner sc = new Scanner(System.in);
		String d =sc.nextLine();
		SimpleDateFormat sd2 = new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date date2 = sd2.parse(d);
			System.out.println(date2);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//计算已过多少天
		System.out.print("请输入第1个时间，格式为yyyy-MM-dd:");
		String date1 = sc.nextLine();
		System.out.print("请输入第2个时间，格式为yyyy-MM-dd:");
		String date2 = sc.nextLine();
		Date d1=null,d2=null;
		try {
		    d1 = sd2.parse(date1);
			d2 = sd2.parse(date2);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		long days = d1.getTime()-d2.getTime();
		System.out.println(days/(24*60*60*1000L));
		
		
	}
}
