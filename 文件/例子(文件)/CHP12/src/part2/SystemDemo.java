package part2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class SystemDemo {
    public static void input(InputStream in) {
        try {
            while (true) {
                int i = in.read();
                if (i == -1) // 输入流结束
                    break;
                char c = (char) i;
                System.out.print(c);
            }
        } catch (IOException e) {
            System.err.println("发生异常:" + e);
            e.printStackTrace();
        }
        System.out.println();
    }

    public static void main(String args[]) {
        try {
            System.setIn(new FileInputStream("file1.txt"));
            input(System.in);
        } catch (Exception e) {
            System.err.println("发生异常:" + e);
            e.printStackTrace();
        }
    }
}
