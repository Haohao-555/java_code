package com.qst.chapter08;

import java.util.ArrayList;
import java.util.Collections;

import com.qst.chapter08.entity.Person;

public class CollectionsDemo {

	public static void main(String[] args) {
		// 创建ArrayList集合
		ArrayList<Person> list = new ArrayList<Person>();
		// 添加Person对象
		list.add(new Person("张三", 13, "北京"));
		list.add(new Person("李四", 8, "上海"));
		list.add(new Person("王五", 50, "济南"));
		list.add(new Person("马六", 46, "烟台"));
		list.add(new Person("赵克玲", 35, "青岛"));
		// foreach输出
		for (Person e : list) {
			System.out.println(e);
		}
		System.out.println("------------------------");

		// 使用Collections工具类排序
		Collections.sort(list);
		System.out.println("排序后：");
		for (Person e : list) {
			System.out.println(e);
		}

		System.out.println("------------------------");
		System.out.println("年龄最大：" + Collections.max(list));
		System.out.println("年龄最小：" + Collections.min(list));
	}

}
