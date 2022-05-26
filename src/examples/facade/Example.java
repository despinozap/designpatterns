package examples.facade;

import examples.facade.resources.Facade;

public class Example
{
  public Example()
  {
    System.out.println("[#] Facade example is running");

    Facade facade = new Facade();

    facade.printStationInformation();

    System.out.println("Facade object instance hash is: " + facade.hashCode());
  }
}