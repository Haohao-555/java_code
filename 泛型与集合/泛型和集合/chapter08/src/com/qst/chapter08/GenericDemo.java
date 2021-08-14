package com.qst.chapter08;

public class GenericDemo {

	public static void main(String[] args) {
		// 定义泛型类的一个String版本
		//使用带参数的泛型构造方法
		Generic<String> strObj = new Generic<String>("欢迎使用泛型类！");
		strObj.showDataType();
		System.out.println(strObj.getData());
		System.out.println("----------------------------------");
		// 定义泛型类的一个Double版本
		//使用Java 7“菱形”语法实例化泛型
		Generic<Double> dObj = new Generic<Double>(3.1415);
		dObj.showDataType();
		System.out.println(dObj.getData());
		System.out.println("----------------------------------");
		// 定义泛型类的一个Integer版本
		//使用不带参数的泛型构造方法
		Generic<Integer> intObj = new Generic<Integer>();
		intObj.setData(123);
		intObj.showDataType();
		System.out.println(intObj.getData());
	}

}
