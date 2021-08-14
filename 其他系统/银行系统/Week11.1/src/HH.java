public class HH {

	public void A() {
		System.out.println(10 / 0);
	}

	public void B() {
		A();
	}

	public void C() {
		B();
	}
}
