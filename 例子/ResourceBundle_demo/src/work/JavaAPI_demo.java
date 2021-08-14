package work;

import java.util.Locale;
import java.util.ResourceBundle;

public class JavaAPI_demo {

	/*
	 * ��Դ��ȡ��˳��Ϊ�� (1)�ȶ�ȡָ���������Դ�ļ�  
	 *                 (2)�ٶ�ȡĬ�ϵ���Դ�ļ� 
	 *                ��3������ȡ��������Դ�ļ���û���������ã�
	 * */
	public static void main(String[] args) {
		
		//(1)ָ������
		Locale loc=new Locale("en","US");
		ResourceBundle res=ResourceBundle.getBundle("message.Message", loc);
		String val=res.getString("into");
		System.out.println(val);
		
		/*(2)Ĭ������
		 * ���������������ָ������Ϊ�¹�����û�и��������Դ�ļ���
		 * ���Զ�ȡĬ������Locale.getDefault()��ȡ�����ص�ַ��zh_CN 
		 * ��˶�ȡ����Դ�ļ���Message_zh_CN.properties
		 * */
		Locale loc_o=Locale.FRANCE;
		ResourceBundle res_o=ResourceBundle.getBundle("message.Message",loc_o);
		String val_o=res_o.getString("into");
		System.out.println(val_o);
		
		/*����ڣ�2��������Ҳ�������Դ�ļ���Message_zh_CN.properties�� 
		 * ��3������ȡ��������Դ�ļ���Message.properties����û���������ã�
		 * ��Դ�ļ����������й涨��
		 * */

	}
	
	
}
