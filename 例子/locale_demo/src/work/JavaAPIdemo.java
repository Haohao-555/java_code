package work;
//�����ڲ�ͬ���ҵ���ʾ���ݵķ�ʽ
import java.util.Locale;

public class JavaAPIdemo {
	public static void main(String[] args) {
		//��1���ֶ����ñ���
		Locale locale=new Locale("zh","CN");//���Ļ���     ���� ����
		System.out.println(locale);
		//��2���ֶ����ñ���
		Locale locle_one=Locale.CHINA;
		System.out.println(locle_one);
		//�Զ����ñ���
		Locale loc=Locale.getDefault();//��ȡ����Ĭ�ϵ�ַ����ʱ����������λ�ã�
		System.out.println(loc);
		
		
	}

}
