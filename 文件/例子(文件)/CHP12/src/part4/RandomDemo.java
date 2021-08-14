package part4;
/*随机读取文件
 * */
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomDemo {
    public static void main(String[] args) {
        try {
            RandomAccessFile rf = new RandomAccessFile("file1.txt", "rw");
            // System.out.println("");
            rf.writeUTF("niuniu");
            rf.writeDouble(3500.0);
            long pos = rf.getFilePointer();
            rf.writeUTF("优优");
            rf.writeDouble(3300.0);
            rf.seek(pos);
            String name = rf.readUTF();
            double salary = rf.readDouble();
            System.out.println("姓名：" + name);
            System.out.println("工资：" + salary);
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException" + e.getMessage());
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("IOException" + e.getMessage());
            e.printStackTrace();
        }
    }
}
