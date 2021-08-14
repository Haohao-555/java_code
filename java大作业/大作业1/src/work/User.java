package work;
import java.util.ArrayList;
import java.util.Scanner;
public class User {
	private String name;
    private String pw;
    public User(){
    }
	public String getName() {
		return name;
	}
    public void setName(String name) {
		this.name = name;
	}
    public String getPw() {
		return pw;
	}
    public void setPw(String pw) {
		this.pw = pw;
	}
    public User(String name, String pw) {
		super();
		this.name = name;
		this.pw = pw;
	}
	public User login(ArrayList<User> user){
		String name;
		String pw;
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入用户名:");
		name = sc.nextLine();
		System.out.print("请输入密码:");
		pw = sc.nextLine();
		for (int i=0;i<user.size();i++){
			
			if(name.equals(user.get(i).getName())&& pw.equals(user.get(i).getPw())){
			return user.get(i);
		} 
	}
		return null;
	}//注册用户登录界面
	public void register(ArrayList<User> user){
		String name;
		String pw;
		int id;
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入用户名:");
		name = sc.nextLine();
		System.out.print("请输入密码:");
		pw = sc.nextLine();
		System.out.print("请输入学号:");
		id=sc.nextInt();
		for(int i=0;i<user.size();i++){
			if(name.equals(user.get(i).getName())){
				System.out.print("用户名已存在！注册失败");
				return ;
			}
		}
		user.add(new RUser(name, pw, id));
		System.out.println("注册成功!");
	}//申请成为注册用户
	public void orderProgram(ArrayList<Program> programs){
     System.out.println("今日节目单如下");
		for(int i=0;i<programs.size();i++){
		System.out.print(programs.get(i).getProgram()+".");
		System.out.println(programs.get(i).getTime()+" ");
	   }
	}//查看今日节目单
	public void searchSong(ArrayList<Song> songs,ArrayList<Comment> comments){
		Comment a=new Comment("","","");
	    Scanner sc = new Scanner(System.in);
		System.out.print("          请输入你要选择的歌曲名字");
	    String chocie = sc.nextLine();
		for(int i=0,len=songs.size();i<len;i++){
	    		if(chocie.equals(songs.get(i).getName())){
	    			System.out.println("已找到你选择的歌曲:");
	    			System.out.print("1.播放 ");
	    			System.out.print("2.暂停 ");
	    			System.out.println("3.下一首");
	    			System.out.print("请输入您的选择:");
	        		Scanner sc1 = new Scanner(System.in);
	        		String chocie1 = sc1.nextLine();
	        		if(chocie1.equals("1")){
	        			System.out.println("正在播放歌曲 "+chocie+" 歌手为"+songs.get(i).getSinger());
	        			 a.comment(comments);
	        		}else if(chocie1.equals("2")){
	        			System.out.println("已暂停歌曲 "+chocie+" 歌手为"+songs.get(i).getSinger());
	        			a.comment(comments);
	        		}else if(chocie1.equals("3")){
	        			int v=i;
	        			next(v,songs,comments);
	        			a.comment(comments);
	        		}else{
	        			System.out.print("输入错误");
	        		}
	        	}
	    		else if(i==len){
	    			System.out.println("查无此歌");
	    			
	    		}else{
	    			;
	    		}
	    	}
	}//查找歌曲
	public void next(int i,ArrayList<Song> songs,ArrayList<Comment> comments) {
		
		if(i+1>=songs.size()){
			System.out.println("已是最后一首歌曲");
		}else{
			int a=i+1;
			System.out.println("下一首歌曲为"+songs.get(a).getName());
			System.out.println("正在播放歌曲 "+songs.get(a).getName()+" 歌手为"+songs.get(a).getSinger());
			
		}
	}//下一首歌
   public void viewAllsong(ArrayList<Song> songs){
       System.out.println("全部歌曲如下");
	   for(int i=0;i<songs.size();i++){
	     System.out.print(songs.get(i).getId()+".");
	     System.out.print(songs.get(i).getName()+" ");
		 System.out.println(songs.get(i).getSinger()+" ");
		}    
	}//看所有歌单
	public void upSong(ArrayList<AppSong> Appsongs){
		String Name;
		String SName;
		String Singer;
		int w;
		do{
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入歌名:");
		SName=sc.nextLine();
		System.out.print("请输入歌手:");
		Singer=sc.nextLine();
		System.out.print("请输入上传人的用户名:");
		Name=sc.nextLine();
		((ArrayList<AppSong>) Appsongs).add(new AppSong(SName,Name,Singer));
		System.out.print("按1继续提出上传歌曲要求,按2结束");
		int f=sc.nextInt();
		w=f;
		}while(w==1);
		System.out.println("以将你的提议提交给管理员了,请等待管理员的审批");
	}//上传歌曲
}
