package utilExample;

import java.util.ArrayList;

/**
 * �����ࣺ���������ƣ����ǲ���Ҫ�ṩ��С�Ķ���,����ֻ�ܷŶ���
 * add, remove, get, contains
 * @author SXL205000
 *
 */
public class ArrayListExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		//����Ԫ��
		for(int i=1;i<=10;i++){
			numbers.add(i);
		}
		System.out.println(numbers);
		//ɾ�������λ�õ�Ԫ��
		numbers.remove(5);
		System.out.println(numbers);
		
		//ɾ������8
		numbers.remove(new Integer(8));
		System.out.println(numbers);
		
		//��õ�3��Ԫ��
		System.out.println(numbers.get(3));
		
		//�ж��Ƿ����5
		System.out.println(numbers.contains(5));
		
		//���
		numbers.clear();
		System.out.println(numbers);
		
		
	}

}
