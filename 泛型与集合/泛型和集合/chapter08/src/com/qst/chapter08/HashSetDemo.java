package com.qst.chapter08;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		// ʹ�÷���HashSet
		HashSet<String> hs = new HashSet<String>();
		// ��HashSet�����Ԫ��
		hs.add("��һ��");
		// ����ظ�Ԫ��
		hs.add("��һ��");
		hs.add("�ڶ���");
		hs.add("������");
		hs.add("���ĸ�");
		// ֱ�����HashSet���϶���
		System.out.println(hs);

		// ʹ��foreachѭ������
		for (String str : hs) {
			System.out.println(str);
		}
		System.out.println("------------------");

		// ɾ��Ԫ��
		hs.remove("��һ��");
		System.out.println("ɾ����ʣ�µ����ݣ�");
		// ��ȡHashSet�ĵ�����
		Iterator<String> iterator = hs.iterator();
		// ʹ�õ���������
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
