package work;

public class JavaAPIDemo {
   public static void main(String[] args) {
		long start=System.currentTimeMillis();
		Runtime run=Runtime.getRuntime();//��ȡʵ��������
		System.out.println(run.availableProcessors());//cpu����
		System.out.println(run.maxMemory());//��ȡ�ڴ����ռ�
		System.out.println(run.totalMemory());//��ȡ�����ڴ�ռ�
		System.out.println(run.freeMemory());//��ȡ�����ڴ�ռ�
	
		String str="";
		for(int x=0;x<30000;x++){
			str+=x;//������������;
		}
		long end=System.currentTimeMillis();
		System.out.println("������ʱ��"+(end-start)+"����");
        
	}

}
