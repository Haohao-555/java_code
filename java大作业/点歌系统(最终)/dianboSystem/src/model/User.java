package model;

import java.sql.ResultSet;
import java.sql.SQLException;

public class User {
	private String username,name,pwd;
	/*
	public user(String username,String name,String pwd){
		super();
		this.username = username;
		this.name = name;
		this.pwd = pwd;
	}*/
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//ע��
	public void zhuce(User u){
		String sql = "INSERT INTO user(username,pwd,name) VALUES('"+u.getUsername()+"','"+u.getPwd()+"','"+u.getName()+"')";
		try {
			DB.DataConnect.getStatement().executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//��½
	public boolean denglu(String username, String pwd){
		String sql = "SELECT username FROM user WHERE pwd='"+pwd+"' and username='"+username+"'";
		try {
			ResultSet rs = DB.DataConnect.getStatement().executeQuery(sql);
			if(rs.next()){
				if(username.equals(rs.getString(1)))
					return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	
	}
	//�鿴������
	@SuppressWarnings("null")
	public song[] geku(){
        java.util.Calendar c=java.util.Calendar.getInstance();    
        java.text.SimpleDateFormat f=new java.text.SimpleDateFormat("yyyy��MM��dd��");    
        String today = f.format(c.getTime());
        //System.out.println(f.format(c.getTime()));
        
        
		//String[][] song = new String[1][19]; //0�Ǹ�����1������
		String sql = "SELECT * FROM song_ready WHERE date='"+today+"'";
		try {
			song[] s = new song[20];
			ResultSet rs = DB.DataConnect.getStatement().executeQuery(sql);
			int i = 0;
			while(rs.next()){
				
				s[i] = new song(rs.getString(2),rs.getString(3),rs.getString(4));
				//s[i] = rs.getString(1),rs.getString(2),rs.getString(3));
				
				//song[0][i] = rs.getString(1);
				//song[1][i] = rs.getString(2);
				System.out.println(rs.getString(2)+rs.getString(3)+rs.getString(4));
				i++;
				
			}

			//System.out.println(song[0][]);
			return s;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	//���
	public song diange(song s){
		String sql = "INSERT INTO song_ready(songname,date,theme,ifsequence,author) VALUES('"+s.getSongName()+"','"+s.getDate()+"','"+s.getTheme()+"',"+s.isIFSEQUENCE()+",'"+s.getAuthor()+"')";
		System.out.println(sql);
		try {
			DB.DataConnect.getStatement().executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	//�û��Ե����е���
	public void dianping(String songname,String username,String comment){
		String sql = "INSERT INTO comment(songname,username,comment) VALUES('"+songname+"','"+username+"','"+comment+"')";
		try {
			DB.DataConnect.getStatement().executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	//�ظ�����(ûʵ��)
	public void huifudianping( String comment){
	}
	//����
	public boolean dianzan(String username,String songname){
		String sql = "INSERT INTO dianzan(username,songname) VALUES('"+username+"','"+songname+"')";
		//String sql = "INSERT INTO like(username,songname) VALUES('"+username+"','"+songname+"')";
		
		
		try {
			DB.DataConnect.getStatement().executeUpdate(sql);
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	//ȡ������
	public boolean quxiaodianzan(String username,String songname){
		//String sql = "INSERT INTO dianzan(username,songname) VALUES('"+username+"','"+songname+"')";
		String sql = "DELETE FROM dianzan WHERE username='"+username+"' and songname='"+songname+"'";
		//String sql = "INSERT INTO like(username,songname) VALUES('"+username+"','"+songname+"')";
		
		
		try {
			DB.DataConnect.getStatement().executeUpdate(sql);
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	//�ղظ���
	public boolean shoucang(String username,String songname){
		String sql = "INSERT INTO collect_song(username,songname) VALUES('"+username+"','"+songname+"')";
		try {
			DB.DataConnect.getStatement().executeUpdate(sql);
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	//ȡ���ղظ���
	public boolean quxiaoshoucang(String username,String songname){
		String sql = "DELETE from collect_song WHERE username='"+username+"' and songname='"+songname+"'";
		try {
			DB.DataConnect.getStatement().executeUpdate(sql);
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	//�ϴ�����
	public boolean shangchuange(song s){
		String sql = "INSERT INTO song_upload(songname,author,theme) VALUES('"+s.getSongName()+"','"+s.getAuthor()+"','"+s.getTheme()+"')";
		try {
			DB.DataConnect.getStatement().executeUpdate(sql);
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}


}
