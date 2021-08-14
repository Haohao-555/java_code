package com.qst.chapter08;

import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		// 使用泛型TreeMap集合
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
		// 添加数据，key-value键值对形式
		tm.put(1, "zhangsan");
		tm.put(2, "lisi");
		tm.put(3, "wangwu");
		tm.put(4, "maliu");
		tm.put(5, "zhaokel");
		//错误，不允许null键和null值
		//tm.put(null, null);
		// 根据key获取value
		System.out.println(tm.get(1));
		System.out.println(tm.get(3));
		System.out.println(tm.get(5));
		//错误，不允许null键
		//System.out.println(tm.get(null));
		// 根据key删除
		tm.remove(1);
		// key为1的元素已经删除，返回null
		System.out.println(tm.get(1));

	}

}
