package com.qst.chapter08;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		// ʹ�÷���HashMap����
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		// ������ݣ�key-value��ֵ����ʽ
		hm.put(1, "zhangsan");
		hm.put(2, "lisi");
		hm.put(3, "wangwu");
		hm.put(4, "maliu");
		hm.put(5, "zhaokel");
		hm.put(null,null);
		// ����key��ȡvalue
		System.out.println(hm.get(1));
		System.out.println(hm.get(3));
		System.out.println(hm.get(5));
		System.out.println(hm.get(null));
		// ����keyɾ��
		hm.remove(1);
		// keyΪ1��Ԫ���Ѿ�ɾ��������null
		System.out.println(hm.get(1));

	}

}
