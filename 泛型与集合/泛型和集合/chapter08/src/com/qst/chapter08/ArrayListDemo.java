package com.qst.chapter08;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// 使用泛型ArrayList集合
		ArrayList<String> list = new ArrayList<String>();
		// 向集合中添加元素
		list.add("北京");
		list.add("上海");
		list.add("天津");
		list.add("济南");
		list.add("青岛");
		// 错误，只能添加字符串
		// list.add(1);
		// 使用foreach语句遍历
		System.out.println("使用foreach语句遍历:");
		for (String e : list) {
			System.out.println(e);
		}
		System.out.println("------------------");
		System.out.println("使用迭代器遍历:");
		// 获取ArrayList的迭代器
		Iterator<String> iterator = list.iterator();
		// 使用迭代器遍历
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("------------------");
		// 删除下标索引是1的元素，即第二个元素“上海”
		list.remove(1);
		// 删除指定元素
		list.remove("青岛");
		System.out.println("删除后剩下的数据：");
		for (String e : list) {
			System.out.println(e);
		}
	}
}
