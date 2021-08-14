package part5;
/*对象序列化
 * */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectStreamDemo {
   public static void main(String[] args) {
      new ObjectStreamDemo();
   }
   public ObjectStreamDemo() {
      myDateOutputStream();
      myDateInputStream();
   }
   public void myDateOutputStream() {
      String filename = "./mydates1.dat";
      File f = new File(filename);
      FileOutputStream fOut;
      try {
         fOut = new FileOutputStream(f);
         ObjectOutputStream objOut = new ObjectOutputStream(fOut);
         // 写入日期对象
         objOut.writeObject(new MyDate(2013, 5, 18));
         objOut.writeObject(new MyDate(2013, 5, 19));
         objOut.close();
      } catch (FileNotFoundException e) {
         e.printStackTrace();
      } catch (IOException e) {
         e.printStackTrace();
      }
   }
   public void myDateInputStream() {
      String filename = "./mydates1.dat";
      File f = new File(filename);
      FileInputStream fIn;
      try {
         fIn = new FileInputStream(f);
         ObjectInputStream objIn = new ObjectInputStream(fIn);
         // 写入日期对象
         MyDate d = (MyDate) objIn.readObject();
         d.show();
        d = (MyDate) objIn.readObject();
         d.show();
         
         objIn.close();
      }catch (FileNotFoundException e) {
         e.printStackTrace();
      }catch (IOException e) {
         e.printStackTrace();
      }catch (ClassNotFoundException e) {
         e.printStackTrace();
      }
   }
}
class MyDate implements Serializable {
   int year  = 0;
   int month = 0;
   int day   = 0;
   public MyDate(int y, int m, int d) {
      year = y;
      month = m;
      day = d;
   }
   public void show() {
      System.out.println("");
      System.out.println("Year:\t" + year);
      System.out.println("Month:\t" + month);
      System.out.println("Day:\t" + day);
   }
}
