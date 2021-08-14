package part2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
public class PrintStreamDemo {

    public static void main(String[] args) throws IOException {
        try {
            PrintStream f = new PrintStream("file1.txt");
            f.printf("%s", "hello");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
