package examples.observer.models;

public class CADExchange extends CurrencyObserver {

  private double rate = 1.29;

  public CADExchange(Subject subject) {
    this.subject = subject;
    this.subject.registerObserver(this);
  }

  @Override
  public void update(double state) {
    System.out.println("[+] CAD exchange is: " + (state * this.rate));
  }
  
}
