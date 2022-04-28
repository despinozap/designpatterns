package examples.command.models;

public class DepositAccount implements BankOperation {
  private Account account;
  private int amount;

  public DepositAccount(Account account, int amount)
  {
    this.account = account;
    this.amount = amount;
  }

  @Override
  public void execute() {
    this.account.deposit(amount);
    this.account.printAmount();
  }
}
