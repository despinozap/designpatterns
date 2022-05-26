package examples.prototype;

import examples.prototype.resources.Account;

public class Example
{
  public Example()
  {
    System.out.println("[#] Prototype example is running");

    // Create a prototype instance
    Account account1 = new Account();
    // Set values
    account1.setType("Savings");
    account1.setNumber("1010 0987 6543 1010");
    account1.printAccountInformation();
    System.out.println("Account1 object instance hash is: " + account1.hashCode());
    // Clone the prototype instance
    Account account2 = (Account) account1.clone();
    account2.printAccountInformation();
    System.out.println("Account2 object instance hash is: " + account2.hashCode());

    if(account1 == account2)
    {
      System.out.println("Both accounts are the same in memory reference");
    }
    else
    {
      System.out.println("Both accounts are different in memory reference");

      if(account1.equals(account2))
      {
        System.out.println("But they are identical internally");
      }
      else
      {
        System.out.println("And they are also different internally");
      }
    }
  }
}