package work;
//替换，拆分
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.regex.Pattern;//适合复杂的正则表达式
//String类中的正则表达式是基础的
public class Regexdemo {
    public static void main(String[] args) throws Exception {
		String stra="qigsf17213$!@%^#!@#^#$%&*(%#!%^qwefgae1335658";
		
		//实现字符串替代
		String regexa="[^a-zA-Z0-9]+";//没有+就是一个一个字符进行匹配，有+则是多个进行匹配。至于多少个由系统决定
		System.out.println(stra.replaceAll(regexa, " "));
		
		//(1)实现字符串拆分
		String strb="f150132h22f12512345g1111f555jhg555";
		String regexb="\\d+";//去掉数字
		String result[]=strb.split(regexb);
		for(int i=0;i<result.length;i++){
			System.out.print(result[i]+"、");
		}
		System.out.println();
		
		//(2)实现字符串拆分   依靠util包中的Pattern类
		String strb1="f150132h22f12512345g1111f555jhg555";
		String regexb1="\\d+";//去掉数字
		Pattern pat=Pattern.compile(regexb1);//编译正则表达式   util包
		String result1[]=pat.split(strb1);
		for(int j=0;j<result.length;j++){
			System.out.print(result1[j]+"、");
		}
		
		
		//例子
		//判断一个数据是否为小数
		String strc="100";//100也是小数
		String regexc="\\d+(\\.\\d+)?";
		System.out.println(strc.matches(regexc));
		
		//判断日期,如果是将其转换为date类型
		String strd="1980-09-28";
		String regexd="\\d{4}-\\d{1,2}-\\d{1,2}";
        if(strd.matches(regexd)){
        	System.out.println(new SimpleDateFormat("yyyy-MM-DD").parse(strd));
        }
        
        //判断字符串是否为电话号码  3种格式 88334975 075488334975 (0754)-88334975
        String stre="(0754)-88334975";
        String regexe="((\\d{3,4})|(\\(\\d{3,4}\\)-))?\\d{7,8}";
        System.out.println(stre.matches(regexe));
        
        //验证email格式是否正确
        String strf="0123456789@qq.com";
        String regexf="[a-zA-Z0-9]\\w+@\\w+\\.(cn|com|cn.com|net|gov)";
        System.out.println(strf.matches(regexf));
        
        
	}
}
