package moldn;

public class Student {
    private String name;
    private String num;
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
	public Student(String name, String num) {
		super();
		this.name = name;
		this.num = num;
	}
    
}
