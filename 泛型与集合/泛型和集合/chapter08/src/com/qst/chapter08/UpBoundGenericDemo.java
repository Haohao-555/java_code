package com.qst.chapter08;
//定义泛型UpBoundGeneric指定其类型参数的上界
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
		System.out.println("数据的类型是: " + data.getClass().getName());
	}
}

public class UpBoundGenericDemo {
	// 使用泛型Generic时指定其类型参数的上界
	public static void myMethod(Generic<? extends Number> g) {
		g.showDataType();
	}

	public static void main(String[] args) {
		// 参数类型是Integer
		Generic<Integer> gint = new Generic<Integer>(12);
		myMethod(gint);
		// 参数类型是Double
		Generic<Double> gdbl = new Generic<Double>(3.1415);
		myMethod(gdbl);
		// 参数类型是String
		Generic<String> gstr = new Generic<String>("String");
		//产生错误
		//myMethod(gstr);
		
		System.out.println("----------------------------------");
		//使用已经限定参数类型的泛型UpBoundGeneric
		UpBoundGeneric<Integer> ubgint = new UpBoundGeneric<Integer>(88);
		ubgint.showDataType();
		UpBoundGeneric<Double> ubgdbl = new UpBoundGeneric<Double>(5.678);
		ubgdbl.showDataType();
		//产生错误
		//UpBoundGeneric<String> ubgstr = new UpBoundGeneric<String>("指定上界");
	}
}
