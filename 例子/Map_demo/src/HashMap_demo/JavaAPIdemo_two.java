package HashMap_demo;

import java.util.HashMap;
import java.util.Map;
public class JavaAPIdemo_two {
	   public static void main(String[] args) {
		  Map<Person,String>map=new HashMap<Person,String>();
		  map.put(new Person("С��",12), "1");
		  System.out.println(map.get(new Person("С��",12)));//��Ҫ��Person����дhasCode()����
		}
	}
/*   ����ڽ���HaspMap�������ݲ�����ʱ�������Hash��ͻ��Hash����ͬ����Hash����ν����
 *   ������Hash��ͻ֮��Ϊ�˱�֤���������ִ�У����ڳ�ͻ��λ�ý�����Hash��ͻ������תΪ������
 * 
 * */
class Person{
	private String name;
	private int age;
	public Person(String name, int age) {
		super();
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

