package model;

import java.io.IOException;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import DB.DBUtil;

public class song implements Serializable{
	private static final long serialVersionUID = 1L;
	//songname,theme ���ɿ�
	private String SongName,author,Theme,date;
	private boolean IFSEQUENCE; //���booleanֵ����˳�����й�
	private boolean ifpass;
public song(String songname,String author,String Theme){
	super();
	this.SongName = songname;
	this.author = author;
	this.Theme = Theme;
}
	public String getSongName() {
		return SongName;
	}

	public void setSongName(String songName) {
		SongName = songName;
	}

	public String getTheme() {
		return Theme;
	}

	public void setTheme(String theme) {
		Theme = theme;
	}

	public boolean isIFSEQUENCE() {
		return IFSEQUENCE;
	}

	public void setIFSEQUENCE(boolean iFSEQUENCE) {
		IFSEQUENCE = iFSEQUENCE;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	//����ʱ���жϸ������Ƿ��������
	public boolean panduan(String date){
		System.out.println(date);
		String sql = "SELECT date FROM song_ready WHERE date='"+date+"'";
		try {
			ResultSet rs = DB.DataConnect.getStatement().executeQuery(sql);
			int i = 0;
			while(rs.next()){
				i++;
			}
			if(i >= 19){
				System.out.println(i);
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
	//�鿴�ø���������

	public String[] chakanpinglun(String songname){
		//System.out.print(songname);
		String sql = "SELECT * FROM comment where songname='"+songname+"'";
		PreparedStatement stmt = null;
		Connection conn = null; 
		ResultSet rs = null; 
		try {
			conn = DBUtil.getConn();
		ArrayList<String> Commentlist = new java.util.ArrayList<String>();
		stmt = conn.prepareStatement(sql);
		rs = stmt.executeQuery();
		while(rs.next()){
			
			Commentlist.add(rs.getString(2)+":"+ rs.getString(3));
			
		}
		String[] Comment = Commentlist.toArray(new String[Commentlist.size()]) ;

		//System.out.println(arrString[1]);
		return Comment;
		} catch (SQLException e) {
			 //TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
		
	}
	public boolean isIfpass() {
		return ifpass;
	}
	public void setIfpass(boolean ifpass) {
		this.ifpass = ifpass;
	}
}
