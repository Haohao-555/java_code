package bank;

public class Account {

	private String name;
	private double balance;
	public Account(String name, double balance) {
		super();
		this.name = name;
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void withdraw(double m) throws BankException{
		if(m<0)
			throw new BankException("不能取负数的钱");
		if(m>balance)
			throw new BankException("不能取超过余额的钱");
		balance-=m;
	}
	public void deposit(double m) throws BankException{
		if(m<0)
			throw new BankException("不能存负数的钱");
		balance+=m;
	}
	public void transfer(Account o, double m) throws BankException{
		this.withdraw(m);
		o.deposit(m);
	}
}

