package model;

import java.io.Serializable;

public class Message implements Serializable {
	private int id;//id�� 
	private String ktype;//�������
	private String jname;//�ļ�������
	private String sname;//�ռ�������
	private String jsite;//�ļ��˵�ַ
	private String ssite;//�ռ��˵�ַ
	private String weight;//�������
	private String price;//��ݷ�
	private String jphone;//�ļ��˵绰
	private String sphone;//�ռ��˵绰
	private String knumber;//ȡ����
	private String condition;//���״̬
	private String deadline;//��ݽ�ֹʱ��
	private String ctime;//���ʱ��
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getKtype() {
		return ktype;
	}
	public void setKtype(String ktype) {
		this.ktype = ktype;
	}
	public String getJname() {
		return jname;
	}
	public void setJname(String jname) {
		this.jname = jname;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getJsite() {
		return jsite;
	}
	public void setJsite(String jsite) {
		this.jsite = jsite;
	}
	public String getSsite() {
		return ssite;
	}
	public void setSsite(String ssite) {
		this.ssite = ssite;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getJphone() {
		return jphone;
	}
	public void setJphone(String jphone) {
		this.jphone = jphone;
	}
	public String getSphone() {
		return sphone;
	}
	public void setSphone(String sphone) {
		this.sphone = sphone;
	}
	public String getKnumber() {
		return knumber;
	}
	public void setKnumber(String knumber) {
		this.knumber = knumber;
	}
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}
	public String getDeadline() {
		return deadline;
	}
	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}
	public String getCtime() {
		return ctime;
	}
	public void setCtime(String ctime) {
		this.ctime = ctime;
	}
	public Message(int id, String ktype, String jname, String sname,
			String jsite, String ssite, String weight, String price,
			String jphone, String sphone, String knumber, String condition,
			String deadline, String ctime) {
		super();
		this.id = id;
		this.ktype = ktype;
		this.jname = jname;
		this.sname = sname;
		this.jsite = jsite;
		this.ssite = ssite;
		this.weight = weight;
		this.price = price;
		this.jphone = jphone;
		this.sphone = sphone;
		this.knumber = knumber;
		this.condition = condition;
		this.deadline = deadline;
		this.ctime = ctime;
	}
//��ݽ��
	public void kprice(String weight){
		
	}
	
}
