package com.qst.chapter08;

//不使用通配符？
public class NoWildcardDemo {
	// 泛型类Generic的类型参数使用Object
	public static void myMethod(Generic<Object> g) {
		g.showDataType();
	}

	public static void main(String[] args) {
		// 参数类型是Object
		Generic<Object> gobj = new Generic<Object>("Object");
		myMethod(gobj);
		// 参数类型是Integer
		Generic<Integer> gint = new Generic<Integer>(12);
		// 这里将产生一个错误
		//myMethod(gint);
		// 参数类型是Double
		Generic<Double> gdbl = new Generic<Double>(3.1415);
		// 这里将产生一个错误
		//myMethod(gdbl);
	}

}
