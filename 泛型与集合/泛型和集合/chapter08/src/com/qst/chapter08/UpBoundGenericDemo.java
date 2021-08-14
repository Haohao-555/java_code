package com.qst.chapter08;
//���巺��UpBoundGenericָ�������Ͳ������Ͻ�
class UpBoundGeneric<T extends Number> {
	private T data;

	public UpBoundGeneric() {
	}

	public UpBoundGeneric(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public void showDataType() {
		System.out.println("���ݵ�������: " + data.getClass().getName());
	}
}

public class UpBoundGenericDemo {
	// ʹ�÷���Genericʱָ�������Ͳ������Ͻ�
	public static void myMethod(Generic<? extends Number> g) {
		g.showDataType();
	}

	public static void main(String[] args) {
		// ����������Integer
		Generic<Integer> gint = new Generic<Integer>(12);
		myMethod(gint);
		// ����������Double
		Generic<Double> gdbl = new Generic<Double>(3.1415);
		myMethod(gdbl);
		// ����������String
		Generic<String> gstr = new Generic<String>("String");
		//��������
		//myMethod(gstr);
		
		System.out.println("----------------------------------");
		//ʹ���Ѿ��޶��������͵ķ���UpBoundGeneric
		UpBoundGeneric<Integer> ubgint = new UpBoundGeneric<Integer>(88);
		ubgint.showDataType();
		UpBoundGeneric<Double> ubgdbl = new UpBoundGeneric<Double>(5.678);
		ubgdbl.showDataType();
		//��������
		//UpBoundGeneric<String> ubgstr = new UpBoundGeneric<String>("ָ���Ͻ�");
	}
}
