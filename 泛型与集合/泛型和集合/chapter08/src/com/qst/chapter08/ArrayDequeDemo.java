package com.qst.chapter08;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDequeDemo {

	public static void main(String[] args) {
		// 使用泛型ArrayDeque集合
		ArrayDeque<String> queue = new ArrayDeque<String>();
		// 在队尾添加元素
		queue.offer("Java8程序设计");
		// 在队头添加元素
		queue.push("Java EE企业应用开发");
		// 在队头添加元素
		queue.offerFirst("C++程序设计");
		// 在队尾添加元素
		queue.offerLast("C#应用开发");
		// 直接输出ArrayDeque集合对象
		System.out.println(queue);
		System.out.println("------------------");
		// 访问队列头部的元素
		System.out.println("peek：" + queue.peek());
		System.out.println("peek后：" + queue);
		System.out.println("------------------");
		// poll出第一个元素
		System.out.println(queue.poll());
		System.out.println("queue后：" + queue);
		System.out.println("------------------");

		System.out.println("foreach遍历：");
		// 使用foreach循环遍历
		for (String str : queue) {
			System.out.println(str);
		}
		System.out.println("------------------");

		System.out.println("迭代器遍历：");
		// 获取ArrayDeque的迭代器
		Iterator<String> iterator = queue.iterator();
		// 使用迭代器遍历
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
