package work;
//������
/*Matcher��String���е�str.split(regex)���������
 * Matcher���Խ��з����֣�str.split(regex)���ܽ��з�����
 * */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Matcherdemo {
     public static void main(String[] args) {
		String str ="INSERT INTO DEPT(deptno,dname,loc) VALUES(#{deptno},#{dname},#{loc})";
        String regex="#\\{\\w+\\}";
		Pattern pat=Pattern.compile(regex);//����������ʽ����֣�
		Matcher mat=pat.matcher(str);//����ƥ��
		while(mat.find()){//������ƥ�䵽
  		    String regexe="#|\\{|\\}";
			//System.out.println(mat.group(0).replaceAll(regexe, ""));
			System.out.println(mat.group(0));
		}
		
		
	}
}
