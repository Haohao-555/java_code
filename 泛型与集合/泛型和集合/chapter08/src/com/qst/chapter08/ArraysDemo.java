package com.qst.chapter08;

import java.util.Arrays;

import com.qst.chapter08.entity.Person;

public class ArraysDemo {

	public static void main(String[] args) {
		// ����һ��Person��������
		Person[] p = new Person[5];
		// ʵ�������������е�Ԫ��
		p[0] = new Person("����", 13, "����");
		p[1] = new Person("����", 8, "�Ϻ�");
		p[2] = new Person("����", 50, "����");
		p[3] = new Person("����", 46, "��̨");
		p[4] = new Person("�Կ���", 35, "�ൺ");
		// foreach���
		for (Person e : p) {
			System.out.println(e);
		}
		System.out.println("------------------------");

		// ʹ��Arrays�������������
		Arrays.sort(p);
		System.out.println("�����");
		for (Person e : p) {
			System.out.println(e);
		}

		System.out.println("------------------------");
		// �������е�����ת�����ַ���
		System.out.println(Arrays.toString(p));

		System.out.println("------------------------");
		// ���鿽��
		Person[] copy = Arrays.copyOfRange(p, 1, 4);
		System.out.println("������");
		for (Person e : copy) {
			System.out.println(e);
		}
	}

}
