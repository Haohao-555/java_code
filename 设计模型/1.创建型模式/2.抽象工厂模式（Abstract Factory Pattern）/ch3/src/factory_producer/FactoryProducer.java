package factory_producer;

import factory.Colorfactory;
import factory.Shapefactory;
import abstract_factory.AbstractFactory;
//生成对应工厂的超级工厂
public class FactoryProducer {
  public static AbstractFactory getFactory(String choice){
	  if(choice.equalsIgnoreCase("SHAPE")){
		  return new Shapefactory();
	  }else if(choice.equalsIgnoreCase("COLOR")){
		  return new Colorfactory();
	  }else if(choice==null){
		  return null;
	  }
	  return null;
  }
}
