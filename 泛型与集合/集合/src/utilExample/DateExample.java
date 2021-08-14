package utilExample;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class DateExample {

	public static void main(String[] args) {
		//��õ�ǰʱ��
		Date date = new Date();
		System.out.println(date);
		
		 //"EEE MMM dd HH:mm:ss zzz yyyy";
		//����yyyy��mm��dd�����������
		//��Ҫʹ�ø�ʽ���� ,������java.text��
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd��");
		String day = sdf.format(date);
		System.out.println(day);
		
		//����hhʱmm�������ʱ��
		SimpleDateFormat sd = new SimpleDateFormat("hhʱmm��");
		String time = sd.format(date);
		System.out.println(time);
		
		//�����ַ���ת��Ϊʱ��
		System.out.print("������ʱ�䣬��ʽΪyyyy-MM-dd:");
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
		
		//�����ѹ�������
		System.out.print("�������1��ʱ�䣬��ʽΪyyyy-MM-dd:");
		String date1 = sc.nextLine();
		System.out.print("�������2��ʱ�䣬��ʽΪyyyy-MM-dd:");
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
