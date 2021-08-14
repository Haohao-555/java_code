package entity;
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
