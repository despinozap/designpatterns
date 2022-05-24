package examples.dependencyinjection.models;

public class LaptopScreen implements Screen {
  private int width;
  private int height;

  public LaptopScreen(int width, int height) {
    this.width = width;
    this.height = height;
  }

  @Override
  public void display(String message)
  {
    System.out.println("[*] Displaying message on a Laptop: " + message + " (" + width + "x" + height + ")");
  }
}
