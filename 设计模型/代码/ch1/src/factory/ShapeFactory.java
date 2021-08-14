package factory;

import interface_Package.Shape;
import entity.Circle;
import entity.Rectangle;
import entity.Square;

public class ShapeFactory {
	//使用 getShape 方法获取形状类型的对象
	   public Shape getShape(String shapeType){
	      if(shapeType == null){
	         return null;
	      }
	      //下面部分可以用Java反射机制实现创建类实例
	      if(shapeType.equalsIgnoreCase("CIRCLE")){
	         return new Circle();
	      } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
	         return new Rectangle();
	      } else if(shapeType.equalsIgnoreCase("SQUARE")){
	         return new Square();
	      }
	      return null;
	   }
}
