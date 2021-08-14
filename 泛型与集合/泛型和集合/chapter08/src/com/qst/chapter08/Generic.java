package com.qst.chapter08;

//������
public class Generic<T> {
	private T data;

	public Generic() {
	}

	public Generic(T data) {
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
