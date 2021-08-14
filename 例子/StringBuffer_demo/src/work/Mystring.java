package work;

public class Mystring {
	public static void main(String[] args) {
		String str="Hello";
		
		String strA="H"+"e"+"l"+"l"+"o";
		change(str);
		StringBuffer but=new StringBuffer(str);//String类转化为StringBuffer
		change(but);
		System.out.println(but);
		System.out.println(str);
		System.out.println(str==strA);
	}
   public static  void change(String temp){
	   temp+="World";
   }
   public static void change(StringBuffer temp){
	   temp.append("world");
   }
}
