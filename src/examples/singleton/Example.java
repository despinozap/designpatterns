package examples.singleton;

import examples.singleton.resources.Singleton;

public class Example
{
  public Example()
  {
    System.out.println("[#] Singleton example is running");

    // Get the singleton instance
    Singleton singleObject = Singleton.getInstance();
    singleObject.execute();
    System.out.println("First object instance hash is: " + singleObject.hashCode());
    
    // Get the singleton instance
    Singleton singleObject2 = Singleton.getInstance();
    singleObject2.execute();
    System.out.println("Second object instance hash is: " + singleObject2.hashCode());
  }
}