package part3;

import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.IOException;

public class CharArrayDemo {
    public static void main(String[] args) {
        int n = 0;
        char[] array = { '1', '2', '3', '4' };
        try {
            CharArrayWriter w = new CharArrayWriter();
            for (int i = 0; i < array.length; i++) {
                w.write(array[i]);// ���ַ����������д�������
            }
            System.out.println("д���ڴ������ݣ�");
            char[] buf = w.toCharArray();
            for (int i = 0; i < buf.length; i++) {
                System.out.print(buf[i] + "\t");
            }
            System.out.println();
            CharArrayReader r = new CharArrayReader(buf);
            System.out.println("���ڴ������ݣ�");
            while ((n = r.read()) != -1) {
                System.out.print((char) n + "\t");
            }
        } catch (IOException e) {
            System.out.println("IOException:" + e.getMessage());
            e.printStackTrace();
        }
    }
}
