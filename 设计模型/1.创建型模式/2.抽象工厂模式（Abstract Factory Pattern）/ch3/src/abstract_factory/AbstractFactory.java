package abstract_factory;

import interface_Package.Color;
import interface_Package.Shape;
//为 Color 和 Shape 对象创建抽象类来获取工厂。
public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getshape(String shape);
}
