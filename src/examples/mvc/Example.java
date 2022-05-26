package examples.mvc;

import examples.mvc.resources.FlightsController;
import examples.mvc.resources.FlightsView;

public class Example
{
  public Example()
  {
    System.out.println("[#] MVC example is running");

    // Create the controller
    FlightsController controller = new FlightsController();

    // Create the view
    FlightsView view = new FlightsView(controller);

    // Display data in view
    view.display();
  }
}