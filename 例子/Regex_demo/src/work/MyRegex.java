package work;
//匹配
//正则表达式只能判断字符串的格式，不能判断字符串的含义
public class MyRegex{
   public static void main(String[] args) {
	String str="1";
	//单字符
	System.out.println(str.matches("a"));//是否有字符a
	System.out.println(str.matches("[abc]"));//是否含有abc其中一个
	System.out.println(str.matches("[^abc]"));//字符是否没有abc其中一个
	System.out.println(str.matches("[a-zA-Z]"));//字符有a-z组成不区分大小写.等价于str.matches("//D")
	System.out.println(str.matches("[0-9]"));//单字符是否由数字组成.等价于str.matches("//d")
	System.out.println(str.matches("//s"));//字符是否存在空格、换行、制表格（/t）
	System.out.println(str.matches("//S"));//匹配非空格数据
	System.out.println(str.matches("//w"));//匹配是否有字符、数字、下划线.等价于str.matches("[a-zA-Z_0-9]")
	System.out.println(str.matches("//W"));//匹配是否没有有字符、数字、下划线.等价于str.matches("[^a-zA-Z_0-9]")
	
	//数值表示（只有数值表示才能匹配多个字符）
	/*表达式？    表示正则可以出现0或1
	 *表达式*   表示正则可以出现0或1、多次
	 *表达式+   表示正则可以出现1次、多次 
	 *表达式{n} 表示表达式的长度为n次 
	 *表达式{n,} 表示表达式的长度为n次以上
	 *表达式{n,m} 表示表达式的长度为n次到m次之间
	 * */
	
	//逻辑表达式连接多个正则
	/*（1）表达式x表达式y  x表达式紧跟着表达式y
	 * (2)表达式x|表达式y  两个表达式只要一个满足就可以
	 *（3）（表达式x） 为表达式设置一个整体描述，可以为整体描述设置数字单位。
	 * */
	}
}
