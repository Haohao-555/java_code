package part3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderDemo {

    public static void main(String[] args) {
        try {
            InputStreamReader in = new InputStreamReader(System.in);
            BufferedReader bf = new BufferedReader(in);
            System.out.println("�������ݣ�");
            String s = bf.readLine();
            int num = Integer.parseInt(s);
            System.out.println("����������ǣ�" + num);
        } catch (IOException e) {
            System.out.println("IOException:" + e.getMessage());
            e.printStackTrace();
        }
    }
}
