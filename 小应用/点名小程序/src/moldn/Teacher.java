package moldn;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

public class Teacher {
    private String name;
    private String passwork;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPasswork() {
		return passwork;
	}
	public void setPasswork(String passwork) {
		this.passwork = passwork;
	}
	public Teacher(String name, String passwork) {
		super();
		this.name = name;
		this.passwork = passwork;
	}
	public Teacher() {
		super();
		this.name = name;
		this.passwork = passwork;
	}
    //��¼
	public static Teacher login(String name, String ps){
		if(name.equals("С��")&&ps.equals("123")){
			return new Teacher(name,ps);
		}
		return null;
	}
	public void sected(ArrayList<Selected_student> selected) throws Exception{
		File file =new File("e:"+File.separator+"java"+File.separator+"СӦ��"+File.separator+"����С����"+File.separator+"student.txt");
		PrintStream out=new PrintStream(new FileOutputStream(file),true);
		for(int i=0;i<selected.size();i++){
			out.printf("������%s   ѧ�ţ�%s   �����%s\r\n", selected.get(i).getName(),selected.get(i).getNum(),selected.get(i).getDetail());
			System.out.println(selected.get(i).getName()+selected.get(i).getNum()+selected.get(i).getDetail());
		}
		out.close();
		
	}
}
