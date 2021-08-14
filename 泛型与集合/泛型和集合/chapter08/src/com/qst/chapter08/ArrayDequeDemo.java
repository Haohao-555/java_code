package com.qst.chapter08;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDequeDemo {

	public static void main(String[] args) {
		// ʹ�÷���ArrayDeque����
		ArrayDeque<String> queue = new ArrayDeque<String>();
		// �ڶ�β���Ԫ��
		queue.offer("Java8�������");
		// �ڶ�ͷ���Ԫ��
		queue.push("Java EE��ҵӦ�ÿ���");
		// �ڶ�ͷ���Ԫ��
		queue.offerFirst("C++�������");
		// �ڶ�β���Ԫ��
		queue.offerLast("C#Ӧ�ÿ���");
		// ֱ�����ArrayDeque���϶���
		System.out.println(queue);
		System.out.println("------------------");
		// ���ʶ���ͷ����Ԫ��
		System.out.println("peek��" + queue.peek());
		System.out.println("peek��" + queue);
		System.out.println("------------------");
		// poll����һ��Ԫ��
		System.out.println(queue.poll());
		System.out.println("queue��" + queue);
		System.out.println("------------------");

		System.out.println("foreach������");
		// ʹ��foreachѭ������
		for (String str : queue) {
			System.out.println(str);
		}
		System.out.println("------------------");

		System.out.println("������������");
		// ��ȡArrayDeque�ĵ�����
		Iterator<String> iterator = queue.iterator();
		// ʹ�õ���������
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
