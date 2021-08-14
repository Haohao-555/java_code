package com.qst.chapter08;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		// 使用泛型PriorityQueue集合
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		// 添加元素
		pq.offer(6);
		pq.offer(-3);
		pq.offer(20);
		pq.offer(18);
		// 直接输出PriorityQueue集合对象
		System.out.println(pq); // 输出[-3, 6, 20, 18]
		// 访问队列第一个元素
		System.out.println("poll：" + pq.poll());
		System.out.println("------------------");

		System.out.println("foreach遍历：");
		// 使用foreach循环遍历
		for (Integer e : pq) {
			System.out.println(e);
		}
		System.out.println("------------------");

		System.out.println("迭代器遍历：");
		// 获取PriorityQueue的迭代器
		Iterator<Integer> iterator = pq.iterator();
		// 使用迭代器遍历
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
