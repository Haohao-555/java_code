package com.qst.chapter08;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		// 使用泛型HashSet
		HashSet<String> hs = new HashSet<String>();
		// 向HashSet中添加元素
		hs.add("第一个");
		// 添加重复元素
		hs.add("第一个");
		hs.add("第二个");
		hs.add("第三个");
		hs.add("第四个");
		// 直接输出HashSet集合对象
		System.out.println(hs);

		// 使用foreach循环遍历
		for (String str : hs) {
			System.out.println(str);
		}
		System.out.println("------------------");

		// 删除元素
		hs.remove("第一个");
		System.out.println("删除后剩下的数据：");
		// 获取HashSet的迭代器
		Iterator<String> iterator = hs.iterator();
		// 使用迭代器遍历
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
