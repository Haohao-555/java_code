package com.qst.chapter08.entity;

//����Person��,ʵ��Comparable�ӿ�
public class Person implements Comparable<Person> {
	/* ���ԣ���Ա���� */
	// ����
	private String name;
	// ����
	private int age;
	// ��ַ
	private String address;

	// Ĭ�Ϲ��췽��
	public Person() {
	}

	// ���췽��
	public Person(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

	/* ���� �����Զ�Ӧ�Ļ�ȡ�����÷�����get/set�� */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	// ��дtoString()����
	public String toString() {

		return "������" + name + "�����䣺" + age + "����ַ��" + address;
	}

	// ��дComparable�ӿ��е�compareTo()����
	public int compareTo(Person p) {
		if (this.age < p.age) {
			// С��
			return -1;
		} else if (this.age == p.age) {
			// ����
			return 0;
		} else {
			// ����
			return 1;
		}
	}
}