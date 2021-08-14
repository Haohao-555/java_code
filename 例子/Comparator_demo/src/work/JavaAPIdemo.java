package work;

import java.util.Arrays;
import java.util.Comparator;
public class JavaAPIdemo {
   public static void main(String[] args) {
	   Person data[] = new Person[] { new Person("小强A", 80),
				new Person("小强B", 70), new Person("小强C", 60),

		};
		Arrays.sort(data,new Personcomparator());
		System.out.println(Arrays.toString(data));
}
}
class Personcomparator implements Comparator<Person>{
	@Override
	public int compare(Person p1, Person p2) {
		return p1.getAge()-p2.getAge();
	}
}
class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

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

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[Person类对象]姓名：" + this.name + "、年龄：" + this.age + "\n";
	}
}
      /*Comparable和Comparator的区别
       * java.lang.Comparable是在类定义的时候实现的父接口，主要用于定义排序规则，里面只有一个compareTo()方法
       * java.util.Comparator是挽救的比较器操作，需要设置单独的比较器类实现排序，里面只有一个compare()方法
       * 用的时候以comparable为主。
       * */

