package com.qst.chapter08;

import java.util.Arrays;

import com.qst.chapter08.entity.Person;

public class ArraysDemo {

	public static void main(String[] args) {
		// 创建一个Person对象数组
		Person[] p = new Person[5];
		// 实例化对象数组中的元素
		p[0] = new Person("张三", 13, "北京");
		p[1] = new Person("李四", 8, "上海");
		p[2] = new Person("王五", 50, "济南");
		p[3] = new Person("马六", 46, "烟台");
		p[4] = new Person("赵克玲", 35, "青岛");
		// foreach输出
		for (Person e : p) {
			System.out.println(e);
		}
		System.out.println("------------------------");

		// 使用Arrays工具类进行排序
		Arrays.sort(p);
		System.out.println("排序后：");
		for (Person e : p) {
			System.out.println(e);
		}

		System.out.println("------------------------");
		// 将数组中的内容转换成字符串
		System.out.println(Arrays.toString(p));

		System.out.println("------------------------");
		// 数组拷贝
		Person[] copy = Arrays.copyOfRange(p, 1, 4);
		System.out.println("拷贝后：");
		for (Person e : copy) {
			System.out.println(e);
		}
	}

}
