package work_two;
//��1����������������Ϣ��������Ϊȡ����Ϣ
//��2��������ÿ����һ����Ϣ������ȡ��һ����Ϣ��
//��3�����������û����������������Ҫ�ȴ��������������������������û��ȡ����Ϣ����������Ҫ�ȴ�������ȡ����Ϣ��
public class MThread {
     public static void main(String[] args) {
		Message msg=new Message();
		new Thread(new Producer(msg)).start();//�����߳�
		new Thread(new Consumer(msg)).start();//�����߳�
	}
}

/*�ö��߳��������̣߳��������߳����Ⱥ������Դ�����з��ʣ�
 * */
	
	
	
	








