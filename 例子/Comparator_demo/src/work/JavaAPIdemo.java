package work;

import java.util.Arrays;
import java.util.Comparator;
public class JavaAPIdemo {
   public static void main(String[] args) {
	   Person data[] = new Person[] { new Person("СǿA", 80),
				new Person("СǿB", 70), new Person("СǿC", 60),

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
		return "[Person�����]������" + this.name + "�����䣺" + this.age + "\n";
	}
}
      /*Comparable��Comparator������
       * java.lang.Comparable�����ඨ���ʱ��ʵ�ֵĸ��ӿڣ���Ҫ���ڶ��������������ֻ��һ��compareTo()����
       * java.util.Comparator����ȵıȽ�����������Ҫ���õ����ıȽ�����ʵ����������ֻ��һ��compare()����
       * �õ�ʱ����comparableΪ����
       * */

