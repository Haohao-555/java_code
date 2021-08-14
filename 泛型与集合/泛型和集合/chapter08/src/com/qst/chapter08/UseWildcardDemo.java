package com.qst.chapter08;

//使用通配符？
public class UseWildcardDemo {
	// 泛型类Generic的类型参数使用通配符？
	public static void myMethod(Generic<?> g) {
		g.showDataType();
	}

	public static void main(String[] args) {
		// 参数类型是Object
		Generic<Object> gobj = new Generic<Object>("Object");
		myMethod(gobj);
		// 参数类型是Integer
		Generic<Integer> gint = new Generic<Integer>(12);
		myMethod(gint);
		// 参数类型是Double
		Generic<Double> gdbl = new Generic<Double>(3.1415);
		myMethod(gdbl);
	}

}
