package utilExample;

import java.util.ArrayList;

/**
 * 集合类：和数组类似，但是不需要提供大小的对象,里面只能放对象
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
		//增加元素
		for(int i=1;i<=10;i++){
			numbers.add(i);
		}
		System.out.println(numbers);
		//删除第五个位置的元素
		numbers.remove(5);
		System.out.println(numbers);
		
		//删除数字8
		numbers.remove(new Integer(8));
		System.out.println(numbers);
		
		//获得第3个元素
		System.out.println(numbers.get(3));
		
		//判断是否包含5
		System.out.println(numbers.contains(5));
		
		//清空
		numbers.clear();
		System.out.println(numbers);
		
		
	}

}
