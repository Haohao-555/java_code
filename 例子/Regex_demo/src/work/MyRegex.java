package work;
//ƥ��
//������ʽֻ���ж��ַ����ĸ�ʽ�������ж��ַ����ĺ���
public class MyRegex{
   public static void main(String[] args) {
	String str="1";
	//���ַ�
	System.out.println(str.matches("a"));//�Ƿ����ַ�a
	System.out.println(str.matches("[abc]"));//�Ƿ���abc����һ��
	System.out.println(str.matches("[^abc]"));//�ַ��Ƿ�û��abc����һ��
	System.out.println(str.matches("[a-zA-Z]"));//�ַ���a-z��ɲ����ִ�Сд.�ȼ���str.matches("//D")
	System.out.println(str.matches("[0-9]"));//���ַ��Ƿ����������.�ȼ���str.matches("//d")
	System.out.println(str.matches("//s"));//�ַ��Ƿ���ڿո񡢻��С��Ʊ��/t��
	System.out.println(str.matches("//S"));//ƥ��ǿո�����
	System.out.println(str.matches("//w"));//ƥ���Ƿ����ַ������֡��»���.�ȼ���str.matches("[a-zA-Z_0-9]")
	System.out.println(str.matches("//W"));//ƥ���Ƿ�û�����ַ������֡��»���.�ȼ���str.matches("[^a-zA-Z_0-9]")
	
	//��ֵ��ʾ��ֻ����ֵ��ʾ����ƥ�����ַ���
	/*���ʽ��    ��ʾ������Գ���0��1
	 *���ʽ*   ��ʾ������Գ���0��1�����
	 *���ʽ+   ��ʾ������Գ���1�Ρ���� 
	 *���ʽ{n} ��ʾ���ʽ�ĳ���Ϊn�� 
	 *���ʽ{n,} ��ʾ���ʽ�ĳ���Ϊn������
	 *���ʽ{n,m} ��ʾ���ʽ�ĳ���Ϊn�ε�m��֮��
	 * */
	
	//�߼����ʽ���Ӷ������
	/*��1�����ʽx���ʽy  x���ʽ�����ű��ʽy
	 * (2)���ʽx|���ʽy  �������ʽֻҪһ������Ϳ���
	 *��3�������ʽx�� Ϊ���ʽ����һ����������������Ϊ���������������ֵ�λ��
	 * */
	}
}
