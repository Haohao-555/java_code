package work;

import java.awt.Component;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

import javax.swing.JOptionPane;



public class Comment implements Serializable {
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
	
	}
