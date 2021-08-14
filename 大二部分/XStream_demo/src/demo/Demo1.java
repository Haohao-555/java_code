package demo;

import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.XStream;
public class Demo1{
	public static  List<Provider> getprovinderList(){
		Provider p1=new Provider();
		p1.setName("北京");
		p1.addcity(new City("东城区","dongchneng"));
		p1.addcity(new City("昌平区","changping"));
		
		Provider p2=new Provider();
		p2.setName("广东省");
		p2.addcity(new City("汕头市","shangtou"));
		p2.addcity(new City("深圳市","shengzheng"));
		
		List<Provider>provinderList=new ArrayList<Provider>();
		provinderList.add(p1);
		provinderList.add(p2);
		return provinderList;
	}
//  默认生成的xml
	public  static void fun1(){
		List<Provider>provinderList=getprovinderList();
		XStream x=new XStream();
		String str=x.toXML(provinderList);
		System.out.println(str);
	}
//	起别名
	public static void fun2(){
		List<Provider>provinderList=getprovinderList();
		XStream x=new XStream();
		x.alias("china", List.class);//给List类型指定别名为china
		x.alias("provider", Provider.class);
		x.alias("city", City.class);
		String str=x.toXML(provinderList);
		System.out.println(str);
	}
//  默认javabean的属性都生产子元素，而现在希望生产元素的属性
	public static void fun3(){
		List<Provider>provinderList=getprovinderList();
		XStream x=new XStream();
		
		x.alias("china", List.class);//给List类型指定别名为china
		x.alias("provider", Provider.class);
		x.alias("city", City.class);
		
		x.useAttributeFor(Provider.class,"name");// 把Provider类型的name属性，生成<Provider>元素的属性
		x.addImplicitCollection(Provider.class, "cities");//去除<cities>这样的Collection类型的属性
		
		String str=x.toXML(provinderList);
		System.out.println(str);
	}
//	去除不要的javabean属性
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
