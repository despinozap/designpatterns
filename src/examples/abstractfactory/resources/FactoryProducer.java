package examples.abstractfactory.resources;

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
