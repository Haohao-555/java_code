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
		return this.name.equals(per.name)&&this.age==per.age;//���ص����ݾ���Ҫ�жϵ�����
	}
}
public class JavaAPIdeno_two {
   public static void main(String[] args) {
	List<Person> person=new ArrayList<Person>();//����=new ����
	//ArrayList<Person> persons=new ArrayList<Person>();����=new ����
	person.add(new Person("С��",12,"123"));
	person.add(new Person("С��",22,"123"));
	person.add(new Person("С��",23,"123"));
	person.add(new Person("С��",24,"123"));
	person.add(new Person("СС",35,"123"));
	//��ʹ��contains()��remove()����ʱ��Ҫ��дequals����
	System.out.println("С���Ƿ����"+person.contains(new Person("С��",23,"")));
	person.remove(new Person("С��",23,"123"));
	for(int i=0;i<person.size();i++){
		System.out.println(person.get(i).getName()+"/"+person.get(i).getAge());
	}
	
	System.out.println("С���Ƿ����"+person.contains(new Person("С��",23,"123")));
}
}
