package com.qst.chapter08.entity;

//声明Person类,实现Comparable接口
public class Person implements Comparable<Person> {
	/* 属性，成员变量 */
	// 姓名
	private String name;
	// 年龄
	private int age;
	// 地址
	private String address;

	// 默认构造方法
	public Person() {
	}

	// 构造方法
	public Person(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

	/* 方法 ，属性对应的获取和设置方法（get/set） */
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

	// 重写toString()方法
	public String toString() {

		return "姓名：" + name + "，年龄：" + age + "，地址：" + address;
	}

	// 重写Comparable接口中的compareTo()方法
	public int compareTo(Person p) {
		if (this.age < p.age) {
			// 小于
			return -1;
		} else if (this.age == p.age) {
			// 等于
			return 0;
		} else {
			// 大于
			return 1;
		}
	}
}