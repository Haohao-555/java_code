package work;

import java.io.*;
//传输对象
public class JavaAPIdemo {
	private static final File SAVE_FILE=new File("e:"+File.separator+"javawork"+File.separator+"Serializable_demo"+File.separator+"mldn1.txt");
	   public static void main(String[] args) throws Exception {
		   saveObject(new Person("小米",12));
		   Person person=(Person) loadObject();
		   System.out.println(loadObject());
		   /*loadObject()返回的数据是二进制数据，底层方法loadObject()调用toString()进行数据转换
		    * 但toString()实质是调用getAge()和getName()方法
		    * */
		   System.out.println(person.getName());
		   person.print_hello();
		   
	}
	    public static void saveObject(Object obj) throws Exception{
	    	ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(SAVE_FILE));
	    	oos.writeObject(obj);//序列化（保持对象）以二进制的形式保存
	    	oos.close();
	    }
	    public static Object loadObject()throws Exception{
	    	ObjectInputStream ois=new ObjectInputStream(new FileInputStream(SAVE_FILE));
	    	Object obj=ois.readObject();//反序列化（得到对象）
	    	ois.close();
	    	return obj;
	    }
	}

class Person implements Serializable{
	private String name;
	private transient int age;//使用关键字transient时当对象进行序列化时，该属性没有被序列化.读取该属性时为空
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
		return "姓名"+this.name+"年龄"+this.age;
	}
	public void print_hello(){
		System.out.println("hello");
	}
}

