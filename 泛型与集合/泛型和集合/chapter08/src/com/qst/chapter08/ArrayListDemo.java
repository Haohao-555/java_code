package com.qst.chapter08;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// ʹ�÷���ArrayList����
		ArrayList<String> list = new ArrayList<String>();
		// �򼯺������Ԫ��
		list.add("����");
		list.add("�Ϻ�");
		list.add("���");
		list.add("����");
		list.add("�ൺ");
		// ����ֻ������ַ���
		// list.add(1);
		// ʹ��foreach������
		System.out.println("ʹ��foreach������:");
		for (String e : list) {
			System.out.println(e);
		}
		System.out.println("------------------");
		System.out.println("ʹ�õ���������:");
		// ��ȡArrayList�ĵ�����
		Iterator<String> iterator = list.iterator();
		// ʹ�õ���������
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("------------------");
		// ɾ���±�������1��Ԫ�أ����ڶ���Ԫ�ء��Ϻ���
		list.remove(1);
		// ɾ��ָ��Ԫ��
		list.remove("�ൺ");
		System.out.println("ɾ����ʣ�µ����ݣ�");
		for (String e : list) {
			System.out.println(e);
		}
	}
}
