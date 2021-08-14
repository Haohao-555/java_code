package model;

import java.io.Serializable;

public class Work implements Serializable {
	private int id;//id�� 
	private String name;//Ա������
	private String number;//Ա������
	private String detail;//��������
	private String ctime;//�ύ��������ʱ��
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
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getCtime() {
		return ctime;
	}
	public void setCtime(String ctime) {
		this.ctime = ctime;
	}
	public Work(int id, String name, String number, String detail, String ctime) {
		super();
		this.id = id;
		this.name = name;
		this.number = number;
		this.detail = detail;
		this.ctime = ctime;
	}
	
}

