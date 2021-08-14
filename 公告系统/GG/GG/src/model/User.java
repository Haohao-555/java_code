package model;

import java.sql.ResultSet;
import java.sql.SQLException;

public class User {
	private boolean islogin;
	private int uid;
	private String uname;
	private String upw;

	public User() {

	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUpw() {
		return upw;
	}

	public void setUpw(String upw) {
		this.upw = upw;
	}

	public User(int uid, String uname, String upw) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.upw = upw;
		islogin = true;
	}

	public User login(String uid, String upw) throws SQLException, ClassNotFoundException {
		User a = null;

		if (islogin)
			return this;

		String sql = "select * from user where uid =" + uid + " and upw = '"
				+ upw + "'";
		ResultSet rs = DataConnect.getStatement().executeQuery(sql);
		if (rs.next()) {
			a = new User(rs.getInt(1),rs.getString(2), rs.getString(3));
		}
		return a;
	}

	public void viewAllGG() {

	}

	public void viewGG() {

	}

	public void searchgg() {

	}

}
