package work;

import java.io.*;
//�������
public class JavaAPIdemo {
	private static final File SAVE_FILE=new File("e:"+File.separator+"javawork"+File.separator+"Serializable_demo"+File.separator+"mldn1.txt");
	   public static void main(String[] args) throws Exception {
		   saveObject(new Person("С��",12));
		   Person person=(Person) loadObject();
		   System.out.println(loadObject());
		   /*loadObject()���ص������Ƕ��������ݣ��ײ㷽��loadObject()����toString()��������ת��
		    * ��toString()ʵ���ǵ���getAge()��getName()����
		    * */
		   System.out.println(person.getName());
		   person.print_hello();
		   
	}
	    public static void saveObject(Object obj) throws Exception{
	    	ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(SAVE_FILE));
	    	oos.writeObject(obj);//���л������ֶ����Զ����Ƶ���ʽ����
	    	oos.close();
	    }
	    public static Object loadObject()throws Exception{
	    	ObjectInputStream ois=new ObjectInputStream(new FileInputStream(SAVE_FILE));
	    	Object obj=ois.readObject();//�����л����õ�����
	    	ois.close();
	    	return obj;
	    }
	}

class Person implements Serializable{
	private String name;
	private transient int age;//ʹ�ùؼ���transientʱ������������л�ʱ��������û�б����л�.��ȡ������ʱΪ��
	public Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	public Person(Person person) {
		// TODO Auto-generated constructor stub
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
	public String toString(){
		return "����"+this.name+"����"+this.age;
	}
	public void print_hello(){
		System.out.println("hello");
	}
}

