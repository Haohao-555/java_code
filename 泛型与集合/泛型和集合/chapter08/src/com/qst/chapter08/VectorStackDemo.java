package com.qst.chapter08;

import java.util.Iterator;
import java.util.Stack;
import java.util.Vector;

public class VectorStackDemo {
	// 定义一个方法，使用迭代器遍历输出集合中的元素
	public static void show(Iterator<?> iterator) {
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

	public static void main(String[] args) {
		// 使用泛型Vector集合
		Vector<Integer> v = new Vector<Integer>();
		// 使用循环向Vector中添加元素
		for (int i = 1; i <= 5; i++) {
			v.add(i);
		}
		System.out.println("Vector中的元素：");
		// 调用show()方法，遍历Vector中的元素
		show(v.iterator());
		System.out.println("------------------");
		// 删除下标索引是2的元素
		v.remove(2);
		System.out.println("Vector删除后剩下的数据：");
		show(v.iterator());
		System.out.println("------------------");

		// 使用泛型Stack集合
		Stack<String> s = new Stack<String>();
		// 循环入栈
		for (int i = 10; i <= 15; i++) {
			s.push(String.valueOf(i));
		}
		System.out.println("Stack中的元素：");
		// 调用show()方法，遍历Stack中的元素
		show(s.iterator());
		System.out.println("------------------");
		System.out.println("Stack出栈：");
		// 循环出栈
		while (!s.isEmpty()) {
			System.out.println(s.pop());
		}
	}
}
