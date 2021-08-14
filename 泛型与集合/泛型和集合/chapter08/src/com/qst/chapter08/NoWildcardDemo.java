package com.qst.chapter08;

//��ʹ��ͨ�����
public class NoWildcardDemo {
	// ������Generic�����Ͳ���ʹ��Object
	public static void myMethod(Generic<Object> g) {
		g.showDataType();
	}

	public static void main(String[] args) {
		// ����������Object
		Generic<Object> gobj = new Generic<Object>("Object");
		myMethod(gobj);
		// ����������Integer
		Generic<Integer> gint = new Generic<Integer>(12);
		// ���ｫ����һ������
		//myMethod(gint);
		// ����������Double
		Generic<Double> gdbl = new Generic<Double>(3.1415);
		// ���ｫ����һ������
		//myMethod(gdbl);
	}

}
