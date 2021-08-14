package work_two;

public class JavaAPIdemo_one {
	public static void main(String[] args) throws Exception {
		Class<?>cls=Class.forName("Person.Person"); 
		Object obj=cls.newInstance();//实例化对象，JDK1.9后被废除了
		/*    newInstance()本质等价于 类 对象=new 类()
		 *    之所以JDK1.9后被废除，是因为newInstance()方法只能够调用无参构造方法
		 * 
		 * */
		
		System.out.println(obj);//输出对象调用toString()方法
		
		//jdk1.9后
		Object ob=cls.getDeclaredConstructor().newInstance();
		System.out.println(ob);
	}
}
