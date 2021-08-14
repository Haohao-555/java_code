package text;

import interface_Package.Shape;
import factory.ShapeFactory;

public class FactoryPatternDemo {
	public static void main(String[] args) {
/*
 * 该方法（function01）有一个缺点：客户端必须知道具体的实现接口方法的具体实现类，
 * 在实际开发中是不能将业务逻辑暴露给客户端的。应该采用枚举法（ch2.txt）。
 */
          function01();
         
	}

	public static void function01() {
		// 获取工厂实例对象
		ShapeFactory shapeFactory = new ShapeFactory();

		// 获取 Circle 的对象，并调用它的 draw 方法
		Shape shape1 = shapeFactory.getShape("CIRCLE");

		// 调用 Circle 的 draw 方法(实质是调用接口下的方法，只是在 Circle类下实现了具体的方法内容)
		shape1.draw();
		// shape1.printlns();注意（3）

		// 获取 Rectangle 的对象，并调用它的 draw 方法
		Shape shape2 = shapeFactory.getShape("RECTANGLE");

		// 调用 Rectangle 的 draw 方法
		shape2.draw();

		// 获取 Square 的对象，并调用它的 draw 方法
		Shape shape3 = shapeFactory.getShape("SQUARE");

		// 调用 Square 的 draw 方法
		shape3.draw();
	}
}
