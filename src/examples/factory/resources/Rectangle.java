package examples.factory.resources;

public class Rectangle implements Shape {

  private final String shapeType = "Rectangle";

  @Override
  public void printShapeType() {
    System.out.println("[+] This is a " + this.shapeType);
  }
}
