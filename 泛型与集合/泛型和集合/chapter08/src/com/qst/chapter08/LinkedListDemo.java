package com.qst.chapter08;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		// 使用泛型LinkedList集合
		LinkedList<String> books = new LinkedList<String>();
		// 在队尾添加元素
		books.offer("Java8程序设计");
		// 在队头添加元素
		books.push("Java EE企业应用开发");
		// 在队头添加元素
		books.offerFirst("C++程序设计");
		// 在队尾添加元素
		books.offerLast("C#应用开发");

		// 直接输出LinkedList集合对象
		System.out.println(books);

		System.out.println("foreach遍历：");
		// 使用foreach循环遍历
		for (String str : books) {
			System.out.println(str);
		}
		System.out.println("------------------");

		System.out.println("按索引访问遍历：");
		// 以List的方式（按索引访问的方式）来遍历集合元素
		for (int i = 0; i < books.size(); i++) {
			System.out.println(books.get(i));
		}
		System.out.println("------------------");

		// 访问、并不删除栈顶的元素
		System.out.println("peekFirst：" + books.peekFirst());
		// 访问、并不删除队列的最后一个元素
		System.out.println("peekLast：" + books.peekLast());
		// 将栈顶的元素弹出“栈”
		System.out.println("pop：" + books.pop());
		// 访问、并删除队列的最后一个元素
		System.out.println("pollLast：" + books.pollLast());
		System.out.println("------------------");

		System.out.println("删除后剩下的数据：");
		// 获取LinkedList的迭代器
		Iterator<String> iterator = books.iterator();
		// 使用迭代器遍历
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
