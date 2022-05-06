package examples.observer.models;

import java.util.ArrayList;
import java.util.List;

public class Subject {
  
  private List<CurrencyObserver> observerList;
  private double state;

  public Subject() {
    this.observerList = new ArrayList<CurrencyObserver>();
    this.state = 0;
  }

  public void setState(double value)
  {
    System.out.println("[+] Setting observer value to " + value);
    this.state = value;
  }

  public double getState()
  {
    return this.state;
  }

  public void registerObserver(CurrencyObserver observer)
  {
    this.observerList.add(observer);
  }

  public void unregisterObserver(CurrencyObserver observer)
  {
    this.observerList.remove(observer);
  }

  public void notifyObservers()
  {
    for (CurrencyObserver observer : this.observerList) {
      observer.update(this.state);
    }
  }

}
