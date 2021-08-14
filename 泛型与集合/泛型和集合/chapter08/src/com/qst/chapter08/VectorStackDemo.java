package com.qst.chapter08;

import java.util.Iterator;
import java.util.Stack;
import java.util.Vector;

public class VectorStackDemo {
	// ����һ��������ʹ�õ�����������������е�Ԫ��
	public static void show(Iterator<?> iterator) {
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

	public static void main(String[] args) {
		// ʹ�÷���Vector����
		Vector<Integer> v = new Vector<Integer>();
		// ʹ��ѭ����Vector�����Ԫ��
		for (int i = 1; i <= 5; i++) {
			v.add(i);
		}
		System.out.println("Vector�е�Ԫ�أ�");
		// ����show()����������Vector�е�Ԫ��
		show(v.iterator());
		System.out.println("------------------");
		// ɾ���±�������2��Ԫ��
		v.remove(2);
		System.out.println("Vectorɾ����ʣ�µ����ݣ�");
		show(v.iterator());
		System.out.println("------------------");

		// ʹ�÷���Stack����
		Stack<String> s = new Stack<String>();
		// ѭ����ջ
		for (int i = 10; i <= 15; i++) {
			s.push(String.valueOf(i));
		}
		System.out.println("Stack�е�Ԫ�أ�");
		// ����show()����������Stack�е�Ԫ��
		show(s.iterator());
		System.out.println("------------------");
		System.out.println("Stack��ջ��");
		// ѭ����ջ
		while (!s.isEmpty()) {
			System.out.println(s.pop());
		}
	}
}
