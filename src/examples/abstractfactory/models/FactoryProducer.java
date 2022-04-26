package examples.abstractfactory.models;

import examples.abstractfactory.factories.AbstractFactory;
import examples.abstractfactory.factories.ConnectionFactory;
import examples.abstractfactory.factories.ShapeFactory;

public class FactoryProducer {
  
  public static AbstractFactory getFactory(String type)
  {
    AbstractFactory factory = null;
    
    switch(type) {
      case "connection": {

        factory = new ConnectionFactory();
        break;
      }

      case "shape": {

        factory = new ShapeFactory();
        break;
      }

      default: {
        break;
      }
    }

    return factory;
  }

}
