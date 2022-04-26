package examples.factory;

import examples.factory.models.Shape;
import examples.factory.models.ShapeFactory;

public class Example {
  
  public Example()
  {
    System.out.println("[#] Factory example is running");

    // Factory creation
    ShapeFactory shapeFactory = new ShapeFactory();

    // Objects created from factory
    Shape shapeCircle = shapeFactory.getShape("circle");
    shapeCircle.printShapeType();
    System.out.println("Circle object instance hash is: " + shapeCircle.hashCode());
    
    Shape shapeRectangle = shapeFactory.getShape("rectangle");
    shapeRectangle.printShapeType();
    System.out.println("Rectangle object instance hash is: " + shapeRectangle.hashCode());  
  }

}
