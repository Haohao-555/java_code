package com.qst.chapter08;

//ʹ��ͨ�����
public class UseWildcardDemo {
	// ������Generic�����Ͳ���ʹ��ͨ�����
	public static void myMethod(Generic<?> g) {
		g.showDataType();
	}

	public static void main(String[] args) {
		// ����������Object
		Generic<Object> gobj = new Generic<Object>("Object");
		myMethod(gobj);
		// ����������Integer
		Generic<Integer> gint = new Generic<Integer>(12);
		myMethod(gint);
		// ����������Double
		Generic<Double> gdbl = new Generic<Double>(3.1415);
		myMethod(gdbl);
	}

}
