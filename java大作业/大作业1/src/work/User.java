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
		System.out.print("�������û���:");
		name = sc.nextLine();
		System.out.print("����������:");
		pw = sc.nextLine();
		for (int i=0;i<user.size();i++){
			
			if(name.equals(user.get(i).getName())&& pw.equals(user.get(i).getPw())){
			return user.get(i);
		} 
	}
		return null;
	}//ע���û���¼����
	public void register(ArrayList<User> user){
		String name;
		String pw;
		int id;
		Scanner sc = new Scanner(System.in);
		System.out.print("�������û���:");
		name = sc.nextLine();
		System.out.print("����������:");
		pw = sc.nextLine();
		System.out.print("������ѧ��:");
		id=sc.nextInt();
		for(int i=0;i<user.size();i++){
			if(name.equals(user.get(i).getName())){
				System.out.print("�û����Ѵ��ڣ�ע��ʧ��");
				return ;
			}
		}
		user.add(new RUser(name, pw, id));
		System.out.println("ע��ɹ�!");
	}//�����Ϊע���û�
	public void orderProgram(ArrayList<Program> programs){
     System.out.println("���ս�Ŀ������");
		for(int i=0;i<programs.size();i++){
		System.out.print(programs.get(i).getProgram()+".");
		System.out.println(programs.get(i).getTime()+" ");
	   }
	}//�鿴���ս�Ŀ��
	public void searchSong(ArrayList<Song> songs,ArrayList<Comment> comments){
		Comment a=new Comment("","","");
	    Scanner sc = new Scanner(System.in);
		System.out.print("          ��������Ҫѡ��ĸ�������");
	    String chocie = sc.nextLine();
		for(int i=0,len=songs.size();i<len;i++){
	    		if(chocie.equals(songs.get(i).getName())){
	    			System.out.println("���ҵ���ѡ��ĸ���:");
	    			System.out.print("1.���� ");
	    			System.out.print("2.��ͣ ");
	    			System.out.println("3.��һ��");
	    			System.out.print("����������ѡ��:");
	        		Scanner sc1 = new Scanner(System.in);
	        		String chocie1 = sc1.nextLine();
	        		if(chocie1.equals("1")){
	        			System.out.println("���ڲ��Ÿ��� "+chocie+" ����Ϊ"+songs.get(i).getSinger());
	        			 a.comment(comments);
	        		}else if(chocie1.equals("2")){
	        			System.out.println("����ͣ���� "+chocie+" ����Ϊ"+songs.get(i).getSinger());
	        			a.comment(comments);
	        		}else if(chocie1.equals("3")){
	        			int v=i;
	        			next(v,songs,comments);
	        			a.comment(comments);
	        		}else{
	        			System.out.print("�������");
	        		}
	        	}
	    		else if(i==len){
	    			System.out.println("���޴˸�");
	    			
	    		}else{
	    			;
	    		}
	    	}
	}//���Ҹ���
	public void next(int i,ArrayList<Song> songs,ArrayList<Comment> comments) {
		
		if(i+1>=songs.size()){
			System.out.println("�������һ�׸���");
		}else{
			int a=i+1;
			System.out.println("��һ�׸���Ϊ"+songs.get(a).getName());
			System.out.println("���ڲ��Ÿ��� "+songs.get(a).getName()+" ����Ϊ"+songs.get(a).getSinger());
			
		}
	}//��һ�׸�
   public void viewAllsong(ArrayList<Song> songs){
       System.out.println("ȫ����������");
	   for(int i=0;i<songs.size();i++){
	     System.out.print(songs.get(i).getId()+".");
	     System.out.print(songs.get(i).getName()+" ");
		 System.out.println(songs.get(i).getSinger()+" ");
		}    
	}//�����и赥
	public void upSong(ArrayList<AppSong> Appsongs){
		String Name;
		String SName;
		String Singer;
		int w;
		do{
		Scanner sc = new Scanner(System.in);
		System.out.print("���������:");
		SName=sc.nextLine();
		System.out.print("���������:");
		Singer=sc.nextLine();
		System.out.print("�������ϴ��˵��û���:");
		Name=sc.nextLine();
		((ArrayList<AppSong>) Appsongs).add(new AppSong(SName,Name,Singer));
		System.out.print("��1��������ϴ�����Ҫ��,��2����");
		int f=sc.nextInt();
		w=f;
		}while(w==1);
		System.out.println("�Խ���������ύ������Ա��,��ȴ�����Ա������");
	}//�ϴ�����
}
