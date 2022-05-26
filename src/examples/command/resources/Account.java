package examples.command.resources;

public class Account {
  private String holder;
  private int amount;

  public Account(String holder, int amount)
  {
    this.holder = holder;
    this.amount = amount;
  }

  public void deposit(int depositAmount)
  {
    System.out.println("[+] A deposit of " + depositAmount + " has been made to "+ this.holder);
    this.amount = this.amount + depositAmount;
  }
  
  public void withdraw(int withdrawAmount)
  {
    System.out.println("[+] A withdraw of " + withdrawAmount + " has been made to "+ this.holder);
    this.amount = this.amount - withdrawAmount;
  }

  public void printAmount()
  {
    System.out.println("[+] The current account amount for " + this.holder + " is: " + this.amount);
  }
}
