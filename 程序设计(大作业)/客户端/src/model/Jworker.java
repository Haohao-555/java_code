package model;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Jworker implements Serializable{
	private int id;//id码 
	private String number;//员工工号
	private String name;//员工姓名
	private String pw;//员工密码
	private String type;//员工类型（1代表管理层，0代表基层）
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Jworker(int id, String number, String name, String pw, String type) {
		super();
		this.id = id;
		this.number = number;
		this.name = name;
		this.pw = pw;
		this.type = type;
	}
	
}
