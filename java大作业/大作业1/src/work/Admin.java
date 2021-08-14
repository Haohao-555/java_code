package work;
import java.util.ArrayList;
import java.util.Scanner;
public class Admin {
    private String name;
    private String id;
	public Admin(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Admin Alogin(ArrayList<Admin> admin){
		String name;
		String pw;
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入管理名:");
		name = sc.nextLine();
		System.out.print("请输入密码:");
		pw = sc.nextLine();
		for (int i=0;i<admin.size();i++){
		    if(name.equals(admin.get(i).getName())&& pw.equals(admin.get(i).getId())){
			return admin.get(i);
		} 
	}
		return null;
	}//管理员登录界面
	public void checkSong(ArrayList<Song> songs){
	    System.out.println("全部歌曲如下");
	 for(int i=0;i<songs.size();i++){
		System.out.print(songs.get(i).getId()+".");
		System.out.print(songs.get(i).getName()+" ");
		System.out.println(songs.get(i).getSinger()+" ");
		}
		Scanner sc =new Scanner(System.in);
		System.out.print("请选择你要听歌曲对应的序号");
		String chocie = sc.nextLine();
		if(chocie.equals("1")){
			System.out.println("正在播放歌曲 "+songs.get(0).getName()+" 歌手为"+songs.get(0).getSinger());
			System.out.print("1.暂停 ");
			System.out.println("2.下一首");
			System.out.print("请选择");
			Scanner sc1 =new Scanner(System.in);
			String chocie1 = sc1.nextLine();
			if(chocie1.equals("1")){
				System.out.println("已暂停歌曲 "+songs.get(0).getName()+" 歌手为"+songs.get(0).getSinger());
			}else if(chocie1.equals("2")){
				next(chocie,songs);
			}else{
				System.out.print("输入错误");
			}
		}else if(chocie.equals("2")){
			System.out.println("正在播放歌曲 "+songs.get(1).getName()+" 歌手为"+songs.get(1).getSinger());
			System.out.print("1.暂停 ");
			System.out.println("2.下一首");
			System.out.print("请选择");
			Scanner sc2 =new Scanner(System.in);
			String chocie2 = sc2.nextLine();
			if(chocie2.equals("1")){
				System.out.println("已暂停歌曲 "+songs.get(1).getName()+" 歌手为"+songs.get(1).getSinger());
				
			}else if(chocie2.equals("2")){
				next(chocie,songs);
			}else{
				System.out.print("输入错误");
				}
		}else if(chocie.equals("3")){
			System.out.println("正在播放歌曲 "+songs.get(2).getName()+" 歌手为"+songs.get(2).getSinger());
			System.out.print("1.暂停 ");
			System.out.println("2.下一首");
			System.out.print("请选择");
			Scanner sc1 =new Scanner(System.in);
			String chocie1 = sc1.nextLine();
			if(chocie1.equals("1")){
				System.out.println("已暂停歌曲 "+songs.get(2).getName()+" 歌手为"+songs.get(2).getSinger());
			}else if(chocie1.equals("2")){
				next(chocie,songs);
			}else{
				System.out.print("输入错误");
				}
			}
    }//查看歌单，播放，暂停，下一首
    public void checkuser(ArrayList<User> users){
    	System.out.println("全部注册用户如下");
    	for(int i=0;i<users.size();i++)
    		System.out.println(users.get(i).getName());
    }//查看注册用户
    private void next(String i,ArrayList<Song> songs){
    	int n=Integer.parseInt(i);
    	int m=n-1;
    	if(m+1>=songs.size()){
			System.out.println("已是最后一首歌曲");
		}else{
			int a=m+1;
			System.out.println("下一首歌曲为"+songs.get(a).getName());
			System.out.println("正在播放歌曲 "+songs.get(a).getName()+" 歌手为"+songs.get(a).getSinger());
		}
    }//下一首歌
    public void deleteUser(ArrayList<User> users){
    	System.out.println("全部注册用户如下");
    	for(int i=0;i<users.size();i++)
    		System.out.print(users.get(i).getName()+" ");
    	System.out.println();
        System.out.print("请输入你要删除用户的姓名:");
        Scanner sc =new Scanner(System.in);
    	String chocie = sc.nextLine();
    	for(int i=0;i<users.size();i++){
    		if(chocie.equals(users.get(i).getName())){
    			users.remove(i);
    			System.out.println("剩余注册用户如下");
    			for(int a=0;a<users.size();a++)
    	    		System.out.print(users.get(a).getName()+" ");
    			    System.out.println();
    			    System.out.println("删除成功 ");
    		}
    	}
    }//删除注册用户
    public void Lookcomment(ArrayList<Comment> comments){
    	if(!comments.isEmpty()){
    	    for(int i=0;i<comments.size();i++){
    			System.out.print("评论人: "+comments.get(i).getName()+"对歌曲: "+comments.get(i).getSongname()+"的评价是: ");
        	    System.out.println(comments.get(i).getDetail());
        	}
    	 }else
     	  System.out.println("用户没有对歌曲进行评论"); 		
    		
    }//查看评论
    public void Deletecomment(ArrayList<Comment> comments){
    	Admin h=new Admin("","");
    	String name;
    	Scanner sc=new Scanner(System.in);
    	System.out.print("请输入你要删除评论对应评论人的名字:");
    	name=sc.nextLine();
    	for(int i=0;i<comments.size();i++){
    		if(name.equals(comments.get(i).getName())){
    			comments.remove(i);
    			System.out.println("剩余评论如下");
    			h.Lookcomment(comments);
    		}
    	}
    	
    }//删除评论
    public void Approve(ArrayList<AppSong> Appsongs){
    	int y;
    	Scanner sc=new Scanner(System.in);
    	
    	if(!Appsongs.isEmpty()){
    		for(int i=0;i<Appsongs.size();i++){
    			System.out.println("用户:  "+Appsongs.get(i).getName()+"希望可以上传歌曲:  "
    					+Appsongs.get(i).getSName()+"歌手:  "+Appsongs.get(i).getSinger());
    		}
    	   }else
        		 System.out.println("没有用户要求上传歌曲");
    		do{
    			String chocie1;
    			System.out.print("按1同意用户上传歌曲，按2不同意上传歌曲，请输入您的选择:");
    		String chocie=sc.nextLine();
    		 chocie1=chocie;
    		if(chocie1.equals("1")){
    		System.out.print("请输入你同意用户上传歌曲的歌曲名字:");
    		String q=sc.nextLine();
    		System.out.println("上传成功");
    		}else if(chocie1.equals("2")){
    			System.out.println("谢谢使用");
    		}else{
    			System.out.println("  输入错误");
    		}
    		System.out.print("按1继续,按2停止,请选择:");
    		int v=sc.nextInt();
    		y=v;
    		}while(y==1);
    		
    	}
    	
    }//审批歌曲

