package com.qst.chapter08;

//泛型类
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
		System.out.println("数据的类型是: " + data.getClass().getName());
	}
}
