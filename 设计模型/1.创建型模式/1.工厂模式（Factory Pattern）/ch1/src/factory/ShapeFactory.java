package factory;

import interface_Package.Shape;
import entity.Circle;
import entity.Rectangle;
import entity.Square;

public class ShapeFactory {
	//ʹ�� getShape ������ȡ��״���͵Ķ���
	   public Shape getShape(String shapeType){
	      if(shapeType == null){
	         return null;
	      }
	      //���沿�ֿ�����Java�������ʵ�ִ�����ʵ��
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
