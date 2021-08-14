package entity;

import java.io.Serializable;

public class Circle implements Serializable {
   private double radius=1.0d;//半径
   private double circleArea=0.0d;//圆面积
   private double circumference=0.0d;//圆周长
public double getRadius() {
	return radius;
}
public void setRadius(double radius) {
	this.radius = radius;
}
public double getCircleArea() {
	return radius*radius*Math.PI;
}
public void setCircleArea(double circleArea) {
	this.circleArea = circleArea;
}
public double getCircumference() {
	return 2*Math.PI*radius;
}
public void setCircumference(double circumference) {
	this.circumference = circumference;
}
   public Circle(){
	   super();
   }
}
