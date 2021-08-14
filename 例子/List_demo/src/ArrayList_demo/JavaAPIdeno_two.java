package ArrayList_demo;

import java.util.ArrayList;
import java.util.List;

class Person {
	private String name;
	private int age;
	private String ph;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPh() {
		return ph;
	}
	public void setPh(String ph) {
		this.ph = ph;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Person(String name, int age,String ph) {
		super();
		this.name = name;
		this.age = age;
		this.ph=ph;
	}
	@Override
	public boolean equals(Object obj) {
		if(this==obj){
			return true;
		}
		if(obj==null){
			return false;
		}
		if(!(obj instanceof Person)){
			return false;                             
		}
		Person per=(Person)obj;
		return this.name.equals(per.name)&&this.age==per.age;//返回的数据就是要判断的属性
	}
}
public class JavaAPIdeno_two {
   public static void main(String[] args) {
	List<Person> person=new ArrayList<Person>();//父类=new 子类
	//ArrayList<Person> persons=new ArrayList<Person>();子类=new 子类
	person.add(new Person("小黄",12,"123"));
	person.add(new Person("小绿",22,"123"));
	person.add(new Person("小城",23,"123"));
	person.add(new Person("小红",24,"123"));
	person.add(new Person("小小",35,"123"));
	//当使用contains()和remove()方法时需要覆写equals方法
	System.out.println("小城是否存在"+person.contains(new Person("小城",23,"")));
	person.remove(new Person("小城",23,"123"));
	for(int i=0;i<person.size();i++){
		System.out.println(person.get(i).getName()+"/"+person.get(i).getAge());
	}
	
	System.out.println("小城是否存在"+person.contains(new Person("小城",23,"123")));
}
}
