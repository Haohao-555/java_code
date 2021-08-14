package part2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
public class DataStreamDemo{
    public static void main(String args[ ]){
        try{
            FileOutputStream fout = new FileOutputStream("file.txt");
            DataOutputStream dfout =new DataOutputStream(fout);
            int i;
            for (i=0; i < 5; i++)
                dfout.writeInt('a' + i);
            dfout.close( );

            FileInputStream fin= new FileInputStream("file.txt");
            DataInputStream dfin= new DataInputStream(fin);
            for (i=0; i < 5; i++)
                System.out.print(dfin.readInt( ) + ", ");
            dfin.close( );
        }catch (Exception e){
            System.err.println("·¢ÉúÒì³£:" + e);
            e.printStackTrace( );
        } 
    }
}
