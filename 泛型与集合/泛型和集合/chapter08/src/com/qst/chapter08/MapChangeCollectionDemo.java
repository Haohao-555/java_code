package com.qst.chapter08;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapChangeCollectionDemo {

	public static void main(String[] args) {
		// ʹ�÷���HashMap����
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		// ������ݣ�key-value��ֵ����ʽ
		hm.put(1, "zhangsan");
		hm.put(2, "lisi");
		hm.put(3, "wangwu");
		hm.put(4, "maliu");
		hm.put(5, "zhaokel");
		hm.put(null, null);
		// ʹ��entrySet()������ȡEntry��ֵ�Լ���
		Set<Entry<Integer, String>> set = hm.entrySet();
		System.out.println("����Entry��");
		// ��������Ԫ��
		for (Entry<Integer, String> entry : set) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		System.out.println("------------------------");
		// ʹ��keySet()������ȡ���м��ļ���
		Set<Integer> keySet = hm.keySet();
		System.out.println("����key��");
		for (Integer key : keySet) {
			System.out.println(key);
		}
		System.out.println("------------------------");
		// ʹ��values()������ȡ����ֵ�ļ���
		Collection<String> valueSet = hm.values();
		System.out.println("����value��");
		for (String value : valueSet) {
			System.out.println(value);
		}
	}

}
