package com.qst.chapter08;

import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		// ʹ�÷���TreeMap����
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
		// ������ݣ�key-value��ֵ����ʽ
		tm.put(1, "zhangsan");
		tm.put(2, "lisi");
		tm.put(3, "wangwu");
		tm.put(4, "maliu");
		tm.put(5, "zhaokel");
		//���󣬲�����null����nullֵ
		//tm.put(null, null);
		// ����key��ȡvalue
		System.out.println(tm.get(1));
		System.out.println(tm.get(3));
		System.out.println(tm.get(5));
		//���󣬲�����null��
		//System.out.println(tm.get(null));
		// ����keyɾ��
		tm.remove(1);
		// keyΪ1��Ԫ���Ѿ�ɾ��������null
		System.out.println(tm.get(1));

	}

}
