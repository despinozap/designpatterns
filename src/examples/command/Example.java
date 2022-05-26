package examples.command;

import examples.command.resources.Account;
import examples.command.resources.BankOperation;
import examples.command.resources.DepositAccount;
import examples.command.resources.Invoker;
import examples.command.resources.WithdrawAccount;

public class Example
{
  public Example()
  {
    System.out.println("[#] Command example is running");

    // Create the object
    Account account = new Account("John Doe", 1000);
    account.printAmount();
    System.out.println("Account object instance hash is: " + account.hashCode());
    
    // Create the commands
    BankOperation deposit = new DepositAccount(account, 500);
    BankOperation withdraw = new WithdrawAccount(account, 250);
    System.out.println("Deposit object instance hash is: " + deposit.hashCode());
    System.out.println("Withdraw object instance hash is: " + withdraw.hashCode());
    
    // Create the invoker and add commands
    Invoker invoker = new Invoker();
    invoker.addBankOperation(deposit);
    invoker.addBankOperation(withdraw);

    // Execute the commands
    invoker.executeAll();
    System.out.println("Invoker object instance hash is: " + invoker.hashCode());
  }
}