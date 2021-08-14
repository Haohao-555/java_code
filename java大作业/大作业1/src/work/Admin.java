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
		System.out.print("�����������:");
		name = sc.nextLine();
		System.out.print("����������:");
		pw = sc.nextLine();
		for (int i=0;i<admin.size();i++){
		    if(name.equals(admin.get(i).getName())&& pw.equals(admin.get(i).getId())){
			return admin.get(i);
		} 
	}
		return null;
	}//����Ա��¼����
	public void checkSong(ArrayList<Song> songs){
	    System.out.println("ȫ����������");
	 for(int i=0;i<songs.size();i++){
		System.out.print(songs.get(i).getId()+".");
		System.out.print(songs.get(i).getName()+" ");
		System.out.println(songs.get(i).getSinger()+" ");
		}
		Scanner sc =new Scanner(System.in);
		System.out.print("��ѡ����Ҫ��������Ӧ�����");
		String chocie = sc.nextLine();
		if(chocie.equals("1")){
			System.out.println("���ڲ��Ÿ��� "+songs.get(0).getName()+" ����Ϊ"+songs.get(0).getSinger());
			System.out.print("1.��ͣ ");
			System.out.println("2.��һ��");
			System.out.print("��ѡ��");
			Scanner sc1 =new Scanner(System.in);
			String chocie1 = sc1.nextLine();
			if(chocie1.equals("1")){
				System.out.println("����ͣ���� "+songs.get(0).getName()+" ����Ϊ"+songs.get(0).getSinger());
			}else if(chocie1.equals("2")){
				next(chocie,songs);
			}else{
				System.out.print("�������");
			}
		}else if(chocie.equals("2")){
			System.out.println("���ڲ��Ÿ��� "+songs.get(1).getName()+" ����Ϊ"+songs.get(1).getSinger());
			System.out.print("1.��ͣ ");
			System.out.println("2.��һ��");
			System.out.print("��ѡ��");
			Scanner sc2 =new Scanner(System.in);
			String chocie2 = sc2.nextLine();
			if(chocie2.equals("1")){
				System.out.println("����ͣ���� "+songs.get(1).getName()+" ����Ϊ"+songs.get(1).getSinger());
				
			}else if(chocie2.equals("2")){
				next(chocie,songs);
			}else{
				System.out.print("�������");
				}
		}else if(chocie.equals("3")){
			System.out.println("���ڲ��Ÿ��� "+songs.get(2).getName()+" ����Ϊ"+songs.get(2).getSinger());
			System.out.print("1.��ͣ ");
			System.out.println("2.��һ��");
			System.out.print("��ѡ��");
			Scanner sc1 =new Scanner(System.in);
			String chocie1 = sc1.nextLine();
			if(chocie1.equals("1")){
				System.out.println("����ͣ���� "+songs.get(2).getName()+" ����Ϊ"+songs.get(2).getSinger());
			}else if(chocie1.equals("2")){
				next(chocie,songs);
			}else{
				System.out.print("�������");
				}
			}
    }//�鿴�赥�����ţ���ͣ����һ��
    public void checkuser(ArrayList<User> users){
    	System.out.println("ȫ��ע���û�����");
    	for(int i=0;i<users.size();i++)
    		System.out.println(users.get(i).getName());
    }//�鿴ע���û�
    private void next(String i,ArrayList<Song> songs){
    	int n=Integer.parseInt(i);
    	int m=n-1;
    	if(m+1>=songs.size()){
			System.out.println("�������һ�׸���");
		}else{
			int a=m+1;
			System.out.println("��һ�׸���Ϊ"+songs.get(a).getName());
			System.out.println("���ڲ��Ÿ��� "+songs.get(a).getName()+" ����Ϊ"+songs.get(a).getSinger());
		}
    }//��һ�׸�
    public void deleteUser(ArrayList<User> users){
    	System.out.println("ȫ��ע���û�����");
    	for(int i=0;i<users.size();i++)
    		System.out.print(users.get(i).getName()+" ");
    	System.out.println();
        System.out.print("��������Ҫɾ���û�������:");
        Scanner sc =new Scanner(System.in);
    	String chocie = sc.nextLine();
    	for(int i=0;i<users.size();i++){
    		if(chocie.equals(users.get(i).getName())){
    			users.remove(i);
    			System.out.println("ʣ��ע���û�����");
    			for(int a=0;a<users.size();a++)
    	    		System.out.print(users.get(a).getName()+" ");
    			    System.out.println();
    			    System.out.println("ɾ���ɹ� ");
    		}
    	}
    }//ɾ��ע���û�
    public void Lookcomment(ArrayList<Comment> comments){
    	if(!comments.isEmpty()){
    	    for(int i=0;i<comments.size();i++){
    			System.out.print("������: "+comments.get(i).getName()+"�Ը���: "+comments.get(i).getSongname()+"��������: ");
        	    System.out.println(comments.get(i).getDetail());
        	}
    	 }else
     	  System.out.println("�û�û�жԸ�����������"); 		
    		
    }//�鿴����
    public void Deletecomment(ArrayList<Comment> comments){
    	Admin h=new Admin("","");
    	String name;
    	Scanner sc=new Scanner(System.in);
    	System.out.print("��������Ҫɾ�����۶�Ӧ�����˵�����:");
    	name=sc.nextLine();
    	for(int i=0;i<comments.size();i++){
    		if(name.equals(comments.get(i).getName())){
    			comments.remove(i);
    			System.out.println("ʣ����������");
    			h.Lookcomment(comments);
    		}
    	}
    	
    }//ɾ������
    public void Approve(ArrayList<AppSong> Appsongs){
    	int y;
    	Scanner sc=new Scanner(System.in);
    	
    	if(!Appsongs.isEmpty()){
    		for(int i=0;i<Appsongs.size();i++){
    			System.out.println("�û�:  "+Appsongs.get(i).getName()+"ϣ�������ϴ�����:  "
    					+Appsongs.get(i).getSName()+"����:  "+Appsongs.get(i).getSinger());
    		}
    	   }else
        		 System.out.println("û���û�Ҫ���ϴ�����");
    		do{
    			String chocie1;
    			System.out.print("��1ͬ���û��ϴ���������2��ͬ���ϴ�����������������ѡ��:");
    		String chocie=sc.nextLine();
    		 chocie1=chocie;
    		if(chocie1.equals("1")){
    		System.out.print("��������ͬ���û��ϴ������ĸ�������:");
    		String q=sc.nextLine();
    		System.out.println("�ϴ��ɹ�");
    		}else if(chocie1.equals("2")){
    			System.out.println("ллʹ��");
    		}else{
    			System.out.println("  �������");
    		}
    		System.out.print("��1����,��2ֹͣ,��ѡ��:");
    		int v=sc.nextInt();
    		y=v;
    		}while(y==1);
    		
    	}
    	
    }//��������

