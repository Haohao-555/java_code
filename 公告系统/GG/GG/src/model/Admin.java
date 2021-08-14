package model;

import java.sql.*;

public class Admin {

	private boolean islogin;
	private String name;
	private String pw;

	public Admin() {

	}

	public Admin(String name, String pw) {
		super();
		this.name = name;
		this.pw = pw;
		islogin = true;
	}

	public Admin login(String n, String pw) throws SQLException,
			ClassNotFoundException {
		Admin a = null;

		if (islogin)
			return this;

		String sql = "select * from admin where name ='" + n + "' and pw = '"
				+ pw + "'";
		ResultSet rs = DataConnect.getStatement().executeQuery(sql);
		if (rs.next()) {
			a = new Admin(rs.getString(1), rs.getString(2));
		}
		return a;

	}

	public void addUser(User u) throws SQLException, ClassNotFoundException {
		String sql = "insert into user values(" + u.getUid() + ",'"
				+ u.getUname() + "','" + u.getUpw() + "')";
		DataConnect.getStatement().executeUpdate(sql);
	}

	public void deleteUser(int uid) throws SQLException, ClassNotFoundException {
		String sql = "delete from user where uid =" + uid;
		DataConnect.getStatement().executeUpdate(sql);

	}

	public User searchUser(int uid) throws SQLException, ClassNotFoundException {
		User u = null;
		String sql = "select * from User where uid=" + uid;
		ResultSet rs = DataConnect.getStatement().executeQuery(sql);
		if (rs.next()) {
			u = new User(rs.getInt(1), rs.getString(2), rs.getString(3));
		}
		return u;
	}

	public User searchUser(String uname) throws SQLException,
			ClassNotFoundException {
		User u = null;
		String sql = "select * from User where uname like '%" + uname + "%'";
		ResultSet rs = DataConnect.getStatement().executeQuery(sql);
		if (rs.next()) {
			u = new User(rs.getInt(1), rs.getString(2), rs.getString(3));
		}
		return u;
	}

	public void updateUser(int uid, String uname, String upw)
			throws SQLException, ClassNotFoundException {

		String sql = "update from user set uname = '" + uname + "' and "
				+ "upw = '" + upw + " where uid =" + uid;
		DataConnect.getStatement().executeUpdate(sql);

	}

	public void addgg() {

	}

	public void deletegg() {

	}

	public void searchgg() {

	}

	public void updategg() {

	}
}
