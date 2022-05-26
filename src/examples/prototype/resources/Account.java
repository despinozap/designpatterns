package examples.prototype.resources;

public class Account extends Prototype {
  
  private String type;
  private String number;

  public Account()
  {
  }

  public Account(Account target)
  {
    if(target != null)
    {
      this.type = target.type;
      this.number = target.number;
    }
  }

  @Override
  public Prototype clone() 
  {
    return new Account(this);
  }

  /**
   * Override the equals comparison method
   */
  @Override
  public boolean equals(Object ob)
  {
    boolean equalsResult = false;
    if(ob != null)
    {
      if(ob instanceof Account)
      {
        Account account = (Account) ob;

        equalsResult = ((account.type == this.type) && (account.number == this.number));
      }
    }

    return equalsResult;
  }

  public void printAccountInformation()
  {
    System.out.println("[+] Account information => Type: " + this.type + ", Number: " + this.number);
  }

  public void setType(String type)
  {
    this.type = type;
  }

  public void setNumber(String number)
  {
    this.number = number;
  }
}
