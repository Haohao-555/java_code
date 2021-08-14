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
    	users.add(new RUser("С��","123123",123));
    	users.add(new RUser("С��","123124",124));
    	users.add(new RUser("Сǿ","123125",1255));
    	songs.add(new Song(1,"����Ӣ��","�ܻ���",246));
    	songs.add(new Song(2,"�Ҵ�����","����",243));
    	songs.add(new Song(3,"������","�Ź���",300));
    	admins.add(new Admin("С��","55555"));
    	admins.add(new Admin("С��","66666"));
    	admins.add(new Admin("С��","77777"));
    	programs.add(new Program("����","2019/5/1"));
    	programs.add(new Program("���Ż","2019/5/4"));
    	programs.add(new Program("�Ļ���","2019/6/9"));
	}//��ʼ��
    public static void UserMenu(){
       init();
  	   User u = new User();
  	   Admin  u1=new Admin("","");
       String a; 
  	do{
    	System.out.println();
    	System.out.println("    ��ӭ�ο�ʹ���Ϸ�ѧԺ���ϵͳ");
    	System.out.println("      1.ע���û���¼");
    	System.out.println("      2.����Ա��¼");
    	System.out.println("      3.ע��");
    	System.out.println("      4.���˵�");
    	System.out.println("      0.�˳�");
    	System.out.print("����������ѡ��:");
    	Scanner sc=new Scanner(System.in);
    	String o=sc.nextLine();
    	if(o.equals("1")){
    		u=u.login(users);
    		if(u == null){
    			System.out.println("  ��½ʧ��");
    		}else{
    			OrderMenu(u);
    		}
    	}else if(o.equals("2")){
    		u1=u1. Alogin( admins);
    		if(u1==null){
    			System.out.println("  ��½ʧ��");
    		}else{
    			AdminMenu(u1);
    		}
    	}else if(o.equals("3")){
    		u.register(users);
    	}else if(o.equals("4")){
    		OrderMenu(u);
    	}else{
    		System.out.println("@@@@@@@@@@ллʹ��@@@@@@@@@@");
    	}
    	System.out.print("�ٰ�1����,��2���ص���ʼ����,����������ѡ��: ");
    	String c=sc.nextLine();
    	a=c;
    }while(a.equals("2"));
  	System.out.print("@@@@@@@@@@ллʹ��@@@@@@@@@@");
    }
    public static void OrderMenu(User u) {
    	int m;
	do{
    	System.out.println();
		System.out.println("    ��ӭ�û����е��");
    	System.out.println("      1.���Ҹ���");
    	System.out.println("      2.�鿴ȫ������");
    	System.out.println("      3.�鿴���ս�Ŀ��");
     if(u instanceof RUser){//�ж��Ƿ�Ϊע���û�
    	 System.out.println("      4.�ϴ�����");
    	 System.out.println("      0.�����ϼ��˵�");
    	 System.out.print("����������ѡ��:");
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
			System.out.println(" �������");
		}
    }else{
    	 System.out.print("����������ѡ��: ");
    	 Scanner sc1 =new Scanner(System.in);
    	 String chocie = sc1.nextLine();
           if(chocie.equals("1")){
    		   u.searchSong(songs,comments);
    	   }else if(chocie.equals("2")){
			   u.viewAllsong(songs);
		   }else if(chocie.equals("3")){
			   u.orderProgram(programs);
		   }else{
			   System.out.println(" �������");
		}
   }
     Scanner sc2 =new Scanner(System.in);
     System.out.print("��1����,��2������һ���˵�,����������ѡ��: ");
     int n=sc2.nextInt();
     m=n;
     } while(m==2);
  }	
    public static void AdminMenu(Admin u1){
     int k;
	do{
    	System.out.println();
		System.out.println("    ����Ա��¼����");
    	System.out.println("      1.�鿴�赥");
    	System.out.println("      2.�鿴����ע���û�");
    	System.out.println("      3.ɾ���û�");
    	System.out.println("      4.�鿴������¼");
    	System.out.println("      5.ɾ��������¼");
    	System.out.println("      6.�����ϴ�����");
    	System.out.println("      7.�����ϼ��˵�");
    	System.out.print("     ����������ѡ��: ");
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
		System.out.println(" �������");
	}
    Scanner sc1 =new Scanner(System.in);
    System.out.print("��1����,��2������һ���˵�,����������ѡ��: ");
    int a=sc1.nextInt();
    	 k=a;
    	}while(k==2);
   }
} 

