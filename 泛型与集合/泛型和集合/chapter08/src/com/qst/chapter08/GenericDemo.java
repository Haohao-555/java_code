package com.qst.chapter08;

public class GenericDemo {

	public static void main(String[] args) {
		// ���巺�����һ��String�汾
		//ʹ�ô������ķ��͹��췽��
		Generic<String> strObj = new Generic<String>("��ӭʹ�÷����࣡");
		strObj.showDataType();
		System.out.println(strObj.getData());
		System.out.println("----------------------------------");
		// ���巺�����һ��Double�汾
		//ʹ��Java 7�����Ρ��﷨ʵ��������
		Generic<Double> dObj = new Generic<Double>(3.1415);
		dObj.showDataType();
		System.out.println(dObj.getData());
		System.out.println("----------------------------------");
		// ���巺�����һ��Integer�汾
		//ʹ�ò��������ķ��͹��췽��
		Generic<Integer> intObj = new Generic<Integer>();
		intObj.setData(123);
		intObj.showDataType();
		System.out.println(intObj.getData());
	}

}
