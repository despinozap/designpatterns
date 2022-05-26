package examples.mvc.resources;

import java.util.ArrayList;

public class FlightsView {
  
  FlightsController controller;
  
  public FlightsView(FlightsController controller)
  {
    this.controller = controller;
  }

  public void display()
  {
    ArrayList<Flight> flightList = (ArrayList<Flight>) this.controller.index();

    for(Flight flight : flightList)
    {
      System.out.println("[*] Flight [" + flight.getFlightNumber() + "] " + flight.getOrigin() + " => " + flight.getDestination());
    }
  }
}
