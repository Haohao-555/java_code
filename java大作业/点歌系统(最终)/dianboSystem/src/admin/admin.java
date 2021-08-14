package admin;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import DB.DBUtil;

import model.User;
import model.song;

public class admin {
	//查看歌库
	public List<song> chakangeku(){
        String sql="select * from song_ready";
        List<song> list=new ArrayList<song>();
        try {
        	Connection conn=null;
        	PreparedStatement ps=null;
        	ResultSet rs=null;
             conn=DBUtil.getConn();
             ps=conn.prepareStatement(sql);
             rs=ps.executeQuery();
             System.out.println(ps.toString());
             while(rs.next()){
            	 song song = new song(null, null, null);
            	 song.setSongName(rs.getString(2));
            	 song.setAuthor(rs.getString(3));
            	 song.setTheme(rs.getString(4));
            	 song.setDate(rs.getString(5));
            	 song.setIFSEQUENCE(rs.getBoolean(6));
                 list.add(song);
             }
             conn.close();
             
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return list;
    }
	//查看今天的歌库
	public List<song> chakangeku_today(){
        java.util.Calendar c=java.util.Calendar.getInstance();    
        java.text.SimpleDateFormat f=new java.text.SimpleDateFormat("yyyy年MM月dd日");    
        String today = f.format(c.getTime());
        String sql="select * from song_ready WHERE date='"+today+"' order by ifsequence DESC";
        List<song> list=new ArrayList<song>();
        try {
        	Connection conn=null;
        	PreparedStatement ps=null;
        	ResultSet rs=null;
             conn=DBUtil.getConn();
             ps=conn.prepareStatement(sql);
             rs=ps.executeQuery();
             System.out.println(ps.toString());
             while(rs.next()){
            	 song song = new song(null, null, null);
            	 song.setSongName(rs.getString(2));
            	 song.setAuthor(rs.getString(3));
            	 song.setTheme(rs.getString(4));
            	 song.setDate(rs.getString(5));
            	 song.setIFSEQUENCE(rs.getBoolean(6));
                 list.add(song);
             }
             conn.close();
             
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return list;
    }
	//查看审核歌曲
	public List<song> chakanshenbigequ(){
		String sql="select * from song_upload";
        List<song> list=new ArrayList<song>();
        try {
        	Connection conn=null;
        	PreparedStatement ps=null;
        	ResultSet rs=null;
             conn=DBUtil.getConn();
             ps=conn.prepareStatement(sql);
             rs=ps.executeQuery();
             System.out.println(ps.toString());
             while(rs.next()){
            	 song song = new song(null, null, null);
            	 song.setSongName(rs.getString(1));
            	 song.setAuthor(rs.getString(2));
            	 song.setTheme(rs.getString(3));
            	 song.setIfpass(rs.getBoolean(4));
                 list.add(song);
             }
             conn.close();
             
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return list;
	}
	//审批歌曲
	public boolean shenpigequ(String songname,int ifpass){
		String sql = "UPDATE song_upload SET ifpass="+ifpass+" WHERE songname='"+songname+"'";
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
	//播放
	public void bofang(String songname){
		
	}
	//暂停
	public void zanting(){
		
	}
	//播放下一首
	public void xiayishou(){
		
	}
	//查看所有用户
	public List<User> chakanyonghu(){
        String sql="select * from user";
        List<User> list=new ArrayList<User>();
        try {
        	Connection conn=null;
        	PreparedStatement ps=null;
        	ResultSet rs=null;
             conn=DBUtil.getConn();
             ps=conn.prepareStatement(sql);
             rs=ps.executeQuery();
             System.out.println(ps.toString());
             while(rs.next()){
            	 User user = new User();
            	 user.setUsername(rs.getString(2));
            	 user.setPwd(rs.getString(3));
            	 user.setName(rs.getString(3));
                 list.add(user);
             }
             conn.close();
             
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return list;
    }
	//删除用户
	public boolean shanchuyonghu(String username){
		String sql = "DELETE FROM user where username ='"+username+"'";
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
