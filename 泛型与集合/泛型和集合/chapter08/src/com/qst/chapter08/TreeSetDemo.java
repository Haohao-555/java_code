package com.qst.chapter08;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// ʹ�÷���TreeSet
		TreeSet<String> hs = new TreeSet<String>();
		// ��TreeSet�����Ԫ��
		hs.add("��1��");
		// ����ظ�Ԫ��
		hs.add("��1��");
		// ���˳������
		hs.add("��3��");
		hs.add("��4��");
		hs.add("��2��");
		// ֱ�����TreeSet���϶���
		System.out.println(hs);

		// ʹ��foreachѭ������
		for (String str : hs) {
			System.out.println(str);
		}
		System.out.println("------------------");

		// ɾ��Ԫ��
		hs.remove("��1��");
		System.out.println("ɾ����ʣ�µ����ݣ�");
		// ��ȡTreeSet�ĵ�����
		Iterator<String> iterator = hs.iterator();
		// ʹ�õ���������
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}
}
