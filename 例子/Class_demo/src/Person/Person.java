package Person;

public class Person {
	private String pname;

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Person() {// 无参构造方法
		System.out.println("无参构造方法");
	}

	public String toString() {
		return "我是一个人";
	}
}
