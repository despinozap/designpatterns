package examples.dependencyinjection;

import examples.dependencyinjection.models.Device;
import examples.dependencyinjection.models.LaptopScreen;
import examples.dependencyinjection.models.PhoneScreen;
import examples.dependencyinjection.models.Screen;

public class Example
{
  public Example()
  {
    System.out.println("[#] Dependency injection example is running");
    
    // Create a Phone screen
    Screen phoneScreen = new PhoneScreen(300, 400);
    
    // Create a Device with phone screen and display a message
    Device device = new Device(phoneScreen);
    device.displayMessage("Trying the first screen");
    
    // Create a Laptop screen
    Screen laptopScreen = new LaptopScreen(1920, 1080);
    
    // Set a laptop screen to a device
    device.setScreen(laptopScreen);
    
    // Display a message on the device with new screen
    device.displayMessage("Trying the second screen");

  }
}