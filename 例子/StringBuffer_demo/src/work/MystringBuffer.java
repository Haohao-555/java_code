package work;

public class MystringBuffer {
    
     public static void main(String[] args) {
    	 //StringBuilder buta=new StringBuilder();Ч����StringBufferһ����������һ������
    	 //StringBuffer�ķ��������̰߳�ȫ�ģ����з�������synchronized�ؼ��ֽ��б�ע(jdk1.5�����)
    	 //StringBuilder�Ƿ��̰߳�ȫ�ģ�jdk1.0����
    	 StringBuffer but=new StringBuffer("Hello ");
    	 change(but);
    	 System.out.println(but.toString());//but.toString()�ǽ�StringBuffer��ת��ΪString��
    	 //StringBuffer but=new StringBuffer(str) String��ת��ΪStringBuffer
    	 insert(but);
    	 System.out.println(but);
    	 delete(but);
    	 System.out.println(but);
    	 reverse(but);
    	 System.out.println(but);
	}
     public static void change(StringBuffer temp){
    	 temp.append("World");//����
     }
     public static void insert(StringBuffer temp){
    	 temp.insert(4, "����");//����
     }
     public static void delete(StringBuffer temp){
    	 temp.delete(1, 4);//ɾ��1��3���ַ�
     }
     public static void reverse(StringBuffer temp){
    	 temp.reverse();//�ַ�����ת
    	 
     }
}
