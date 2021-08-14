package com.qst.chapter08;

public class LowBoundGenericDemo {
	// 使用泛型Generic时指定其类型参数的下界
	public static void myMethod(Generic<? super String> g) {
		g.showDataType();
	}

	public static void main(String[] args) {
		// 参数类型是String
		Generic<String> gstr = new Generic<String>("String类本身");
		myMethod(gstr);
		// 参数类型是Object
		Generic<Object> gobj = new Generic<Object>("String的父类Object");
		myMethod(gobj);
		// 参数类型是Integer
		Generic<Integer> gint = new Generic<Integer>(12);
		// 产生错误
		// myMethod(gint);
		// 参数类型是Double
		Generic<Double> gdbl = new Generic<Double>(3.1415);
		// 产生错误
		// myMethod(gdbl);
	}

}
