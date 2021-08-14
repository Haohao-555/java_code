package utilExample;

import java.util.ArrayList;
import java.util.Collections;

/**ʹ��Collections�෽������������Ȥ�Ķ���
 * suffle���ң� sort����, reverse ��ת�� rotate ��ǰ���Ԫ�طź���
 * 
 * @author SXL205000
 *
 */
public class CollectionsExample {
	public static void main(String[] args) {
		//��������
		ArrayList<String> cards = new ArrayList<String>();
		for(int i=1;i<=4;i++){
			for(int j=1;j<=13;j++){
				cards.add(i+"-"+j);
			}
		}
		System.out.println(cards);
		
		//���Ҽ���-ϴ��
		Collections.shuffle(cards);
		System.out.println(cards);
		
		//����
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
		
		//�������� sort
		Collections.sort(u1);
		Collections.sort(u2);
		Collections.sort(u3);
		Collections.sort(u4);
		System.out.println(u1);
		System.out.println(u2);
		System.out.println(u3);
		System.out.println(u4);
		
		//���Ϸ�ת
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
