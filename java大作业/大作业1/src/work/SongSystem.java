package work;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
public class SongSystem {
    static ArrayList<User> users=new ArrayList<User>();
    static ArrayList<Song> songs=new ArrayList<Song>();
    static ArrayList<Comment> Comments=new ArrayList<Comment>();
    static ArrayList<Admin> admins=new ArrayList<Admin>();
    static ArrayList<Program> programs=new ArrayList<Program>();
    static ArrayList<Comment> comments=new ArrayList<Comment>();
    static ArrayList<AppSong> Appsongs=new ArrayList<AppSong>();
    public static void init(){
    	users.add(new RUser("小明","123123",123));
    	users.add(new RUser("小红","123124",124));
    	users.add(new RUser("小强","123125",1255));
    	songs.add(new Song(1,"真心英雄","周华健",246));
    	songs.add(new Song(2,"匆匆那年","王菲",243));
    	songs.add(new Song(3,"当年情","张国荣",300));
    	admins.add(new Admin("小黄","55555"));
    	admins.add(new Admin("小绿","66666"));
    	admins.add(new Admin("小紫","77777"));
    	programs.add(new Program("郊游","2019/5/1"));
    	programs.add(new Program("社团活动","2019/5/4"));
    	programs.add(new Program("文化节","2019/6/9"));
	}//初始化
    public static void UserMenu(){
       init();
  	   User u = new User();
  	   Admin  u1=new Admin("","");
       String a; 
  	do{
    	System.out.println();
    	System.out.println("    欢迎游客使用南方学院点歌系统");
    	System.out.println("      1.注册用户登录");
    	System.out.println("      2.管理员登录");
    	System.out.println("      3.注册");
    	System.out.println("      4.点歌菜单");
    	System.out.println("      0.退出");
    	System.out.print("请输入您的选择:");
    	Scanner sc=new Scanner(System.in);
    	String o=sc.nextLine();
    	if(o.equals("1")){
    		u=u.login(users);
    		if(u == null){
    			System.out.println("  登陆失败");
    		}else{
    			OrderMenu(u);
    		}
    	}else if(o.equals("2")){
    		u1=u1. Alogin( admins);
    		if(u1==null){
    			System.out.println("  登陆失败");
    		}else{
    			AdminMenu(u1);
    		}
    	}else if(o.equals("3")){
    		u.register(users);
    	}else if(o.equals("4")){
    		OrderMenu(u);
    	}else{
    		System.out.println("@@@@@@@@@@谢谢使用@@@@@@@@@@");
    	}
    	System.out.print("再按1结束,按2返回到初始界面,请输入您的选择: ");
    	String c=sc.nextLine();
    	a=c;
    }while(a.equals("2"));
  	System.out.print("@@@@@@@@@@谢谢使用@@@@@@@@@@");
    }
    public static void OrderMenu(User u) {
    	int m;
	do{
    	System.out.println();
		System.out.println("    欢迎用户进行点歌");
    	System.out.println("      1.查找歌曲");
    	System.out.println("      2.查看全部歌曲");
    	System.out.println("      3.查看今日节目单");
     if(u instanceof RUser){//判断是否为注册用户
    	 System.out.println("      4.上传歌曲");
    	 System.out.println("      0.返回上级菜单");
    	 System.out.print("请输入您的选择:");
    	 Scanner sc1 =new Scanner(System.in);
    	 String chocie = sc1.nextLine();
    	if(chocie.equals("1")){
    		 u.searchSong(songs,comments);
    	}else if(chocie.equals("2")){
		      u.viewAllsong(songs);
		}else if(chocie.equals("3")){
			 u.orderProgram(programs);
		}else if(chocie.equals("4")){
			 u.upSong(Appsongs);
		}else if(chocie.equals("0")){
		    UserMenu();
		}else{
			System.out.println(" 输入错误");
		}
    }else{
    	 System.out.print("请输入您的选择: ");
    	 Scanner sc1 =new Scanner(System.in);
    	 String chocie = sc1.nextLine();
           if(chocie.equals("1")){
    		   u.searchSong(songs,comments);
    	   }else if(chocie.equals("2")){
			   u.viewAllsong(songs);
		   }else if(chocie.equals("3")){
			   u.orderProgram(programs);
		   }else{
			   System.out.println(" 输入错误");
		}
   }
     Scanner sc2 =new Scanner(System.in);
     System.out.print("按1结束,按2返回上一级菜单,请输入您的选择: ");
     int n=sc2.nextInt();
     m=n;
     } while(m==2);
  }	
    public static void AdminMenu(Admin u1){
     int k;
	do{
    	System.out.println();
		System.out.println("    管理员登录界面");
    	System.out.println("      1.查看歌单");
    	System.out.println("      2.查看所有注册用户");
    	System.out.println("      3.删除用户");
    	System.out.println("      4.查看点评记录");
    	System.out.println("      5.删除点评记录");
    	System.out.println("      6.审批上传歌曲");
    	System.out.println("      7.返回上级菜单");
    	System.out.print("     请输入您的选择: ");
    	Scanner sc =new Scanner(System.in);
    	String chocie = sc.nextLine();
    if(chocie.equals("1")){
    	u1.checkSong(songs);
	}else if(chocie.equals("2")){
		 u1.checkuser(users);
	}else if(chocie.equals("3")){
		 u1.deleteUser(users);
	}else if(chocie.equals("4")){
		 u1.Lookcomment(comments);
	}else if(chocie.equals("5")){
		u1.Deletecomment(comments);
	}else if(chocie.equals("6")){
		u1.Approve(Appsongs);
	}else if(chocie.equals("7")){
		   UserMenu();
	}else{
		System.out.println(" 输入错误");
	}
    Scanner sc1 =new Scanner(System.in);
    System.out.print("按1结束,按2返回上一级菜单,请输入您的选择: ");
    int a=sc1.nextInt();
    	 k=a;
    	}while(k==2);
   }
} 

