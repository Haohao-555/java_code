package com.qst.chapter08;

public class LowBoundGenericDemo {
	// ʹ�÷���Genericʱָ�������Ͳ������½�
	public static void myMethod(Generic<? super String> g) {
		g.showDataType();
	}

	public static void main(String[] args) {
		// ����������String
		Generic<String> gstr = new Generic<String>("String�౾��");
		myMethod(gstr);
		// ����������Object
		Generic<Object> gobj = new Generic<Object>("String�ĸ���Object");
		myMethod(gobj);
		// ����������Integer
		Generic<Integer> gint = new Generic<Integer>(12);
		// ��������
		// myMethod(gint);
		// ����������Double
		Generic<Double> gdbl = new Generic<Double>(3.1415);
		// ��������
		// myMethod(gdbl);
	}

}
