package part3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;

public class BufferedReaderWriter {
    public static void main(String args[]) {
        try {
            // ��������������������Ŵ������file1.txt
        	FileWriter fw = new FileWriter("file1.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("hello");
            bw.newLine();//����
            bw.write("niuniu");
            bw.newLine();
            bw.flush();//�������
            bw.close();//�ر�
            // ������������������file1.txt��ȡ����
            FileReader fr = new FileReader("file1.txt");
            BufferedReader r = new BufferedReader(fr);
            String s;
            for (s = r.readLine(); s != null; s = r.readLine())
                System.out.println(s);
            r.close();
            // ����ļ����к���Ϣ��
            LineNumberReader br = new LineNumberReader(new FileReader(
            "file1.txt"));
           for (s = br.readLine(); s != null; s = br.readLine())
          System.out.println(br.getLineNumber() + ": " + s);
         br.close();
        } catch (IOException e) {
            System.err.println("�����쳣:" + e);
            e.printStackTrace();
        } 
    } 
} 
