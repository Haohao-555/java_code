package part3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterDemo {
    public static void main(String args[]) {
        String s = "hello niuniu!";
        try {
            FileWriter out = new FileWriter("file1.txt");
            char[] c = s.toCharArray();
            out.write(c);
            out.close();

            FileReader in = new FileReader("file1.txt");
            while (in.read(c) != -1) {
                String str = new String(c);
                System.out.println("file1£∫" + str);
            }
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException" + e);
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println("∑¢…˙“Ï≥£:" + e);
            e.printStackTrace();
        }
    }
}
