package Person;

public class Person {
	private String pname;

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Person() {// �޲ι��췽��
		System.out.println("�޲ι��췽��");
	}

	public String toString() {
		return "����һ����";
	}
}
