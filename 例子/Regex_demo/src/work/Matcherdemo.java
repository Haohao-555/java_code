package work;
//分组拆分
/*Matcher与String类中的str.split(regex)最大区别是
 * Matcher可以进行分组拆分，str.split(regex)不能进行分组拆分
 * */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Matcherdemo {
     public static void main(String[] args) {
		String str ="INSERT INTO DEPT(deptno,dname,loc) VALUES(#{deptno},#{dname},#{loc})";
        String regex="#\\{\\w+\\}";
		Pattern pat=Pattern.compile(regex);//编译正则表达式（拆分）
		Matcher mat=pat.matcher(str);//进行匹配
		while(mat.find()){//发现有匹配到
  		    String regexe="#|\\{|\\}";
			//System.out.println(mat.group(0).replaceAll(regexe, ""));
			System.out.println(mat.group(0));
		}
		
		
	}
}
