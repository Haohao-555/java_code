package text;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import entity.Demo5;

public class Text {
  public static void main(String[] args) throws Exception {
	  Demo5 d1=Demo5.getdemo();
	  Demo5 d2=Demo5.getdemo();
	  System.out.print("�����л�ǰ����Ϊ��");
	  System.out.print(d1.hashCode()+" ");
	  System.out.println(d2.hashCode());
	  
	  //������d1д���ļ���
	  FileOutputStream fos=new FileOutputStream("e:"+File.separator+"mldn.txt");
	  ObjectOutputStream oos=new ObjectOutputStream(fos);
	  oos.writeObject(d1);
	  oos.close();
	  fos.close();
	  
	  //���ļ��ж�ȡ����d1
	  ObjectInputStream ois=new ObjectInputStream(new FileInputStream("e:"+File.separator+"mldn.txt"));
	  Demo5 d3=(Demo5) ois.readObject();
      System.out.println("�����л������Ϊ��"+d3.hashCode());//s3��һ���¶���
	}
}

