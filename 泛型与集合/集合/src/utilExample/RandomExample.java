package utilExample;

import java.util.Random;

public class RandomExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�����
		Random r = new Random();
		//���������������
		int  a  = r.nextInt();
		System.out.println(a);
		//ֻҪ������
		System.out.println(Math.abs(a));
		//ֻҪ1-100
		System.out.println(Math.abs(a)%100+1);
		
	}

}
