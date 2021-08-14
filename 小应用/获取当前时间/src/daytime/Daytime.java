package daytime;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class Daytime {
public static void main(String[] args){
	System.out.println("通过util包中的Date获取当前时间");
	Date date = new Date();
	SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd :hh:mm:ss");
	SimpleDateFormat dateyear= new SimpleDateFormat("yyyy");
	SimpleDateFormat datemonth= new SimpleDateFormat("MM");
	SimpleDateFormat dateday= new SimpleDateFormat("dd");
	System.out.print("日子"+dateday.format(date));
	System.out.print("月份"+datemonth.format(date));
	System.out.print("年份"+dateyear.format(date));
	System.out.println("完整时间"+dateFormat.format(date));
	
	System.out.println("通过util包中的Calendar获取当前时间");
	Calendar calendar= Calendar.getInstance();
	SimpleDateFormat dateFormat1= new SimpleDateFormat("yyyy-MM-dd :hh:mm:ss");
	SimpleDateFormat dateyear1= new SimpleDateFormat("yyyy");
	SimpleDateFormat datemonth1= new SimpleDateFormat("MM");
	SimpleDateFormat dateday1= new SimpleDateFormat("dd");
	System.out.print("日子"+dateday1.format(calendar.getTime()));
	System.out.print("月份"+datemonth1.format(calendar.getTime()));
	System.out.print("年份"+dateyear1.format(calendar.getTime()));
	System.out.println("完整时间"+dateFormat1.format(calendar.getTime()));
	
	Calendar cal=Calendar.getInstance();      
	int y=cal.get(Calendar.YEAR);      
	int m=cal.get(Calendar.MONTH);      
	int d=cal.get(Calendar.DATE);      
	int h=cal.get(Calendar.HOUR_OF_DAY);      
	int mi=cal.get(Calendar.MINUTE);      
	int s=cal.get(Calendar.SECOND);      
	System.out.println("现在时刻是"+y+"年"+m+"月"+d+"日"+h+"时"+mi+"分"+s+"秒");
	
	
}
}