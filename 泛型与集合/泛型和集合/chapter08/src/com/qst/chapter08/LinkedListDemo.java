package com.qst.chapter08;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		// ʹ�÷���LinkedList����
		LinkedList<String> books = new LinkedList<String>();
		// �ڶ�β���Ԫ��
		books.offer("Java8�������");
		// �ڶ�ͷ���Ԫ��
		books.push("Java EE��ҵӦ�ÿ���");
		// �ڶ�ͷ���Ԫ��
		books.offerFirst("C++�������");
		// �ڶ�β���Ԫ��
		books.offerLast("C#Ӧ�ÿ���");

		// ֱ�����LinkedList���϶���
		System.out.println(books);

		System.out.println("foreach������");
		// ʹ��foreachѭ������
		for (String str : books) {
			System.out.println(str);
		}
		System.out.println("------------------");

		System.out.println("���������ʱ�����");
		// ��List�ķ�ʽ�����������ʵķ�ʽ������������Ԫ��
		for (int i = 0; i < books.size(); i++) {
			System.out.println(books.get(i));
		}
		System.out.println("------------------");

		// ���ʡ�����ɾ��ջ����Ԫ��
		System.out.println("peekFirst��" + books.peekFirst());
		// ���ʡ�����ɾ�����е����һ��Ԫ��
		System.out.println("peekLast��" + books.peekLast());
		// ��ջ����Ԫ�ص�����ջ��
		System.out.println("pop��" + books.pop());
		// ���ʡ���ɾ�����е����һ��Ԫ��
		System.out.println("pollLast��" + books.pollLast());
		System.out.println("------------------");

		System.out.println("ɾ����ʣ�µ����ݣ�");
		// ��ȡLinkedList�ĵ�����
		Iterator<String> iterator = books.iterator();
		// ʹ�õ���������
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
