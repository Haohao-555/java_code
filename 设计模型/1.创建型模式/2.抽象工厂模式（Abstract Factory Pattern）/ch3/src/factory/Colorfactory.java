package factory;

import interface_Package.Color;
import interface_Package.Shape;
import abstract_factory.AbstractFactory;
import entity.Green;
import entity.Red;
import entity.Yellow;
//color¹¤³§
public class Colorfactory extends  AbstractFactory{

	@Override
	public Color getColor(String color) {
		if(color==null){
			return null;
		}else if(color.equalsIgnoreCase("REd")){
			return new Red();
		}else if(color.equalsIgnoreCase("YELLOW")){
			return new Yellow();
		}else if(color.equalsIgnoreCase("GREEN")){
			return new Green();
		}
		return null;
	}

	@Override
	public Shape getshape(String shape) {
		// TODO Auto-generated method stub
		return null;
	}

}
