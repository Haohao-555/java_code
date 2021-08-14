package TreeSet_demo;

import java.util.Set;
import java.util.TreeSet;
public class JavaAPIdemo_two {
	   public static void main(String[] args) {
		Set<Person>all=new TreeSet<Person>();
		all.add(new Person("����",12));
		all.add(new Person("Сǿ",12));//������ͬ��������ͬ
		all.add(new Person("����",12));//�ظ�����
		all.add(new Person("����",11));
		all.add(new Person("С��",34));
		all.add(new Person("����",15));
		 for(Person temp:all){
			   System.out.println("������"+temp.getName()+"  ���䣺"+temp.getAge());
		   }
	   }
	  
}
class Person implements Comparable<Person>{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Person per) {
		if(this.age<per.age){
			return -1;
		}else if(this.age>per.age){
			return 1;
		}else
			return this.name.compareTo(per.name);
		//return this.age-per.age;���ֻ����һ�仰��������ȵ�ʱ�����ֲ�ͬʱֻ����һ���˵�����
	}
	
}

