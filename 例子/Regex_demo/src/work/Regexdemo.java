package work;
//�滻�����
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.regex.Pattern;//�ʺϸ��ӵ�������ʽ
//String���е�������ʽ�ǻ�����
public class Regexdemo {
    public static void main(String[] args) throws Exception {
		String stra="qigsf17213$!@%^#!@#^#$%&*(%#!%^qwefgae1335658";
		
		//ʵ���ַ������
		String regexa="[^a-zA-Z0-9]+";//û��+����һ��һ���ַ�����ƥ�䣬��+���Ƕ������ƥ�䡣���ڶ��ٸ���ϵͳ����
		System.out.println(stra.replaceAll(regexa, " "));
		
		//(1)ʵ���ַ������
		String strb="f150132h22f12512345g1111f555jhg555";
		String regexb="\\d+";//ȥ������
		String result[]=strb.split(regexb);
		for(int i=0;i<result.length;i++){
			System.out.print(result[i]+"��");
		}
		System.out.println();
		
		//(2)ʵ���ַ������   ����util���е�Pattern��
		String strb1="f150132h22f12512345g1111f555jhg555";
		String regexb1="\\d+";//ȥ������
		Pattern pat=Pattern.compile(regexb1);//����������ʽ   util��
		String result1[]=pat.split(strb1);
		for(int j=0;j<result.length;j++){
			System.out.print(result1[j]+"��");
		}
		
		
		//����
		//�ж�һ�������Ƿ�ΪС��
		String strc="100";//100Ҳ��С��
		String regexc="\\d+(\\.\\d+)?";
		System.out.println(strc.matches(regexc));
		
		//�ж�����,����ǽ���ת��Ϊdate����
		String strd="1980-09-28";
		String regexd="\\d{4}-\\d{1,2}-\\d{1,2}";
        if(strd.matches(regexd)){
        	System.out.println(new SimpleDateFormat("yyyy-MM-DD").parse(strd));
        }
        
        //�ж��ַ����Ƿ�Ϊ�绰����  3�ָ�ʽ 88334975 075488334975 (0754)-88334975
        String stre="(0754)-88334975";
        String regexe="((\\d{3,4})|(\\(\\d{3,4}\\)-))?\\d{7,8}";
        System.out.println(stre.matches(regexe));
        
        //��֤email��ʽ�Ƿ���ȷ
        String strf="0123456789@qq.com";
        String regexf="[a-zA-Z0-9]\\w+@\\w+\\.(cn|com|cn.com|net|gov)";
        System.out.println(strf.matches(regexf));
        
        
	}
}
