package moldn;

public class Selected_student {
   private String name;
   private String num;
   private String detail;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getNum() {
	return num;
}
public void setNum(String num) {
	this.num = num;
}
public String getDetail() {
	return detail;
}
public void setDetail(String detail) {
	this.detail = detail;
}
public Selected_student(String name, String num, String detail) {
	super();
	this.name = name;
	this.num = num;
	this.detail = detail;
}
   
}
