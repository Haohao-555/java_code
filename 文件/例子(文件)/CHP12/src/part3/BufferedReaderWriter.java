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
            // 创建缓冲输出流，将符号串输出至file1.txt
        	FileWriter fw = new FileWriter("file1.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("hello");
            bw.newLine();//换行
            bw.write("niuniu");
            bw.newLine();
            bw.flush();//清除缓存
            bw.close();//关闭
            // 创建缓冲输入流，从file1.txt读取数据
            FileReader fr = new FileReader("file1.txt");
            BufferedReader r = new BufferedReader(fr);
            String s;
            for (s = r.readLine(); s != null; s = r.readLine())
                System.out.println(s);
            r.close();
            // 输出文件中行号信息类
            LineNumberReader br = new LineNumberReader(new FileReader(
            "file1.txt"));
           for (s = br.readLine(); s != null; s = br.readLine())
          System.out.println(br.getLineNumber() + ": " + s);
         br.close();
        } catch (IOException e) {
            System.err.println("发生异常:" + e);
            e.printStackTrace();
        } 
    } 
} 
