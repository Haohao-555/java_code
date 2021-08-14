package work;

//comparable接口实现对象的比较
import java.util.Arrays;

public class JavaAPIdemo {
	public static void main(String[] args) {
		Person data[] = new Person[] { new Person("小强A", 80),
				new Person("小强B", 70), new Person("小强C", 60),

		};
		Arrays.sort(data);
		System.out.println(Arrays.toString(data));
	}
}

 class Person implements Comparable<Person> {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
     @Override
     //compareTo（）方法可以進行自定義對象的排序
   public int compareTo(Person per) {
	 if(this.age<per.age){
		 return -1;
	 }else  if(this.age>per.age){
		 return 1;
	 } 
	return 0;
}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[Person类对象]姓名：" + this.name + "、年龄：" + this.age + "\n";
	}
}
