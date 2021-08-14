package text;

import interface_Package.Color;
import interface_Package.Shape;
import abstract_factory.AbstractFactory;
import factory_producer.FactoryProducer;

public class AbstractFactoryPatternDemo {
   public static void main(String[] args) {
//	System.out.println("形状工厂生成的对象");
//	//获取形状工厂
//	AbstractFactory shape_factory=FactoryProducer.getFactory("SHAPE");
//	//获取形状实例化对象
//	Shape shape01=shape_factory.getshape("CIRCLE");
//	Shape shape02=shape_factory.getshape("RECTANGLE");
//	Shape shape03=shape_factory.getshape("SQUARE");
//	shape01.draw();
//	shape02.draw();
//	shape03.draw();
//	System.out.println("颜色工厂生成的对象：");
//	//获取颜色工厂
//	AbstractFactory color_factory=FactoryProducer.getFactory("COLOR");
//	//获取颜色实例化对象
//	Color color01=color_factory.getColor("RED");
//	Color color02=color_factory.getColor("YELLOW");
//	Color color03=color_factory.getColor("GREEN");
//	color01.fill();
//	color02.fill();
//	color03.fill();
	   System.out.println("生产一个戴尔品牌鼠标");
	   System.out.println("生产一个戴尔品牌键盘");
	   System.out.println("生产一个惠普品牌鼠标");
	   System.out.println("生产一个惠普品牌键盘");
}
}
