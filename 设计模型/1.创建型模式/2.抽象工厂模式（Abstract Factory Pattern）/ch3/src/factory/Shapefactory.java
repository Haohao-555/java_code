package factory;

import interface_Package.Color;
import interface_Package.Shape;
import abstract_factory.AbstractFactory;
import entity.Circle;
import entity.Rectangle;
import entity.Square;
//Í¼ÐÎ¹¤³§
public class Shapefactory extends AbstractFactory{
	@Override
	public Shape getshape(String shape) {
		if(shape==null){
			return null;
		}else if(shape.equalsIgnoreCase("CIRCLE")){
			return new Circle();
		}else if(shape.equalsIgnoreCase("RECTANGLE")){
			return new Rectangle();
		}else if(shape.equalsIgnoreCase("SQUARE")){
			return new Square();
		}
		return null;
	}
    
	@Override
	public Color getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}
   
}
