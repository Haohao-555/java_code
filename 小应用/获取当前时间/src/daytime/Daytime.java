package daytime;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class Daytime {
public static void main(String[] args){
	System.out.println("ͨ��util���е�Date��ȡ��ǰʱ��");
	Date date = new Date();
	SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd :hh:mm:ss");
	SimpleDateFormat dateyear= new SimpleDateFormat("yyyy");
	SimpleDateFormat datemonth= new SimpleDateFormat("MM");
	SimpleDateFormat dateday= new SimpleDateFormat("dd");
	System.out.print("����"+dateday.format(date));
	System.out.print("�·�"+datemonth.format(date));
	System.out.print("���"+dateyear.format(date));
	System.out.println("����ʱ��"+dateFormat.format(date));
	
	System.out.println("ͨ��util���е�Calendar��ȡ��ǰʱ��");
	Calendar calendar= Calendar.getInstance();
	SimpleDateFormat dateFormat1= new SimpleDateFormat("yyyy-MM-dd :hh:mm:ss");
	SimpleDateFormat dateyear1= new SimpleDateFormat("yyyy");
	SimpleDateFormat datemonth1= new SimpleDateFormat("MM");
	SimpleDateFormat dateday1= new SimpleDateFormat("dd");
	System.out.print("����"+dateday1.format(calendar.getTime()));
	System.out.print("�·�"+datemonth1.format(calendar.getTime()));
	System.out.print("���"+dateyear1.format(calendar.getTime()));
	System.out.println("����ʱ��"+dateFormat1.format(calendar.getTime()));
	
	Calendar cal=Calendar.getInstance();      
	int y=cal.get(Calendar.YEAR);      
	int m=cal.get(Calendar.MONTH);      
	int d=cal.get(Calendar.DATE);      
	int h=cal.get(Calendar.HOUR_OF_DAY);      
	int mi=cal.get(Calendar.MINUTE);      
	int s=cal.get(Calendar.SECOND);      
	System.out.println("����ʱ����"+y+"��"+m+"��"+d+"��"+h+"ʱ"+mi+"��"+s+"��");
	
	
}
}