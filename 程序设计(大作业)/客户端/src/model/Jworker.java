package model;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Jworker implements Serializable{
	private int id;//id�� 
	private String number;//Ա������
	private String name;//Ա������
	private String pw;//Ա������
	private String type;//Ա�����ͣ�1�������㣬0������㣩
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
