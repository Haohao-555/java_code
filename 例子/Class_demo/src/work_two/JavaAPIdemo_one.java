package work_two;

public class JavaAPIdemo_one {
	public static void main(String[] args) throws Exception {
		Class<?>cls=Class.forName("Person.Person"); 
		Object obj=cls.newInstance();//ʵ��������JDK1.9�󱻷ϳ���
		/*    newInstance()���ʵȼ��� �� ����=new ��()
		 *    ֮����JDK1.9�󱻷ϳ�������ΪnewInstance()����ֻ�ܹ������޲ι��췽��
		 * 
		 * */
		
		System.out.println(obj);//����������toString()����
		
		//jdk1.9��
		Object ob=cls.getDeclaredConstructor().newInstance();
		System.out.println(ob);
	}
}
