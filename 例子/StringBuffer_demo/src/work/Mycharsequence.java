package work;

public class Mycharsequence {
	public static void main(String[] args) {
		CharSequence str="Hello";//子类实例向父类接口转型（就是描述字符串）java.lang包jdk1.4后
	      //CharSequence是接口主要有三个类String StringBuffer StringBuilder
	      CharSequence seq=str.subSequence(1,3);//字符串截取
	      System.out.println(seq);
	      
	      
	      
	}
      
}
