package utilExample;

import java.util.Random;

public class RandomExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//随机类
		Random r = new Random();
		//随机整数，有正负
		int  a  = r.nextInt();
		System.out.println(a);
		//只要正整数
		System.out.println(Math.abs(a));
		//只要1-100
		System.out.println(Math.abs(a)%100+1);
		
	}

}
