package text;

import interface_Package.Shape;
import factory.ShapeFactory;

public class FactoryPatternDemo {
	public static void main(String[] args) {
/*
 * �÷�����function01����һ��ȱ�㣺�ͻ��˱���֪�������ʵ�ֽӿڷ����ľ���ʵ���࣬
 * ��ʵ�ʿ������ǲ��ܽ�ҵ���߼���¶���ͻ��˵ġ�Ӧ�ò���ö�ٷ���ch2.txt����
 */
          function01();
         
	}

	public static void function01() {
		// ��ȡ����ʵ������
		ShapeFactory shapeFactory = new ShapeFactory();

		// ��ȡ Circle �Ķ��󣬲��������� draw ����
		Shape shape1 = shapeFactory.getShape("CIRCLE");

		// ���� Circle �� draw ����(ʵ���ǵ��ýӿ��µķ�����ֻ���� Circle����ʵ���˾���ķ�������)
		shape1.draw();
		// shape1.printlns();ע�⣨3��

		// ��ȡ Rectangle �Ķ��󣬲��������� draw ����
		Shape shape2 = shapeFactory.getShape("RECTANGLE");

		// ���� Rectangle �� draw ����
		shape2.draw();

		// ��ȡ Square �Ķ��󣬲��������� draw ����
		Shape shape3 = shapeFactory.getShape("SQUARE");

		// ���� Square �� draw ����
		shape3.draw();
	}
}
