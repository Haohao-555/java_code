package part2;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
public class ByteArrayDemo {
	public static void main(String[] args) {
		int n = 0;
		ByteArrayOutputStream bo = new ByteArrayOutputStream();
		byte[] array = {1,2,3,4};
		for(int i = 0; i <array.length; i++){
			bo.write(array[i]);//���ֽ����������д�������
		}
		System.out.println("д�������Ϊ��");
		byte[] buf = bo.toByteArray();//�������������ת��Ϊ�ֽ�����
		for(int i = 0; i< buf.length; i++){
			System.out.print(buf[i] + "\t");
		}
        System.out.println();
        ByteArrayInputStream bi = new ByteArrayInputStream(buf);
        System.out.println("��ȡ������Ϊ��");
        while((n=bi.read()) != -1){//��ȡ�������е�����
        	System.out.print(n + "\t");
        }
	}
}
