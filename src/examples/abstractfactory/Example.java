package examples.abstractfactory;

import examples.abstractfactory.models.FactoryProducer;
import examples.abstractfactory.factories.AbstractFactory;
import examples.abstractfactory.models.Connection;
import examples.abstractfactory.models.Shape;

public class Example {
  
  public Example() {
    System.out.println("[#] AbstractFactory example is running");

    // Get a Connection factory
    AbstractFactory connectionFactory = FactoryProducer.getFactory("connection");
    // Create connection objects from factory
    Connection connectionMysql = connectionFactory.getConnection("mysql");
    connectionMysql.connect();
    connectionMysql.disconnect();
    System.out.println("MySQL connection object instance hash is: " + connectionMysql.hashCode());
    Connection connectionMssql = connectionFactory.getConnection("mssql");
    connectionMssql.connect();
    connectionMssql.disconnect();
    System.out.println("MsSQL connection object instance hash is: " + connectionMssql.hashCode());
    
    // Get a Shape factory
    AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
    // Create shape objects from factory
    Shape shapeCircle = shapeFactory.getShape("circle");
    shapeCircle.printShapeType();
    System.out.println("Circle object instance hash is: " + shapeCircle.hashCode());
    Shape shapeRectangle = shapeFactory.getShape("rectangle");
    shapeRectangle.printShapeType();
    System.out.println("Rectangle object instance hash is: " + shapeRectangle.hashCode());
  }
}
