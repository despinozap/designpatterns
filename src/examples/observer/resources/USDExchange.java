package examples.observer.resources;

public class USDExchange extends CurrencyObserver {

  private double rate = 1.0;

  public USDExchange(Subject subject) {
    this.subject = subject;
    this.subject.registerObserver(this);
  }

  @Override
  public void update(double state) {
    System.out.println("[+] USD exchange is: " + (state * this.rate));
  }
  
}
