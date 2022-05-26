package examples.observer.resources;

public class AUDExchange extends CurrencyObserver {

  private double rate = 1.41;

  public AUDExchange(Subject subject) {
    this.subject = subject;
    this.subject.registerObserver(this);
  }

  @Override
  public void update(double state) {
    System.out.println("[+] AUD exchange is: " + (state * this.rate));
  }
  
}
