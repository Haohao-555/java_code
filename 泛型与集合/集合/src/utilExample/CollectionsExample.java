package utilExample;

import java.util.ArrayList;
import java.util.Collections;

/**使用Collections类方法可以做很有趣的东西
 * suffle打乱， sort排序, reverse 翻转， rotate 把前面的元素放后面
 * 
 * @author SXL205000
 *
 */
public class CollectionsExample {
	public static void main(String[] args) {
		//创建集合
		ArrayList<String> cards = new ArrayList<String>();
		for(int i=1;i<=4;i++){
			for(int j=1;j<=13;j++){
				cards.add(i+"-"+j);
			}
		}
		System.out.println(cards);
		
		//打乱集合-洗牌
		Collections.shuffle(cards);
		System.out.println(cards);
		
		//发牌
		ArrayList<String> u1 = new ArrayList<String>();
		ArrayList<String> u2 = new ArrayList<String>();
		ArrayList<String> u3 = new ArrayList<String>();
		ArrayList<String> u4 = new ArrayList<String>();
		
		for(int i=0;i<52;i+=4){
			u1.add(cards.get(i));
			u2.add(cards.get(i+1));
			u3.add(cards.get(i+2));
			u4.add(cards.get(i+3));
		}
		System.out.println(u1);
		System.out.println(u2);
		System.out.println(u3);
		System.out.println(u4);
		
		//集合排序 sort
		Collections.sort(u1);
		Collections.sort(u2);
		Collections.sort(u3);
		Collections.sort(u4);
		System.out.println(u1);
		System.out.println(u2);
		System.out.println(u3);
		System.out.println(u4);
		
		//集合翻转
		Collections.reverse(u1);
		Collections.reverse(u2);
		Collections.reverse(u3);
		Collections.reverse(u4);
		System.out.println(u1);
		System.out.println(u2);
		System.out.println(u3);
		System.out.println(u4);
	}

}
