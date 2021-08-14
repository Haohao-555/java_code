package com.qst.chapter08;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// 使用泛型TreeSet
		TreeSet<String> hs = new TreeSet<String>();
		// 向TreeSet中添加元素
		hs.add("第1个");
		// 添加重复元素
		hs.add("第1个");
		// 添加顺序无序
		hs.add("第3个");
		hs.add("第4个");
		hs.add("第2个");
		// 直接输出TreeSet集合对象
		System.out.println(hs);

		// 使用foreach循环遍历
		for (String str : hs) {
			System.out.println(str);
		}
		System.out.println("------------------");

		// 删除元素
		hs.remove("第1个");
		System.out.println("删除后剩下的数据：");
		// 获取TreeSet的迭代器
		Iterator<String> iterator = hs.iterator();
		// 使用迭代器遍历
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}
}
