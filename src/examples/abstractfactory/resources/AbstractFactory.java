package examples.abstractfactory.resources;

public abstract class AbstractFactory {
  public abstract Connection getConnection(String type);
  public abstract Shape getShape(String type);
}
