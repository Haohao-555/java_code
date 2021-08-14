package work;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Scanner;
public class Comment {
	 private String name;//评论人
	 private String songname;//歌的名字
	 private String detail;//评论内容
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
		System.out.print("请评价歌曲");
		detail=sc.nextLine();
		
		System.out.print("请输入歌曲名字");
		songname=sc.nextLine();
		System.out.print("请输入评论人名字");
		Name=sc.nextLine();
		((ArrayList<Comment>) comments).add(new Comment(Name,detail,songname));
	}//评论歌曲
	
}
