package work;

import java.util.ResourceBundle;

//��ȡ��Դ�ļ�
public class MyresourceBundle {
  public static void main(String[] args) {
	  //�½���Դ�ļ����裺����Ŀ�е�һ�����Ҽ�-new-File-������Դ����+��׺��properties��
	  //��Դ¼�룺��Դ����name��value����ֵ��������ͨ��name���ҵ�value��ֵ������name����Ϊ�ա�
	ResourceBundle res=ResourceBundle.getBundle("message.Message");
	//�����Դ�ļ�û���ڰ���ֱ��д��Դ�ļ����ɣ����ú�׺������
	for(int i=1;i<4;i++){
		String key=Integer.toString(i);
		String val=res.getString(key);
		System.out.println(val);
	}
	
}
}
