package examples.command.resources;

public class WithdrawAccount implements BankOperation {
  private Account account;
  private int amount;

  public WithdrawAccount(Account account, int amount)
  {
    this.account = account;
    this.amount = amount;
  }

  @Override
  public void execute() {
    this.account.withdraw(amount);
    this.account.printAmount();
  }
}
