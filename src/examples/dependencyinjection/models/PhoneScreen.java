package examples.dependencyinjection.models;

public class PhoneScreen implements Screen {
  
  private int width;
  private int height;

  public PhoneScreen(int width, int height) {
    this.width = width;
    this.height = height;
  }

  @Override
  public void display(String message)
  {
    System.out.println("[*] Displaying message on a Phone: " + message + " (" + width + "x" + height + ")");
  }

}
