package examples.observer.resources;

public abstract class CurrencyObserver {
  
  protected Subject subject;
  public abstract void update(double value);

}
