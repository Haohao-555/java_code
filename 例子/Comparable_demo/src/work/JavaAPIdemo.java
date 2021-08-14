package work;

//comparable�ӿ�ʵ�ֶ���ıȽ�
import java.util.Arrays;

public class JavaAPIdemo {
	public static void main(String[] args) {
		Person data[] = new Person[] { new Person("СǿA", 80),
				new Person("СǿB", 70), new Person("СǿC", 60),

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
     //compareTo�������������M���Զ��x���������
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
		return "[Person�����]������" + this.name + "�����䣺" + this.age + "\n";
	}
}
