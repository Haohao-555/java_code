package work;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Scanner;
public class Comment {
	 private String name;//������
	 private String songname;//�������
	 private String detail;//��������
	public String getSongname(){
		return songname;
	}
	public void  setUser(String songname){
		this.songname=songname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public Comment(String name,String detail,String songname){
		super();
		this.name = name;
		this.songname=songname;
		this.detail = detail;
	}
	@SuppressWarnings("unchecked")
	public void comment(Object comments){
		String detail;
		String Name;
		String songname;
		Scanner sc = new Scanner(System.in);
		System.out.print("�����۸���");
		detail=sc.nextLine();
		
		System.out.print("�������������");
		songname=sc.nextLine();
		System.out.print("����������������");
		Name=sc.nextLine();
		((ArrayList<Comment>) comments).add(new Comment(Name,detail,songname));
	}//���۸���
	
}
