package model;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class Admin extends User {
	public Admin(int uid, String username, String password) {
		super(uid, username, password);
	}

	public Admin() {
		super();
	}

	public Admin login(String u, String p) throws Exception {
		if (this.isLogin())
			throw new Exception("ÄãÒÑ¾­µÇÂ½ÁË");
		String sql = "select * from admin where username='" + u + "' and "
				+ "password = '" + p + "'";
		ResultSet rs = DataConnect.getStat().executeQuery(sql);
		if (rs.next())
			return new Admin(rs.getInt(1),rs.getString(2), rs.getString(3));
		else
			return this;
	}

	public ArrayList<User> viewAllUser() throws SQLException,
			ClassNotFoundException {
		ArrayList<User> gg = new ArrayList<User>();
		String sql = "select * from user ";
		ResultSet rs = DataConnect.getStat().executeQuery(sql);
		while (rs.next()) {
			gg.add(new User(rs.getInt(1),rs.getString(2), rs.getString(3)));
		}
		return gg;
	}
	public void deleteGG(int gid) throws Exception {

		String sql = "delete from gg where gid ="+gid;
		DataConnect.getStat().executeUpdate(sql);
	}
	public void deleteUser(int uid) throws Exception {

		String sql = "delete from user where uid ="+uid;
		DataConnect.getStat().executeUpdate(sql);
	}
	public void deleteCom(int cid) throws Exception {

		String sql = "delete from comment where cid ="+cid;
		DataConnect.getStat().executeUpdate(sql);
	}
	public void deleteRep(int rid) throws Exception {

		String sql = "delete from reply where rid ="+rid;
		DataConnect.getStat().executeUpdate(sql);
	}

}
