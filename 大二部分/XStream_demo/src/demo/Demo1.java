package demo;

import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.XStream;
public class Demo1{
	public static  List<Provider> getprovinderList(){
		Provider p1=new Provider();
		p1.setName("����");
		p1.addcity(new City("������","dongchneng"));
		p1.addcity(new City("��ƽ��","changping"));
		
		Provider p2=new Provider();
		p2.setName("�㶫ʡ");
		p2.addcity(new City("��ͷ��","shangtou"));
		p2.addcity(new City("������","shengzheng"));
		
		List<Provider>provinderList=new ArrayList<Provider>();
		provinderList.add(p1);
		provinderList.add(p2);
		return provinderList;
	}
//  Ĭ�����ɵ�xml
	public  static void fun1(){
		List<Provider>provinderList=getprovinderList();
		XStream x=new XStream();
		String str=x.toXML(provinderList);
		System.out.println(str);
	}
//	�����
	public static void fun2(){
		List<Provider>provinderList=getprovinderList();
		XStream x=new XStream();
		x.alias("china", List.class);//��List����ָ������Ϊchina
		x.alias("provider", Provider.class);
		x.alias("city", City.class);
		String str=x.toXML(provinderList);
		System.out.println(str);
	}
//  Ĭ��javabean�����Զ�������Ԫ�أ�������ϣ������Ԫ�ص�����
	public static void fun3(){
		List<Provider>provinderList=getprovinderList();
		XStream x=new XStream();
		
		x.alias("china", List.class);//��List����ָ������Ϊchina
		x.alias("provider", Provider.class);
		x.alias("city", City.class);
		
		x.useAttributeFor(Provider.class,"name");// ��Provider���͵�name���ԣ�����<Provider>Ԫ�ص�����
		x.addImplicitCollection(Provider.class, "cities");//ȥ��<cities>������Collection���͵�����
		
		String str=x.toXML(provinderList);
		System.out.println(str);
	}
//	ȥ����Ҫ��javabean����
	public static String fun4(){
		List<Provider>provinderList=getprovinderList();
		XStream x=new XStream();
		
		x.alias("china", List.class);
		x.alias("provider", Provider.class);
		x.alias("city", City.class);
		
		x.useAttributeFor(Provider.class,"name");
		x.addImplicitCollection(Provider.class, "cities");
		
		x.omitField(City.class, "description");
		String str=x.toXML(provinderList);
		return str;
		
	}
    public static void main(String[] args) {
    	System.out.println(fun4());
	}
}
