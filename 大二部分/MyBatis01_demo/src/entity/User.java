package entity;
/*该类不能有构造方法，如果有构造方法从数据库中取出数据后返回User类型不报错（映射）
 * 该类的作用是MyBatis框架从数据库中取得数据后返回User类型
 * 属性名称要跟数据表中每一列一样
 * */
public class User {
  private int id;
  private String name;
  private String pw;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
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
  @Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getId()+" "+this.getName()+" "+this.getPw();
	}
}
