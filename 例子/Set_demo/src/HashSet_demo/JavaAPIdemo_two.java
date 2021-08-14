package HashSet_demo;

import java.util.HashSet;
import java.util.Set;


public class JavaAPIdemo_two {
	 public static void main(String[] args) {
			Set<Person>all=new HashSet<Person>();
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
class Person {
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	
	
}