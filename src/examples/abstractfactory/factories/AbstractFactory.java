package examples.abstractfactory.factories;

import examples.abstractfactory.models.Connection;
import examples.abstractfactory.models.Shape;

public abstract class AbstractFactory {
  public abstract Connection getConnection(String type);
  public abstract Shape getShape(String type);
}
