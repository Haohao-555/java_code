package com.qst.chapter08;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		// ʹ�÷���PriorityQueue����
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		// ���Ԫ��
		pq.offer(6);
		pq.offer(-3);
		pq.offer(20);
		pq.offer(18);
		// ֱ�����PriorityQueue���϶���
		System.out.println(pq); // ���[-3, 6, 20, 18]
		// ���ʶ��е�һ��Ԫ��
		System.out.println("poll��" + pq.poll());
		System.out.println("------------------");

		System.out.println("foreach������");
		// ʹ��foreachѭ������
		for (Integer e : pq) {
			System.out.println(e);
		}
		System.out.println("------------------");

		System.out.println("������������");
		// ��ȡPriorityQueue�ĵ�����
		Iterator<Integer> iterator = pq.iterator();
		// ʹ�õ���������
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
