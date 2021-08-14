package model;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class User implements Serializable{
	private int id;//id�� 
	private String name;//�û�����
	private String phone;//�û��绰
	private String site;//�û���ַ
	private String pw;//�û�����
	private String number;//�û��˺�
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getSite() {
		return site;
	}
	public void setSite(String site) {
		this.site = site;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public User(int id, String name, String phone, String site, String pw,
			String number) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.site = site;
		this.pw = pw;
		this.number = number;
	}
}