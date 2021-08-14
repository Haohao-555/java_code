package abstract_factory;

import interface_Package.Color;
import interface_Package.Shape;
//Ϊ Color �� Shape ���󴴽�����������ȡ������
public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getshape(String shape);
}
