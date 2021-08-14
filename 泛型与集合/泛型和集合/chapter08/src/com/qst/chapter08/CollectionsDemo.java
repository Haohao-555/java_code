package com.qst.chapter08;

import java.util.ArrayList;
import java.util.Collections;

import com.qst.chapter08.entity.Person;

public class CollectionsDemo {

	public static void main(String[] args) {
		// ����ArrayList����
		ArrayList<Person> list = new ArrayList<Person>();
		// ���Person����
		list.add(new Person("����", 13, "����"));
		list.add(new Person("����", 8, "�Ϻ�"));
		list.add(new Person("����", 50, "����"));
		list.add(new Person("����", 46, "��̨"));
		list.add(new Person("�Կ���", 35, "�ൺ"));
		// foreach���
		for (Person e : list) {
			System.out.println(e);
		}
		System.out.println("------------------------");

		// ʹ��Collections����������
		Collections.sort(list);
		System.out.println("�����");
		for (Person e : list) {
			System.out.println(e);
		}

		System.out.println("------------------------");
		System.out.println("�������" + Collections.max(list));
		System.out.println("������С��" + Collections.min(list));
	}

}
