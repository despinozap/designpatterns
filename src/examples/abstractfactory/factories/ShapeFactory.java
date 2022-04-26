package examples.abstractfactory.factories;

import examples.abstractfactory.models.Circle;
import examples.abstractfactory.models.Connection;
import examples.abstractfactory.models.Rectangle;
import examples.abstractfactory.models.Shape;

public class ShapeFactory extends AbstractFactory {
  
  @Override
  public Shape getShape(String type)
  {
    Shape shape = null;
    
    switch(type)
    {
      case "circle": {
        
        shape = new Circle();

        break;
      }

      case "rectangle": {
        shape = new Rectangle();

        break;
      }
      
      default: {
        
        break;
      }
    }

    return shape;
  }

  @Override
  public Connection getConnection(String type)
  {
    return null;
  }
}
