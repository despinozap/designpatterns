package examples.dependencyinjection.resources;

public class Device {
  
  private Screen screen;

  public Device(Screen screen)
  {
    this.screen = screen;
  }

  public void setScreen(Screen screen)
  {
    this.screen = screen;
  }

  public void displayMessage(String message)
  {
    this.screen.display(message);
  }

}
