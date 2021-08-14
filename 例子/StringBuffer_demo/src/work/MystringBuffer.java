package work;

public class MystringBuffer {
    
     public static void main(String[] args) {
    	 //StringBuilder buta=new StringBuilder();效果跟StringBuffer一样（方法名一样）。
    	 //StringBuffer的方法属于线程安全的，所有方法都有synchronized关键字进行标注(jdk1.5后出现)
    	 //StringBuilder是非线程安全的，jdk1.0出现
    	 StringBuffer but=new StringBuffer("Hello ");
    	 change(but);
    	 System.out.println(but.toString());//but.toString()是将StringBuffer类转化为String类
    	 //StringBuffer but=new StringBuffer(str) String类转化为StringBuffer
    	 insert(but);
    	 System.out.println(but);
    	 delete(but);
    	 System.out.println(but);
    	 reverse(but);
    	 System.out.println(but);
	}
     public static void change(StringBuffer temp){
    	 temp.append("World");//增加
     }
     public static void insert(StringBuffer temp){
    	 temp.insert(4, "哈哈");//插入
     }
     public static void delete(StringBuffer temp){
    	 temp.delete(1, 4);//删除1到3的字符
     }
     public static void reverse(StringBuffer temp){
    	 temp.reverse();//字符串反转
    	 
     }
}
