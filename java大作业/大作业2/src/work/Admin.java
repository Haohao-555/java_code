package work;

public class Admin {
private String name;
private String pw;
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
public Admin(String name, String pw) {
	super();
	this.name = name;
	this.pw = pw;
}
public void Aregister(String name,String id) throws Exception{
	if(name.equals("小黄")&&id.equals("123124")){
	System.out.println("登录成功");
	}else{
		throw new Exception("密码或管理名输入错误");
	}
}
}
