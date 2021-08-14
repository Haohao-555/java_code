package part2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedDemo {
    public static void main(String args[]) {
        try {
            byte[] buf = new byte[10];
            String f1 = "file1.txt";
            String f2 = "file2.txt";
            FileInputStream fis = new FileInputStream(f1);
            BufferedInputStream bis = new BufferedInputStream(fis);

            FileOutputStream fos = new FileOutputStream(f2);
            BufferedOutputStream bos = new BufferedOutputStream(fos);

            while (bis.read(buf) != -1) {
                bos.write(buf);
            }
            bos.flush();
            System.out.println("file1�ļ�����д��file2��");
            bos.close();
            bis.close();
        } catch (FileNotFoundException e) {
            System.out.println("�ļ�δ�ҵ��쳣");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("�����쳣��" + e.getMessage());
            e.printStackTrace();
        }
    }
}
