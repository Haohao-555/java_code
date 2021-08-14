package model;
import java.sql.*;
import java.util.ArrayList;


public class User {

	private int uid;
	private String username;
	private String password;
	private boolean login;

	public User(int uid,String username, String password) {
		super();
		this.uid = uid;
		this.username = username;
		this.password = password;
		login = true;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public User() {
		super();
		login = false;
	}

	public boolean isLogin() {
		return login;
	}

	public User login(String u, String p) throws Exception {
		if (login)
			throw new Exception("你已经登陆了");
		String sql = "select * from user where username='" + u + "' and "
				+ "password = '" + p + "'";
		ResultSet rs = DataConnect.getStat().executeQuery(sql);
		if (rs.next())
			return new User(rs.getInt(1),rs.getString(2), rs.getString(3));
		else
			return this;
	}

	public void register(String u, String p1, String p2) throws Exception {
		if (!p1.equals(p2))
			throw new Exception("密码输入不一致");
		String sql = "insert into user(username,password) values ('" + u
				+ "','" + p1 + "')";
		DataConnect.getStat().executeUpdate(sql);
	}

	public ArrayList<GG> marklist(int uid) throws SQLException,
			ClassNotFoundException {
		ArrayList<GG> gg = new ArrayList<GG>();
		String sql = "select * from mark where uid =" + uid;
		ResultSet rs = DataConnect.getStat().executeQuery(sql);
		while (rs.next()) {
			int gid = rs.getInt("gid");
			sql = "select * from gg where gid=" + gid;
			rs = DataConnect.getStat().executeQuery(sql);
			if (rs.next())
				gg.add(new GG(rs.getInt(1), rs.getString(2), rs.getString(3),
						rs.getInt(4), rs.getString(5)));
		}
		return gg;

	}

	public ArrayList<GG> viewAllGG() throws SQLException,
			ClassNotFoundException {
		ArrayList<GG> gg = new ArrayList<GG>();
		String sql = "select * from gg ";
		ResultSet rs = DataConnect.getStat().executeQuery(sql);
		while (rs.next()) {
			gg.add(new GG(rs.getInt(1), rs.getString(2), rs.getString(3), rs
					.getInt(4), rs.getString(5)));
		}
		return gg;
	}

	public GG viewGG(String gid) throws SQLException, ClassNotFoundException {
		GG gg = null;
		String sql = "select * from gg where gid=" + gid;
		ResultSet rs = DataConnect.getStat().executeQuery(sql);
		if (rs.next()) {
			gg = new GG(rs.getInt(1), rs.getString(2), rs.getString(3), rs
					.getInt(4), rs.getString(5));
		}
		return gg;
	}

	public void addComment(int gid, String content, int uid) throws Exception {

		String sql = "insert into user comment(gid,content,uid) values(" + +gid
				+ ",'" + content + "'," + uid;
		DataConnect.getStat().executeUpdate(sql);
	}

	public void addReply(int cid, String content, int uid) throws Exception {

		String sql = "insert into user reply(cid,content,uid) values(" + +cid
				+ ",'" + content + "'," + uid;
		DataConnect.getStat().executeUpdate(sql);
	}

	public void mark(int uid, int gid) throws Exception {

		String sql = "insert into mark values(" + uid + "," + gid + ")";
		DataConnect.getStat().executeUpdate(sql);
	}

	public void demark(int uid, int gid) throws Exception {

		String sql = "delete from mark where uid =" + uid + " and gid=" + gid;
		DataConnect.getStat().executeUpdate(sql);
	}

	public ArrayList<Comment> viewCom(int gid) throws SQLException,
			ClassNotFoundException {
		ArrayList<Comment> gg = new ArrayList<Comment>();
		String sql = "select * from Comment where gid=" + gid;
		ResultSet rs = DataConnect.getStat().executeQuery(sql);
		while (rs.next()) {
			gg.add(new Comment(rs.getInt(1), rs.getInt(2), rs.getString(3), rs
					.getInt(4), rs.getString(5)));
		}
		return gg;
	}

	public ArrayList<Reply> viewRel(int rid) throws SQLException,
			ClassNotFoundException {
		ArrayList<Reply> gg = new ArrayList<Reply>();
		String sql = "select * from reply where rid=" + rid;
		ResultSet rs = DataConnect.getStat().executeQuery(sql);
		while (rs.next()) {
			gg.add(new Reply(rs.getInt(1), rs.getInt(2), rs.getString(3), rs
					.getInt(4), rs.getString(5)));
		}
		return gg;
	}
}
