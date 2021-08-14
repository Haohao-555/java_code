package model;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Teacher {
//点名
	public ArrayList<Student> votestudent() throws SQLException, ClassNotFoundException{
		ArrayList<Student> student = new ArrayList<Student>();
		String sql = "select * from student";
		ResultSet rs = DataConnect.getStat().executeQuery(sql);
		while(rs.next()){
			student.add(new Student(rs.getInt(1),rs.getString(3),rs.getString(2),null));
		}
		return student;
	}
//保存信息
	public void savestudent(String file,Student student) throws IOException{
		        FileOutputStream fout = new FileOutputStream(file);
                DataOutputStream dfout =new DataOutputStream(fout);
                String name = student.getName();
        		String  number = student.getNumber();
        		String  detail=student.getDetail();
				dfout.writeUTF(name);
				dfout.flush();
				dfout.writeUTF(number);
				dfout.flush();
				dfout.writeUTF(detail);
				dfout.flush();
				dfout.close();
			
               
          
	}
}
