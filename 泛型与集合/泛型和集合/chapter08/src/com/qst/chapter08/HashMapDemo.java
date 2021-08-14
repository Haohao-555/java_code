package com.qst.chapter08;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		// 使用泛型HashMap集合
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		// 添加数据，key-value键值对形式
		hm.put(1, "zhangsan");
		hm.put(2, "lisi");
		hm.put(3, "wangwu");
		hm.put(4, "maliu");
		hm.put(5, "zhaokel");
		hm.put(null,null);
		// 根据key获取value
		System.out.println(hm.get(1));
		System.out.println(hm.get(3));
		System.out.println(hm.get(5));
		System.out.println(hm.get(null));
		// 根据key删除
		hm.remove(1);
		// key为1的元素已经删除，返回null
		System.out.println(hm.get(1));

	}

}
