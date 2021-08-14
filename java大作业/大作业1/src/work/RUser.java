package work;
//游客注册
public class RUser extends User {
	private String name;  
	private String pw;
	private int id;
	public RUser(String name, String pw, int id) {
		super();
		this.name = name;//用户名
		this.pw = pw;//密码
		this.id = id;//学号
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
