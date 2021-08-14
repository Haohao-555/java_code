package text;

import entity.ShapeTypeEnum;
import interface_Package.Shape;

public class ShapeFactory {
	private ShapeFactory(){}//私有化构造方法
    public static Shape createShape(ShapeTypeEnum shapeTypeEnum){
        Shape shape = null;
        String className = shapeTypeEnum.getClassName();
        try {
            Class clazz = Class.forName(className);
            shape = (Shape)clazz.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return shape;
    }
    public static void main(String[] args) {
    	 ShapeFactory.createShape(ShapeTypeEnum.CIRCLE).draw();
         ShapeFactory.createShape(ShapeTypeEnum.SQUARE).draw();
         ShapeFactory.createShape(ShapeTypeEnum.RECTANGLE).draw();
         
	}
}
