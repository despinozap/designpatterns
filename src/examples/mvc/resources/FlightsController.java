package examples.mvc.resources;

import java.util.ArrayList;

public class FlightsController {
  
  public ArrayList<Flight> index()
  {
    ArrayList<Flight> flights = new ArrayList<Flight>();
    
    flights.add(new Flight("AA123", "New York", "London"));
    flights.add(new Flight("AA456", "London", "Paris"));
    flights.add(new Flight("AA789", "Paris", "New York"));
    
    return flights;
  }
}
