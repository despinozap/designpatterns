package examples.proxy;

import examples.proxy.resources.UserProxy;

public class Example
{
  public Example()
  {
    System.out.println("[#] Proxy example is running");

    UserProxy userProxy = new UserProxy(0);
    userProxy.printMovieInfo(10);
    System.out.println("UserProxy object instance hash is: " + userProxy.hashCode());
    
    UserProxy userProxy2 = new UserProxy(1);
    userProxy2.printMovieInfo(10);
    System.out.println("UserProxy2 object instance hash is: " + userProxy2.hashCode());
    
    UserProxy userProxy3 = new UserProxy(2);
    userProxy3.printMovieInfo(10);
    System.out.println("UserProxy3 object instance hash is: " + userProxy3.hashCode());
  }
}