package TreeSet_demo;

import java.util.Set;
import java.util.TreeSet;
public class JavaAPIdemo_two {
	   public static void main(String[] args) {
		Set<Person>all=new TreeSet<Person>();
		all.add(new Person("张三",12));
		all.add(new Person("小强",12));//年龄相同，姓名不同
		all.add(new Person("张三",12));//重复数据
		all.add(new Person("李四",11));
		all.add(new Person("小明",34));
		all.add(new Person("万五",15));
		 for(Person temp:all){
			   System.out.println("姓名："+temp.getName()+"  年龄："+temp.getAge());
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
		//return this.age-per.age;如果只有这一句话则当年龄相等的时候，名字不同时只保存一个人的数据
	}
	
}

