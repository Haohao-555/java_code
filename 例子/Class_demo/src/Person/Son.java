package Person;

public class Son  extends Father implements NetMessage,Memessage{
	private String sname;
	private int sage;
	public  Son(String name,int age) {
		this.sname=name;
		this.sage=age;
	}
	public  Son() {}
	public String toString() {
		return this.sname+this.sage;
	}
	
	public String getName() {
		return sname;
	}
	public void setName(String name) {
		this.sname = name;
	}
	//∆’Õ®∑Ω∑®
	public void print(String name) {}
	public void print_a() {}
	public void print_b() {}
}
