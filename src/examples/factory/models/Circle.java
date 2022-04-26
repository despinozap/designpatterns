package examples.factory.models;

public class Circle implements Shape {

  private final String shapeType = "Circle";

  @Override
  public void printShapeType() {
    System.out.println("[+] This is a " + this.shapeType);
  }
}
