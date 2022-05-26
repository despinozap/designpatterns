package examples.observer;

import examples.observer.resources.AUDExchange;
import examples.observer.resources.CADExchange;
import examples.observer.resources.Subject;
import examples.observer.resources.USDExchange;

public class Example
{
  public Example()
  {
    System.out.println("[#] Observer example is running");

    // Create the subject (observered object)
    Subject subject = new Subject();
    
    // Create observers and register them to the subject
    USDExchange usdExchange = new USDExchange(subject);
    CADExchange cadExchange = new CADExchange(subject);
    AUDExchange audExchange = new AUDExchange(subject);

    // Update state
    subject.setState(100);
    subject.notifyObservers();

    subject.setState(500);
    subject.notifyObservers();
    
    // Unregister observer
    System.out.println("Removing the CAD observer");
    subject.unregisterObserver(cadExchange);
    subject.setState(250);
    subject.notifyObservers();
    
  }
}