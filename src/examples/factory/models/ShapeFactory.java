package examples.factory.models;

public class ShapeFactory {
  
  public Shape getShape(String shapeType)
  {
    Shape shape = null;
    
    switch(shapeType)
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
}
