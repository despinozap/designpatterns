package examples.command.resources;

import java.util.ArrayList;
import java.util.List;

public class Invoker {
  private List<BankOperation> bankOperationList;

  public Invoker()
  {
    this.bankOperationList = new ArrayList<BankOperation>();
  }

  public void addBankOperation(BankOperation bankOperation)
  {
    this.bankOperationList.add(bankOperation);
  }

  public void executeAll()
  {
    for (BankOperation bankOperation : this.bankOperationList) {
      bankOperation.execute();
    }

    this.bankOperationList.clear();
  }
}
