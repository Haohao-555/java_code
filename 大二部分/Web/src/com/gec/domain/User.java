package com.gec.domain;

public class User {
    private int id;
    private String account;
    private String password;
    private String type;
    private String flag;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
	public User(int id, String account, String password, String type,
			String flag) {
		super();
		this.id = id;
		this.account = account;
		this.password = password;
		this.type = type;
		this.flag = flag;
	}
	@Override
	public String toString() {
		return "Account [account=" + account + ", flag=" + flag + ", id=" + id
				+ ", password=" + password + ", type=" + type + "]";
	}
    
}
